package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.DumbService;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.ide.generator.GeneratorCacheComponent;
import jetbrains.mps.generator.IGenerationTracer;
import jetbrains.mps.lang.generator.plugin.debug.GenerationTracer;
import jetbrains.mps.generator.NullGenerationTracer;
import jetbrains.mps.generator.GenerationOptions;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.ide.messages.DefaultMessageHandler;
import jetbrains.mps.generator.TransientModelsComponent;

public class Generate_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("Generate");

  public Generate_Facet() {
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_a());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_b());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_c());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_d());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_e());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Make")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_fi61u2_a implements ITarget {
    private ITarget.Name name = new ITarget.Name("checkParameters");

    public Target_fi61u2_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0a = null;
          switch (0) {
            case 0:
              if (pool.parameters(Target_fi61u2_a.this.getName(), Generate_Facet.Target_fi61u2_a.Variables.class).project() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("project is null")));
                return new IResult.FAILURE(_output_fi61u2_a0a);
              }
              if (pool.parameters(Target_fi61u2_a.this.getName(), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("operationContext is null")));
                return new IResult.FAILURE(_output_fi61u2_a0a);
              }
              if (pool.parameters(Target_fi61u2_a.this.getName(), Generate_Facet.Target_fi61u2_a.Variables.class).cleanMake() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("no cleanMake")));
                return new IResult.FAILURE(_output_fi61u2_a0a);
              }
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0a);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return null;
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return null;
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return cls.cast(new Variables());
    }

    public static class Variables extends MultiTuple._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> {
      public Variables() {
        super();
      }

      public Variables(Project project, IOperationContext operationContext, Boolean cleanMake, _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet) {
        super(project, operationContext, cleanMake, pindGet);
      }

      public Project project(Project value) {
        return super._0(value);
      }

      public IOperationContext operationContext(IOperationContext value) {
        return super._1(value);
      }

      public Boolean cleanMake(Boolean value) {
        return super._2(value);
      }

      public _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet(_FunctionTypes._return_P0_E0<? extends ProgressIndicator> value) {
        return super._3(value);
      }

      public Project project() {
        return super._0();
      }

      public IOperationContext operationContext() {
        return super._1();
      }

      public Boolean cleanMake() {
        return super._2();
      }

      public _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet() {
        return super._3();
      }

      @SuppressWarnings(value = "unchecked")
      public Generate_Facet.Target_fi61u2_a.Variables assignFrom(Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> from) {
        return (Generate_Facet.Target_fi61u2_a.Variables) super.assign(from);
      }
    }
  }

  public static class Target_fi61u2_b implements ITarget {
    private ITarget.Name name = new ITarget.Name("checkDumbMode");

    public Target_fi61u2_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0b = null;
          switch (0) {
            case 0:
              if (DumbService.getInstance(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project()).isDumb()) {
                DumbService.getInstance(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project()).showDumbModeNotification("Generation is not available until indices are built.");
                return new IResult.FAILURE(_output_fi61u2_a0b);
              }
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0b);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return null;
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return null;
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }

  public static class Target_fi61u2_c implements ITarget {
    private ITarget.Name name = new ITarget.Name("configure");

    public Target_fi61u2_c() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0c = null;
          switch (0) {
            case 0:
              GenerationSettings settings = GenerationSettings.getInstance();
              GenerationStrategy strategy = null;
              if (settings.isIncremental()) {
                strategy = new GenerationStrategy((settings.isIncrementalUseCache() ?
                  GeneratorCacheComponent.getInstance().getCache() :
                  null
                ));
              }
              IGenerationTracer tracer = (pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient() ?
                pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(GenerationTracer.class) :
                new NullGenerationTracer()
              );
              pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions(GenerationOptions.getDefaults().saveTransientModels(pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient()).strictMode(settings.isStrictMode()).incremental(strategy).generateInParallel(settings.isParallelGenerator(), settings.getNumberOfParallelThreads()).tracing(settings.getPerformanceTracingLevel(), tracer).reporting(settings.isShowInfo(), settings.isShowWarnings(), settings.isKeepModelsWithWarnings(), settings.getNumberOfModelsToKeep()).rebuildAll(true).keepOutputModel(true));
              return new IResult.SUCCESS(_output_fi61u2_a0c);
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0c);
          }
        }
      };
    }

    public IConfig createConfig() {
      return new IConfig() {
        public boolean configure(final IConfigMonitor cmonitor, final IParametersPool pool) {
          switch (0) {
            case 0:
              GenerationSettings settings = GenerationSettings.getInstance();
              if (settings.isSaveTransientModels()) {
                switch (cmonitor.<SaveTransient_Option>relayQuery(new SaveTransientModels_Query())) {
                  case SAVE_fi61u2_a0a0c:
                    pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(true);
                    break;
                  case DONT_SAVE_fi61u2_b0a0c:
                    pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(false);
                    break;
                  case BUGGER_OFF_fi61u2_c0a0c:
                    cmonitor.<rrr_Option>relayQuery(new WontAskAgain_Query());
                    pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(false);
                    settings.setSaveTransientModels(false);
                    break;
                  default:
                    return false;
                }
              } else {
                pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(false);
              }
            default:
              return true;
          }
        }
      };
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("checkParameters"), new ITarget.Name("checkDumbMode")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return null;
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return cls.cast(new Variables());
    }

    public static class Variables extends MultiTuple._3<Boolean, GenerationStrategy, GenerationOptions.OptionsBuilder> {
      public Variables() {
        super();
      }

      public Variables(Boolean saveTransient, GenerationStrategy generationStrategy, GenerationOptions.OptionsBuilder generationOptions) {
        super(saveTransient, generationStrategy, generationOptions);
      }

      public Boolean saveTransient(Boolean value) {
        return super._0(value);
      }

      public GenerationStrategy generationStrategy(GenerationStrategy value) {
        return super._1(value);
      }

      public GenerationOptions.OptionsBuilder generationOptions(GenerationOptions.OptionsBuilder value) {
        return super._2(value);
      }

      public Boolean saveTransient() {
        return super._0();
      }

      public GenerationStrategy generationStrategy() {
        return super._1();
      }

      public GenerationOptions.OptionsBuilder generationOptions() {
        return super._2();
      }

      @SuppressWarnings(value = "unchecked")
      public Generate_Facet.Target_fi61u2_c.Variables assignFrom(Tuples._3<Boolean, GenerationStrategy, GenerationOptions.OptionsBuilder> from) {
        return (Generate_Facet.Target_fi61u2_c.Variables) super.assign(from);
      }
    }
  }

  public static class Target_fi61u2_d implements ITarget {
    private ITarget.Name name = new ITarget.Name("generate");

    public Target_fi61u2_d() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          final Wrappers._T<Iterable<IResource>> _output_fi61u2_a0d = new Wrappers._T<Iterable<IResource>>(null);
          switch (0) {
            case 0:
              MessagesViewTool mvt = pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(MessagesViewTool.class);
              if (mvt != null) {
                mvt.openToolLater(false);
              }
              boolean generationOk;
              GeneratorManager gm = pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(GeneratorManager.class);
              if (!(pool.parameters(new ITarget.Name("configure"), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient())) {
                pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(GenerationTracer.class).discardTracing();
              }

              GenerationHandler gh = new GenerationHandler(new _FunctionTypes._return_P1_E0<Boolean, GResource>() {
                public Boolean invoke(GResource data) {
                  monitor.currentProgress().advanceWork("Generation", 1000);
                  _output_fi61u2_a0d.value = Sequence.fromIterable(_output_fi61u2_a0d.value).concat(Sequence.fromIterable(Sequence.<IResource>singleton(data)));
                  return true;
                }
              });
              monitor.currentProgress().beginWork("Generation", Sequence.fromIterable(input).foldLeft(0, new ILeftCombinator<IResource, Integer>() {
                public Integer combine(Integer s, IResource it) {
                  return s + Sequence.fromIterable(((MResource) it).models()).count() * 1000;
                }
              }), monitor.currentProgress().workLeft());
              generationOk = gm.generateModels(Sequence.fromIterable(input).<SModelDescriptor>translate(new ITranslator2<IResource, SModelDescriptor>() {
                public Iterable<SModelDescriptor> translate(IResource in) {
                  return ((MResource) in).models();
                }
              }).toListSequence(), pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext(), gh, pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).pindGet().invoke(), new DefaultMessageHandler(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project()) {
                @Override
                public void clear() {
                  // don't clear the messages 
                }
              }, pool.parameters(new ITarget.Name("configure"), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions().create());
              monitor.currentProgress().finishWork("Generation");
              if (!(generationOk)) {
                return new IResult.FAILURE(_output_fi61u2_a0d.value);
              }
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0d.value);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("configure")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return true;
    }

    public boolean producesOutput() {
      return true;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }

  public static class Target_fi61u2_e implements ITarget {
    private ITarget.Name name = new ITarget.Name("cleanUpAfterGeneration");

    public Target_fi61u2_e() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0e = null;
          switch (0) {
            case 0:
              pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(TransientModelsComponent.class).removeAllTransient();
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0e);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("generate")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }
}
