package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class Concept_IsExactlyOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_IsExactlyOperation";
  public static String CONCEPT_ARGUMENT = "conceptArgument";
  public static String CONCEPT_DECLARATION = "conceptDeclaration";

  public  Concept_IsExactlyOperation(SNode node) {
    super(node);
  }

  public static Concept_IsExactlyOperation newInstance(SModel sm, boolean init) {
    return (Concept_IsExactlyOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_IsExactlyOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Concept_IsExactlyOperation newInstance(SModel sm) {
    return Concept_IsExactlyOperation.newInstance(sm, false);
  }


  public IRefConceptArg getConceptArgument() {
    return (IRefConceptArg)this.getChild(Concept_IsExactlyOperation.CONCEPT_ARGUMENT);
  }

  public void setConceptArgument(IRefConceptArg node) {
    super.setChild(Concept_IsExactlyOperation.CONCEPT_ARGUMENT, node);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration)this.getReferent(Concept_IsExactlyOperation.CONCEPT_DECLARATION);
  }

  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(Concept_IsExactlyOperation.CONCEPT_DECLARATION, node);
  }

}
