package testRefactoring.structure;

/*Generated by MPS */

import testRefactoringTargetLang.structure.AnsotherGoodConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class YetAnotherGoodConcept extends AnsotherGoodConcept {
  public static final String concept = "testRefactoring.structure.YetAnotherGoodConcept";
  public static final String NICE_PROPERTY = "niceProperty";

  public YetAnotherGoodConcept(SNode node) {
    super(node);
  }

  public String getNiceProperty() {
    return this.getProperty(YetAnotherGoodConcept.NICE_PROPERTY);
  }

  public void setNiceProperty(String value) {
    this.setProperty(YetAnotherGoodConcept.NICE_PROPERTY, value);
  }

  public static YetAnotherGoodConcept newInstance(SModel sm, boolean init) {
    return (YetAnotherGoodConcept) SModelUtil_new.instantiateConceptDeclaration("testRefactoring.structure.YetAnotherGoodConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static YetAnotherGoodConcept newInstance(SModel sm) {
    return YetAnotherGoodConcept.newInstance(sm, false);
  }
}
