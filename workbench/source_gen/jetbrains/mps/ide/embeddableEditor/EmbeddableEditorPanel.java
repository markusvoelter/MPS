package jetbrains.mps.ide.embeddableEditor;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.openapi.actionSystem.DataProvider;
import jetbrains.mps.workbench.editors.MPSFileNodeEditor;
import java.awt.BorderLayout;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.workbench.MPSDataKeys;

/* package */class EmbeddableEditorPanel extends JPanel implements DataProvider {

  private MPSFileNodeEditor myFileNodeEditor;

  /* package */EmbeddableEditorPanel(MPSFileNodeEditor editor) {
    super(new BorderLayout());
    this.myFileNodeEditor = editor;
    this.add(editor.getComponent(), BorderLayout.CENTER);
  }

  @Nullable()
  public Object getData(@NonNls() String dataId) {
    if (dataId.equals(MPSDataKeys.FILE_EDITOR.getName())) {
      return this.myFileNodeEditor;
    }
    return null;
  }

}
