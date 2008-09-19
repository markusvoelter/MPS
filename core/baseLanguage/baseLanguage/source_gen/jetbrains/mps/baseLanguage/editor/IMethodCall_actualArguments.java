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
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class IMethodCall_actualArguments extends AbstractCellProvider {

  /* package */AbstractCellListHandler myListHandler_1173990956439;

  public IMethodCall_actualArguments(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1173990937233(context, node);
  }

  public EditorCell createCollection1173990937233(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11739909372331173990937233(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1173990956438(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList1173990956439(context, node));
    editorCell.addEditorCell(this.createConstant1173990956441(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1173990956438(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739909564381173990956438(editorCell, node, context);
    setupLabel_Constant_1173990956438_1173990956438(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1173990956441(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11739909564411173990956441(editorCell, node, context);
    setupLabel_Constant_1173990956441_1173990956441(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1173990956439(EditorContext context, SNode node) {
    if (this.myListHandler_1173990956439 == null) {
      this.myListHandler_1173990956439 = new IMethodCall_actualArguments.actualArgumentListHandler_4497_0(node, "actualArgument", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1173990956439.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_actualArgument1173990956439(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1173990956439.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_11739909372331173990937233(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1173990937233");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11739909564381173990956438(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1173990956438");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

            public Integer calculate(EditorCell cell) {
              return IMethodCall_actualArguments.calculateFontStyle4497_0(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_actualArgument1173990956439(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_actualArgument");
  }

  private static void setupBasic_Constant_11739909564411173990956441(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1173990956441");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

            public Integer calculate(EditorCell cell) {
              return IMethodCall_actualArguments.calculateFontStyle4497_1(cell);
            }

          });
          this.set(StyleAttributes.EDITABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (renderingCondition4497_0(node, context, context.getScope())) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupLabel_Constant_1173990956438_1173990956438(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_actualArgument_1173990956439(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1173990956441_1173990956441(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4497_0(SNode node, EditorContext editorContext, IScope scope) {
    if (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null) {
      return false;
    }
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter", true)).isEmpty();
  }

  private static Integer calculateFontStyle4497_0(EditorCell cell) {
    int result;
    result = MPSFonts.PLAIN;
    return result;
  }

  private static Integer calculateFontStyle4497_1(EditorCell cell) {
    int result;
    result = MPSFonts.PLAIN;
    return result;
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
      return this.createConstant1173990956440(context, node, "");
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
        return editorCell;
      }
    }

    public EditorCell createConstant1173990956440(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11739909564401173990956440(editorCell, node, context);
      setupLabel_Constant_1173990956440_1173990956440(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_11739909564401173990956440(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1173990956440");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.SELECTABLE, true);
            this.set(StyleAttributes.EDITABLE, true);
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1173990956440_1173990956440(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
