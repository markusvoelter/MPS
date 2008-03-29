package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class Model_AddRootOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAlias_Comp1;

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206482604994");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ReplaceableAlias_CompCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206482604995");
  }

  private static void setupBasic_NodeArgumentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206482605000");
  }

  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206482605001");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.PLAIN);
  }

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206484905011");
    editorCell.setSelectable(false);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.setLayoutConstraint("punctuation");
  }

  private static void setupLabel_NodeArgumentCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    Model_AddRootOperation_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createReplaceableAlias_CompCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "("));
    editorCell.addEditorCell(this.createNodeArgumentCell(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, ")"));
    return editorCell;
  }

  public EditorCell createReplaceableAlias_CompCell(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp1 == null) {
      this.myReplaceableAlias_Comp1 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp1.createEditorCell(context);
    Model_AddRootOperation_Editor.setupBasic_ReplaceableAlias_CompCell(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    Model_AddRootOperation_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    Model_AddRootOperation_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    Model_AddRootOperation_Editor.setupBasic_ConstantCell(editorCell, node, context);
    Model_AddRootOperation_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createNodeArgumentCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    Model_AddRootOperation_Editor.setupBasic_NodeArgumentCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      Model_AddRootOperation_Editor.setupLabel_NodeArgumentCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createNodeArgumentCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeArgument");
    provider.setNoTargetText("<no prototype>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createNodeArgumentCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

}
