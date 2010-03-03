package jetbrains.mps.bash.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class OutputRedirection_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_b2e668_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_b2e668_a_0(editorContext, node);
  }

  private EditorCell createCollection_b2e668_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_b2e668_a");
    editorCell.addEditorCell(this.createProperty_b2e668_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_b2e668_b0(editorContext, node));
    if (renderingCondition_b2e668_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_b2e668_c0(editorContext, node));
    }
    editorCell.addEditorCell(this.createRefNode_b2e668_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_b2e668_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_b2e668_a_0");
    editorCell.addEditorCell(this.createConstant_b2e668_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_b2e668_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_b2e668_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">");
    editorCell.setCellId("Constant_b2e668_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_b2e668_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "|");
    editorCell.setCellId("Constant_b2e668_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_b2e668_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "noclobber:");
    editorCell.setCellId("Constant_b2e668_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_b2e668_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("n");
    provider.setNoTargetText("<no n>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_n");
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

  private EditorCell createProperty_b2e668_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("noclobber");
    provider.setNoTargetText("<no noclobber>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_noclobber");
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

  private EditorCell createRefNode_b2e668_d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("word");
    provider.setNoTargetText("<no word>");
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

  private static boolean renderingCondition_b2e668_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "noclobber");
  }
}
