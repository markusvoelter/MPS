package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEdmitorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class DeleteStatement_Test extends BaseTransformationTest {

  @Test()
  public void test_DeleteStatement() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEdmitorTestBody {

    public void testMethod() throws Exception {
      IEditor editor = this.initEditor("1232033114563", "1232033120145");
      BaseEdmitorTestBody.pressKeys(editor, ListSequence.fromListAndArray(new ArrayList<String>(), " DELETE"));
      this.finishTest();
    }

}

}
