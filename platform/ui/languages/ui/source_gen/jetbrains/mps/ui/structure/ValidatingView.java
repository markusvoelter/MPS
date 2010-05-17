package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ValidatingView extends View {
  public static final String concept = "jetbrains.mps.ui.structure.ValidatingView";
  public static final String VIEW = "view";
  public static final String VALIDATOR = "validator";

  public ValidatingView(SNode node) {
    super(node);
  }

  public View getView() {
    return (View) this.getChild(View.class, ValidatingView.VIEW);
  }

  public void setView(View node) {
    super.setChild(ValidatingView.VIEW, node);
  }

  public Validator getValidator() {
    return (Validator) this.getChild(Validator.class, ValidatingView.VALIDATOR);
  }

  public void setValidator(Validator node) {
    super.setChild(ValidatingView.VALIDATOR, node);
  }

  public static ValidatingView newInstance(SModel sm, boolean init) {
    return (ValidatingView) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ValidatingView", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ValidatingView newInstance(SModel sm) {
    return ValidatingView.newInstance(sm, false);
  }
}
