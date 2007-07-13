package jetbrains.mps.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class InlineRegexpExpression_Editor extends DefaultNodeEditor {

  public static boolean _QueryFunction_NodeCondition_1175159220382(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "caseInsensitive");
  }
  public static boolean _QueryFunction_NodeCondition_1175159195326(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "dotAll");
  }
  public static boolean _QueryFunction_NodeCondition_1175159234062(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "multiLine");
  }
  private static void setupBasic_RegexpCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1174510567265");
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(true);
    editorCell.setBracketsColor(MPSColors.DARK_MAGENTA);
  }
  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159209099");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159178653");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159227265");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1174510565684");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158922384");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159122673");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_CaseInsensitiveCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159127847");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159121827");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159118216");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158926904");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_DotAllCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158931609");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158925948");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158939878");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158942349");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.ITALIC);
  }
  private static void setupBasic_RowCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158938845");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158979132");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158981824");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_MultiLineCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158987435");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158980712");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158992283");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158994097");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.ITALIC);
  }
  private static void setupBasic_RowCell5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158991218");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell13(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159026149");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell14(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159029433");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.ITALIC);
  }
  private static void setupBasic_RowCell6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175159024710");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ColumnCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1175158920789");
    editorCell.setDrawBorder(false);
  }
  private static void setupLabel_RegexpCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_MAGENTA);
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_MAGENTA);
  }
  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_MAGENTA);
  }
  private static void setupLabel_ConstantCell3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_CaseInsensitiveCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell5(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_DotAllCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell7(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell8(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell9(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell10(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_MultiLineCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell11(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell12(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell13(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell14(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRegexpCell(context, node));
    if(InlineRegexpExpression_Editor._QueryFunction_NodeCondition_1175159220382(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell(context, node, "CASE_INSENSITIVE"));
    }
    if(InlineRegexpExpression_Editor._QueryFunction_NodeCondition_1175159195326(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell1(context, node, "DOTALL"));
    }
    if(InlineRegexpExpression_Editor._QueryFunction_NodeCondition_1175159234062(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell2(context, node, "MULTILINE"));
    }
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "Case insensitive :"));
    editorCell.addEditorCell(this.createCaseInsensitiveCell(context, node));
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell6(context, node, "Dot all : "));
    editorCell.addEditorCell(this.createDotAllCell(context, node));
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell7(context, node, "  "));
    editorCell.addEditorCell(this.createConstantCell8(context, node, "If dot all mode is enabled, the . symbol class will include new line characters"));
    return editorCell;
  }
  public EditorCell createRowCell4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell4(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell10(context, node, "Multiline mode : "));
    editorCell.addEditorCell(this.createMultiLineCell(context, node));
    return editorCell;
  }
  public EditorCell createRowCell5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell5(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell11(context, node, "  "));
    editorCell.addEditorCell(this.createConstantCell12(context, node, "If multiline mode is enabled, the $ and ^ will work not only in the start and"));
    return editorCell;
  }
  public EditorCell createRowCell6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InlineRegexpExpression_Editor.setupBasic_RowCell6(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell13(context, node, "  "));
    editorCell.addEditorCell(this.createConstantCell14(context, node, "the end of the text but on starts and ends of lines separated by new line characters"));
    return editorCell;
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    InlineRegexpExpression_Editor.setupBasic_ColumnCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell3(context, node, "Options:"));
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createConstantCell5(context, node, ""));
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.addEditorCell(this.createConstantCell9(context, node, ""));
    editorCell.addEditorCell(this.createRowCell4(context, node));
    editorCell.addEditorCell(this.createRowCell5(context, node));
    editorCell.addEditorCell(this.createRowCell6(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell3(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell4(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell5(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell6(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell7(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell8(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell9(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell10(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell11(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell12(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell13(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell13(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell13(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell14(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    InlineRegexpExpression_Editor.setupBasic_ConstantCell14(editorCell, node, context);
    InlineRegexpExpression_Editor.setupLabel_ConstantCell14(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createRegexpCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    InlineRegexpExpression_Editor.setupBasic_RegexpCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      InlineRegexpExpression_Editor.setupLabel_RegexpCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createRegexpCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("regexp");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRegexpCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createCaseInsensitiveCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    InlineRegexpExpression_Editor.setupBasic_CaseInsensitiveCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      InlineRegexpExpression_Editor.setupLabel_CaseInsensitiveCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createCaseInsensitiveCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("caseInsensitive");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createCaseInsensitiveCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createDotAllCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    InlineRegexpExpression_Editor.setupBasic_DotAllCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      InlineRegexpExpression_Editor.setupLabel_DotAllCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createDotAllCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("dotAll");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createDotAllCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createMultiLineCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    InlineRegexpExpression_Editor.setupBasic_MultiLineCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      InlineRegexpExpression_Editor.setupLabel_MultiLineCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createMultiLineCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("multiLine");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createMultiLineCellinternal(context, node, provider);
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
