package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptRefExpression extends Expression {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.ConceptRefExpression";
public    static final String CONCEPT_DECLARATION = "conceptDeclaration";

  public ConceptRefExpression(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration)this.getReferent(ConceptRefExpression.CONCEPT_DECLARATION);
  }

  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(ConceptRefExpression.CONCEPT_DECLARATION, node);
  }


  public static ConceptRefExpression newInstance(SModel sm, boolean init) {
    return (ConceptRefExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.ConceptRefExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptRefExpression newInstance(SModel sm) {
    return ConceptRefExpression.newInstance(sm, false);
  }

}
