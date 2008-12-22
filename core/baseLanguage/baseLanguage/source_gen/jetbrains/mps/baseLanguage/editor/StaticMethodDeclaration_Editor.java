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
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class StaticMethodDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility5695_0;
  /* package */AbstractCellProvider myBaseMethodDeclaration_NameCellComponent5695_0;
  /* package */AbstractCellProvider my_GenericDeclaration_TypeVariables_Component5695_0;
  /* package */AbstractCellProvider my_DeprecatedPart5695_0;
  /* package */AbstractCellListHandler myListHandler_5695_0;
  /* package */AbstractCellListHandler myListHandler_5695_1;
  /* package */AbstractCellListHandler myListHandler_5695_2;
  /* package */AbstractCellListHandler myListHandler_5695_3;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_5695_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_5695_4(context, node);
  }

  public EditorCell createAlternation_5695_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = StaticMethodDeclaration_Editor.renderingCondition5695_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_5695_3(context, node);
    } else
    {
      editorCell = this.createConstant_5695_5(context, node, "{");
    }
    setupBasic_Alternation_5695_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection_5695_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_5695_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_5695_3(context, node));
    if (renderingCondition5695_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_5695_5(context, node));
    }
    editorCell.addEditorCell(this.createCollection_5695_2(context, node));
    editorCell.addEditorCell(this.createCollection_5695_1(context, node));
    editorCell.addEditorCell(this.createConstant_5695_2(context, node, "}"));
    editorCell.addEditorCell(this.createConstant_5695_9(context, node, ""));
    return editorCell;
  }

  public EditorCell createCollection_5695_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5695_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell5695_0(context, node));
    editorCell.addEditorCell(this.createRefNode_5695_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5695_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5695_2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_5695_0(context, node));
    editorCell.addEditorCell(this.createConstant_5695_3(context, node, "static"));
    if (renderingCondition5695_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_5695_2(context, node));
    }
    editorCell.addEditorCell(this.createRefNode_5695_3(context, node));
    editorCell.addEditorCell(this.createComponent_5695_1(context, node));
    editorCell.addEditorCell(this.createConstant_5695_1(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList_5695_0(context, node));
    editorCell.addEditorCell(this.createConstant_5695_0(context, node, ")"));
    editorCell.addEditorCell(this.createAlternation_5695_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5695_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5695_3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_5695_7(context, node, "throws"));
    editorCell.addEditorCell(this.createRefNodeList_5695_1(context, node));
    editorCell.addEditorCell(this.createConstant_5695_6(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection_5695_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_5695_4(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection_5695_6(context, node));
    editorCell.addEditorCell(this.createRefNodeList_5695_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5695_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_5695_5(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList_5695_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5695_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5695_6(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_5695_8(context, node, "annotations:"));
    return editorCell;
  }

  public EditorCell createComponent_5695_0(EditorContext context, SNode node) {
    if (this.my_Component_Visibility5695_0 == null) {
      this.my_Component_Visibility5695_0 = new _Component_Visibility(node);
    }
    EditorCell editorCell = this.my_Component_Visibility5695_0.createEditorCell(context);
    setupBasic_Component_5695_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5695_1(EditorContext context, SNode node) {
    if (this.myBaseMethodDeclaration_NameCellComponent5695_0 == null) {
      this.myBaseMethodDeclaration_NameCellComponent5695_0 = new BaseMethodDeclaration_NameCellComponent(node);
    }
    EditorCell editorCell = this.myBaseMethodDeclaration_NameCellComponent5695_0.createEditorCell(context);
    setupBasic_Component_5695_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5695_2(EditorContext context, SNode node) {
    if (this.my_GenericDeclaration_TypeVariables_Component5695_0 == null) {
      this.my_GenericDeclaration_TypeVariables_Component5695_0 = new _GenericDeclaration_TypeVariables_Component(node);
    }
    EditorCell editorCell = this.my_GenericDeclaration_TypeVariables_Component5695_0.createEditorCell(context);
    setupBasic_Component_5695_2(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5695_3(EditorContext context, SNode node) {
    if (this.my_DeprecatedPart5695_0 == null) {
      this.my_DeprecatedPart5695_0 = new _DeprecatedPart(node);
    }
    EditorCell editorCell = this.my_DeprecatedPart5695_0.createEditorCell(context);
    setupBasic_Component_5695_3(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_5695_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_0(editorCell, node, context);
    setupLabel_Constant_5695_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_1(editorCell, node, context);
    setupLabel_Constant_5695_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_2(editorCell, node, context);
    setupLabel_Constant_5695_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_3(editorCell, node, context);
    setupLabel_Constant_5695_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_5(editorCell, node, context);
    setupLabel_Constant_5695_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_6(editorCell, node, context);
    setupLabel_Constant_5695_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_7(editorCell, node, context);
    setupLabel_Constant_5695_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_8(editorCell, node, context);
    setupLabel_Constant_5695_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5695_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5695_9(editorCell, node, context);
    setupLabel_Constant_5695_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_5695_0(EditorContext context, SNode node) {
    if (this.myListHandler_5695_0 == null) {
      this.myListHandler_5695_0 = new StaticMethodDeclaration_Editor.parameterListHandler_5695_0(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_5695_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_5695_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_5695_0.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_5695_1(EditorContext context, SNode node) {
    if (this.myListHandler_5695_1 == null) {
      this.myListHandler_5695_1 = new StaticMethodDeclaration_Editor.throwsItemListHandler_5695_0(node, "throwsItem", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_5695_1.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_RefNodeList_5695_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_5695_1.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_5695_2(EditorContext context, SNode node) {
    if (this.myListHandler_5695_2 == null) {
      this.myListHandler_5695_2 = new StaticMethodDeclaration_Editor.annotationListHandler_5695_0(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_5695_2.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_5695_2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_5695_2.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_5695_3(EditorContext context, SNode node) {
    if (this.myListHandler_5695_3 == null) {
      this.myListHandler_5695_3 = new StaticMethodDeclaration_Editor.annotationListHandler_5695_1(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_5695_3.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_5695_3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_5695_3.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell5695_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode_5695_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_5695_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_5695_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_5695_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_5695_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_5695_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_5695_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_5695_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_5695_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("returnType");
    provider.setNoTargetText("<no type>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_5695_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_0");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
    _BaseMethodDeclaration_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Collection_5695_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.POSITION, "indented");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_5695_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_5695_1(EditorCell editorCell, SNode node, EditorContext context) {
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupBasic_Constant_5695_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_1");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_5695_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_2");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.POSITION, "next-line");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_5695_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_3");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_parameter");
  }

  private static void setupBasic_Alternation_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_5695_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_5");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_Collection_5695_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_3");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNodeList_5695_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_throwsItem");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, Measure.SPACES));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_5695_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_6");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_Constant_5695_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_7");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Component_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_5695_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_5695_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_4");
  }

  private static void setupBasic_Collection_5695_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_5");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNodeList_5695_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_annotation");
  }

  private static void setupBasic_Collection_5695_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5695_6");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_5695_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_8");
  }

  private static void setupBasic_RefNodeList_5695_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_annotation");
  }

  private static void setupBasic_Component_5695_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_5695_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5695_9");
  }

  private static void setupBasic_Indent_5695_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_5695_0");
  }

  private static void setupBasic_Component_5695_3(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_5695_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_5695_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_5695_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_5(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_5695_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_7(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_5695_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_8(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_5695_3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5695_9(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition5695_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "throwsItem") > 0;
  }

  public static boolean renderingCondition5695_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "annotation") > 0;
  }

  public static boolean renderingCondition5695_2(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "typeVariableDeclaration") > 0;
  }

  public static class parameterListHandler_5695_0 extends RefNodeListHandler {

    public parameterListHandler_5695_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_5695_4(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        return editorCell;
      }
    }

    public EditorCell createConstant_5695_4(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_5695_4(editorCell, node, context);
      setupLabel_Constant_5695_4(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_5695_4(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_5695_4");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.SELECTABLE, true);
            this.set(StyleAttributes.EDITABLE, true);
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_5695_4(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class throwsItemListHandler_5695_0 extends RefNodeListHandler {

    public throwsItemListHandler_5695_0(SNode ownerNode, String childRole, EditorContext context) {
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
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        return editorCell;
      }
    }

}
  public static class annotationListHandler_5695_0 extends RefNodeListHandler {

    public annotationListHandler_5695_0(SNode ownerNode, String childRole, EditorContext context) {
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
  public static class annotationListHandler_5695_1 extends RefNodeListHandler {

    public annotationListHandler_5695_1(SNode ownerNode, String childRole, EditorContext context) {
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
