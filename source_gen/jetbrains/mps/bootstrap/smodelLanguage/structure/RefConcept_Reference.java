package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class RefConcept_Reference extends RefConcept_Abstract {
  public static String CONCEPT_DECLARATION = "conceptDeclaration";

  public  RefConcept_Reference(SNode node) {
    super(node);
  }

  public static RefConcept_Reference newInstance(SModel sm, boolean init) {
    return (RefConcept_Reference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static RefConcept_Reference newInstance(SModel sm) {
    return RefConcept_Reference.newInstance(sm, false);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration)this.getReferent(RefConcept_Reference.CONCEPT_DECLARATION);
  }
  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(RefConcept_Reference.CONCEPT_DECLARATION, node);
  }
}
