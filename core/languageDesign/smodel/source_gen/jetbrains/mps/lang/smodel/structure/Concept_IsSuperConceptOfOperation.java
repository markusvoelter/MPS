package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.structure.IRefConceptArg;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Concept_IsSuperConceptOfOperation extends jetbrains.mps.lang.smodel.structure.SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation";
  public static final String CONCEPT_ARGUMENT = "conceptArgument";

  public Concept_IsSuperConceptOfOperation(SNode node) {
    super(node);
  }

  public jetbrains.mps.lang.smodel.structure.IRefConceptArg getConceptArgument() {
    return (jetbrains.mps.lang.smodel.structure.IRefConceptArg)this.getChild(IRefConceptArg.class, Concept_IsSuperConceptOfOperation.CONCEPT_ARGUMENT);
  }

  public void setConceptArgument(jetbrains.mps.lang.smodel.structure.IRefConceptArg node) {
    super.setChild(Concept_IsSuperConceptOfOperation.CONCEPT_ARGUMENT, node);
  }


  public static Concept_IsSuperConceptOfOperation newInstance(SModel sm, boolean init) {
    return (Concept_IsSuperConceptOfOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Concept_IsSuperConceptOfOperation newInstance(SModel sm) {
    return Concept_IsSuperConceptOfOperation.newInstance(sm, false);
  }

}
