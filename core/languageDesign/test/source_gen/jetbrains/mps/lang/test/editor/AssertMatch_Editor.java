package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.style.StyleAttributes;

public class AssertMatch_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_9939_0;
  /* package */AbstractCellListHandler myListHandler_9939_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_9939_0(context, node);
  }

  public EditorCell createCollection_9939_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9939_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_9939_0(context, node, "assert"));
    editorCell.addEditorCell(this.createConstant_9939_3(context, node, "<"));
    editorCell.addEditorCell(this.createRefNodeList_9939_0(context, node));
    editorCell.addEditorCell(this.createConstant_9939_4(context, node, ">"));
    editorCell.addEditorCell(this.createConstant_9939_1(context, node, " match"));
    editorCell.addEditorCell(this.createConstant_9939_5(context, node, "<"));
    editorCell.addEditorCell(this.createRefNodeList_9939_1(context, node));
    editorCell.addEditorCell(this.createConstant_9939_6(context, node, ">"));
    editorCell.addEditorCell(this.createConstant_9939_2(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant_9939_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_0(editorCell, node, context);
    setupLabel_Constant_9939_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9939_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_1(editorCell, node, context);
    setupLabel_Constant_9939_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9939_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_2(editorCell, node, context);
    setupLabel_Constant_9939_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9939_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_3(editorCell, node, context);
    setupLabel_Constant_9939_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9939_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_4(editorCell, node, context);
    setupLabel_Constant_9939_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9939_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_5(editorCell, node, context);
    setupLabel_Constant_9939_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9939_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9939_6(editorCell, node, context);
    setupLabel_Constant_9939_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_9939_0(EditorContext context, SNode node) {
    if (this.myListHandler_9939_0 == null) {
      this.myListHandler_9939_0 = new AssertMatch_Editor.beforeListHandler_9939_0(node, "before", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_9939_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_9939_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_9939_0.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_9939_1(EditorContext context, SNode node) {
    if (this.myListHandler_9939_1 == null) {
      this.myListHandler_9939_1 = new AssertMatch_Editor.afterListHandler_9939_0(node, "after", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_9939_1.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_9939_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_9939_1.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_9939_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9939_0");
  }

  private static void setupBasic_Constant_9939_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_0");
    transformationTest_StyleSheet.getAssertStyle(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_9939_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_before");
  }

  private static void setupBasic_Constant_9939_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_1");
    transformationTest_StyleSheet.getAssertStyle(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_9939_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_after");
  }

  private static void setupBasic_Constant_9939_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_2");
  }

  private static void setupBasic_Constant_9939_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_3");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_9939_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_4");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_9939_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_5");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_9939_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9939_6");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_9939_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_9939_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_9939_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_9939_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_9939_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_9939_3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_9939_4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_9939_5(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_9939_6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class beforeListHandler_9939_0 extends RefNodeListHandler {

    public beforeListHandler_9939_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

}
  public static class afterListHandler_9939_0 extends RefNodeListHandler {

    public afterListHandler_9939_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

}

}
