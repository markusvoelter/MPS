package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.editor._DeprecatedPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class SimpleNodeTest_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_7u86xv_a(editorContext, node);
  }

  private EditorCell createCollection_7u86xv_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_7u86xv_a");
    editorCell.addEditorCell(this.createComponent_7u86xv_a0(editorContext, node));
    if (renderingCondition_7u86xv_a1a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_7u86xv_b0(editorContext, node));
    }
    editorCell.addEditorCell(this.createCollection_7u86xv_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_7u86xv_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_7u86xv_e0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_7u86xv_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_7u86xv_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.addEditorCell(this.createRefNodeList_7u86xv_a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_7u86xv_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_7u86xv_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.addEditorCell(this.createConstant_7u86xv_a2a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_7u86xv_b2a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_7u86xv_c2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_7u86xv_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_7u86xv_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.addEditorCell(this.createIndentCell_7u86xv_a3a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_7u86xv_b3a(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_7u86xv_a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _DeprecatedPart(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_7u86xv_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "test");
    editorCell.setCellId("Constant_7u86xv_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_7u86xv_c2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_7u86xv_c2a");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_7u86xv_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_7u86xv_e0");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_7u86xv_a1a(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new SimpleNodeTest_Editor.annotationListHandler_7u86xv_a1a(node, "annotation", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_annotation");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.POSITION_CHILDREN, "next-line");
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createIndentCell_7u86xv_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createProperty_7u86xv_b2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
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

  private EditorCell createRefNode_7u86xv_b3a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
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

  private static boolean renderingCondition_7u86xv_a1a(SNode node, EditorContext editorContext, IScope scope) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).count() > 0;
  }

  private static class annotationListHandler_7u86xv_a1a extends RefNodeListHandler {
    public annotationListHandler_7u86xv_a1a(SNode ownerNode, String childRole, EditorContext context) {
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
  }
}
