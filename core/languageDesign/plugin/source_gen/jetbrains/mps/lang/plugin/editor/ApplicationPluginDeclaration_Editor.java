package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class ApplicationPluginDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_3739_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3739_2(context, node);
  }

  public EditorCell createCollection_3739_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_3739_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_3739_0(context, node, "application plugin"));
    editorCell.addEditorCell(this.createProperty_3739_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3739_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_3739_1");
    editorCell.addEditorCell(this.createRefNodeList_3739_0(context, node));
    editorCell.addEditorCell(this.createConstant_3739_1(context, node, ""));
    editorCell.addEditorCell(this.createRefNode_3739_0(context, node));
    editorCell.addEditorCell(this.createConstant_3739_2(context, node, ""));
    editorCell.addEditorCell(this.createRefNode_3739_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3739_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_3739_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_3739_3(context, node));
    editorCell.addEditorCell(this.createCollection_3739_4(context, node));
    if (renderingCondition3739_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_3739_4(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection_3739_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_3739_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_3739_0(context, node));
    if (renderingCondition3739_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_3739_3(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection_3739_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_3739_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell3739_0(context, node));
    editorCell.addEditorCell(this.createCollection_3739_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_3739_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3739_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3739_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3739_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3739_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3739_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3739_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3739_3");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3739_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_3739_4");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_3739_0(EditorContext context, SNode node) {
    if (this.myListHandler_3739_0 == null) {
      this.myListHandler_3739_0 = new ApplicationPluginDeclaration_Editor.fieldDeclarationListHandler_3739_0(node, "fieldDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3739_0.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_fieldDeclaration");
    editorCell.setRole(this.myListHandler_3739_0.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell3739_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty_3739_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_name");
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

  public EditorCell createRefNode_3739_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("initBlock");
    provider.setNoTargetText("<init block>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
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

  public EditorCell createRefNode_3739_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("disposeBlock");
    provider.setNoTargetText("<dispose block>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
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


  public static boolean renderingCondition3739_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition3739_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class fieldDeclarationListHandler_3739_0 extends RefNodeListHandler {

    public fieldDeclarationListHandler_3739_0(SNode ownerNode, String childRole, EditorContext context) {
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
