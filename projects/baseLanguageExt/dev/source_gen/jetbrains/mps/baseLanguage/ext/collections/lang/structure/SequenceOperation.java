package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SequenceOperation extends BaseConcept {

  public  SequenceOperation(SNode node) {
    super(node);
  }

  public static SequenceOperation newInstance(SModel sm, boolean init) {
    return (SequenceOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static SequenceOperation newInstance(SModel sm) {
    return SequenceOperation.newInstance(sm, false);
  }
}
