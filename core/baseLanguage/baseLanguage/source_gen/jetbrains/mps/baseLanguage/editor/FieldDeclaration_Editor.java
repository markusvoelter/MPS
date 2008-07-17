package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class FieldDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility6;
  /* package */AbstractCellProvider myVariableDeclaration_NameCellComponent;
  /* package */AbstractCellListHandler myListHandler_3369_0;
  /* package */AbstractCellListHandler myListHandler_3369_01;

  private static void setupBasic_CollectionCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3369_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.NEXT_LINE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_CollectionCell3369_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3369_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
    editorCell.addKeyMap(new FieldDeclaration_keyMap());
  }

  private static void setupBasic__Component_VisibilityComponentCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "__Component_VisibilityComponentCell3369_0");
  }

  private static void setupBasic_typeRefNodeCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_VariableDeclaration_NameCellComponentComponentCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_VariableDeclaration_NameCellComponentComponentCell3369_0");
    BaseLanguageStyle_StyleSheet.FIELD.apply(editorCell);
  }

  private static void setupBasic_CollectionCell3369_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3369_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3369_0");
    BaseLanguageStyle_StyleSheet.OPERATOR.apply(editorCell);
  }

  private static void setupBasic_initializerRefNodeCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell3369_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3369_01");
  }

  private static void setupBasic_CollectionCell3369_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3369_03");
  }

  private static void setupBasic_CollectionCell3369_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3369_04");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell3369_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3369_02");
  }

  private static void setupBasic_annotationRefNodeListCell3369_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_annotationRefNodeListCell3369_0");
  }

  private static void setupBasic_CollectionCell3369_05(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3369_05");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_annotationRefNodeListCell3369_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_annotationRefNodeListCell3369_01");
  }

  private static void setupLabel_typeRefNodeCell3369_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3369_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_initializerRefNodeCell3369_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3369_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3369_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_annotationRefNodeListCell3369_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_annotationRefNodeListCell3369_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition3369_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "initializer", true) != null;
  }

  public static boolean renderingCondition3369_01(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "annotation") > 0;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell3369_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell3369_03(context, node);
  }

  public EditorCell create_CollectionCell3369_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell3369_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition3369_01(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell3369_05(context, node));
    }
    editorCell.addEditorCell(this.create_CollectionCell3369_01(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell3369_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3369_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create__Component_VisibilityComponentCell3369_0(context, node));
    editorCell.addEditorCell(this.create_typeRefNodeCell3369_0(context, node));
    editorCell.addEditorCell(this.create_VariableDeclaration_NameCellComponentComponentCell3369_0(context, node));
    if (renderingCondition3369_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell3369_02(context, node));
    }
    editorCell.addEditorCell(this.create_ConstantCell3369_01(context, node, ";"));
    return editorCell;
  }

  public EditorCell create_CollectionCell3369_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3369_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell3369_0(context, node, "="));
    editorCell.addEditorCell(this.create_initializerRefNodeCell3369_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell3369_03(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell3369_03(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell3369_04(context, node));
    editorCell.addEditorCell(this.create_annotationRefNodeListCell3369_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell3369_04(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3369_04(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell3369_02(context, node, "annotations:"));
    return editorCell;
  }

  public EditorCell create_CollectionCell3369_05(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell3369_05(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_annotationRefNodeListCell3369_01(context, node));
    return editorCell;
  }

  public EditorCell create__Component_VisibilityComponentCell3369_0(EditorContext context, SNode node) {
    if (this.my_Component_Visibility6 == null) {
      this.my_Component_Visibility6 = new _Component_Visibility(node);
    }
    EditorCell editorCell = this.my_Component_Visibility6.createEditorCell(context);
    setupBasic__Component_VisibilityComponentCell3369_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_VariableDeclaration_NameCellComponentComponentCell3369_0(EditorContext context, SNode node) {
    if (this.myVariableDeclaration_NameCellComponent == null) {
      this.myVariableDeclaration_NameCellComponent = new VariableDeclaration_NameCellComponent(node);
    }
    EditorCell editorCell = this.myVariableDeclaration_NameCellComponent.createEditorCell(context);
    setupBasic_VariableDeclaration_NameCellComponentComponentCell3369_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell3369_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3369_0(editorCell, node, context);
    setupLabel_ConstantCell3369_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell3369_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3369_01(editorCell, node, context);
    setupLabel_ConstantCell3369_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell3369_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3369_02(editorCell, node, context);
    setupLabel_ConstantCell3369_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_annotationRefNodeListCell3369_0(EditorContext context, SNode node) {
    if (this.myListHandler_3369_0 == null) {
      this.myListHandler_3369_0 = new FieldDeclaration_Editor.annotationListHandler_3369_0(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3369_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_annotationRefNodeListCell3369_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_3369_0.getElementRole());
    return editorCell;
  }

  public EditorCell create_annotationRefNodeListCell3369_01(EditorContext context, SNode node) {
    if (this.myListHandler_3369_01 == null) {
      this.myListHandler_3369_01 = new FieldDeclaration_Editor.annotationListHandler_3369_01(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3369_01.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_annotationRefNodeListCell3369_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_3369_01.getElementRole());
    return editorCell;
  }

  public EditorCell create_typeRefNodeCell3369_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_typeRefNodeCell3369_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_typeRefNodeCell3369_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_typeRefNodeCell3369_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_typeRefNodeCell3369_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_initializerRefNodeCell3369_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_initializerRefNodeCell3369_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_initializerRefNodeCell3369_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_initializerRefNodeCell3369_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("initializer");
    provider.setNoTargetText("<no initializer>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_initializerRefNodeCell3369_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class annotationListHandler_3369_0 extends RefNodeListHandler {

    public annotationListHandler_3369_0(SNode ownerNode, String childRole, EditorContext context) {
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
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
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
  public static class annotationListHandler_3369_01 extends RefNodeListHandler {

    public annotationListHandler_3369_01(SNode ownerNode, String childRole, EditorContext context) {
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
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
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
