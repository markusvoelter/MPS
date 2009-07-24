package jetbrains.mps.baseLanguage.editor;

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
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ForeachStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0809_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_0809_2(context, node);
  }

  public EditorCell createCollection_0809_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0809_0(editorCell, node, context);
    if (renderingCondition0809_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_0809_1(context, node));
    }
    editorCell.addEditorCell(this.createConstant_0809_0(context, node, "for"));
    editorCell.addEditorCell(this.createConstant_0809_1(context, node, "("));
    editorCell.addEditorCell(this.createRefNode_0809_5(context, node));
    editorCell.addEditorCell(this.createConstant_0809_2(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_0809_1(context, node));
    editorCell.addEditorCell(this.createConstant_0809_3(context, node, ")"));
    editorCell.addEditorCell(this.createConstant_0809_4(context, node, "{"));
    editorCell.addEditorCell(this.createRefNode_0809_3(context, node));
    editorCell.addEditorCell(this.createConstant_0809_5(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection_0809_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0809_1(editorCell, node, context);
    editorCell.addEditorCell(this.createProperty_0809_1(context, node));
    editorCell.addEditorCell(this.createConstant_0809_6(context, node, ":"));
    return editorCell;
  }

  public EditorCell createCollection_0809_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0809_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_0809_7(context, node, "label"));
    editorCell.addEditorCell(this.createConstant_0809_8(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_0809_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_0809_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0809_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0809_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_0809_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0809_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0809_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("iterable");
    provider.setNoTargetText("<no iterable>");
    EditorCell cellWithRole = this.createRefNode_0809_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0809_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0809_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0809_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    EditorCell cellWithRole = this.createRefNode_0809_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0809_4_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0809_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0809_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("variable");
    provider.setNoTargetText("<no variable>");
    EditorCell cellWithRole = this.createRefNode_0809_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_0809_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0809_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0809_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("label");
    provider.setNoTargetText("<no label>");
    EditorCell cellWithRole = this.createProperty_0809_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_0809_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0809_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0809_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("label");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_0809_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0809_0");
  }

  private static void setupBasic_Constant_0809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_0809_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_1");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_0809_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_0809_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_0809_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_3");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_0809_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_4");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_0809_1(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_0809_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_5");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNode_0809_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_0809_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0809_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Property_0809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_label");
    AbstractLoopStatement_Label_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_0809_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_6");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.EDITABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_0809_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0809_2");
  }

  private static void setupBasic_Constant_0809_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_7");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_0809_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0809_8");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.EDITABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Property_0809_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_label_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  public static boolean renderingCondition0809_0(SNode node, EditorContext editorContext, IScope scope) {
    return !(SPropertyOperations.hasValue(node, "label", null));
  }

}
