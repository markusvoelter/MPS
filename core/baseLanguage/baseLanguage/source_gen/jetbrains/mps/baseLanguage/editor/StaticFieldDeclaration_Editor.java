package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class StaticFieldDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility6130_0;
  /* package */AbstractCellProvider myVariableDeclaration_NameCellComponent6130_0;
  /* package */AbstractCellListHandler myListHandler_1188210613756;
  /* package */AbstractCellListHandler myListHandler_1188210623223;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1188210606979(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1184156044214(context, node);
  }

  public EditorCell createCollection1184156044214(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11841560442141184156044214(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1184156044215(context, node));
    editorCell.addEditorCell(this.createCollection1188210623221(context, node));
    editorCell.addEditorCell(this.createRefNodeList1188210623223(context, node));
    return editorCell;
  }

  public EditorCell createCollection1184156044215(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11841560442151184156044215(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1184156045517(context, node, "isFinal"));
    editorCell.addEditorCell(this.createProperty1184156048574(context, node));
    return editorCell;
  }

  public EditorCell createCollection1188210606979(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11882106069791188210606979(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6130_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1188210613755(context, node));
    }
    editorCell.addEditorCell(this.createCollection1188210606980(context, node));
    return editorCell;
  }

  public EditorCell createCollection1188210606980(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11882106069801188210606980(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1188210606981(context, node));
    editorCell.addEditorCell(this.createConstant1188210606982(context, node, "static"));
    if (renderingCondition6130_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1188210606983(context, node, "final"));
    }
    editorCell.addEditorCell(this.createRefNode1188210606990(context, node));
    editorCell.addEditorCell(this.createComponent1188210606991(context, node));
    if (renderingCondition6130_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1188210606992(context, node));
    }
    editorCell.addEditorCell(this.createConstant1188210607003(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection1188210606992(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11882106069921188210606992(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1188210606993(context, node, "="));
    editorCell.addEditorCell(this.createRefNode1188210606994(context, node));
    return editorCell;
  }

  public EditorCell createCollection1188210613755(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11882106137551188210613755(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1188210613756(context, node));
    return editorCell;
  }

  public EditorCell createCollection1188210623221(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11882106232211188210623221(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1188210623222(context, node, "annotations:"));
    return editorCell;
  }

  public EditorCell createComponent1188210606981(EditorContext context, SNode node) {
    if (this.my_Component_Visibility6130_0 == null) {
      this.my_Component_Visibility6130_0 = new _Component_Visibility(node);
    }
    EditorCell editorCell = this.my_Component_Visibility6130_0.createEditorCell(context);
    setupBasic_component__Component_Visibility1188210606981(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1188210606991(EditorContext context, SNode node) {
    if (this.myVariableDeclaration_NameCellComponent6130_0 == null) {
      this.myVariableDeclaration_NameCellComponent6130_0 = new VariableDeclaration_NameCellComponent(node);
    }
    EditorCell editorCell = this.myVariableDeclaration_NameCellComponent6130_0.createEditorCell(context);
    setupBasic_component_VariableDeclaration_NameCellComponent1188210606991(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1184156045517(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11841560455171184156045517(editorCell, node, context);
    setupLabel_Constant_1184156045517_1184156045517(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188210606982(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882106069821188210606982(editorCell, node, context);
    setupLabel_Constant_1188210606982_1188210606982(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188210606983(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882106069831188210606983(editorCell, node, context);
    setupLabel_Constant_1188210606983_1188210606983(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188210606993(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882106069931188210606993(editorCell, node, context);
    setupLabel_Constant_1188210606993_1188210606993(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188210607003(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882106070031188210607003(editorCell, node, context);
    setupLabel_Constant_1188210607003_1188210607003(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188210623222(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882106232221188210623222(editorCell, node, context);
    setupLabel_Constant_1188210623222_1188210623222(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1188210613756(EditorContext context, SNode node) {
    if (this.myListHandler_1188210613756 == null) {
      this.myListHandler_1188210613756 = new StaticFieldDeclaration_Editor.annotationListHandler_6130_0(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1188210613756.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_annotation1188210613756(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1188210613756.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1188210623223(EditorContext context, SNode node) {
    if (this.myListHandler_1188210623223 == null) {
      this.myListHandler_1188210623223 = new StaticFieldDeclaration_Editor.annotationListHandler_6130_1(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1188210623223.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_annotation1188210623223(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1188210623223.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty1184156048574_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_isFinal1184156048574(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_isFinal_1184156048574((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1184156048574(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isFinal");
    provider.setNoTargetText("<no isFinal>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1184156048574_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1188210606990_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_type1188210606990(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_type_1188210606990((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1188210606990(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1188210606990_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1188210606994_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_initializer1188210606994(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_initializer_1188210606994((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1188210606994(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("initializer");
    provider.setNoTargetText("<no initializer>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1188210606994_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11841560442141184156044214(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1184156044214");
  }

  private static void setupBasic_Collection_11841560442151184156044215(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1184156044215");
  }

  private static void setupBasic_Constant_11841560455171184156045517(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1184156045517");
  }

  private static void setupBasic_property_isFinal1184156048574(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_isFinal");
  }

  private static void setupBasic_Collection_11882106069791188210606979(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1188210606979");
  }

  private static void setupBasic_Collection_11882106069801188210606980(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1188210606980");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component__Component_Visibility1188210606981(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component__Component_Visibility");
  }

  private static void setupBasic_Constant_11882106069821188210606982(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1188210606982");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11882106069831188210606983(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1188210606983");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_type1188210606990(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_component_VariableDeclaration_NameCellComponent1188210606991(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component_VariableDeclaration_NameCellComponent");
    BaseLanguageStyle_StyleSheet.getStaticField(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_11882106069921188210606992(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1188210606992");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11882106069931188210606993(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1188210606993");
    BaseLanguageStyle_StyleSheet.getOperator(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_initializer1188210606994(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.AUTO_DELETABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11882106070031188210607003(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1188210607003");
    BaseLanguageStyle_StyleSheet.getSemicolon(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_11882106137551188210613755(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1188210613755");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_annotation1188210613756(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_annotation");
  }

  private static void setupBasic_Collection_11882106232211188210623221(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1188210623221");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11882106232221188210623222(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1188210623222");
  }

  private static void setupBasic_refNodeList_annotation1188210623223(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_annotation");
  }

  private static void setupLabel_Constant_1184156045517_1184156045517(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_isFinal_1184156048574(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188210606982_1188210606982(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188210606983_1188210606983(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_type_1188210606990(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188210606993_1188210606993(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_initializer_1188210606994(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188210607003_1188210607003(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_annotation_1188210613756(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188210623222_1188210623222(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_annotation_1188210623223(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6130_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isFinal");
  }

  public static boolean renderingCondition6130_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "initializer", true) != null;
  }

  public static boolean renderingCondition6130_2(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "annotation") > 0;
  }

  public static class annotationListHandler_6130_0 extends RefNodeListHandler {

    public annotationListHandler_6130_0(SNode ownerNode, String childRole, EditorContext context) {
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
  public static class annotationListHandler_6130_1 extends RefNodeListHandler {

    public annotationListHandler_6130_1(SNode ownerNode, String childRole, EditorContext context) {
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
