package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.plugin.VisibilityLevel;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ExtractFromIntention_Test extends BaseTransformationTest {

  @Test()
  public void test_extractExpression() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_extractExpression", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_extractExpression() throws Exception {
      this.addNodeById("1230052684510");
      this.addNodeById("1230052684520");
      this.addNodeById("1230052684528");
      this.addNodeById("1230052684538");
      SLinkOperations.setTarget(this.getNodeById("1230052684533"), "classConcept", this.getNodeById("1230052684539"), false);
      SLinkOperations.setTarget(this.getNodeById("1230052684533"), "baseMethodDeclaration", this.getNodeById("1230052684540"), false);
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.<SNode>fromArray(this.getNodeById("1230052684515")));
      params.setName("foo");
      params.setVisibilityLevel(VisibilityLevel.PUBLIC);
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      ref.setStaticContainer(this.getNodeById("1230052684521"));
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230052684511"), this.getNodeById("1230052684521")), ListSequence.<SNode>fromArray(this.getNodeById("1230052684529"), this.getNodeById("1230052684539"))));
    }

}

}
