package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AnonymousCellAnnotation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_7250_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_7250_1(context, node);
  }

  public EditorCell createAlternation_7250_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = AnonymousCellAnnotation_Editor.renderingCondition7250_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_7250_5(context, node, "last");
    } else
    {
      editorCell = this.createNonEmptyProperty_7250_1(context, node);
    }
    setupBasic_Alternation_7250_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection_7250_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7250_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7250_0(context, node, "<"));
    editorCell.addEditorCell(this.createConstant_7250_2(context, node, "cell"));
    editorCell.addEditorCell(this.createAttributedNodeCell_7250_0(context, node));
    editorCell.addEditorCell(this.createConstant_7250_1(context, node, ">"));
    return editorCell;
  }

  public EditorCell createCollection_7250_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7250_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7250_8(context, node, "is in inspector"));
    editorCell.addEditorCell(this.createProperty_7250_7(context, node));
    editorCell.addEditorCell(this.createConstant_7250_3(context, node, "cell id:"));
    editorCell.addEditorCell(this.createProperty_7250_1(context, node));
    editorCell.addEditorCell(this.createConstant_7250_4(context, node, "position:"));
    editorCell.addEditorCell(this.createAlternation_7250_0(context, node));
    if (renderingCondition7250_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_7250_2(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection_7250_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7250_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7250_6(context, node, "selection start:"));
    editorCell.addEditorCell(this.createProperty_7250_3(context, node));
    editorCell.addEditorCell(this.createConstant_7250_7(context, node, "selection end:"));
    editorCell.addEditorCell(this.createProperty_7250_5(context, node));
    return editorCell;
  }

  public EditorCell createConstant_7250_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7250_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7250_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createAttributedNodeCell_7250_0(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    setupBasic_AttributedNodeCell_7250_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createProperty_7250_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7250_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7250_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("cellId");
    provider.setNoTargetText("<no cellId>");
    EditorCell cellWithRole = this.createProperty_7250_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createNonEmptyProperty_7250_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_NonEmptyProperty_7250_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createNonEmptyProperty_7250_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("caretPosition");
    provider.setNoTargetText("<no caretPosition>");
    EditorCell cellWithRole = this.createNonEmptyProperty_7250_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7250_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7250_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7250_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("selectionStart");
    provider.setNoTargetText("<no selectionStart>");
    EditorCell cellWithRole = this.createProperty_7250_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7250_4_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7250_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7250_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("selectionEnd");
    provider.setNoTargetText("<no selectionEnd>");
    EditorCell cellWithRole = this.createProperty_7250_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7250_6_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7250_3(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7250_7(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isInInspector");
    provider.setNoTargetText("<no isInInspector>");
    EditorCell cellWithRole = this.createProperty_7250_6_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_7250_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7250_0");
  }

  private static void setupBasic_Constant_7250_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
  }

  private static void setupBasic_Constant_7250_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
  }

  private static void setupBasic_AttributedNodeCell_7250_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_7250_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_2");
    transformationTest_StyleSheet.getEditorOperation(editorCell).apply(editorCell);
    Annotation_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Collection_7250_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7250_1");
  }

  private static void setupBasic_Constant_7250_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_3");
  }

  private static void setupBasic_Property_7250_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_cellId");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_7250_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_4");
  }

  private static void setupBasic_Alternation_7250_0(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_7250_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_5");
  }

  private static void setupBasic_NonEmptyProperty_7250_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_caretPosition");
  }

  private static void setupBasic_Collection_7250_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7250_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_7250_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_6");
  }

  private static void setupBasic_Property_7250_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_selectionStart");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_7250_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_7");
  }

  private static void setupBasic_Property_7250_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_selectionEnd");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_7250_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7250_8");
  }

  private static void setupBasic_Property_7250_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_isInInspector");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  public static boolean renderingCondition7250_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isLastPosition");
  }

  public static boolean renderingCondition7250_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "useLabelSelection");
  }

}
