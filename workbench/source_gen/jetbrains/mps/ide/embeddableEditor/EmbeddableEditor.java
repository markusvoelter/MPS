package jetbrains.mps.ide.embeddableEditor;

/*Generated by MPS */

import jetbrains.mps.workbench.editors.MPSFileNodeEditor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.ModelOwner;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ProjectModels;
import jetbrains.mps.library.GeneralPurpose_DevKit;
import jetbrains.mps.smodel.SModelRepository;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.ide.NodeEditor;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.List;
import jetbrains.mps.nodeEditor.EditorMessage;
import java.util.Set;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.make.IMakeService;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.smodel.resources.ModelsToResources;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.resources.CResource;
import javax.swing.SwingUtilities;
import java.util.concurrent.ExecutionException;
import jetbrains.mps.compiler.IClassesData;
import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.generator.GeneratorUIFacade;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelReference;

public class EmbeddableEditor {
  private MPSFileNodeEditor myFileNodeEditor;
  private EmbeddableEditorPanel myPanel;
  private final IOperationContext myContext;
  private final EditableSModelDescriptor myModel;
  private final ModelOwner myOwner;
  private SNode myNode;
  private SNode myRootNode;
  private final boolean myIsEditable;

  public EmbeddableEditor(IOperationContext context, ModelOwner owner, SNode node) {
    this(context, owner, node, true);
  }

  public EmbeddableEditor(IOperationContext context, ModelOwner owner, SNode node, boolean editable) {
    this(context, owner, node, node, editable);
  }

  public EmbeddableEditor(IOperationContext context, ModelOwner owner, SNode rootNode, SNode targetNode, boolean editable) {
    myOwner = owner;
    myContext = context;
    myIsEditable = editable;
    myModel = ((EditableSModelDescriptor) ProjectModels.createDescriptorFor());
    myModel.getSModel().addDevKit(GeneralPurpose_DevKit.MODULE_REFERENCE);
    SModelRepository.getInstance().registerModelDescriptor(myModel, myOwner);
    setNode(rootNode, targetNode, true);
  }

  public EmbeddableEditor(IOperationContext context, EditableSModelDescriptor modelDescriptor, SNode rootNode, SNode targetNode, boolean editable) {
    myOwner = modelDescriptor.getModule();
    myContext = context;
    myIsEditable = editable;
    myModel = modelDescriptor;
    setNode(rootNode, targetNode, false);
  }

  private void setNode(@NotNull final SNode rootNode, @NotNull SNode targetNode, boolean addToModel) {
    myRootNode = rootNode;
    myNode = targetNode;
    if (addToModel) {
      myModel.getSModel().addRoot(rootNode);
    }
    myFileNodeEditor = new MPSFileNodeEditor(myContext, MPSNodesVirtualFileSystem.getInstance().getFileFor(myNode));
    IEditor editor = myFileNodeEditor.getNodeEditor();
    if (editor instanceof NodeEditor) {
      NodeEditor nodeEditor = (NodeEditor) editor;
      nodeEditor.getCurrentEditorComponent().setEditable(myIsEditable);
    }
    if (myPanel == null) {
      myPanel = new EmbeddableEditorPanel(myFileNodeEditor);
    } else {
      myPanel.setEditor(myFileNodeEditor);
    }
  }

  public void setNode(@NotNull SNode node) {
    setNode(node, node, true);
  }

  public JComponent getComponenet() {
    return myPanel;
  }

  public void setBackground(Color color) {
    IEditor editor = myFileNodeEditor.getNodeEditor();
    if (editor instanceof NodeEditor) {
      NodeEditor nodeEditor = (NodeEditor) editor;
      nodeEditor.getCurrentEditorComponent().setBackground(color);
    }
  }

  public void mark(List<EditorMessage> messages) {
    IEditor editor = myFileNodeEditor.getNodeEditor();
    if (editor instanceof NodeEditor) {
      NodeEditor nodeEditor = (NodeEditor) editor;
      nodeEditor.getCurrentEditorComponent().getHighlightManager().mark(messages);
    }
  }

