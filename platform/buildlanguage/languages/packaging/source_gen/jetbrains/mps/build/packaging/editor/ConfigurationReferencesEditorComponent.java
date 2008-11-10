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

  /* package */AbstractCellListHandler myListHandler_1226345904046;

  public ConfigurationReferencesEditorComponent(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1226345904062(context, node);
  }

  public EditorCell createCollection1226345904044(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12263459040441226345904044(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1226345904045(context, node, "include in"));
    editorCell.addEditorCell(this.createRefNodeList1226345904046(context, node));
    return editorCell;
  }

  public EditorCell createCollection1226345904062(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12263459040621226345904062(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition4382_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1226345904044(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant1226345904045(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12263459040451226345904045(editorCell, node, context);
    setupLabel_Constant_1226345904045_1226345904045(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1226345904046(EditorContext context, SNode node) {
    if (this.myListHandler_1226345904046 == null) {
      this.myListHandler_1226345904046 = new ConfigurationReferencesEditorComponent.configurationListHandler_4382_0(node, "configuration", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1226345904046.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_configuration1226345904046(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1226345904046.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_12263459040441226345904044(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226345904044");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12263459040451226345904045(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226345904045");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNodeList_configuration1226345904046(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_configuration");
  }

  private static void setupBasic_Collection_12263459040621226345904062(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226345904062");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1226345904045_1226345904045(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_configuration_1226345904046(EditorCell_Label editorCell, SNode node, EditorContext context) {
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
      return this.createConstant1226345904047(context, node, "<any configuration>");
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

    public EditorCell createConstant1226345904047(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12263459040471226345904047(editorCell, node, context);
      setupLabel_Constant_1226345904047_1226345904047(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12263459040471226345904047(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1226345904047");
      MPSLayoutStyles_StyleSheet.getHint(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1226345904047_1226345904047(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
