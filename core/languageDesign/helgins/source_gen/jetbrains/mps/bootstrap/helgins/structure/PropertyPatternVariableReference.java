package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.patterns.structure.PropertyPatternVariableDeclaration;

public class PropertyPatternVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.PropertyPatternVariableReference";
  public static String PATTERN_VAR_DECL = "patternVarDecl";

  public PropertyPatternVariableReference(SNode node) {
    super(node);
  }

  public static PropertyPatternVariableReference newInstance(SModel sm, boolean init) {
    return (PropertyPatternVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.PropertyPatternVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyPatternVariableReference newInstance(SModel sm) {
    return PropertyPatternVariableReference.newInstance(sm, false);
  }


  public PropertyPatternVariableDeclaration getPatternVarDecl() {
    return (PropertyPatternVariableDeclaration)this.getReferent(PropertyPatternVariableReference.PATTERN_VAR_DECL);
  }

  public void setPatternVarDecl(PropertyPatternVariableDeclaration node) {
    super.setReferent(PropertyPatternVariableReference.PATTERN_VAR_DECL, node);
  }

}
