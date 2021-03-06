package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.openapi.editor.Editor;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.Assert;

@MPSLaunch
public class TryingToLeftTransformNewExpression_Test extends BaseTransformationTest {
  public TryingToLeftTransformNewExpression_Test() {
  }

  @Test
  public void test_TryingToLeftTransformNewExpression() throws Throwable {
    this.initTest("${mps_home}/MPS.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest("jetbrains.mps.editorTest.TryingToLeftTransformNewExpression_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    public TestBody() {
    }

    @Override
    public void testMethodImpl() throws Exception {
      final Editor editor = TestBody.this.initEditor("2907839077756812217", "2907839077756812221");
      EditorComponent editorComponent = (EditorComponent) editor.getCurrentEditorComponent();
      BaseEditorTestBody.typeString(editorComponent, " ");
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), "ctrl SPACE"));
      Assert.assertTrue(editorComponent.getNodeSubstituteChooser().isVisible());
      editorComponent.getNodeSubstituteChooser().setVisible(false);
      BaseEditorTestBody.invokeAction(editorComponent, "jetbrains.mps.ide.editor.actions.MoveUp_Action");
    }
  }
}
