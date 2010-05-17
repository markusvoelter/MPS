package jetbrains.mps.ui.internal.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ui.structure.Controller;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContextControllerWrapper extends ContextWrapper {
  public static final String concept = "jetbrains.mps.ui.internal.structure.ContextControllerWrapper";
  public static final String CONTROLLER = "controller";

  public ContextControllerWrapper(SNode node) {
    super(node);
  }

  public Controller getController() {
    return (Controller) this.getChild(Controller.class, ContextControllerWrapper.CONTROLLER);
  }

  public void setController(Controller node) {
    super.setChild(ContextControllerWrapper.CONTROLLER, node);
  }

  public static ContextControllerWrapper newInstance(SModel sm, boolean init) {
    return (ContextControllerWrapper) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.internal.structure.ContextControllerWrapper", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContextControllerWrapper newInstance(SModel sm) {
    return ContextControllerWrapper.newInstance(sm, false);
  }
}
