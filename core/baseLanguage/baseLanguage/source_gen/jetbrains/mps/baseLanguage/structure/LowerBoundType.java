package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LowerBoundType extends Type {
public    static final String concept = "jetbrains.mps.baseLanguage.structure.LowerBoundType";
public    static final String BOUND = "bound";

  public LowerBoundType(SNode node) {
    super(node);
  }

  public Type getBound() {
    return (Type)this.getChild(LowerBoundType.BOUND);
  }

  public void setBound(Type node) {
    super.setChild(LowerBoundType.BOUND, node);
  }


  public static LowerBoundType newInstance(SModel sm, boolean init) {
    return (LowerBoundType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LowerBoundType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LowerBoundType newInstance(SModel sm) {
    return LowerBoundType.newInstance(sm, false);
  }

}
