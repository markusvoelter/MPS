package jetbrains.mps.bootstrap.helgins.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class IsSubtypeExpression_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell9141_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell9141_0");
  }

  private static void setupBasic_ConstantCell9141_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell9141_0");
  }

  private static void setupBasic_subtypeExpressionRefNodeCell9141_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell9141_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell9141_01");
  }

  private static void setupBasic_supertypeExpressionRefNodeCell9141_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell9141_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell9141_02");
  }

  private static void setupLabel_ConstantCell9141_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_subtypeExpressionRefNodeCell9141_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell9141_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_supertypeExpressionRefNodeCell9141_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell9141_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell9141_0(context, node);
  }

  public EditorCell create_CollectionCell9141_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell9141_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell9141_0(context, node, "isSubtype("));
    editorCell.addEditorCell(this.create_subtypeExpressionRefNodeCell9141_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell9141_01(context, node, ":<"));
    editorCell.addEditorCell(this.create_supertypeExpressionRefNodeCell9141_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell9141_02(context, node, ")"));
    return editorCell;
  }

  public EditorCell create_ConstantCell9141_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell9141_0(editorCell, node, context);
    setupLabel_ConstantCell9141_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new ISubstituteInfoPart[]{new IsSubtypeExpression_Editor.IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_ConstantCell9141_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell9141_01(editorCell, node, context);
    setupLabel_ConstantCell9141_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell9141_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell9141_02(editorCell, node, context);
    setupLabel_ConstantCell9141_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_subtypeExpressionRefNodeCell9141_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_subtypeExpressionRefNodeCell9141_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_subtypeExpressionRefNodeCell9141_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_subtypeExpressionRefNodeCell9141_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("subtypeExpression");
    provider.setNoTargetText("<no subtypeExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_subtypeExpressionRefNodeCell9141_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_supertypeExpressionRefNodeCell9141_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_supertypeExpressionRefNodeCell9141_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_supertypeExpressionRefNodeCell9141_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_supertypeExpressionRefNodeCell9141_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("supertypeExpression");
    provider.setNoTargetText("<no supertypeExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_supertypeExpressionRefNodeCell9141_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression";
    }

}

}
