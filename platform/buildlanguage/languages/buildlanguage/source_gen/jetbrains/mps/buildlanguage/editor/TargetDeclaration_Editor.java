package jetbrains.mps.buildlanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class TargetDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4669_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_4669_8(context, node);
  }

  private EditorCell createCollection_4669_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_4669_0");
    if (renderingCondition4669_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4669_5(context, node));
    }
    editorCell.addEditorCell(this.createCollection_4669_1(context, node));
    editorCell.addEditorCell(this.createCollection_4669_4(context, node));
    editorCell.addEditorCell(this.createCollection_4669_2(context, node));
    editorCell.addEditorCell(this.createConstant_4669_4(context, node, ""));
    return editorCell;
  }

  private EditorCell createCollection_4669_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConceptProperty_4669_0(context, node));
    editorCell.addEditorCell(this.createProperty_4669_0(context, node));
    if (renderingCondition4669_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4669_6(context, node));
    }
    if (renderingCondition4669_3(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4669_7(context, node));
    }
    if (renderingCondition4669_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4669_3(context, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_4669_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell4669_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList_4669_0(context, node));
    return editorCell;
  }

  private EditorCell createCollection_4669_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_4669_0(context, node, "["));
    editorCell.addEditorCell(this.createComponent_4669_0(context, node));
    editorCell.addEditorCell(this.createConstant_4669_1(context, node, "]"));
    return editorCell;
  }

  private EditorCell createCollection_4669_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell4669_1(context, node));
    editorCell.addEditorCell(this.createRefNodeList_4669_1(context, node));
    return editorCell;
  }

  private EditorCell createCollection_4669_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_4669_5(context, node, "//"));
    editorCell.addEditorCell(this.createProperty_4669_1(context, node));
    return editorCell;
  }

  private EditorCell createCollection_4669_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_4669_6(context, node, "if"));
    editorCell.addEditorCell(this.createProperty_4669_2(context, node));
    return editorCell;
  }

  private EditorCell createCollection_4669_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_4669_7(context, node, "unless"));
    editorCell.addEditorCell(this.createProperty_4669_3(context, node));
    return editorCell;
  }

  private EditorCell createCollection_4669_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_4669_8");
    editorCell.addEditorCell(this.createComponent_4669_1(context, node));
    if (renderingCondition4669_4(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4669_9(context, node));
    }
    if (renderingCondition4669_5(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_4669_10(context, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_4669_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_4669_8(context, node, "if"));
    editorCell.addEditorCell(this.createConstant_4669_9(context, node, "="));
    editorCell.addEditorCell(this.createProperty_4669_4(context, node));
    return editorCell;
  }

  private EditorCell createCollection_4669_10(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_4669_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_4669_11(context, node, "unless"));
    editorCell.addEditorCell(this.createConstant_4669_10(context, node, "="));
    editorCell.addEditorCell(this.createProperty_4669_5(context, node));
    return editorCell;
  }

  private EditorCell createComponent_4669_0(EditorContext context, SNode node) {
    AbstractCellProvider provider = new TargetDeclaration_EditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(context);
    return editorCell;
  }

  private EditorCell createComponent_4669_1(EditorContext context, SNode node) {
    AbstractCellProvider provider = new TargetDeclaration_EditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(context);
    return editorCell;
  }

  private EditorCell createConstant_4669_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.EDITABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_5");
    BuildLanguageStyle_StyleSheet.getComment(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_6");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_7");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_8");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_9");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_10");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4669_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4669_11");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_4669_0(EditorContext context, SNode node) {
    AbstractCellListHandler handler = new TargetDeclaration_Editor.taskCallListHandler_4669_0(node, "taskCall", context);
    EditorCell_Collection editorCell = handler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_taskCall");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNodeList_4669_1(EditorContext context, SNode node) {
    AbstractCellListHandler handler = new TargetDeclaration_Editor.propertyListListHandler_4669_0(node, "propertyList", context);
    EditorCell_Collection editorCell = handler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_propertyList");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createIndentCell4669_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  private EditorCell createIndentCell4669_1(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  private EditorCell createConceptProperty_4669_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("conceptProperty_alias");
    BuildLanguageStyle_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
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

  private EditorCell createProperty_4669_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_name");
    BuildLanguageStyle_StyleSheet.getTarget(editorCell).apply(editorCell);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
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

  private EditorCell createProperty_4669_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("shortDescription");
    provider.setNoTargetText("<no shortDescription>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_shortDescription");
    BuildLanguageStyle_StyleSheet.getComment(editorCell).apply(editorCell);
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

  private EditorCell createProperty_4669_2(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("if");
    provider.setNoTargetText("<no if>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_if");
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

  private EditorCell createProperty_4669_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("unless");
    provider.setNoTargetText("<no unless>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_unless");
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

  private EditorCell createProperty_4669_4(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("if");
    provider.setNoTargetText("<no if>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_if_1");
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

  private EditorCell createProperty_4669_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("unless");
    provider.setNoTargetText("<no unless>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_unless_1");
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


  private static boolean renderingCondition4669_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "depends") != 0 || editorContext.isInspector();
  }

  private static boolean renderingCondition4669_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "shortDescription") != null;
  }

  private static boolean renderingCondition4669_2(SNode node, EditorContext editorContext, IScope scope) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(node, "if"));
  }

  private static boolean renderingCondition4669_3(SNode node, EditorContext editorContext, IScope scope) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(node, "unless"));
  }

  private static boolean renderingCondition4669_4(SNode node, EditorContext editorContext, IScope scope) {
    return editorContext.isInspector();
  }

  private static boolean renderingCondition4669_5(SNode node, EditorContext editorContext, IScope scope) {
    return editorContext.isInspector();
  }

  private static class taskCallListHandler_4669_0 extends RefNodeListHandler {

    public taskCallListHandler_4669_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_4669_3(context, node, "<task calls>");
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

    private EditorCell createConstant_4669_3(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      editorCell.setCellId("Constant_4669_3");
      BuildLanguageStyle_StyleSheet.getPrompting(editorCell).apply(editorCell);
      editorCell.setDefaultText("");
      return editorCell;
    }

}
  private static class propertyListListHandler_4669_0 extends RefNodeListHandler {

    public propertyListListHandler_4669_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_4669_2(context, node, "<property declarations>");
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

    private EditorCell createConstant_4669_2(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      editorCell.setCellId("Constant_4669_2");
      BuildLanguageStyle_StyleSheet.getPrompting(editorCell).apply(editorCell);
      editorCell.setDefaultText("");
      return editorCell;
    }

}

}
