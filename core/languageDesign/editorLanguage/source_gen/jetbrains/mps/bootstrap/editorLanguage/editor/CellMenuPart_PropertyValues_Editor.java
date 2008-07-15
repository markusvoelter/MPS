package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class CellMenuPart_PropertyValues_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell13005_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell13005_0");
  }

  private static void setupBasic_CollectionCell13005_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell13005_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell13005_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell13005_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell13005_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell13005_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_valuesFunctionRefNodeCell13005_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_CollectionCell13005_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell13005_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell13005_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell13005_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellMenuPart_PropertyValues_Editor.calculateColor28(cell);
            }

          });
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellMenuPart_PropertyValues_Editor.calculateColor67(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell13005_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell13005_03");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_ConstantCell13005_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell13005_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_valuesFunctionRefNodeCell13005_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell13005_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell13005_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor28(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor67(EditorCell cell) {
    Color result;
    result = Color.lightGray;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell13005_0(context, node);
  }

  public EditorCell create_CollectionCell13005_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell13005_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell13005_02(context, node));
    editorCell.addEditorCell(this.create_CollectionCell13005_01(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell13005_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell13005_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell13005_03(context, node, "  "));
    editorCell.addEditorCell(this.create_ConstantCell13005_0(context, node, "values"));
    editorCell.addEditorCell(this.create_ConstantCell13005_01(context, node, ":"));
    editorCell.addEditorCell(this.create_valuesFunctionRefNodeCell13005_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell13005_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell13005_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell13005_02(context, node, "property values"));
    return editorCell;
  }

  public EditorCell create_ConstantCell13005_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell13005_0(editorCell, node, context);
    setupLabel_ConstantCell13005_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell13005_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell13005_01(editorCell, node, context);
    setupLabel_ConstantCell13005_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell13005_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell13005_02(editorCell, node, context);
    setupLabel_ConstantCell13005_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell13005_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell13005_03(editorCell, node, context);
    setupLabel_ConstantCell13005_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_valuesFunctionRefNodeCell13005_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_valuesFunctionRefNodeCell13005_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_valuesFunctionRefNodeCell13005_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_valuesFunctionRefNodeCell13005_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("valuesFunction");
    provider.setNoTargetText("<no valuesFunction>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_valuesFunctionRefNodeCell13005_0_internal(context, node, provider);
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
