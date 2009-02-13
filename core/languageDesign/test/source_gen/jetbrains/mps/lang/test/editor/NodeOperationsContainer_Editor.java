package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class NodeOperationsContainer_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_3161_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3161_0(context, node);
  }

  public EditorCell createCollection_3161_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3161_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_3161_0(context, node, "<"));
    editorCell.addEditorCell(this.createRefNodeList_3161_0(context, node));
    editorCell.addEditorCell(this.createAttributedNodeCell_3161_0(context, node));
    editorCell.addEditorCell(this.createConstant_3161_1(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant_3161_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3161_0(editorCell, node, context);
    setupLabel_Constant_3161_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3161_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3161_1(editorCell, node, context);
    setupLabel_Constant_3161_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createAttributedNodeCell_3161_0(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    setupBasic_AttributedNodeCell_3161_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefNodeList_3161_0(EditorContext context, SNode node) {
    if (this.myListHandler_3161_0 == null) {
      this.myListHandler_3161_0 = new NodeOperationsContainer_Editor.operationsListHandler_3161_0(node, "operations", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3161_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_3161_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_3161_0.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_3161_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3161_0");
  }

  private static void setupBasic_Constant_3161_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3161_0");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
        }

      };
      inlineStyle.apply(editorCell);
    }
    Annotation_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_RefNodeList_3161_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_operations");
    BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_AttributedNodeCell_3161_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3161_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3161_1");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_3161_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_3161_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_3161_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class operationsListHandler_3161_0 extends RefNodeListHandler {

    public operationsListHandler_3161_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant_3161_2(context, node, "...");
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

    public EditorCell createConstant_3161_2(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3161_2(editorCell, node, context);
      setupLabel_Constant_3161_2(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_3161_2(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3161_2");
      BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PUNCTUATION_LEFT, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
      Annotation_Actions.setCellActions(editorCell, node, context);
    }

    private static void setupLabel_Constant_3161_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
