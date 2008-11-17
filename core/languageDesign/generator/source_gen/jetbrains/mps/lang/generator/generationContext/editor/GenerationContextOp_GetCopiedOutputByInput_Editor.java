package jetbrains.mps.lang.generator.generationContext.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class GenerationContextOp_GetCopiedOutputByInput_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1217884861524(context, node);
  }

  public EditorCell createCollection1217884861524(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12178848615241217884861524(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1217884861525(context, node, "get copied output for"));
    editorCell.addEditorCell(this.createConstant1225400108746(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1217884861530(context, node));
    editorCell.addEditorCell(this.createConstant1225400068385(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1217884861525(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12178848615251217884861525(editorCell, node, context);
    setupLabel_Constant_1217884861525_1217884861525(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225400068385(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12254000683851225400068385(editorCell, node, context);
    setupLabel_Constant_1225400068385_1225400068385(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225400108746(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12254001087461225400108746(editorCell, node, context);
    setupLabel_Constant_1225400108746_1225400108746(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1217884861530_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_inputNode1217884861530(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_inputNode_1217884861530((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1217884861530(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("inputNode");
    provider.setNoTargetText("<no input node>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1217884861530_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12178848615241217884861524(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1217884861524");
  }

  private static void setupBasic_Constant_12178848615251217884861525(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1217884861525");
    Styles_StyleSheet.getGenContext_operation(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_inputNode1217884861530(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12254000683851225400068385(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225400068385");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12254001087461225400108746(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225400108746");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1217884861525_1217884861525(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_inputNode_1217884861530(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225400068385_1225400068385(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225400108746_1225400108746(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
