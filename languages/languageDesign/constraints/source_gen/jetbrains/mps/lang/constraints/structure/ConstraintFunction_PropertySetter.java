package jetbrains.mps.lang.constraints.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunction_PropertySetter extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertySetter";

  public ConstraintFunction_PropertySetter(SNode node) {
    super(node);
  }

  public static ConstraintFunction_PropertySetter newInstance(SModel sm, boolean init) {
    return (ConstraintFunction_PropertySetter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertySetter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstraintFunction_PropertySetter newInstance(SModel sm) {
    return ConstraintFunction_PropertySetter.newInstance(sm, false);
  }
}
