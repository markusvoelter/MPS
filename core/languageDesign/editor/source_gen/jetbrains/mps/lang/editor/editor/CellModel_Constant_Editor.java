package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;

public class CellModel_Constant_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6752_0(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6752_1(editorContext, node);
  }

  private EditorCell createCollection_6752_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6752_0");
    Styles_StyleSheet.getRootCellModelStyle(editorCell).apply(editorCell);
    if (renderingCondition6752_0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_6752_0(editorContext, node));
    }
    editorCell.addEditorCell(this.createProperty_6752_0(editorContext, node));
    if (renderingCondition6752_1(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_6752_1(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_6752_1(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6752_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createComponent_6752_2(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6752_3(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6752_0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_6752_2(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6752_2(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6752_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_6752_3(editorContext, node));
    editorCell.addEditorCell(this.createCollection_6752_4(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6752_3(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6752_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_6752_1(editorContext, node));
    editorCell.addEditorCell(this.createProperty_6752_1(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6752_4(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6752_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_6752_2(editorContext, node));
    editorCell.addEditorCell(this.createProperty_6752_2(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_6752_0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _OpenTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_6752_1(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _CloseTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_6752_2(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _CellModel_Common(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_6752_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Constant cell:");
    editorCell.setCellId("Constant_6752_0");
    Styles_StyleSheet.getHeader(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6752_1(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "text");
    editorCell.setCellId("Constant_6752_1");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6752_2(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "text*");
    editorCell.setCellId("Constant_6752_2");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6752_3(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6752_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_6752_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("text");
    provider.setNoTargetText("<constant>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_text");
    Styles_StyleSheet.getBordered(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.BACKGROUND_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_1((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_2((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_3((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.FONT_SIZE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_5((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.UNDERLINED, new AttributeCalculator <Boolean>() {

        public Boolean calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_4((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.STRIKE_OUT, new AttributeCalculator <Boolean>() {

        public Boolean calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_6752_6((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    editorCell.addKeyMap(new _SplitConctantCellIntoWordsKeyMap());
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_6752_1(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("text");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_text_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.yellow);
      style.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.cyan);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_6752_2(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("nullText");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_nullText");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.yellow);
      style.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.cyan);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }


  private static boolean renderingCondition6752_0(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getOpeningTag_1220340471382(node).length() > 0;
  }

  private static boolean renderingCondition6752_1(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getClosingTag_1220340488560(node).length() > 0;
  }

  private static Color _StyleParameter_QueryFunction_6752_0(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getTextBackgroundColor_1220972190901(node);
  }

  private static Color _StyleParameter_QueryFunction_6752_1(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getBackgroundColor_1220969182195(node);
  }

  private static Color _StyleParameter_QueryFunction_6752_2(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getForegroundColor_1220960215403(node);
  }

  private static int _StyleParameter_QueryFunction_6752_3(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getFontStyle_1221053923273(node);
  }

  private static boolean _StyleParameter_QueryFunction_6752_4(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_isUnderlined_1221220594206(node);
  }

  private static int _StyleParameter_QueryFunction_6752_5(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getFontSize_1221216397365(node);
  }

  private static boolean _StyleParameter_QueryFunction_6752_6(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_isStrikeOut_1223390694337(node);
  }

}
