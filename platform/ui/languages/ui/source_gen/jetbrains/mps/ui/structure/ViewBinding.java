package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ui.modeling.structure.UIProperty;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ViewBinding extends BaseConcept {
  public static final String concept = "jetbrains.mps.ui.structure.ViewBinding";
  public static final String PROPERTY = "property";
  public static final String VIEW = "view";

  public ViewBinding(SNode node) {
    super(node);
  }

  public UIProperty getProperty() {
    return (UIProperty) this.getReferent(UIProperty.class, ViewBinding.PROPERTY);
  }

  public void setProperty(UIProperty node) {
    super.setReferent(ViewBinding.PROPERTY, node);
  }

  public View getView() {
    return (View) this.getChild(View.class, ViewBinding.VIEW);
  }

  public void setView(View node) {
    super.setChild(ViewBinding.VIEW, node);
  }

  public static ViewBinding newInstance(SModel sm, boolean init) {
    return (ViewBinding) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ViewBinding", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ViewBinding newInstance(SModel sm) {
    return ViewBinding.newInstance(sm, false);
  }
}
