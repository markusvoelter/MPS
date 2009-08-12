package jetbrains.mps.samples.formulaLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class Operation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4955_0(context, node);
  }

  public EditorCell createCollection_4955_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4955_0");
    editorCell.addEditorCell(this.createRefNode_4955_0(context, node));
    editorCell.addEditorCell(this.createError_4955_0(context, node));
    return editorCell;
  }

  public EditorCell createError_4955_0(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, " ");
    editorCell.setCellId("Error_4955_0");
    Operation_symbol_Actions.setCellActions(editorCell, node, context);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new Operation_Editor.Operation_Editor_replaceWith_Operation_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createRefNode_4955_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftOperand");
    provider.setNoTargetText("<expression>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    Operation_leftOperand_Actions.setCellActions(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class Operation_Editor_replaceWith_Operation_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public Operation_Editor_replaceWith_Operation_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.samples.formulaLanguage.structure.Operation";
    }

}

}
