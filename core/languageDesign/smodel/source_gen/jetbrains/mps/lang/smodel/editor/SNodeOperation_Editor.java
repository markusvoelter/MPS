package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

public class SNodeOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAlias_Comp1722_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createComponent_1722_0(context, node);
  }

  public EditorCell createComponent_1722_0(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp1722_0 == null) {
      this.myReplaceableAlias_Comp1722_0 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp1722_0.createEditorCell(context);
    return editorCell;
  }

}
