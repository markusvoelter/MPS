package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptProperty extends jetbrains.mps.lang.core.structure.BaseConcept {
  public static final String concept = "jetbrains.mps.lang.structure.structure.ConceptProperty";
  public static final String CONCEPT_PROPERTY_DECLARATION = "conceptPropertyDeclaration";

  public ConceptProperty(SNode node) {
    super(node);
  }

  public jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration getConceptPropertyDeclaration() {
    return (jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration)this.getReferent(ConceptPropertyDeclaration.class, ConceptProperty.CONCEPT_PROPERTY_DECLARATION);
  }

  public void setConceptPropertyDeclaration(jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration node) {
    super.setReferent(ConceptProperty.CONCEPT_PROPERTY_DECLARATION, node);
  }


  public static ConceptProperty newInstance(SModel sm, boolean init) {
    return (ConceptProperty)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.ConceptProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptProperty newInstance(SModel sm) {
    return ConceptProperty.newInstance(sm, false);
  }

}
