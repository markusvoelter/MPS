package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;

public class MultitabbedEditorTab_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1227032414395(context, node);
  }

  public EditorCell createCollection1227032414379(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324143791227032414379(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227032414380(context, node, "multitabbed editor tab"));
    editorCell.addEditorCell(this.createProperty1227032414382(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227032414384(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12270324143841227032414384(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227032414385(context, node));
    editorCell.addEditorCell(this.createConstant1227032414389(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227032414390(context, node));
    editorCell.addEditorCell(this.createConstant1227032414391(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227032414392(context, node));
    editorCell.addEditorCell(this.createConstant1227032414393(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227032414394(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227032414385(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324143851227032414385(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227032414386(context, node, "empty text:"));
    editorCell.addEditorCell(this.createProperty1227032414387(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227032414395(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12270324143951227032414395(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227032414396(context, node));
    editorCell.addEditorCell(this.createCollection1227032414399(context, node));
    if (renderingCondition7753_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227032418582(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227032414396(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324143961227032414396(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227032414379(context, node));
    if (renderingCondition7753_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227032418577(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227032414399(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324143991227032414399(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell7753_0(context, node));
    editorCell.addEditorCell(this.createCollection1227032414384(context, node));
    return editorCell;
  }

  public EditorCell createConstant1227032414380(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324143801227032414380(editorCell, node, context);
    setupLabel_Constant_1227032414380_1227032414380(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032414386(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324143861227032414386(editorCell, node, context);
    setupLabel_Constant_1227032414386_1227032414386(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032414389(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324143891227032414389(editorCell, node, context);
    setupLabel_Constant_1227032414389_1227032414389(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032414391(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324143911227032414391(editorCell, node, context);
    setupLabel_Constant_1227032414391_1227032414391(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032414393(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324143931227032414393(editorCell, node, context);
    setupLabel_Constant_1227032414393_1227032414393(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418577(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324185771227032418577(editorCell, node, context);
    setupLabel_Constant_1227032418577_1227032418577(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418582(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324185821227032418582(editorCell, node, context);
    setupLabel_Constant_1227032418582_1227032418582(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell7753_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1227032414382_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1227032414382(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1227032414382((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1227032414382(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<tab caption>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1227032414382_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createProperty1227032414387_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_emptyCaption1227032414387(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_emptyCaption_1227032414387((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1227032414387(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("emptyCaption");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1227032414387_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227032414390_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_getNodesBlock1227032414390(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_getNodesBlock_1227032414390((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227032414390(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getNodesBlock");
    provider.setNoTargetText("<no getNodesBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227032414390_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227032414392_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_getInnerTabNameBlock1227032414392(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_getInnerTabNameBlock_1227032414392((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227032414392(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getInnerTabNameBlock");
    provider.setNoTargetText("<inner tab text : use node name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227032414392_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227032414394_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_createBlock1227032414394(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_createBlock_1227032414394((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227032414394(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("createBlock");
    provider.setNoTargetText("<can't create node from this tab>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227032414394_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }


  private static void setupBasic_Collection_12270324143791227032414379(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032414379");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12270324143801227032414380(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032414380");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.orange);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1227032414382(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Collection_12270324143841227032414384(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032414384");
  }

  private static void setupBasic_Collection_12270324143851227032414385(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032414385");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12270324143861227032414386(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032414386");
  }

  private static void setupBasic_property_emptyCaption1227032414387(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_emptyCaption");
  }

  private static void setupBasic_Constant_12270324143891227032414389(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032414389");
  }

  private static void setupBasic_refNode_getNodesBlock1227032414390(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270324143911227032414391(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032414391");
  }

  private static void setupBasic_refNode_getInnerTabNameBlock1227032414392(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270324143931227032414393(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032414393");
  }

  private static void setupBasic_refNode_createBlock1227032414394(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_12270324143951227032414395(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032414395");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270324143961227032414396(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032414396");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270324143991227032414399(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032414399");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12270324144001227032414400(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1227032414400");
  }

  private static void setupBasic_Constant_12270324185771227032418577(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418577");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12270324185821227032418582(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418582");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1227032414380_1227032414380(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1227032414382(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032414386_1227032414386(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_emptyCaption_1227032414387(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032414389_1227032414389(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_getNodesBlock_1227032414390(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032414391_1227032414391(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_getInnerTabNameBlock_1227032414392(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032414393_1227032414393(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_createBlock_1227032414394(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418577_1227032418577(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418582_1227032418582(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition7753_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition7753_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

}
