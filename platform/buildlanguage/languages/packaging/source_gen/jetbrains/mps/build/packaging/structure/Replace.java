package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Replace extends File {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Replace";
  public static final String REPLACING_PAIR = "replacingPair";

  public Replace(SNode node) {
    super(node);
  }

  public int getReplacingPairsCount() {
    return this.getChildCount(Replace.REPLACING_PAIR);
  }

  public Iterator<Pair> replacingPairs() {
    return this.children(Pair.class, Replace.REPLACING_PAIR);
  }

  public List<Pair> getReplacingPairs() {
    return this.getChildren(Pair.class, Replace.REPLACING_PAIR);
  }

  public void addReplacingPair(Pair node) {
    this.addChild(Replace.REPLACING_PAIR, node);
  }

  public void insertReplacingPair(Pair prev, Pair node) {
    this.insertChild(prev, Replace.REPLACING_PAIR, node);
  }

  public static Replace newInstance(SModel sm, boolean init) {
    return (Replace) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Replace", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Replace newInstance(SModel sm) {
    return Replace.newInstance(sm, false);
  }
}
