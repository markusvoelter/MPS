package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class ConfigurationEditorDeclaration_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createComponent_mr6qai_a(editorContext, node);
  }

  private EditorCell createComponent_mr6qai_a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ConfigurationEditorDeclaration_BasicEditor(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }
}
