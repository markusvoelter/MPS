package jetbrains.mps.lang.editor.table.genericTable.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;

@MPSLaunch
public class EditCell_Test extends BaseTransformationTest {
  @Test
  public void test_EditCell() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:e02ee75b-0624-4ff2-b4d9-d2277a157ff4(jetbrains.mps.lang.editor.table.genericTable.test)");
    this.runTest("jetbrains.mps.lang.editor.table.genericTable.test.EditCell_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      final IEditor editor = TestBody.this.initEditor("6170050146384276510", "6170050146384276532");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide#action#jetbrains.mps.ide.actions.SelectUp_Action");
      BaseEditorTestBody.typeString(editorComponent, "newValue");

    }
  }
}
