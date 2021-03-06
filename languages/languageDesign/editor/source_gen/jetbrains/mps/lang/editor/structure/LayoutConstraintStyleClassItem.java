package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LayoutConstraintStyleClassItem extends StyleClassItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.LayoutConstraintStyleClassItem";
  public static final String LAYOUT_CONSTRAINT = "layoutConstraint";

  public LayoutConstraintStyleClassItem(SNode node) {
    super(node);
  }

  public _Layout_Constraints_Enum getLayoutConstraint() {
    String value = super.getProperty(LayoutConstraintStyleClassItem.LAYOUT_CONSTRAINT);
    return _Layout_Constraints_Enum.parseValue(value);
  }

  public void setLayoutConstraint(_Layout_Constraints_Enum value) {
    super.setProperty(LayoutConstraintStyleClassItem.LAYOUT_CONSTRAINT, value.getValueAsString());
  }

  public static LayoutConstraintStyleClassItem newInstance(SModel sm, boolean init) {
    return (LayoutConstraintStyleClassItem) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.LayoutConstraintStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LayoutConstraintStyleClassItem newInstance(SModel sm) {
    return LayoutConstraintStyleClassItem.newInstance(sm, false);
  }
}
