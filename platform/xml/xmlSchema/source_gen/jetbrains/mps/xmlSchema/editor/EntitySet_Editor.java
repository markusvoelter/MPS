package jetbrains.mps.xmlSchema.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import javax.swing.JComponent;
import jetbrains.mps.ide.browser.HyperlinkUtil;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class EntitySet_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_3021_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3021_0(context, node);
  }

  public EditorCell createAlternation_3021_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = EntitySet_Editor.renderingCondition3021_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createProperty_3021_1(context, node);
    } else
    {
      editorCell = EditorCell_Component.createComponentCell(context, node, EntitySet_Editor._QueryFunction_JComponent_1176495136463(node, context), "_1172963395100");
    }
    return editorCell;
  }

  public EditorCell createCollection_3021_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_3021_0");
    editorCell.addEditorCell(this.createCollection_3021_1(context, node));
    editorCell.addEditorCell(this.createConstant_3021_1(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList_3021_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3021_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_3021_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_3021_0(context, node, "entity set"));
    editorCell.addEditorCell(this.createProperty_3021_0(context, node));
    editorCell.addEditorCell(this.createConstant_3021_2(context, node, ":"));
    editorCell.addEditorCell(this.createAlternation_3021_0(context, node));
    return editorCell;
  }

  public EditorCell createConstant_3021_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3021_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3021_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3021_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3021_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3021_2");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_3021_0(EditorContext context, SNode node) {
    if (this.myListHandler_3021_0 == null) {
      this.myListHandler_3021_0 = new EntitySet_Editor.entityBlockListHandler_3021_0(node, "entityBlock", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3021_0.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_entityBlock");
    editorCell.setRole(this.myListHandler_3021_0.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty_3021_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("entitySetName");
    provider.setNoTargetText("<no entitySetName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_entitySetName");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public EditorCell createProperty_3021_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("url");
    provider.setNoTargetText("<no url>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_url");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }


  public static boolean renderingCondition3021_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "url") == null;
  }

  public static JComponent _QueryFunction_JComponent_1176495136463(SNode node, EditorContext editorContext) {
    return HyperlinkUtil.getHyperlinkComponent(SPropertyOperations.getString(node, "url"));
  }

  public static class entityBlockListHandler_3021_0 extends RefNodeListHandler {

    public entityBlockListHandler_3021_0(SNode ownerNode, String childRole, EditorContext context) {
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
