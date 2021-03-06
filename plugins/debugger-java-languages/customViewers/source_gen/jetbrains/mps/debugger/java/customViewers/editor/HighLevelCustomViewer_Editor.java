package jetbrains.mps.debugger.java.customViewers.editor;

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

public class HighLevelCustomViewer_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_5jxfrn_a(editorContext, node);
  }

  private EditorCell createCollection_5jxfrn_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_5jxfrn_a");
    editorCell.addEditorCell(this.createCollection_5jxfrn_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_5jxfrn_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_e0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5jxfrn_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_g0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_h0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5jxfrn_i0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_j0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5jxfrn_k0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5jxfrn_l0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_5jxfrn_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_5jxfrn_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_5jxfrn_a0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_5jxfrn_b0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_5jxfrn_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_5jxfrn_c0");
    editorCell.addEditorCell(this.createConstant_5jxfrn_a2a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5jxfrn_b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "custom viewer");
    editorCell.setCellId("Constant_5jxfrn_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5jxfrn_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "for type:");
    editorCell.setCellId("Constant_5jxfrn_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5jxfrn_d0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "can wrap:");
    editorCell.setCellId("Constant_5jxfrn_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5jxfrn_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_h0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "get presentation:");
    editorCell.setCellId("Constant_5jxfrn_h0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_j0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5jxfrn_j0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5jxfrn_k0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "get custom watchables");
    editorCell.setCellId("Constant_5jxfrn_k0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_5jxfrn_b2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("valueType");
    provider.setNoTargetText("<no valueType>");
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

  private EditorCell createRefNode_5jxfrn_f0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("canWrap");
    provider.setNoTargetText("<no canWrap>");
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

  private EditorCell createRefNode_5jxfrn_i0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("getPresentation");
    provider.setNoTargetText("<no getPresentation>");
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

  private EditorCell createRefNode_5jxfrn_l0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("getWatchables");
    provider.setNoTargetText("<no getWatchables>");
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

  private EditorCell createProperty_5jxfrn_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
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
