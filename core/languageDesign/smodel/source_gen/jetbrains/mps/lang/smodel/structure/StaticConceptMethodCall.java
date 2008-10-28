package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodCall;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.behavior.structure.StaticConceptMethodDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StaticConceptMethodCall extends BaseMethodCall {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.StaticConceptMethodCall";
  public static final String CONCEPT = "concept";

  public StaticConceptMethodCall(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(StaticConceptMethodCall.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(StaticConceptMethodCall.CONCEPT, node);
  }

  public StaticConceptMethodDeclaration getMethodDeclaration() {
    return (StaticConceptMethodDeclaration)this.getBaseMethodDeclaration();
  }

  public void setMethodDeclaration(StaticConceptMethodDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }


  public static StaticConceptMethodCall newInstance(SModel sm, boolean init) {
    return (StaticConceptMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.StaticConceptMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StaticConceptMethodCall newInstance(SModel sm) {
    return StaticConceptMethodCall.newInstance(sm, false);
  }

}
