package jetbrains.mps.bootstrap.helgins.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class CoerceStatement_Editor extends DefaultNodeEditor {

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558946461");
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558952494");
  }
  private static void setupBasic_NodeToCoerceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558961668");
  }
  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558964107");
  }
  private static void setupBasic_PatternCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558972609");
  }
  private static void setupBasic_ConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558976001");
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558946460");
    editorCell.setSelectable(false);
  }
  private static void setupBasic_ConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558985116");
    editorCell.setSelectable(false);
  }
  private static void setupBasic_BodyCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558995383");
  }
  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558983661");
    editorCell.setSelectable(false);
  }
  private static void setupBasic_ConstantCell5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558998791");
  }
  private static void setupBasic_ColumnCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1176558940332");
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_NodeToCoerceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_PatternCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_BodyCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell5(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    CoerceStatement_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "coerce"));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "("));
    editorCell.addEditorCell(this.createNodeToCoerceCell(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ":<"));
    editorCell.addEditorCell(this.createPatternCell(context, node));
    editorCell.addEditorCell(this.createConstantCell3(context, node, ") {"));
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    CoerceStatement_Editor.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "  "));
    editorCell.addEditorCell(this.createBodyCell(context, node));
    return editorCell;
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    CoerceStatement_Editor.setupBasic_ColumnCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createConstantCell5(context, node, "}"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    CoerceStatement_Editor.setupBasic_ConstantCell(editorCell, node, context);
    CoerceStatement_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    CoerceStatement_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    CoerceStatement_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    CoerceStatement_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    CoerceStatement_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    CoerceStatement_Editor.setupBasic_ConstantCell3(editorCell, node, context);
    CoerceStatement_Editor.setupLabel_ConstantCell3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    CoerceStatement_Editor.setupBasic_ConstantCell4(editorCell, node, context);
    CoerceStatement_Editor.setupLabel_ConstantCell4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    CoerceStatement_Editor.setupBasic_ConstantCell5(editorCell, node, context);
    CoerceStatement_Editor.setupLabel_ConstantCell5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createNodeToCoerceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    CoerceStatement_Editor.setupBasic_NodeToCoerceCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      CoerceStatement_Editor.setupLabel_NodeToCoerceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createNodeToCoerceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeToCoerce");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createNodeToCoerceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createPatternCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    CoerceStatement_Editor.setupBasic_PatternCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      CoerceStatement_Editor.setupLabel_PatternCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createPatternCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("pattern");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createPatternCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createBodyCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    CoerceStatement_Editor.setupBasic_BodyCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      CoerceStatement_Editor.setupLabel_BodyCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createBodyCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createBodyCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
}
