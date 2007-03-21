package jetbrains.mps.regexp.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParensRegexp extends Regexp {
  public static String EXPR = "expr";

  public  ParensRegexp(SNode node) {
    super(node);
  }

  public static ParensRegexp newInstance(SModel sm, boolean init) {
    return (ParensRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.ParensRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ParensRegexp newInstance(SModel sm) {
    return ParensRegexp.newInstance(sm, false);
  }

  public Regexp getExpr() {
    return (Regexp)this.getChild(ParensRegexp.EXPR);
  }
  public void setExpr(Regexp node) {
    super.setChild(ParensRegexp.EXPR, node);
  }
}
