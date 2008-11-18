package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.EnumMeasure;
import jetbrains.mps.nodeEditor.FocusPolicy;

public class StringLiteral_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1079623722228(context, node);
  }

  public EditorCell createCollection1079623722228(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10796237222281079623722228(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1079623722229(context, node, "\""));
    editorCell.addEditorCell(this.createProperty1079623722230(context, node));
    editorCell.addEditorCell(this.createConstant1079623722231(context, node, "\""));
    return editorCell;
  }

  public EditorCell createConstant1079623722229(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10796237222291079623722229(editorCell, node, context);
    setupLabel_Constant_1079623722229_1079623722229(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1079623722231(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10796237222311079623722231(editorCell, node, context);
    setupLabel_Constant_1079623722231_1079623722231(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1079623722230_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_value1079623722230(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_value_1079623722230((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1079623722230(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("value");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1079623722230_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_10796237222281079623722228(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1079623722228");
  }

  private static void setupBasic_Constant_10796237222291079623722229(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1079623722229");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_value1079623722230(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_value");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, EnumMeasure.spaces));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupBasic_Constant_10796237222311079623722231(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1079623722231");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, EnumMeasure.spaces));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1079623722229_1079623722229(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_value_1079623722230(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1079623722231_1079623722231(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
