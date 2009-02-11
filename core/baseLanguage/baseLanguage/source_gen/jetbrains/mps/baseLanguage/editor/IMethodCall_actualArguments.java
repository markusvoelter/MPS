package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class IMethodCall_actualArguments extends AbstractCellProvider {

  /* package */AbstractCellListHandler myListHandler_4497_0;

  public IMethodCall_actualArguments(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4497_0(context, node);
  }

  public EditorCell createCollection_4497_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_4497_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_4497_0(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList_4497_0(context, node));
    editorCell.addEditorCell(this.createConstant_4497_2(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant_4497_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4497_0(editorCell, node, context);
    setupLabel_Constant_4497_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4497_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4497_2(editorCell, node, context);
    setupLabel_Constant_4497_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_4497_0(EditorContext context, SNode node) {
    if (this.myListHandler_4497_0 == null) {
      this.myListHandler_4497_0 = new IMethodCall_actualArguments.actualArgumentListHandler_4497_0(node, "actualArgument", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_4497_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_4497_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_4497_0.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_4497_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_4497_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_4497_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4497_0");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PUNCTUATION_LEFT, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNodeList_4497_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_actualArgument");
    if (renderingCondition4497_1(node, context, context.getScope())) {
      editorCell.setFocusPolicy(FocusPolicy.FIRST_EDITABLE_CELL);
    }
  }

  private static void setupBasic_Constant_4497_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4497_2");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.EDITABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (renderingCondition4497_0(node, context, context.getScope())) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupLabel_Constant_4497_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_4497_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_4497_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4497_0(SNode node, EditorContext editorContext, IScope scope) {
    if (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null) {
      return false;
    }
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter", true)).isEmpty();
  }

  public static boolean renderingCondition4497_1(SNode node, EditorContext editorContext, IScope scope) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter", true)).isNotEmpty();
  }

  public static class actualArgumentListHandler_4497_0 extends RefNodeListHandler {

    public actualArgumentListHandler_4497_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_4497_1(context, node, "");
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

    public EditorCell createConstant_4497_1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_4497_1(editorCell, node, context);
      setupLabel_Constant_4497_1(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_4497_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_4497_1");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.SELECTABLE, true);
            this.set(StyleAttributes.EDITABLE, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_4497_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
