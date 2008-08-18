package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

public class Node_GetAllSiblingsOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAliasAndParms_Comp1730_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createComponent1207000523060(context, node);
  }

  public EditorCell createComponent1207000523060(EditorContext context, SNode node) {
    if (this.myReplaceableAliasAndParms_Comp1730_0 == null) {
      this.myReplaceableAliasAndParms_Comp1730_0 = new ReplaceableAliasAndParms_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAliasAndParms_Comp1730_0.createEditorCell(context);
    setupBasic_component_ReplaceableAliasAndParms_Comp1207000523060(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_component_ReplaceableAliasAndParms_Comp1207000523060(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component_ReplaceableAliasAndParms_Comp");
  }

}
