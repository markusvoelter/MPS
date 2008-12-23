package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ExtractDefaultClassifierMethodDeclaration_Test extends BaseTransformationTest {

  @Test()
  public void test_extractFromMethod() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_extractFromMethod", true);
  }

  @Test()
  public void test_extractFromExecute() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_extractFromExecute", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_extractFromMethod() throws Exception {
      this.addNodeById("1230052509259");
      this.addNodeById("1230052509277");
      this.addNodeById("1230052509301");
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.<SNode>fromArray(this.getNodeById("1230052509264")));
      params.setName("bar");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230052509260")), ListSequence.<SNode>fromArray(this.getNodeById("1230052509278"))));
    }

    public void test_extractFromExecute() throws Exception {
      this.addNodeById("1230052509259");
      this.addNodeById("1230052509277");
      this.addNodeById("1230052509301");
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.<SNode>fromArray(this.getNodeById("1230052509271")));
      params.setName("boo");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230052509260")), ListSequence.<SNode>fromArray(this.getNodeById("1230052509302"))));
    }

}

}
