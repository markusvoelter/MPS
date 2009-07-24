package jetbrains.mpslite.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MPSLiteConceptDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3196_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_3196_2(context, node);
  }

  public EditorCell createCollection_3196_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3196_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_3196_1(context, node));
    editorCell.addEditorCell(this.createCollection_3196_5(context, node));
    editorCell.addEditorCell(this.createConstant_3196_6(context, node, " "));
    return editorCell;
  }

  public EditorCell createCollection_3196_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3196_1(editorCell, node, context);
    if (renderingCondition3196_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_3196_2(context, node, "root"));
    }
    if (renderingCondition3196_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_3196_5(context, node, "abstract"));
    }
    editorCell.addEditorCell(this.createConstant_3196_0(context, node, "concept"));
    editorCell.addEditorCell(this.createProperty_3196_1(context, node));
    editorCell.addEditorCell(this.createConstant_3196_1(context, node, "extends"));
    editorCell.addEditorCell(this.createRefNode_3196_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3196_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3196_2(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_3196_3(context, node));
    editorCell.addEditorCell(this.createCollection_3196_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3196_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3196_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3196_3(context, node, "root"));
    editorCell.addEditorCell(this.createProperty_3196_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3196_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3196_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3196_4(context, node, "abstract"));
    editorCell.addEditorCell(this.createProperty_3196_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3196_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3196_5(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3196_0(context, node));
    editorCell.addEditorCell(this.createRefNode_3196_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_3196_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3196_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3196_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3196_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3196_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3196_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3196_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3196_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell3196_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty_3196_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3196_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3196_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_3196_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3196_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3196_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3196_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("root");
    provider.setNoTargetText("<no root>");
    EditorCell cellWithRole = this.createProperty_3196_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3196_4_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3196_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3196_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("abstract");
    provider.setNoTargetText("<no abstract>");
    EditorCell cellWithRole = this.createProperty_3196_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3196_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3196_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3196_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("lineList");
    provider.setNoTargetText("<no lineList>");
    EditorCell cellWithRole = this.createRefNode_3196_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3196_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3196_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3196_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("extends");
    provider.setNoTargetText("<no extends>");
    EditorCell cellWithRole = this.createRefNode_3196_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3196_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3196_0");
  }

  private static void setupBasic_Collection_3196_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3196_1");
  }

  private static void setupBasic_Constant_3196_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_3196_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Constant_3196_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_1");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_3196_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_2");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_3196_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3196_2");
  }

  private static void setupBasic_Collection_3196_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3196_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3196_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_3");
    MPSLite_Style_StyleSheet.getMPSLiteOption(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_3196_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_root");
  }

  private static void setupBasic_Collection_3196_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3196_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3196_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_4");
    MPSLite_Style_StyleSheet.getMPSLiteOption(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_3196_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_abstract");
  }

  private static void setupBasic_Constant_3196_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_5");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_3196_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3196_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Indent_3196_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3196_0");
  }

  private static void setupBasic_RefNode_3196_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_3196_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3196_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3196_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  public static boolean renderingCondition3196_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "root");
  }

  public static boolean renderingCondition3196_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "abstract");
  }

}
