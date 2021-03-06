package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Concept_IsExactlyOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Concept_IsExactlyOperation";
  public static final String CONCEPT_ARGUMENT = "conceptArgument";

  public Concept_IsExactlyOperation(SNode node) {
    super(node);
  }

  public IRefConceptArg getConceptArgument() {
    return (IRefConceptArg) this.getChild(IRefConceptArg.class, Concept_IsExactlyOperation.CONCEPT_ARGUMENT);
  }

  public void setConceptArgument(IRefConceptArg node) {
    super.setChild(Concept_IsExactlyOperation.CONCEPT_ARGUMENT, node);
  }

  public static Concept_IsExactlyOperation newInstance(SModel sm, boolean init) {
    return (Concept_IsExactlyOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Concept_IsExactlyOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Concept_IsExactlyOperation newInstance(SModel sm) {
    return Concept_IsExactlyOperation.newInstance(sm, false);
  }
}
