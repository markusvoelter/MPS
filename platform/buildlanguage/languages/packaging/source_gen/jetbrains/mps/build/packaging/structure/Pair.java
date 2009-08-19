package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Pair extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Pair";
  public static final String FIRST = "first";
  public static final String SECOND = "second";

  public Pair(SNode node) {
    super(node);
  }

  public IStringExpression getFirst() {
    return (IStringExpression)this.getChild(IStringExpression.class, Pair.FIRST);
  }

  public void setFirst(IStringExpression node) {
    super.setChild(Pair.FIRST, node);
  }

  public IStringExpression getSecond() {
    return (IStringExpression)this.getChild(IStringExpression.class, Pair.SECOND);
  }

  public void setSecond(IStringExpression node) {
    super.setChild(Pair.SECOND, node);
  }

  public static Pair newInstance(SModel sm, boolean init) {
    return (Pair)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Pair", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Pair newInstance(SModel sm) {
    return Pair.newInstance(sm, false);
  }
}
