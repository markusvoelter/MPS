package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SmartClosureParameterDeclaration extends jetbrains.mps.baseLanguage.closures.structure.UnboundClosureParameterDeclaration {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration";

  public SmartClosureParameterDeclaration(SNode node) {
    super(node);
  }

  public static SmartClosureParameterDeclaration newInstance(SModel sm, boolean init) {
    return (SmartClosureParameterDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SmartClosureParameterDeclaration newInstance(SModel sm) {
    return SmartClosureParameterDeclaration.newInstance(sm, false);
  }

}
