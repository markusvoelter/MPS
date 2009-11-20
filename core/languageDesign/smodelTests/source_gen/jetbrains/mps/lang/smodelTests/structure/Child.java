package jetbrains.mps.lang.smodelTests.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Child extends NamedConcept {
  public static final String concept = "jetbrains.mps.lang.smodelTests.structure.Child";
  public static final String GRAND_CHILD_0_1 = "grandChild_0_1";
  public static final String GRAND_CHILD_1 = "grandChild_1";
  public static final String GRAND_CHILD_0_N = "grandChild_0_n";
  public static final String GRAND_CHILD_1_N = "grandChild_1_n";

  public Child(SNode node) {
    super(node);
  }

  public GrandChild getGrandChild_0_1() {
    return (GrandChild)this.getChild(GrandChild.class, Child.GRAND_CHILD_0_1);
  }

  public void setGrandChild_0_1(GrandChild node) {
    super.setChild(Child.GRAND_CHILD_0_1, node);
  }

  public GrandChild getGrandChild_1() {
    return (GrandChild)this.getChild(GrandChild.class, Child.GRAND_CHILD_1);
  }

  public void setGrandChild_1(GrandChild node) {
    super.setChild(Child.GRAND_CHILD_1, node);
  }

  public int getGrandChild_0_nsCount() {
    return this.getChildCount(Child.GRAND_CHILD_0_N);
  }

  public Iterator<GrandChild> grandChild_0_ns() {
    return this.children(GrandChild.class, Child.GRAND_CHILD_0_N);
  }

  public List<GrandChild> getGrandChild_0_ns() {
    return this.getChildren(GrandChild.class, Child.GRAND_CHILD_0_N);
  }

  public void addGrandChild_0_n(GrandChild node) {
    this.addChild(Child.GRAND_CHILD_0_N, node);
  }

  public void insertGrandChild_0_n(GrandChild prev, GrandChild node) {
    this.insertChild(prev, Child.GRAND_CHILD_0_N, node);
  }

  public int getGrandChild_1_nsCount() {
    return this.getChildCount(Child.GRAND_CHILD_1_N);
  }

  public Iterator<GrandChild> grandChild_1_ns() {
    return this.children(GrandChild.class, Child.GRAND_CHILD_1_N);
  }

  public List<GrandChild> getGrandChild_1_ns() {
    return this.getChildren(GrandChild.class, Child.GRAND_CHILD_1_N);
  }

  public void addGrandChild_1_n(GrandChild node) {
    this.addChild(Child.GRAND_CHILD_1_N, node);
  }

  public void insertGrandChild_1_n(GrandChild prev, GrandChild node) {
    this.insertChild(prev, Child.GRAND_CHILD_1_N, node);
  }

  public static Child newInstance(SModel sm, boolean init) {
    return (Child)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodelTests.structure.Child", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Child newInstance(SModel sm) {
    return Child.newInstance(sm, false);
  }
}
