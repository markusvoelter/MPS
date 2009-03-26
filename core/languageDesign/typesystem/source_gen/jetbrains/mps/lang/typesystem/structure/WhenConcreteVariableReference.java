package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.typesystem.structure.WhenConcreteVariableDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WhenConcreteVariableReference extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.WhenConcreteVariableReference";
  public static final String WHEN_CONCRETE_VAR = "whenConcreteVar";

  public WhenConcreteVariableReference(SNode node) {
    super(node);
  }

  public jetbrains.mps.lang.typesystem.structure.WhenConcreteVariableDeclaration getWhenConcreteVar() {
    return (jetbrains.mps.lang.typesystem.structure.WhenConcreteVariableDeclaration)this.getReferent(WhenConcreteVariableDeclaration.class, WhenConcreteVariableReference.WHEN_CONCRETE_VAR);
  }

  public void setWhenConcreteVar(jetbrains.mps.lang.typesystem.structure.WhenConcreteVariableDeclaration node) {
    super.setReferent(WhenConcreteVariableReference.WHEN_CONCRETE_VAR, node);
  }


  public static WhenConcreteVariableReference newInstance(SModel sm, boolean init) {
    return (WhenConcreteVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.WhenConcreteVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WhenConcreteVariableReference newInstance(SModel sm) {
    return WhenConcreteVariableReference.newInstance(sm, false);
  }

}