  public void selectNode(SNode node) {
    myFileNodeEditor.getNodeEditor().showNode(node, true);
  }

  public IEditor getEditor() {
    return myFileNodeEditor.getNodeEditor();
  }

  public void make(final Set<IClassPathItem> classPath) {
    final IScript scr = new ScriptBuilder().withFacetNames(new IFacet.Name("jetbrains.mps.lang.core.Generate"), new IFacet.Name("jetbrains.mps.lang.core.TextGen"), new IFacet.Name("jetbrains.mps.baseLanguage.JavaCompile"), new IFacet.Name("jetbrains.mps.lang.core.Make")).withFinalTarget(new ITarget.Name("jetbrains.mps.baseLanguage.JavaCompile.compileToMemory")).toScript();


    ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
      public void run() {
        IScriptController ctl = new IScriptController.Stub(new IConfigMonitor.Stub() {
          public <T extends IOption> T relayQuery(IQuery<T> query) {
            return query.defaultOption();
          }
        }, new IJobMonitor.Stub()) {
          @Override
          public void setup(IPropertiesPool ppool) {
            super.setup(ppool);
            Tuples._1<Iterable<IClassPathItem>> params = (Tuples._1<Iterable<IClassPathItem>>) ppool.properties(new ITarget.Name("jetbrains.mps.baseLanguage.JavaCompile.compileToMemory"), Object.class);
            if (params != null) {
              params._0(classPath);
            }
          }
        };

        MakeSession session = new MakeSession(myContext, null, true);
        if (IMakeService.INSTANCE.get().openNewSession(session)) {
          Future<IResult> future = IMakeService.INSTANCE.get().make(session, new ModelsToResources(myContext, Sequence.<SModelDescriptor>singleton(myModel)).resources(false), scr, ctl);
          try {
            IResult result = future.get();
            if (result.isSucessful()) {
              final CResource out = (CResource) Sequence.fromIterable(result.output()).first();
              SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                  processClassesData(out.classes());
                }
              });
            }
          } catch (InterruptedException ignore) {
          } catch (ExecutionException ignore) {
          }
        }
      }
    });
  }

  protected void processClassesData(IClassesData cd) {
  }

  @Deprecated
  public GenerationResult generate(final Set<IClassPathItem> additionalClasspath) {
    if (myRootNode == null) {
      return null;
    }
    InMemoryJavaGenerationHandler handler = new InMemoryJavaGenerationHandler(false, false) {
      @Override
      public boolean canHandle(SModelDescriptor inputModel) {
        return inputModel != null;
      }

      @Override
      protected CompositeClassPathItem getClassPath(Set<IModule> contextModules) {
        CompositeClassPathItem result = super.getClassPath(contextModules);
        for (IClassPathItem item : additionalClasspath) {
          result.add(item);
        }
        return result;
      }
    };
    boolean successful = GeneratorUIFacade.getInstance().generateModels(myContext, ListSequence.fromListAndArray(new ArrayList<SModelDescriptor>(), myModel), handler, true, true);
    return new GenerationResult(myRootNode, myContext, myModel, handler, successful);
  }

  public EditableSModelDescriptor getModel() {
    return myModel;
  }

  public void addLanguageStructureModel(final Language language) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModelReference ref = language.getStructureModelDescriptor().getSModelReference();
        myModel.getSModel().addModelImport(ref, false);
      }
    });
  }

  public void addLanguage(final Language language) {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myModel.getSModel().addLanguage(language.getModuleReference());
      }
    });
  }

  public void addModel(final SModelReference model) {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myModel.getSModel().addModelImport(model, false);
      }
    });
  }

  public void disposeEditor() {
    disposeEditor(true);
  }

  public void disposeEditor(boolean clearModule) {
    if (clearModule) {
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          SModelRepository.getInstance().unRegisterModelDescriptors(myOwner);
        }
      });
    }
    myFileNodeEditor.dispose();
  }

  protected IOperationContext createOperationContext() {
    return myContext;
  }
}
