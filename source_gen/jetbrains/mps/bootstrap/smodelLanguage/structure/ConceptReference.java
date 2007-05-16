package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class ConceptReference extends BaseConcept {
  public static String CONCEPT = "concept";

  public  ConceptReference(SNode node) {
    super(node);
  }

  public static ConceptReference newInstance(SModel sm, boolean init) {
    return (ConceptReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.ConceptReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptReference newInstance(SModel sm) {
    return ConceptReference.newInstance(sm, false);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(ConceptReference.CONCEPT);
  }
  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(ConceptReference.CONCEPT, node);
  }
}
