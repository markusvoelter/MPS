package jetbrains.mps.build.packaging.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class ConfigurationReferencesEditorComponent extends AbstractCellProvider {

  /* package */AbstractCellListHandler myListHandler_4382_0;

  public ConfigurationReferencesEditorComponent(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4382_1(context, node);
  }

  public EditorCell createCollection_4382_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_4382_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_4382_0(context, node, "include in"));
    editorCell.addEditorCell(this.createRefNodeList_4382_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_4382_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_4382_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition4382_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4382_0(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant_4382_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4382_0(editorCell, node, context);
    setupLabel_Constant_4382_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_4382_0(EditorContext context, SNode node) {
    if (this.myListHandler_4382_0 == null) {
      this.myListHandler_4382_0 = new ConfigurationReferencesEditorComponent.configurationListHandler_4382_0(node, "configuration", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_4382_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_4382_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_4382_0.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_4382_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_4382_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_4382_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4382_0");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_4382_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_configuration");
  }

  private static void setupBasic_Collection_4382_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_4382_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_4382_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_4382_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4382_0(SNode node, EditorContext editorContext, IScope scope) {
    return editorContext.isInspector() || (!(ListSequence.fromList(SLinkOperations.getTargets(node, "configuration", true)).isEmpty()));
  }

  public static class configurationListHandler_4382_0 extends RefNodeListHandler {

    public configurationListHandler_4382_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_4382_1(context, node, "<any configuration>");
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

    public EditorCell createConstant_4382_1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_4382_1(editorCell, node, context);
      setupLabel_Constant_4382_1(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_4382_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_4382_1");
      MPSLayoutStyles_StyleSheet.getHint(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_4382_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
