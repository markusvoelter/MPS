package jetbrains.mps.nanoj.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class NanoStatementList_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_6819_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6819_0(context, node);
  }

  public EditorCell createCollection_6819_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6819_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_6819_0(context, node, "{"));
    editorCell.addEditorCell(this.createRefNodeList_6819_0(context, node));
    editorCell.addEditorCell(this.createConstant_6819_1(context, node, "}"));
    return editorCell;
  }

  public EditorCell createConstant_6819_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6819_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6819_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6819_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_6819_0(EditorContext context, SNode node) {
    if (this.myListHandler_6819_0 == null) {
      this.myListHandler_6819_0 = new NanoStatementList_Editor.bodyListHandler_6819_0(node, "body", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_6819_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_6819_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_6819_0.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_6819_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6819_0");
  }

  private static void setupBasic_Constant_6819_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6819_0");
  }

  private static void setupBasic_RefNodeList_6819_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_body");
  }

  private static void setupBasic_Constant_6819_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6819_1");
  }

  public static class bodyListHandler_6819_0 extends RefNodeListHandler {

    public bodyListHandler_6819_0(SNode ownerNode, String childRole, EditorContext context) {
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
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

}

}
