package jetbrains.mps.ide.embeddableEditor;

/*Generated by MPS */

import jetbrains.mps.workbench.editors.MPSFileNodeEditor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.ModelOwner;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ProjectModels;
import jetbrains.mps.library.GeneralPurpose_DevKit;
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
import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.generator.GeneratorFacade;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelRepository;

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
    myModel = ProjectModels.createDescriptorFor(myOwner);
    myModel.getSModel().addDevKit(GeneralPurpose_DevKit.MODULE_REFERENCE);
    setNode(rootNode, targetNode);
  }

  private void setNode(@NotNull SNode rootNode, @NotNull SNode targetNode) {
    myRootNode = rootNode;
    myNode = targetNode;
    myModel.getSModel().runLoadingAction(new Runnable() {
      public void run() {
        myModel.getSModel().addRoot(myRootNode);
      }
    });
    myFileNodeEditor = new MPSFileNodeEditor(myContext, MPSNodesVirtualFileSystem.getInstance().getFileFor(myNode));
    IEditor editor = myFileNodeEditor.getNodeEditor();
    if (editor instanceof NodeEditor) {
      NodeEditor nodeEditor = (NodeEditor) editor;
      nodeEditor.setEditable(myIsEditable);
    }
    if (myPanel == null) {
      myPanel = new EmbeddableEditorPanel(myFileNodeEditor);
    } else {
      myPanel.setEditor(myFileNodeEditor);
    }
  }

  public void setNode(@NotNull SNode node) {
    setNode(node, node);
  }

  public JComponent getComponenet() {
    return myPanel;
  }

  public void setBackground(Color color) {
    IEditor editor = myFileNodeEditor.getNodeEditor();
    if (editor instanceof NodeEditor) {
      NodeEditor nodeEditor = (NodeEditor) editor;
      nodeEditor.setBackground(color);
    }
  }

  public void mark(List<EditorMessage> messages) {
    IEditor editor = myFileNodeEditor.getNodeEditor();
    if (editor instanceof NodeEditor) {
      NodeEditor nodeEditor = (NodeEditor) editor;
      nodeEditor.mark(messages);
    }
  }

  public void selectNode(SNode node) {
    myFileNodeEditor.getNodeEditor().selectNode(node);
  }

  public IEditor getEditor() {
    return myFileNodeEditor.getNodeEditor();
  }

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
    boolean successful = GeneratorFacade.getInstance().generateModels(myContext, ListSequence.fromListAndArray(new ArrayList<SModelDescriptor>(), myModel), handler, true, true);
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
      SModelRepository.getInstance().unRegisterModelDescriptors(myOwner);
    }
    myFileNodeEditor.dispose();
  }

  protected IOperationContext createOperationContext() {
    return myContext;
  }
}
