package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SModel;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class FixVirtualPackges_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(FixVirtualPackges_Action.class);

  private IModule module;

  public FixVirtualPackges_Action() {
    super("Fix Virtual Packages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return FixVirtualPackges_Action.this.module instanceof Language;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "FixVirtualPackges", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.module = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      Language language = (Language) FixVirtualPackges_Action.this.module;
      SModel structure = language.getStructureModelDescriptor().getSModel();
      List<SNode> concepts = SModelOperations.getRoots(structure, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
      for (SNode concept : concepts) {
        List<SNode> aspects = AbstractConceptDeclaration_Behavior.call_findAllAspects_7754459869734028917(concept, language.getScope());
        for (SNode aspect : aspects) {
          if (!(SNodeOperations.isInstanceOf(aspect, "jetbrains.mps.lang.core.structure.BaseConcept"))) {
            continue;
          }
          String aspectPack = SPropertyOperations.getString(SNodeOperations.cast(aspect, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtualPackage");
          String conceptPack = SPropertyOperations.getString(concept, "virtualPackage");
          if (eq_89si7b_a0d0b0d0a0f(aspectPack, conceptPack)) {
            continue;
          }

          SPropertyOperations.set(SNodeOperations.cast(aspect, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtualPackage", SPropertyOperations.getString(concept, "virtualPackage"));
        }
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "FixVirtualPackges", t);
      }
    }
  }

  private static boolean eq_89si7b_a0d0b0d0a0f(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
