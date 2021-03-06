package jetbrains.mps.lang.pattern.testLang.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TestPropertyVariableReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.pattern.testLang.structure.TestPropertyVariableReference";
  public static final String DECLARATION = "declaration";

  public TestPropertyVariableReference(SNode node) {
    super(node);
  }

  public PropertyPatternVariableDeclaration getDeclaration() {
    return (PropertyPatternVariableDeclaration) this.getReferent(PropertyPatternVariableDeclaration.class, TestPropertyVariableReference.DECLARATION);
  }

  public void setDeclaration(PropertyPatternVariableDeclaration node) {
    super.setReferent(TestPropertyVariableReference.DECLARATION, node);
  }

  public static TestPropertyVariableReference newInstance(SModel sm, boolean init) {
    return (TestPropertyVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.pattern.testLang.structure.TestPropertyVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TestPropertyVariableReference newInstance(SModel sm) {
    return TestPropertyVariableReference.newInstance(sm, false);
  }
}
