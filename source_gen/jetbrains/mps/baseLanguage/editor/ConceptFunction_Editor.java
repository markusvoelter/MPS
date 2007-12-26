package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;

public class ConceptFunction_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConceptFunction_Component;

  private static void setupBasic_ConceptFunction_ComponentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196975582231");
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConceptFunction_ComponentCell(context, node);
  }

  public EditorCell createConceptFunction_ComponentCell(EditorContext context, SNode node) {
    if(this.myConceptFunction_Component == null) {
      this.myConceptFunction_Component = new ConceptFunction_Component(node);
    }
    EditorCell componentCell = this.myConceptFunction_Component.createEditorCell(context);
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.addEditorCell(componentCell);
    ConceptFunction_Editor.setupBasic_ConceptFunction_ComponentCell(editorCell, node, context);
    return editorCell;
  }

}
