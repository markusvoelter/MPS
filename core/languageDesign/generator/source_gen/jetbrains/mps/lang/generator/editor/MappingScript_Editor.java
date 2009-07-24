package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MappingScript_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3053_0(context, node);
  }

  public EditorCell createCollection_3053_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3053_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_3053_1(context, node));
    editorCell.addEditorCell(this.createConstant_3053_1(context, node, ""));
    editorCell.addEditorCell(this.createCollection_3053_2(context, node));
    editorCell.addEditorCell(this.createConstant_3053_6(context, node, ""));
    editorCell.addEditorCell(this.createRefNode_3053_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3053_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3053_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3053_0(context, node, "mapping script"));
    editorCell.addEditorCell(this.createProperty_3053_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3053_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3053_2(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_3053_3(context, node));
    if (renderingCondition3053_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_3053_4(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection_3053_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3053_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3053_2(context, node, "script kind"));
    editorCell.addEditorCell(this.createConstant_3053_3(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_3053_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3053_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3053_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3053_4(context, node, "modifies model"));
    editorCell.addEditorCell(this.createConstant_3053_5(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_3053_5(context, node));
    return editorCell;
  }

  public EditorCell createConstant_3053_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3053_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3053_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3053_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3053_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3053_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3053_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3053_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_3053_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3053_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3053_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_3053_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3053_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3053_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3053_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("codeBlock");
    provider.setNoTargetText("<no codeBlock>");
    EditorCell cellWithRole = this.createRefNode_3053_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3053_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3053_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3053_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("scriptKind");
    provider.setNoTargetText("<no scriptKind>");
    EditorCell cellWithRole = this.createProperty_3053_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3053_4_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3053_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3053_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("modifiesModel");
    provider.setNoTargetText("<no modifiesModel>");
    EditorCell cellWithRole = this.createProperty_3053_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3053_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3053_0");
  }

  private static void setupBasic_Collection_3053_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3053_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3053_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_0");
  }

  private static void setupBasic_Property_3053_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Constant_3053_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3053_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3053_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3053_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_3053_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3053_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3053_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_2");
  }

  private static void setupBasic_Constant_3053_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_3053_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_scriptKind");
    Styles_StyleSheet.getConstant(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_3053_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3053_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3053_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_4");
  }

  private static void setupBasic_Constant_3053_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_3053_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_modifiesModel");
    Styles_StyleSheet.getConstant(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_3053_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3053_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  public static boolean renderingCondition3053_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.hasValue(node, "scriptKind", "pre_processing", "post_processing");
  }

}
