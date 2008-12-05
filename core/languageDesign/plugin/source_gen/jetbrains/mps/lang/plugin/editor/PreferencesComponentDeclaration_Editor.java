package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class PreferencesComponentDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1228495419282;
  /* package */AbstractCellListHandler myListHandler_1228495419294;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1228495419297(context, node);
  }

  public EditorCell createCollection1228495419277(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12284954192771228495419277(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228495419278(context, node, "preferences component"));
    editorCell.addEditorCell(this.createProperty1228495419279(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228495419281(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12284954192811228495419281(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1228495419282(context, node));
    editorCell.addEditorCell(this.createConstant1228495419284(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228495419286(context, node));
    editorCell.addEditorCell(this.createConstant1228495419287(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228495419289(context, node));
    editorCell.addEditorCell(this.createConstant1228495419290(context, node, ""));
    editorCell.addEditorCell(this.createConstant1228495419292(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1228495419294(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228495419297(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12284954192971228495419297(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228495419298(context, node));
    editorCell.addEditorCell(this.createCollection1228495419301(context, node));
    if (renderingCondition4007_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228495420020(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228495419298(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12284954192981228495419298(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228495419277(context, node));
    if (renderingCondition4007_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228495420015(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228495419301(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12284954193011228495419301(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell4007_0(context, node));
    editorCell.addEditorCell(this.createCollection1228495419281(context, node));
    return editorCell;
  }

  public EditorCell createConstant1228495419278(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954192781228495419278(editorCell, node, context);
    setupLabel_Constant_1228495419278_1228495419278(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228495419284(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954192841228495419284(editorCell, node, context);
    setupLabel_Constant_1228495419284_1228495419284(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228495419287(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954192871228495419287(editorCell, node, context);
    setupLabel_Constant_1228495419287_1228495419287(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228495419290(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954192901228495419290(editorCell, node, context);
    setupLabel_Constant_1228495419290_1228495419290(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228495419292(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954192921228495419292(editorCell, node, context);
    setupLabel_Constant_1228495419292_1228495419292(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228495420015(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954200151228495420015(editorCell, node, context);
    setupLabel_Constant_1228495420015_1228495420015(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228495420020(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12284954200201228495420020(editorCell, node, context);
    setupLabel_Constant_1228495420020_1228495420020(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1228495419282(EditorContext context, SNode node) {
    if (this.myListHandler_1228495419282 == null) {
      this.myListHandler_1228495419282 = new PreferencesComponentDeclaration_Editor.persistenPropertyDeclarationListHandler_4007_0(node, "persistenPropertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1228495419282.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_persistenPropertyDeclaration1228495419282(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1228495419282.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1228495419294(EditorContext context, SNode node) {
    if (this.myListHandler_1228495419294 == null) {
      this.myListHandler_1228495419294 = new PreferencesComponentDeclaration_Editor.preferencePageListHandler_4007_0(node, "preferencePage", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1228495419294.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_preferencePage1228495419294(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1228495419294.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell4007_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1228495419279_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1228495419279(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1228495419279((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228495419279(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228495419279_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228495419286_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_afterReadBlock1228495419286(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_afterReadBlock_1228495419286((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228495419286(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("afterReadBlock");
    provider.setNoTargetText("<no afterReadBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228495419286_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228495419289_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_beforeWriteBlock1228495419289(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_beforeWriteBlock_1228495419289((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228495419289(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("beforeWriteBlock");
    provider.setNoTargetText("<no beforeWriteBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228495419289_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12284954192771228495419277(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228495419277");
  }

  private static void setupBasic_Constant_12284954192781228495419278(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495419278");
  }

  private static void setupBasic_property_name1228495419279(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12284954192811228495419281(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228495419281");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_persistenPropertyDeclaration1228495419282(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_persistenPropertyDeclaration");
  }

  private static void setupBasic_Constant_12284954192841228495419284(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495419284");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_afterReadBlock1228495419286(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12284954192871228495419287(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495419287");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_beforeWriteBlock1228495419289(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12284954192901228495419290(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495419290");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12284954192921228495419292(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495419292");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_preferencePage1228495419294(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_preferencePage");
  }

  private static void setupBasic_Collection_12284954192971228495419297(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228495419297");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12284954192981228495419298(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228495419298");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12284954193011228495419301(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228495419301");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12284954193021228495419302(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1228495419302");
  }

  private static void setupBasic_Constant_12284954200151228495420015(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495420015");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12284954200201228495420020(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228495420020");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1228495419278_1228495419278(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1228495419279(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_persistenPropertyDeclaration_1228495419282(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228495419284_1228495419284(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_afterReadBlock_1228495419286(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228495419287_1228495419287(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_beforeWriteBlock_1228495419289(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228495419290_1228495419290(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228495419292_1228495419292(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_preferencePage_1228495419294(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228495420015_1228495420015(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228495420020_1228495420020(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4007_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition4007_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class persistenPropertyDeclarationListHandler_4007_0 extends RefNodeListHandler {

    public persistenPropertyDeclarationListHandler_4007_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1228495419283(context, node, "<persistent properties>");
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

    public EditorCell createConstant1228495419283(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12284954192831228495419283(editorCell, node, context);
      setupLabel_Constant_1228495419283_1228495419283(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12284954192831228495419283(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1228495419283");
      BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1228495419283_1228495419283(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class preferencePageListHandler_4007_0 extends RefNodeListHandler {

    public preferencePageListHandler_4007_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1228495419295(context, node, "<no preference pages>");
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

    public EditorCell createConstant1228495419295(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12284954192951228495419295(editorCell, node, context);
      setupLabel_Constant_1228495419295_1228495419295(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12284954192951228495419295(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1228495419295");
      BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1228495419295_1228495419295(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
