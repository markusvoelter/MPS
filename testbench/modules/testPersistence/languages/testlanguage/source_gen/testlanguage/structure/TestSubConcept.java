package testlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TestSubConcept extends TestConcept {
  public static final String concept = "testlanguage.structure.TestSubConcept";

  public TestSubConcept(SNode node) {
    super(node);
  }

  public static TestSubConcept newInstance(SModel sm, boolean init) {
    return (TestSubConcept) SModelUtil_new.instantiateConceptDeclaration("testlanguage.structure.TestSubConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TestSubConcept newInstance(SModel sm) {
    return TestSubConcept.newInstance(sm, false);
  }
}
