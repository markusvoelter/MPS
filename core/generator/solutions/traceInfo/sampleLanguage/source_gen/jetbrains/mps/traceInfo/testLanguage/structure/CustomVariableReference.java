package jetbrains.mps.traceInfo.testLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.traceInfo.testLanguage.structure.CustomVariableReference";
  public static final String DECLARATION = "declaration";

  public CustomVariableReference(SNode node) {
    super(node);
  }

  public CustomVariableDeclaration getDeclaration() {
    return (CustomVariableDeclaration) this.getReferent(CustomVariableDeclaration.class, CustomVariableReference.DECLARATION);
  }

  public void setDeclaration(CustomVariableDeclaration node) {
    super.setReferent(CustomVariableReference.DECLARATION, node);
  }

  public static CustomVariableReference newInstance(SModel sm, boolean init) {
    return (CustomVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.traceInfo.testLanguage.structure.CustomVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomVariableReference newInstance(SModel sm) {
    return CustomVariableReference.newInstance(sm, false);
  }
}
