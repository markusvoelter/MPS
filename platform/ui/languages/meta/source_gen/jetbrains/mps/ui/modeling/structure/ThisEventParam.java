package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ThisEventParam extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.ThisEventParam";

  public ThisEventParam(SNode node) {
    super(node);
  }

  public static ThisEventParam newInstance(SModel sm, boolean init) {
    return (ThisEventParam) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.ThisEventParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ThisEventParam newInstance(SModel sm) {
    return ThisEventParam.newInstance(sm, false);
  }
}
