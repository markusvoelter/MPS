package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class Concept_GetAllSubConcepts_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6ze8vl_a(editorContext, node);
  }

  private EditorCell createCollection_6ze8vl_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_6ze8vl_a");
    editorCell.addEditorCell(this.createComponent_6ze8vl_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6ze8vl_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6ze8vl_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6ze8vl_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6ze8vl_e0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6ze8vl_f0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_6ze8vl_a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ReplaceableAlias_Comp(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_6ze8vl_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_6ze8vl_b0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6ze8vl_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ",");
    editorCell.setCellId("Constant_6ze8vl_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6ze8vl_f0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_6ze8vl_f0");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_6ze8vl_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("smodel");
    provider.setNoTargetText("<smodel>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_6ze8vl_e0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("scope");
    provider.setNoTargetText("<scope>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
}
