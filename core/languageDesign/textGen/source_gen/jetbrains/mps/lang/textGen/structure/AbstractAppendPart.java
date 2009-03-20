package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractAppendPart extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.AbstractAppendPart";

  public AbstractAppendPart(SNode node) {
    super(node);
  }

  public static AbstractAppendPart newInstance(SModel sm, boolean init) {
    return (AbstractAppendPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.AbstractAppendPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractAppendPart newInstance(SModel sm) {
    return AbstractAppendPart.newInstance(sm, false);
  }

}
