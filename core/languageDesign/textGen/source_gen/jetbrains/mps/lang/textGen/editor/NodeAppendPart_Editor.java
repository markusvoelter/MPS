package jetbrains.mps.lang.textGen.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class NodeAppendPart_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_2499_0(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_2499_1(editorContext, node);
  }

  private EditorCell createCollection_2499_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_2499_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "punctuation");
    }
    editorCell.addEditorCell(this.createConstant_2499_0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_2499_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_2499_1(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2499_1(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_2499_1");
    editorCell.addEditorCell(this.createCollection_2499_2(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_2499_2(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_2499_2");
    editorCell.addEditorCell(this.createConstant_2499_2(editorContext, node));
    editorCell.addEditorCell(this.createConstant_2499_3(editorContext, node));
    editorCell.addEditorCell(this.createProperty_2499_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_2499_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "${");
    editorCell.setCellId("Constant_2499_0");
    TextGenStyles_StyleSheet.getAppendPart(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2499_1(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_2499_1");
    TextGenStyles_StyleSheet.getAppendPart(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2499_2(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "with");
    editorCell.setCellId("Constant_2499_2");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_2499_3(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "indent");
    editorCell.setCellId("Constant_2499_3");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_2499_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("value");
    provider.setNoTargetText("<no value>");
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

  private EditorCell createProperty_2499_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("withIndent");
    provider.setNoTargetText("<no withIndent>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_withIndent");
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
