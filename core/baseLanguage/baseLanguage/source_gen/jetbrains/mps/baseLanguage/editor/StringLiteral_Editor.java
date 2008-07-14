package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class StringLiteral_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell14_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell14_0");
  }

  private static void setupBasic_ConstantCell14_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell14_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return StringLiteral_Editor.calculateColor15(cell);
            }

          });
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          this.set(StyleAttributes.PADDING_LEFT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_valuePropertyCell14_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_valuePropertyCell14_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return StringLiteral_Editor.calculateColor36(cell);
            }

          });
          this.set(StyleAttributes.PADDING_LEFT, 0.0);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupBasic_ConstantCell14_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell14_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return StringLiteral_Editor.calculateColor40(cell);
            }

          });
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.PADDING_LEFT, 0.0);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_ConstantCell14_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_valuePropertyCell14_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell14_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor15(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

  private static Color calculateColor36(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

  private static Color calculateColor40(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell14_0(context, node);
  }

  public EditorCell create_CollectionCell14_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell14_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell14_0(context, node, "\""));
    editorCell.addEditorCell(this.create_valuePropertyCell14_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell14_01(context, node, "\""));
    return editorCell;
  }

  public EditorCell create_ConstantCell14_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell14_0(editorCell, node, context);
    setupLabel_ConstantCell14_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell14_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell14_01(editorCell, node, context);
    setupLabel_ConstantCell14_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_valuePropertyCell14_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_valuePropertyCell14_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_valuePropertyCell14_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_valuePropertyCell14_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("value");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.create_valuePropertyCell14_0_internal(context, node, provider);
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
