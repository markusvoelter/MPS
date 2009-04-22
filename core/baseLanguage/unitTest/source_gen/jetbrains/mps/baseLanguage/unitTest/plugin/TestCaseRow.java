package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.apache.commons.lang.ObjectUtils;

public class TestCaseRow extends TestContainerRow {

  private String testCaseName;

  public TestCaseRow(SNode testCase) {
    super(ITestCase_Behavior.call_getClassName_1216136193905(testCase), SNodeOperations.getModel(testCase).getLongName());
    this.testCaseName = ITestCase_Behavior.call_getClassName_1216136193905(testCase);
  }

  public boolean matches(String testCase, String testMethod) {
    return testCase == null || ObjectUtils.equals(testCase, this.testCaseName);
  }

}
