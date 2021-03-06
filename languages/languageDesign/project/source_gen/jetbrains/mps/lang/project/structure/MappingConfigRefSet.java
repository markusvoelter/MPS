package jetbrains.mps.lang.project.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MappingConfigRefSet extends MappingConfigRefBase {
  public static final String concept = "jetbrains.mps.lang.project.structure.MappingConfigRefSet";
  public static final String REFS = "refs";

  public MappingConfigRefSet(SNode node) {
    super(node);
  }

  public int getRefsesCount() {
    return this.getChildCount(MappingConfigRefSet.REFS);
  }

  public Iterator<MappingConfigRefBase> refses() {
    return this.children(MappingConfigRefBase.class, MappingConfigRefSet.REFS);
  }

  public List<MappingConfigRefBase> getRefses() {
    return this.getChildren(MappingConfigRefBase.class, MappingConfigRefSet.REFS);
  }

  public void addRefs(MappingConfigRefBase node) {
    this.addChild(MappingConfigRefSet.REFS, node);
  }

  public void insertRefs(MappingConfigRefBase prev, MappingConfigRefBase node) {
    this.insertChild(prev, MappingConfigRefSet.REFS, node);
  }

  public static MappingConfigRefSet newInstance(SModel sm, boolean init) {
    return (MappingConfigRefSet) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.project.structure.MappingConfigRefSet", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MappingConfigRefSet newInstance(SModel sm) {
    return MappingConfigRefSet.newInstance(sm, false);
  }
}
