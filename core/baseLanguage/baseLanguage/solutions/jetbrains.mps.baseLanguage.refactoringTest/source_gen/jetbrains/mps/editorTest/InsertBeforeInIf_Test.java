package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

@MPSLaunch
public class InsertBeforeInIf_Test extends BaseTransformationTest {
  @Test
  public void test_InsertBeforeInIf() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("jetbrains.mps.editorTest.InsertBeforeInIf_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      final IEditor editor = TestBody.this.initEditor("1232973328242", "1232973357251");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), " ENTER"));
    }
  }
}
