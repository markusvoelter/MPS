package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class WhenConcreteStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1140_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1140_1(context, node);
  }

  public EditorCell createCollection_1140_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    editorCell.setCellId("Collection_1140_0");
    editorCell.addEditorCell(this.createConstant_1140_0(context, node, "when concrete"));
    editorCell.addEditorCell(this.createConstant_1140_1(context, node, "("));
    editorCell.addEditorCell(this.createRefNode_1140_1(context, node));
    editorCell.addEditorCell(this.createConstant_1140_4(context, node, "as"));
    editorCell.addEditorCell(this.createRefNode_1140_5(context, node));
    editorCell.addEditorCell(this.createConstant_1140_2(context, node, ")"));
    editorCell.addEditorCell(this.createConstant_1140_5(context, node, "{"));
    editorCell.addEditorCell(this.createRefNode_1140_3(context, node));
    editorCell.addEditorCell(this.createConstant_1140_3(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection_1140_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    editorCell.setCellId("Collection_1140_1");
    editorCell.addEditorCell(this.createConstant_1140_6(context, node, "is shallow:"));
    editorCell.addEditorCell(this.createProperty_1140_1(context, node));
    editorCell.addEditorCell(this.createConstant_1140_7(context, node, "skips error:"));
    editorCell.addEditorCell(this.createProperty_1140_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_1140_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_0");
    BaseLanguageStyle_StyleSheet.getCompactKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_1");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_2");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_3");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_4");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_5");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_6");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1140_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1140_7");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_1140_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1140_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("argument");
    provider.setNoTargetText("<no argument>");
    EditorCell cellWithRole = this.createRefNode_1140_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1140_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1140_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    EditorCell cellWithRole = this.createRefNode_1140_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1140_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1140_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("argumentRepresentator");
    provider.setNoTargetText("");
    EditorCell cellWithRole = this.createRefNode_1140_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_1140_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_isShallow");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1140_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isShallow");
    provider.setNoTargetText("<no isShallow>");
    EditorCell cellWithRole = this.createProperty_1140_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_1140_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_skipsError");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1140_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("skipsError");
    provider.setNoTargetText("<no skipsError>");
    EditorCell cellWithRole = this.createProperty_1140_2_internal(context, node, provider);
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
