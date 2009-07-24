package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ArrayAccessExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2233_0(context, node);
  }

  public EditorCell createCollection_2233_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_2233_0(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_2233_1(context, node));
    editorCell.addEditorCell(this.createConstant_2233_0(context, node, "["));
    editorCell.addEditorCell(this.createRefNode_2233_3(context, node));
    editorCell.addEditorCell(this.createConstant_2233_1(context, node, "]"));
    return editorCell;
  }

  public EditorCell createConstant_2233_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2233_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2233_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2233_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_2233_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2233_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2233_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("array");
    provider.setNoTargetText("<no array>");
    EditorCell cellWithRole = this.createRefNode_2233_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_2233_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2233_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2233_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("index");
    provider.setNoTargetText("<no index>");
    EditorCell cellWithRole = this.createRefNode_2233_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_2233_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2233_0");
  }

  private static void setupBasic_RefNode_2233_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_2233_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2233_0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    ArrayAccessExpression_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_RefNode_2233_1(EditorCell editorCell, SNode node, EditorContext context) {
    ArrayAccessExpression_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_2233_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2233_1");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    ArrayAccessExpression_Actions.setCellActions(editorCell, node, context);
  }

}
