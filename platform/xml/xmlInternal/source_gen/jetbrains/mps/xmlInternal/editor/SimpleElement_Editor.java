package jetbrains.mps.xmlInternal.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.xml.editor.XmlStyle_StyleSheet;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class SimpleElement_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_8130_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_8130_0(context, node);
  }

  public EditorCell createCollection_8130_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_8130_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_8130_1(context, node));
    editorCell.addEditorCell(this.createCollection_8130_3(context, node));
    editorCell.addEditorCell(this.createCollection_8130_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_8130_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8130_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_8130_0(context, node, "<"));
    editorCell.addEditorCell(this.createRefNode_8130_3(context, node));
    editorCell.addEditorCell(this.createRefNodeList_8130_0(context, node));
    editorCell.addEditorCell(this.createConstant_8130_1(context, node, ">"));
    return editorCell;
  }

  public EditorCell createCollection_8130_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8130_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_8130_2(context, node, "/>"));
    return editorCell;
  }

  public EditorCell createCollection_8130_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8130_3(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell8130_0(context, node));
    editorCell.addEditorCell(this.createRefNode_8130_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_8130_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8130_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8130_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8130_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8130_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8130_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_8130_0(EditorContext context, SNode node) {
    if (this.myListHandler_8130_0 == null) {
      this.myListHandler_8130_0 = new SimpleElement_Editor.attributeListHandler_8130_0(node, "attribute", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_8130_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_8130_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_8130_0.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell8130_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode_8130_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_8130_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_8130_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("contentList");
    provider.setNoTargetText("<no contentList>");
    EditorCell cellWithRole = this.createRefNode_8130_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_8130_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_8130_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_8130_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("elementName");
    provider.setNoTargetText("<no elementName>");
    EditorCell cellWithRole = this.createRefNode_8130_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_8130_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8130_0");
  }

  private static void setupBasic_Collection_8130_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8130_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_8130_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8130_0");
    XmlStyle_StyleSheet.getXmlOpenParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_8130_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8130_1");
    XmlStyle_StyleSheet.getXmlCloseParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_8130_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8130_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_8130_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8130_2");
    XmlStyle_StyleSheet.getXmlCloseBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_8130_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8130_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_8130_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_8130_1(EditorCell editorCell, SNode node, EditorContext context) {
    XmlStyle_StyleSheet.getXmlElement(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_8130_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_attribute");
  }

  private static void setupBasic_Indent_8130_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_8130_0");
  }

  public static class attributeListHandler_8130_0 extends RefNodeListHandler {

    public attributeListHandler_8130_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_8130_3(context, node, "attr");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, " "));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), " ");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

    public EditorCell createConstant_8130_3(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_8130_3(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_8130_3(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_8130_3");
      XmlStyle_StyleSheet.getXmlEmptyCell(editorCell).apply(editorCell);
    }

}

}
