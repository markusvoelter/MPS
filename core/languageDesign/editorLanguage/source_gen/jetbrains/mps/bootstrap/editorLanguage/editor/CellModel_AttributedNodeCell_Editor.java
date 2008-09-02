package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_AttributedNodeCell_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_CellModel_Common5832_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1149850835046(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1149850821036(context, node);
  }

  public EditorCell createCollection1149850821036(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11498508210361149850821036(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1214478723481(context, node));
    return editorCell;
  }

  public EditorCell createCollection1149850835046(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11498508350461149850835046(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1149850835047(context, node, "|>"));
    editorCell.addEditorCell(this.createConstant1149850835048(context, node, "attributed node"));
    editorCell.addEditorCell(this.createConstant1149850835049(context, node, "<|"));
    return editorCell;
  }

  public EditorCell createComponent1214478723481(EditorContext context, SNode node) {
    if (this.my_CellModel_Common5832_0 == null) {
      this.my_CellModel_Common5832_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common5832_0.createEditorCell(context);
    setupBasic_component__CellModel_Common1214478723481(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1149850835047(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11498508350471149850835047(editorCell, node, context);
    setupLabel_Constant_1149850835047_1149850835047(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1149850835048(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11498508350481149850835048(editorCell, node, context);
    setupLabel_Constant_1149850835048_1149850835048(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1149850835049(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11498508350491149850835049(editorCell, node, context);
    setupLabel_Constant_1149850835049_1149850835049(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_11498508210361149850821036(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1149850821036");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11498508350461149850835046(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1149850835046");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11498508350471149850835047(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1149850835047");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11498508350481149850835048(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1149850835048");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.EDITABLE, false);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_AttributedNodeCell_Editor.calculateColor5832_0(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11498508350491149850835049(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1149850835049");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component__CellModel_Common1214478723481(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component__CellModel_Common");
  }

  private static void setupLabel_Constant_1149850835047_1149850835047(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1149850835048_1149850835048(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1149850835049_1149850835049(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor5832_0(EditorCell cell) {
    Color result;
    result = MPSColors.pink;
    return result;
  }

}
