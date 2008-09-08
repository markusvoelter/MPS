package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NTimesRegexp extends UnaryRegexp {
  public static final String concept = "jetbrains.mps.regexp.structure.NTimesRegexp";
  public static String N = "n";

  public NTimesRegexp(SNode node) {
    super(node);
  }

  public int getN() {
    return this.getIntegerProperty(NTimesRegexp.N);
  }

  public void setN(int value) {
    this.setIntegerProperty(NTimesRegexp.N, value);
  }


  public static NTimesRegexp newInstance(SModel sm, boolean init) {
    return (NTimesRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.structure.NTimesRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NTimesRegexp newInstance(SModel sm) {
    return NTimesRegexp.newInstance(sm, false);
  }

}
