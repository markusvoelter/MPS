package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.LanguageID;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.smodel.SModel;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.MPSModuleOwner;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.plugin.IProjectHandler;
import jetbrains.mps.plugin.MPSPlugin;
import javax.swing.SwingUtilities;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.rmi.RemoteException;

public class GoByCurrentReference_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GoByCurrentReference_Action.class);

  private EditorComponent editorComponent;
  private EditorCell cell;
  private IOperationContext context;
  private SNode node;

  public GoByCurrentReference_Action() {
    super("Go by Current Reference", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl B";
  }

  public boolean isApplicable(AnActionEvent event) {
    SNode targetNode = GoByCurrentReference_Action.this.cell.getSNodeWRTReference();
    if (targetNode == null) {
      return false;
    }
    if (targetNode == GoByCurrentReference_Action.this.cell.getSNode()) {
      return false;
    }
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoByCurrentReference", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.cell == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.NODE);
    if (this.node == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.editorComponent = null;
    this.cell = null;
    this.context = null;
    this.node = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final SNode targetNode = GoByCurrentReference_Action.this.cell.getSNodeWRTReference();
      String targetSter = SNodeOperations.getModel(targetNode).getStereotype();
      String stubSter = SModelStereotype.getStubStereotypeForId(LanguageID.JAVA);

      if (!(ObjectUtils.equals(stubSter, targetSter))) {
        GoByCurrentReference_Action.this.open(targetNode);
      } else {
        SNode node = GoByCurrentReference_Action.this.cell.getSNodeWRTReference();
        SModel model = node.getModel();
        Set<IModule> modules = model.getModelDescriptor().getModules();
        assert !(modules.isEmpty());
        IModule module = modules.iterator().next();
        if (module instanceof Solution && ((Solution) module).isStub()) {
          Set<MPSModuleOwner> owners = MPSModuleRepository.getInstance().getOwners(module);
          assert !(owners.isEmpty());
          module = ((IModule) owners.iterator().next());
        }
        final String modulePath = module.getDescriptorFile().getAbsolutePath();

        new Thread() {
          public void run() {
            final IProjectHandler handler = MPSPlugin.getInstance().getProjectHandler(modulePath);
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                ModelAccess.instance().runWriteAction(new Runnable() {
                  public void run() {
                    if (handler != null) {
                      GoByCurrentReference_Action.this.navigateToJavaStub(handler, targetNode);
                    } else {
                      GoByCurrentReference_Action.this.open(targetNode);
                    }
                  }
                });
              }
            });
          }
        }.start();
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoByCurrentReference", t);
      }
    }
  }

  private void open(SNode targetNode) {
    GoByCurrentReference_Action.this.context.getComponent(MPSEditorOpener.class).openNode(targetNode, GoByCurrentReference_Action.this.context, true, !(targetNode.isRoot()));
  }

  private boolean navigateToJavaStub(@NotNull IProjectHandler handler, SNode targetNode) {
    SModelReference ref = SNodeOperations.getModel(targetNode).getSModelReference();
    boolean isClassifier = SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.Classifier");
    boolean isConstructor = SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration");
    boolean isMethod = SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(targetNode), "jetbrains.mps.baseLanguage.structure.Classifier");
    boolean isField = (SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(targetNode), "jetbrains.mps.baseLanguage.structure.Classifier");
    if (!(isClassifier || isConstructor || isMethod || isField)) {
      return false;
    }
    try {
      if (isClassifier) {
        String fqName = ref.getLongName() + "." + SPropertyOperations.getString(SNodeOperations.cast(targetNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "name");
        handler.openClass(fqName);
      } else if (isConstructor) {
        String classifierName = GoByCurrentReference_Action.this.getClassifierName(targetNode, ref);
        int paramCount = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(targetNode, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"), "parameter", true)).count();
        handler.openClass(classifierName);
        handler.openConstructor(classifierName, paramCount);
      } else if (isMethod) {
        String classifierName = GoByCurrentReference_Action.this.getClassifierName(targetNode, ref);
        SNode method = SNodeOperations.cast(targetNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
        handler.openMethod(classifierName, SPropertyOperations.getString(method, "name"), ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count());
      } else {
        String classifierName = GoByCurrentReference_Action.this.getClassifierName(targetNode, ref);
        handler.openField(classifierName, targetNode.getName());
      }
    } catch (RemoteException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    return true;
  }

  private String getClassifierName(SNode targetNode, SModelReference ref) {
    SNode classifier = SNodeOperations.cast(SNodeOperations.getParent(targetNode), "jetbrains.mps.baseLanguage.structure.Classifier");
    assert classifier != null;
    return ref.getLongName() + "." + SPropertyOperations.getString(classifier, "name");
  }
}
