package jetbrains.mps.ypath.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class NodeKindDefaultCase_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6159_0(context, node);
  }

  public EditorCell createCollection_6159_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_6159_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_6159_1(context, node));
    editorCell.addEditorCell(this.createCollection_6159_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6159_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6159_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_6159_0(context, node, "default"));
    editorCell.addEditorCell(this.createConstant_6159_2(context, node, ":"));
    return editorCell;
  }

  public EditorCell createCollection_6159_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6159_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_6159_1(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_6159_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6159_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_6159_3(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_6159_1(context, node));
    editorCell.addEditorCell(this.createCollection_6159_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6159_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6159_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_6159_3(context, node, "break"));
    editorCell.addEditorCell(this.createConstant_6159_4(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant_6159_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6159_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6159_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6159_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6159_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6159_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6159_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6159_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6159_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6159_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_6159_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_6159_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6159_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statementList");
    provider.setNoTargetText("<no statementList>");
    EditorCell cellWithRole = this.createRefNode_6159_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_6159_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6159_0");
  }

  private static void setupBasic_Collection_6159_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6159_1");
  }

  private static void setupBasic_Constant_6159_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6159_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_Collection_6159_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6159_2");
  }

  private static void setupBasic_Constant_6159_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6159_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_6159_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6159_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "punctuation");
    }
  }

  private static void setupBasic_Collection_6159_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6159_3");
  }

  private static void setupBasic_RefNode_6159_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_6159_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6159_4");
  }

  private static void setupBasic_Constant_6159_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6159_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_Constant_6159_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6159_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "punctuation");
    }
  }

}
