package jetbrains.mps.baseLanguageInternal.editor;

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
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.EnumMeasure;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class InternalPartialFieldReference_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1177590125769(context, node);
  }

  public EditorCell createCollection1177590125769(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775901257691177590125769(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1177590127490(context, node, "["));
    editorCell.addEditorCell(this.createRefNode1177590138558(context, node));
    editorCell.addEditorCell(this.createConstant1177590141591(context, node, "]"));
    editorCell.addEditorCell(this.createConstant1209817310938(context, node, "("));
    if (renderingCondition7959_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1209817276511(context, node));
    }
    editorCell.addEditorCell(this.createRefNode1177590147655(context, node));
    editorCell.addEditorCell(this.createConstant1177590150470(context, node, "."));
    editorCell.addEditorCell(this.createProperty1177590154097(context, node));
    editorCell.addEditorCell(this.createConstant1177597955295(context, node, ")"));
    return editorCell;
  }

  public EditorCell createCollection1209817276511(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12098172765111209817276511(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1209817282763(context, node, "["));
    editorCell.addEditorCell(this.createRefNode1209817282764(context, node));
    editorCell.addEditorCell(this.createConstant1209817282765(context, node, "]"));
    return editorCell;
  }

  public EditorCell createConstant1177590127490(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775901274901177590127490(editorCell, node, context);
    setupLabel_Constant_1177590127490_1177590127490(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177590141591(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775901415911177590141591(editorCell, node, context);
    setupLabel_Constant_1177590141591_1177590141591(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177590150470(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775901504701177590150470(editorCell, node, context);
    setupLabel_Constant_1177590150470_1177590150470(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177597955295(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775979552951177597955295(editorCell, node, context);
    setupLabel_Constant_1177597955295_1177597955295(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1209817282763(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12098172827631209817282763(editorCell, node, context);
    setupLabel_Constant_1209817282763_1209817282763(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1209817282765(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12098172827651209817282765(editorCell, node, context);
    setupLabel_Constant_1209817282765_1209817282765(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1209817310938(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12098173109381209817310938(editorCell, node, context);
    setupLabel_Constant_1209817310938_1209817310938(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1177590138558_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_fieldType1177590138558(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_fieldType_1177590138558((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1177590138558(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("fieldType");
    provider.setNoTargetText("<no fieldType>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1177590138558_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1177590147655_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_instance1177590147655(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_instance_1177590147655((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1177590147655(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("instance");
    provider.setNoTargetText("<no instance>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1177590147655_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1177590154097_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_fieldName1177590154097(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_fieldName_1177590154097((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1177590154097(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("fieldName");
    provider.setNoTargetText("<no fieldName>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1177590154097_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1209817282764_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_instanceType1209817282764(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_instanceType_1209817282764((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1209817282764(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("instanceType");
    provider.setNoTargetText("<no instanceType>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1209817282764_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11775901257691177590125769(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177590125769");
  }

  private static void setupBasic_Constant_11775901274901177590127490(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177590127490");
    StyleSheet_StyleSheet.getSquareBracket(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_fieldType1177590138558(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11775901415911177590141591(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177590141591");
    StyleSheet_StyleSheet.getSquareBracket(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_instance1177590147655(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11775901504701177590150470(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177590150470");
    BaseLanguageStyle_StyleSheet.getDot(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_fieldName1177590154097(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_fieldName");
    StyleSheet_StyleSheet.getInternalName(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11775979552951177597955295(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177597955295");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_12098172765111209817276511(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1209817276511");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12098172827631209817282763(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209817282763");
    StyleSheet_StyleSheet.getSquareBracket(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_instanceType1209817282764(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12098172827651209817282765(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209817282765");
    StyleSheet_StyleSheet.getSquareBracket(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12098173109381209817310938(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209817310938");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1177590127490_1177590127490(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_fieldType_1177590138558(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177590141591_1177590141591(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_instance_1177590147655(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177590150470_1177590150470(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_fieldName_1177590154097(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177597955295_1177597955295(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209817282763_1209817282763(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_instanceType_1209817282764(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209817282765_1209817282765(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209817310938_1209817310938(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition7959_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "instance", true) != null;
  }

}
