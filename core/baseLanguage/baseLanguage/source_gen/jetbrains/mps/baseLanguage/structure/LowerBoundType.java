package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LowerBoundType extends jetbrains.mps.baseLanguage.structure.Type {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.LowerBoundType";
  public static final String BOUND = "bound";

  public LowerBoundType(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Type getBound() {
    return (jetbrains.mps.baseLanguage.structure.Type)this.getChild(Type.class, LowerBoundType.BOUND);
  }

  public void setBound(jetbrains.mps.baseLanguage.structure.Type node) {
    super.setChild(LowerBoundType.BOUND, node);
  }


  public static LowerBoundType newInstance(SModel sm, boolean init) {
    return (LowerBoundType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LowerBoundType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LowerBoundType newInstance(SModel sm) {
    return LowerBoundType.newInstance(sm, false);
  }

}
