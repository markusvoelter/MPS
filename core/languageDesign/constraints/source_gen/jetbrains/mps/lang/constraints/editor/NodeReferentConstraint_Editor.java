package jetbrains.mps.lang.constraints.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class NodeReferentConstraint_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4542_0(context, node);
  }

  public EditorCell createCollection_4542_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    editorCell.setCellId("Collection_4542_0");
    editorCell.addEditorCell(this.createConstant_4542_0(context, node, "link"));
    editorCell.addEditorCell(this.createConstant_4542_2(context, node, "{"));
    editorCell.addEditorCell(this.createRefCell_4542_0(context, node));
    editorCell.addEditorCell(this.createConstant_4542_3(context, node, "}"));
    editorCell.addEditorCell(this.createCollection_4542_1(context, node));
    editorCell.addEditorCell(this.createConstant_4542_1(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection_4542_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    editorCell.setCellId("Collection_4542_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.addEditorCell(this.createConstant_4542_4(context, node, "referent set handler"));
    editorCell.addEditorCell(this.createConstant_4542_5(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_4542_0(context, node));
    editorCell.addEditorCell(this.createConstant_4542_6(context, node, "search scope"));
    editorCell.addEditorCell(this.createConstant_4542_7(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_4542_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_4542_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_2");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_3");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4542_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4542_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_4542_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("applicableLink");
    provider.setNoTargetText("<choose reference>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new NodeReferentConstraint_Editor._Inline4542_0());
    editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public EditorCell createRefNode_4542_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("referentSetHandler");
    provider.setNoTargetText("<none>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public EditorCell createRefNode_4542_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("searchScopeFactory");
    provider.setNoTargetText("<default>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class _Inline4542_0 extends AbstractCellProvider {

    public _Inline4542_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_4542_0(context, node);
    }

    public EditorCell createProperty_4542_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("role");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(context);
      editorCell.setCellId("property_role");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
        style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
      } else
      return editorCell;
    }

}

}
