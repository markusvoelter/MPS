package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractSetOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.AbstractSetOperation";

  public AbstractSetOperation(SNode node) {
    super(node);
  }

  public static AbstractSetOperation newInstance(SModel sm, boolean init) {
    return (AbstractSetOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.AbstractSetOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractSetOperation newInstance(SModel sm) {
    return AbstractSetOperation.newInstance(sm, false);
  }

}
