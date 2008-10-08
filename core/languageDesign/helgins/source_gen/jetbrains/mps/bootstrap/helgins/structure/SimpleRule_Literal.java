package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleRule_Literal extends SimpleRule {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.SimpleRule_Literal";
  public static String CONCEPT_REFERENCE = "conceptReference";
  public static String TYPE = "type";

  public SimpleRule_Literal(SNode node) {
    super(node);
  }

  public ConceptReference getConceptReference() {
    return (ConceptReference)this.getChild(SimpleRule_Literal.CONCEPT_REFERENCE);
  }

  public void setConceptReference(ConceptReference node) {
    super.setChild(SimpleRule_Literal.CONCEPT_REFERENCE, node);
  }

  public BaseConcept getType() {
    return (BaseConcept)this.getChild(SimpleRule_Literal.TYPE);
  }

  public void setType(BaseConcept node) {
    super.setChild(SimpleRule_Literal.TYPE, node);
  }


  public static SimpleRule_Literal newInstance(SModel sm, boolean init) {
    return (SimpleRule_Literal)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.SimpleRule_Literal", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleRule_Literal newInstance(SModel sm) {
    return SimpleRule_Literal.newInstance(sm, false);
  }

}
