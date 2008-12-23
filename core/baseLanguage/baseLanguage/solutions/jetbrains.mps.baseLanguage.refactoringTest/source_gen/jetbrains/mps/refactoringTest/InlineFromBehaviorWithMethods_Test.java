package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.InlineMethodRefactoring;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;

public class InlineFromBehaviorWithMethods_Test extends BaseTransformationTest {

  @Test()
  public void test_InlineFromBehaviorWithMethods() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_InlineFromBehaviorWithMethods", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_InlineFromBehaviorWithMethods() throws Exception {
      this.addNodeById("1230053040768");
      this.addNodeById("1230053040816");
      this.addNodeById("1230053040864");
      this.addNodeById("1230053040868");
      InlineMethodRefactoring ref = new InlineMethodRefactoring(this.getNodeById("1230053040785"));
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230053040769")), ListSequence.<SNode>fromArray(this.getNodeById("1230053040817"))));
    }

}

}
