package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClassPath extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.distrib.structure.ClassPath";
  public static final String CLASS_PATH_ITEM = "classPathItem";

  public ClassPath(SNode node) {
    super(node);
  }

  public int getClassPathItemsCount() {
    return this.getChildCount(ClassPath.CLASS_PATH_ITEM);
  }

  public Iterator<AbstractPath> classPathItems() {
    return this.children(AbstractPath.class, ClassPath.CLASS_PATH_ITEM);
  }

  public List<AbstractPath> getClassPathItems() {
    return this.getChildren(AbstractPath.class, ClassPath.CLASS_PATH_ITEM);
  }

  public void addClassPathItem(AbstractPath node) {
    this.addChild(ClassPath.CLASS_PATH_ITEM, node);
  }

  public void insertClassPathItem(AbstractPath prev, AbstractPath node) {
    this.insertChild(prev, ClassPath.CLASS_PATH_ITEM, node);
  }

  public static ClassPath newInstance(SModel sm, boolean init) {
    return (ClassPath) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.ClassPath", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClassPath newInstance(SModel sm) {
    return ClassPath.newInstance(sm, false);
  }
}
