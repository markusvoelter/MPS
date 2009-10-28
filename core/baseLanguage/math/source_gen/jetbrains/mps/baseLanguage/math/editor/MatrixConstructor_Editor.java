package jetbrains.mps.baseLanguage.math.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.math.plugin.EmptyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.style.CellAlign;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class MatrixConstructor_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createAlternation_4845_0(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_4845_0(editorContext, node);
  }

  private EditorCell createAlternation_4845_0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = MatrixConstructor_Editor.renderingCondition4845_0(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_4845_1(editorContext, node);
    } else {
      editorCell = this.createRefNodeList_4845_0(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createCollection_4845_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_4845_0");
    editorCell.addEditorCell(this.createConstant_4845_0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_4845_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_4845_1(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_4845_1");
    editorCell.addEditorCell(this.createCustom_4845_0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_4845_1(editorContext, node));
    editorCell.addEditorCell(this.createCustom_4845_1(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_4845_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "column:");
    editorCell.setCellId("Constant_4845_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCustom_4845_0(final EditorContext editorContext, final SNode node) {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<EmptyCellProvider>() {
      public EmptyCellProvider invoke() {
        return new EmptyCellProvider(node);
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("Custom_4845_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    return editorCell;
  }

  private EditorCell createCustom_4845_1(final EditorContext editorContext, final SNode node) {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<EmptyCellProvider>() {
      public EmptyCellProvider invoke() {
        return new EmptyCellProvider(node);
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("Custom_4845_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    return editorCell;
  }

  private EditorCell createRefNodeList_4845_0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new MatrixConstructor_Editor.componentsListHandler_4845_0(node, "components", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Horizontal(), false);
    editorCell.setCellId("refNodeList_components");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNodeList_4845_1(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new MatrixConstructor_Editor.componentsListHandler_4845_1(node, "components", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_components_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.HORIZONTAL_ALIGN, CellAlign.CENTER);
      style.set(StyleAttributes.DRAW_BRACKETS, true);
    }
    editorCell.setGridLayout(true);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createProperty_4845_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("column");
    provider.setNoTargetText("<no column>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_column");
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

  private static boolean renderingCondition4845_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "column");
  }

  private static class componentsListHandler_4845_0 extends RefNodeListHandler {
    public componentsListHandler_4845_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext editorContext) {
      return super.createSeparatorCell(editorContext);
    }
  }

  private static class componentsListHandler_4845_1 extends RefNodeListHandler {
    public componentsListHandler_4845_1(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext editorContext) {
      return super.createSeparatorCell(editorContext);
    }
  }
}
