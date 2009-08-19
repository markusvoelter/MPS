package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractConceptReference extends BaseConcept {
  public static final String concept = "jetbrains.mpslite.structure.AbstractConceptReference";
  public static final String CONCEPT_DECLARATION = "conceptDeclaration";

  public AbstractConceptReference(SNode node) {
    super(node);
  }

  public INamedConcept getConceptDeclaration() {
    return (INamedConcept)this.getReferent(INamedConcept.class, AbstractConceptReference.CONCEPT_DECLARATION);
  }

  public void setConceptDeclaration(INamedConcept node) {
    super.setReferent(AbstractConceptReference.CONCEPT_DECLARATION, node);
  }

  public static AbstractConceptReference newInstance(SModel sm, boolean init) {
    return (AbstractConceptReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.AbstractConceptReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractConceptReference newInstance(SModel sm) {
    return AbstractConceptReference.newInstance(sm, false);
  }
}
