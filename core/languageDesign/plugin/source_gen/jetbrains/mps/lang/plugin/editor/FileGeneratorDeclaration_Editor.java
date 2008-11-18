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
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.EnumMeasure;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class FileGeneratorDeclaration_Editor extends DefaultNodeEditor {

  /* package */ AbstractCellListHandler myListHandler_1227032418442;
  /* package */ AbstractCellListHandler myListHandler_1227032418455;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1227032418457(context, node);
  }

  public EditorCell createCollection1227032418419(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324184191227032418419(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227032418420(context, node, "file generator"));
    editorCell.addEditorCell(this.createConstant1227032418421(context, node, "extends"));
    editorCell.addEditorCell(this.createRefCell1227032418422(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227032418441(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12270324184411227032418441(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1227032418442(context, node));
    editorCell.addEditorCell(this.createConstant1227032418444(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227032418446(context, node));
    editorCell.addEditorCell(this.createConstant1227032418447(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227032418449(context, node));
    editorCell.addEditorCell(this.createConstant1227032418450(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227032418452(context, node));
    editorCell.addEditorCell(this.createConstant1227032418453(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1227032418455(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227032418457(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12270324184571227032418457(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227032418458(context, node));
    editorCell.addEditorCell(this.createCollection1227032418461(context, node));
    if (renderingCondition0103_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227032418855(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227032418458(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324184581227032418458(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227032418419(context, node));
    if (renderingCondition0103_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227032418850(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227032418461(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270324184611227032418461(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell0103_0(context, node));
    editorCell.addEditorCell(this.createCollection1227032418441(context, node));
    return editorCell;
  }

  public EditorCell createConstant1227032418420(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324184201227032418420(editorCell, node, context);
    setupLabel_Constant_1227032418420_1227032418420(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418421(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324184211227032418421(editorCell, node, context);
    setupLabel_Constant_1227032418421_1227032418421(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418444(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324184441227032418444(editorCell, node, context);
    setupLabel_Constant_1227032418444_1227032418444(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418447(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324184471227032418447(editorCell, node, context);
    setupLabel_Constant_1227032418447_1227032418447(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418450(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324184501227032418450(editorCell, node, context);
    setupLabel_Constant_1227032418450_1227032418450(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418453(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324184531227032418453(editorCell, node, context);
    setupLabel_Constant_1227032418453_1227032418453(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418850(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324188501227032418850(editorCell, node, context);
    setupLabel_Constant_1227032418850_1227032418850(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227032418855(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270324188551227032418855(editorCell, node, context);
    setupLabel_Constant_1227032418855_1227032418855(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1227032418442(EditorContext context, SNode node) {
    if (this.myListHandler_1227032418442 == null) {
      this.myListHandler_1227032418442 = new FileGeneratorDeclaration_Editor.fieldListHandler_0103_0(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1227032418442.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_field1227032418442(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1227032418442.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1227032418455(EditorContext context, SNode node) {
    if (this.myListHandler_1227032418455 == null) {
      this.myListHandler_1227032418455 = new FileGeneratorDeclaration_Editor.methodListHandler_0103_0(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1227032418455.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_method1227032418455(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1227032418455.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell0103_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefCell1227032418422_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new FileGeneratorDeclaration_Editor._Inline0103_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_extendedClass1227032418422(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_extendedClass_1227032418422((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1227032418422(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("extendedClass");
    provider.setNoTargetText("<no extendedClass>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1227032418422_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227032418446_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_generateBlock1227032418446(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_generateBlock_1227032418446((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227032418446(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("generateBlock");
    provider.setNoTargetText("<no generate block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227032418446_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227032418449_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_isDefaultBlock1227032418449(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_isDefaultBlock_1227032418449((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227032418449(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("isDefaultBlock");
    provider.setNoTargetText("<no isDefault block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227032418449_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227032418452_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_overridesDefaultBlock1227032418452(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_overridesDefaultBlock_1227032418452((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227032418452(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("overridesDefaultBlock");
    provider.setNoTargetText("<no overridesDefaultBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227032418452_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }


  private static void setupBasic_Collection_12270324184191227032418419(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032418419");
  }

  private static void setupBasic_Constant_12270324184201227032418420(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418420");
  }

  private static void setupBasic_Constant_12270324184211227032418421(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418421");
  }

  private static void setupBasic_refCell_extendedClass1227032418422(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_extendedClass");
  }

  private static void setupBasic_Collection_12270324184411227032418441(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032418441");
  }

  private static void setupBasic_refNodeList_field1227032418442(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_field");
  }

  private static void setupBasic_Constant_12270324184441227032418444(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418444");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_generateBlock1227032418446(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270324184471227032418447(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418447");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_isDefaultBlock1227032418449(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270324184501227032418450(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418450");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_overridesDefaultBlock1227032418452(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270324184531227032418453(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418453");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_method1227032418455(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_method");
  }

  private static void setupBasic_Collection_12270324184571227032418457(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032418457");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270324184581227032418458(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032418458");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270324184611227032418461(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227032418461");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12270324184621227032418462(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1227032418462");
  }

  private static void setupBasic_Constant_12270324188501227032418850(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418850");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12270324188551227032418855(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227032418855");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1227032418420_1227032418420(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418421_1227032418421(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_extendedClass_1227032418422(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_field_1227032418442(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418444_1227032418444(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_generateBlock_1227032418446(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418447_1227032418447(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_isDefaultBlock_1227032418449(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418450_1227032418450(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_overridesDefaultBlock_1227032418452(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418453_1227032418453(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_method_1227032418455(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418850_1227032418850(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227032418855_1227032418855(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0103_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition0103_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class _Inline0103_0 extends AbstractCellProvider {

    public _Inline0103_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1227032418424(context, node);
    }

    public EditorCell createProperty1227032418424_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1227032418424(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1227032418424((EditorCell_Label) editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1227032418424(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1227032418424_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
        return cellWithRole;
    }


    private static void setupBasic_property_name1227032418424(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1227032418424(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

  }

  public static class fieldListHandler_0103_0 extends RefNodeListHandler {

    public fieldListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1227032418443(context, node, "");
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

    public EditorCell createConstant1227032418443(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12270324184431227032418443(editorCell, node, context);
      setupLabel_Constant_1227032418443_1227032418443(editorCell, node, context);
      editorCell.setDefaultText("<fields>");
      return editorCell;
    }


    private static void setupBasic_Constant_12270324184431227032418443(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1227032418443");
    }

    private static void setupLabel_Constant_1227032418443_1227032418443(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

  }

  public static class methodListHandler_0103_0 extends RefNodeListHandler {

    public methodListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1227032418456(context, node, "");
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

    public EditorCell createConstant1227032418456(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12270324184561227032418456(editorCell, node, context);
      setupLabel_Constant_1227032418456_1227032418456(editorCell, node, context);
      editorCell.setDefaultText("<methods>");
      return editorCell;
    }


    private static void setupBasic_Constant_12270324184561227032418456(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1227032418456");
    }

    private static void setupLabel_Constant_1227032418456_1227032418456(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

  }

}
