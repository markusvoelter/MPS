package jetbrains.mps.build.ant.generation.workers;

/*Generated by MPS */

import jetbrains.mps.build.ant.MpsWorker;
import jetbrains.mps.build.ant.WhatToDo;
import org.apache.commons.lang.StringUtils;
import org.apache.tools.ant.ProjectComponent;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.build.ant.generation.GenerateTask;
import jetbrains.mps.ide.generator.GenerationSettings;
import org.apache.tools.ant.BuildException;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.ProjectOperationContext;
import java.util.List;
import jetbrains.mps.smodel.resources.IMResource;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.internal.make.runtime.util.GraphAnalyzer;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.ArrayList;
import jetbrains.mps.ide.ThreadUtils;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Collections;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.resources.ModelsToResources;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.make.resources.IResource;
import java.io.File;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.IMessage;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

public class GeneratorWorker extends MpsWorker {
  private final GeneratorWorker.MyMessageHandler myMessageHandler = new GeneratorWorker.MyMessageHandler();

  public GeneratorWorker(WhatToDo whatToDo) {
    super(whatToDo);
  }

  public GeneratorWorker(WhatToDo whatToDo, ProjectComponent component) {
    super(whatToDo, component);
  }

  public GeneratorWorker(WhatToDo whatToDo, MpsWorker.AntLogger logger) {
    super(whatToDo, logger);
  }

  protected void executeTask(final MPSProject project, MpsWorker.ObjectsToProcess go) {
    setGenerationProperties();
    if (go.hasAnythingToGenerate()) {
      generate(project, go);
    }
  }

  private void setGenerationProperties() {
    if (myWhatToDo.getProperty(GenerateTask.PER_ROOT_GENERATION) != null) {
      boolean perRootGeneration = Boolean.parseBoolean(myWhatToDo.getProperty(GenerateTask.PER_ROOT_GENERATION));
      GenerationSettings.getInstance().setParallelGenerator(perRootGeneration);
      GenerationSettings.getInstance().setStrictMode(perRootGeneration);
      info("Per-root generation set to " + perRootGeneration);
    }
  }

  protected void showStatistic() {
    if (!(myErrors.isEmpty()) && myWhatToDo.getFailOnError()) {
      StringBuffer sb = new StringBuffer();
      sb.append(StringUtils.repeat("*", 100));
      sb.append("\n");
      sb.append(myErrors.size());
      sb.append(" errors during generation:\n");
      for (String error : myErrors) {
        sb.append(error);
        sb.append("\n");
      }
      sb.append(StringUtils.repeat("*", 100));
      throw new BuildException(sb.toString());
    }
  }

