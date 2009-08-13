package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class Node_GetNextSiblingsOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createComponent_7650_0(context, node);
  }

  private EditorCell createComponent_7650_0(EditorContext context, SNode node) {
    AbstractCellProvider provider = new ReplaceableAliasAndParms_Comp(node);
    EditorCell editorCell = provider.createEditorCell(context);
    return editorCell;
  }

}
