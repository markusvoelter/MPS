package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ToIteratorOperation extends jetbrains.mps.baseLanguage.collections.structure.SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ToIteratorOperation";

  public ToIteratorOperation(SNode node) {
    super(node);
  }

  public static ToIteratorOperation newInstance(SModel sm, boolean init) {
    return (ToIteratorOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ToIteratorOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ToIteratorOperation newInstance(SModel sm) {
    return ToIteratorOperation.newInstance(sm, false);
  }

}
