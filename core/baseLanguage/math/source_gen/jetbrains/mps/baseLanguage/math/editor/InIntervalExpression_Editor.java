package jetbrains.mps.baseLanguage.math.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.baseLanguage.editor.BinaryOperation_LeftArgument_Actions;
import jetbrains.mps.baseLanguage.editor.BinaryOperation_RightArgument_Actions;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class InIntervalExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0650_0(context, node);
  }

  public EditorCell createCollection_0650_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0650_0(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_0650_1(context, node));
    editorCell.addEditorCell(this.createConstant_0650_0(context, node, "\u2208"));
    editorCell.addEditorCell(this.createRefNode_0650_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_0650_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0650_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new InIntervalExpression_Editor.InIntervalExpression_Editor_replaceWith_BinaryOperation_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createRefNode_0650_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0650_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0650_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftExpression");
    provider.setNoTargetText("<no leftExpression>");
    EditorCell cellWithRole = this.createRefNode_0650_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0650_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0650_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0650_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("rightExpression");
    provider.setNoTargetText("<no rightExpression>");
    EditorCell cellWithRole = this.createRefNode_0650_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0650_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0650_0");
  }

  private static void setupBasic_RefNode_0650_0(EditorCell editorCell, SNode node, EditorContext context) {
    BinaryOperation_LeftArgument_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_0650_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0650_0");
  }

  private static void setupBasic_RefNode_0650_1(EditorCell editorCell, SNode node, EditorContext context) {
    BinaryOperation_RightArgument_Actions.setCellActions(editorCell, node, context);
  }

  public static class InIntervalExpression_Editor_replaceWith_BinaryOperation_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public InIntervalExpression_Editor_replaceWith_BinaryOperation_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.baseLanguage.structure.BinaryOperation";
    }

}

}
