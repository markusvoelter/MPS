package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OverloadedOperatorTypeFunction extends jetbrains.mps.baseLanguage.structure.ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.OverloadedOperatorTypeFunction";

  public OverloadedOperatorTypeFunction(SNode node) {
    super(node);
  }

  public static OverloadedOperatorTypeFunction newInstance(SModel sm, boolean init) {
    return (OverloadedOperatorTypeFunction)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.OverloadedOperatorTypeFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OverloadedOperatorTypeFunction newInstance(SModel sm) {
    return OverloadedOperatorTypeFunction.newInstance(sm, false);
  }

}
