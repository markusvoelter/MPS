package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class ConceptSubstitutePart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart";
  public static String CONCEPT = "concept";

  public ConceptSubstitutePart(SNode node) {
    super(node);
  }

  public static ConceptSubstitutePart newInstance(SModel sm, boolean init) {
    return (ConceptSubstitutePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptSubstitutePart newInstance(SModel sm) {
    return ConceptSubstitutePart.newInstance(sm, false);
  }


  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptSubstitutePart.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(ConceptSubstitutePart.CONCEPT, node);
  }

}
