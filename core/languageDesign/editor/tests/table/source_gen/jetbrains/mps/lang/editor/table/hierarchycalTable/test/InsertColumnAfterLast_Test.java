package jetbrains.mps.lang.editor.table.hierarchycalTable.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class InsertColumnAfterLast_Test extends BaseTransformationTest {
  @Test
  public void test_InsertColumnAfterLast() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/editor/editor.mpr", "r:67b81510-37ee-448c-9923-c51275863bef(jetbrains.mps.lang.editor.table.hierarchycalTable.test)");
    this.runTest("jetbrains.mps.lang.editor.table.hierarchycalTable.test.InsertColumnAfterLast_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      final IEditor editor = TestBody.this.initEditor("5171926735592482853", "5171926735592482884");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide.actions.Insert_Action");
    }
  }
}