  private void generate(MPSProject project, MpsWorker.ObjectsToProcess go) {
    StringBuffer s = new StringBuffer("Generating:");
    for (MPSProject p : go.getProjects()) {
      s.append("\n    ");
      s.append(p);
    }
    for (IModule m : go.getModules()) {
      s.append("\n    ");
      s.append(m);
    }
    for (SModelDescriptor m : go.getModels()) {
      s.append("\n    ");
      s.append(m);
    }
    info(s.toString());
    final ProjectOperationContext ctx = ProjectOperationContext.get(project.getProject());

    final List<IMResource> resources = Sequence.fromIterable(collectResources(ctx, go)).toListSequence();
    final Map<IModule, IMResource> cache = MapSequence.fromMap(new HashMap<IModule, IMResource>());
    ListSequence.fromList(resources).visitAll(new IVisitor<IMResource>() {
      public void visit(IMResource r) {
        MapSequence.fromMap(cache).put(r.module(), r);
      }
    });
    final GeneratorWorker.Graph<IMResource> graph = new GeneratorWorker.Graph<IMResource>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (IMResource res : (Iterable<IMResource>) resources) {
          graph.addEdges(res);
          for (IModule depOn : res.module().getDependenciesManager().getDependOnModules()) {
            if (MapSequence.fromMap(cache).containsKey(depOn)) {
              graph.addEdges(MapSequence.fromMap(cache).get(depOn), res);
            }
          }
          if (res.module() instanceof Language) {
            for (Generator gen : ((Language) res.module()).getGenerators()) {
              if (MapSequence.fromMap(cache).containsKey(gen)) {
                graph.addEdges(res, MapSequence.fromMap(cache).get(gen));
                graph.addEdges(MapSequence.fromMap(cache).get(gen), res);
              }
            }
          }
        }
      }
    });
    GraphAnalyzer<IMResource> ga = graph.getCycleDetector();
    List<List<IMResource>> cycles = ga.findCycles();
    for (IMResource res : Sequence.fromIterable(ga.topologicalSort()).where(new IWhereFilter<IMResource>() {
      public boolean accept(IMResource r) {
        return MapSequence.fromMap(cache).containsKey(r.module());
      }
    })) {
      final List<IMResource> toMake = ListSequence.fromList(new ArrayList<IMResource>());
      for (List<IMResource> cycle : cycles) {
        if (ListSequence.fromList(cycle).contains(res)) {
          ListSequence.fromList(toMake).addSequence(ListSequence.fromList(cycle));
          ListSequence.fromList(cycle).visitAll(new IVisitor<IMResource>() {
            public void visit(IMResource r) {
              MapSequence.fromMap(cache).removeKey(r.module());
            }
          });
          break;
        }
      }
      if (ListSequence.fromList(toMake).isEmpty()) {
        ListSequence.fromList(toMake).addElement(res);
        MapSequence.fromMap(cache).removeKey(res.module());
      }
      ModelAccess.instance().flushEventQueue();
      ThreadUtils.runInUIThreadAndWait(new Runnable() {
        public void run() {
          new BuildMakeService(ctx, myMessageHandler).make(toMake);
        }
      });
      ModelAccess.instance().flushEventQueue();
      ApplicationManager.getApplication().invokeAndWait(new Runnable() {
        public void run() {
        }
      }, ModalityState.defaultModalityState());
    }

  }

  private Iterable<IModule> withGenerators(Iterable<IModule> modules) {
    return Sequence.fromIterable(modules).concat(Sequence.fromIterable(modules).where(new IWhereFilter<IModule>() {
      public boolean accept(IModule it) {
        return it instanceof Language;
      }
    }).<IModule>translate(new ITranslator2<IModule, IModule>() {
      public Iterable<IModule> translate(IModule it) {
        return Collections.<IModule>unmodifiableList(((Language) it).getGenerators());
      }
    }));
  }

  private Iterable<SModelDescriptor> getModelsToGenerate(IModule mod) {
    return Sequence.fromIterable(((Iterable<SModelDescriptor>) mod.getOwnModelDescriptors())).where(new IWhereFilter<SModelDescriptor>() {
      public boolean accept(SModelDescriptor it) {
        return it.isGeneratable();
      }
    });
  }

  private Iterable<IMResource> collectResources(IOperationContext context, final MpsWorker.ObjectsToProcess go) {
    final Wrappers._T<Iterable<SModelDescriptor>> models = new Wrappers._T<Iterable<SModelDescriptor>>(null);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (MPSProject p : go.getProjects()) {
          for (IModule mod : withGenerators(p.getModules())) {
            models.value = Sequence.fromIterable(models.value).concat(Sequence.fromIterable((getModelsToGenerate(mod))));

          }
        }
        for (IModule mod : withGenerators(go.getModules())) {
          models.value = Sequence.fromIterable(models.value).concat(Sequence.fromIterable(getModelsToGenerate(mod)));
        }
        if (go.getModels() != null) {
          models.value = Sequence.fromIterable(models.value).concat(SetSequence.fromSet(go.getModels()));
        }
      }
    });
    return Sequence.fromIterable(new ModelsToResources(context, Sequence.fromIterable(models.value).where(new IWhereFilter<SModelDescriptor>() {
      public boolean accept(SModelDescriptor smd) {
        return !(GeneratorManager.isDoNotGenerate(smd));
      }
    })).resources(false)).<IMResource>select(new ISelector<IResource, IMResource>() {
      public IMResource select(IResource r) {
        return (IMResource) r;
      }
    });
  }

  public static void main(String[] args) {
    MpsWorker mpsWorker = new GeneratorWorker(WhatToDo.fromDumpInFile(new File(args[0])), new SystemOutLogger());
    mpsWorker.workFromMain();
  }

  private class MyMessageHandler implements IMessageHandler {
    private final List<String> myGenerationErrors = new ArrayList<String>();
    private final List<String> myGenerationWarnings = new ArrayList<String>();

    /*package*/ MyMessageHandler() {
    }

    public void handle(IMessage msg) {
      switch (msg.getKind()) {
        case ERROR:
          GeneratorWorker.this.error(msg.getText());
          if (msg.getException() != null) {
            myGenerationErrors.add(MpsWorker.extractStackTrace(msg.getException()).toString());
          } else {
            myGenerationErrors.add(msg.getText());
          }
          break;
        case WARNING:
          GeneratorWorker.this.warning(msg.getText());
          myGenerationWarnings.add(msg.getText());
          break;
        case INFORMATION:
          GeneratorWorker.this.verbose(msg.getText());
          break;
        default:
      }
    }

    public List<String> getGenerationErrors() {
      return myGenerationErrors;
    }

    public List<String> getGenerationWarnings() {
      return myGenerationWarnings;
    }

    public void clean() {
      myGenerationErrors.clear();
      myGenerationWarnings.clear();
    }

    public void clear() {
    }
  }

  public static class Graph<V> {
    private Set<V> vertices = SetSequence.fromSet(new HashSet<V>());
    private Map<V, List<V>> fwEdges = MapSequence.fromMap(new HashMap<V, List<V>>());
    private Map<V, List<V>> bkEdges = MapSequence.fromMap(new HashMap<V, List<V>>());
    private _FunctionTypes._return_P1_E0<? extends Comparable<?>, ? super V> sorter;
    private boolean asc;

    public Graph() {
    }

    public void addEdges(V from, V... to) {
      List<V> fw = MapSequence.fromMap(fwEdges).get(from);
      if (fw == null) {
        fw = ListSequence.fromList(new ArrayList<V>());
        MapSequence.fromMap(fwEdges).put(from, fw);
      }
      SetSequence.fromSet(vertices).addElement(from);
      for (V next : to) {
        ListSequence.fromList(fw).addElement(next);
        List<V> bk = MapSequence.fromMap(bkEdges).get(next);
        if (bk == null) {
          bk = ListSequence.fromList(new ArrayList<V>());
          MapSequence.fromMap(bkEdges).put(next, bk);
        }
        ListSequence.fromList(bk).addElement(from);
        SetSequence.fromSet(vertices).addElement(next);
      }
    }

    public void sort(_FunctionTypes._return_P1_E0<? extends Comparable<?>, ? super V> sorter, boolean asc) {
      this.sorter = sorter;
      this.asc = asc;
    }

    public Iterable<V> getVertices() {
      return (sorter != null ?
        SetSequence.fromSet(vertices).sort(sorter, asc) :
        vertices
      );
    }

    public GraphAnalyzer<V> getCycleDetector() {
      return new GraphAnalyzer<V>() {
        @Override
        public Iterable<V> forwardEdges(V v) {
          return MapSequence.fromMap(fwEdges).get(v);
        }

        @Override
        public Iterable<V> vertices() {
          return getVertices();
        }

        @Override
        public Iterable<V> backwardEdges(V v) {
          return MapSequence.fromMap(bkEdges).get(v);
        }
      };
    }
  }
}
