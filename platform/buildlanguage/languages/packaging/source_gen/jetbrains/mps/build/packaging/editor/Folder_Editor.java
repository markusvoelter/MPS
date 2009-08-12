package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Folder_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent5234_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent5234_1;
  /* package */AbstractCellProvider myIncludeExcludeInInspector5234_0;
  /* package */AbstractCellProvider myIncludeExcludeEditorComponent5234_0;
  /* package */AbstractCellListHandler myListHandler_5234_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_5234_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_5234_3(context, node);
  }

  public EditorCell createCollection_5234_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_5234_0");
    editorCell.addEditorCell(this.createCollection_5234_1(context, node));
    editorCell.addEditorCell(this.createCollection_5234_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5234_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_5234_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConceptProperty_5234_0(context, node));
    editorCell.addEditorCell(this.createRefNode_5234_0(context, node));
    editorCell.addEditorCell(this.createConstant_5234_0(context, node, "from"));
    editorCell.addEditorCell(this.createRefNode_5234_1(context, node));
    editorCell.addEditorCell(this.createComponent_5234_3(context, node));
    editorCell.addEditorCell(this.createComponent_5234_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5234_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_5234_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell5234_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList_5234_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5234_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_5234_3");
    editorCell.addEditorCell(this.createComponent_5234_2(context, node));
    editorCell.addEditorCell(this.createComponent_5234_0(context, node));
    return editorCell;
  }

  public EditorCell createComponent_5234_0(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent5234_0 == null) {
      this.myConfigurationReferencesEditorComponent5234_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent5234_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_5234_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent5234_1 == null) {
      this.myConfigurationReferencesEditorComponent5234_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent5234_1.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_5234_2(EditorContext context, SNode node) {
    if (this.myIncludeExcludeInInspector5234_0 == null) {
      this.myIncludeExcludeInInspector5234_0 = new IncludeExcludeInInspector(node);
    }
    EditorCell editorCell = this.myIncludeExcludeInInspector5234_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_5234_3(EditorContext context, SNode node) {
    if (this.myIncludeExcludeEditorComponent5234_0 == null) {
      this.myIncludeExcludeEditorComponent5234_0 = new IncludeExcludeEditorComponent(node);
    }
    EditorCell editorCell = this.myIncludeExcludeEditorComponent5234_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConstant_5234_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_5234_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_5234_0(EditorContext context, SNode node) {
    if (this.myListHandler_5234_0 == null) {
      this.myListHandler_5234_0 = new Folder_Editor.entryListHandler_5234_0(node, "entry", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_5234_0.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_entry");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setCanBeFolded(true);
    editorCell.setRole(this.myListHandler_5234_0.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell5234_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createConceptProperty_5234_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
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

  public EditorCell createRefNode_5234_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
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

  public EditorCell createRefNode_5234_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
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

  public static class entryListHandler_5234_0 extends RefNodeListHandler {

    public entryListHandler_5234_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_5234_1(context, node, "<entries>");
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

    public EditorCell createConstant_5234_1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      editorCell.setCellId("Constant_5234_1");
      PackagingStyles_StyleSheet.getHint(editorCell).apply(editorCell);
      editorCell.setDefaultText("");
      return editorCell;
    }

}

}
