package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.plugin.InlineMethodRefactoringAnalyzer;
import jetbrains.mps.baseLanguage.plugin.InlineMethodDialogModel;

public class InlineWithNoSourcesAttached_Test extends BaseTransformationTest {

  @Test()
  public void test_InlineWithNoSourcesAttached() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_InlineWithNoSourcesAttached", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_InlineWithNoSourcesAttached() throws Exception {
      this.addNodeById("1230052989307");
      this.addNodeById("1230052989320");
      Assert.assertTrue(InlineMethodRefactoringAnalyzer.getErrors(new InlineMethodDialogModel(this.getNodeById("1230052989317"), null)) != null);
    }

}

}
