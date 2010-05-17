package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Context extends BaseConcept {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.Context";
  public static final String UI_OBJECT = "uiObject";

  public Context(SNode node) {
    super(node);
  }

  public UIObject getUiObject() {
    return (UIObject) this.getReferent(UIObject.class, Context.UI_OBJECT);
  }

  public void setUiObject(UIObject node) {
    super.setReferent(Context.UI_OBJECT, node);
  }

  public static Context newInstance(SModel sm, boolean init) {
    return (Context) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.Context", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Context newInstance(SModel sm) {
    return Context.newInstance(sm, false);
  }
}
