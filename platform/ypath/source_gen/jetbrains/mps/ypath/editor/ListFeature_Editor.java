package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ypath.behavior.IFeature_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

public class ListFeature_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIFeature_Properties9012_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_9012_0(context, node);
  }

  public EditorCell createAlternation_9012_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ListFeature_Editor.renderingCondition9012_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_9012_5(context, node, "default");
    } else
    {
      editorCell = this.createConstant_9012_6(context, node, "");
    }
    setupBasic_Alternation_9012_0(editorCell, node, context);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createAlternation_9012_1(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ListFeature_Editor.renderingCondition9012_1(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_9012_8(context, node);
    } else
    {
      editorCell = this.createCollection_9012_9(context, node);
    }
    setupBasic_Alternation_9012_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection_9012_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_9012_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_9012_3(context, node));
    editorCell.addEditorCell(this.createCollection_9012_1(context, node));
    editorCell.addEditorCell(this.createCollection_9012_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_0(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_9012_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_9012_2(editorCell, node, context);
    editorCell.setCanBeFolded(true);
    editorCell.addEditorCell(this.createComponent_9012_0(context, node));
    editorCell.addEditorCell(this.createCollection_9012_6(context, node));
    editorCell.addEditorCell(this.createCollection_9012_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_3(editorCell, node, context);
    editorCell.addEditorCell(this.createAlternation_9012_0(context, node));
    editorCell.addEditorCell(this.createProperty_9012_1(context, node));
    editorCell.addEditorCell(this.createCollection_9012_7(context, node));
    editorCell.addEditorCell(this.createConstant_9012_2(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection_9012_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_1(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_9012_10(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_3(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection_9012_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_6(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_4(context, node, "operations"));
    return editorCell;
  }

  public EditorCell createCollection_9012_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_7(editorCell, node, context);
    editorCell.addEditorCell(this.createAlternation_9012_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_8(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_7(context, node, "<<--"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_9012_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_9(editorCell, node, context);
    if (renderingCondition9012_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_9012_8(context, node, "<--"));
    }
    if (renderingCondition9012_3(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_9012_9(context, node, "<-->"));
    }
    if (renderingCondition9012_4(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell_9012_1(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection_9012_10(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_9012_10(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_9012_11(context, node));
    editorCell.addEditorCell(this.createCollection_9012_12(context, node));
    editorCell.addEditorCell(this.createCollection_9012_13(context, node));
    editorCell.addEditorCell(this.createCollection_9012_14(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_11(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_11(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_10(context, node, "get"));
    return editorCell;
  }

  public EditorCell createCollection_9012_12(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_12(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_11(context, node, "  "));
    editorCell.addEditorCell(this.createRefNode_9012_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9012_13(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_13(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_12(context, node, "size"));
    return editorCell;
  }

  public EditorCell createCollection_9012_14(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9012_14(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9012_13(context, node, "  "));
    editorCell.addEditorCell(this.createRefNode_9012_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_9012_0(EditorContext context, SNode node) {
    if (this.myIFeature_Properties9012_0 == null) {
      this.myIFeature_Properties9012_0 = new IFeature_Properties(node);
    }
    EditorCell editorCell = this.myIFeature_Properties9012_0.createEditorCell(context);
    setupBasic_Component_9012_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_9012_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_7(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_component_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant_9012_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_8(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_component_cellMenu1()}));
    return editorCell;
  }

  public EditorCell createConstant_9012_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_9(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_component_cellMenu2()}));
    return editorCell;
  }

  public EditorCell createConstant_9012_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9012_13(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9012_13(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_9012_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        StringBuilder sb = new StringBuilder("[ ");
        String sep = "";
        for(SNode foo : Sequence.fromIterable(IFeature_Behavior.call_getPartialOpposites_1213877499798(node))) {
          sb.append(sep).append(SPropertyOperations.getString(foo, "name"));
          sep = ", ";
        }
        return sb.append(" ]").toString();
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_9012_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createProperty_9012_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_9012_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_9012_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("?name?");
    EditorCell cellWithRole = this.createProperty_9012_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_9012_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ListFeature_Editor._Inline9012_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_9012_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_9012_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("opposite");
    provider.setNoTargetText("<no opposite>");
    EditorCell cellWithRole = this.createRefCell_9012_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_9012_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_9012_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_9012_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getFunction");
    provider.setNoTargetText("<no getFunction>");
    EditorCell cellWithRole = this.createRefNode_9012_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_9012_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_9012_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_9012_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sizeFunction");
    provider.setNoTargetText("<no sizeFunction>");
    EditorCell cellWithRole = this.createRefNode_9012_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_9012_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_9012_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_9012_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addKeyMap(new keymap_ListFeature());
  }

  private static void setupBasic_Property_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
    }
  }

  private static void setupBasic_Collection_9012_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_1");
  }

  private static void setupBasic_Constant_9012_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_2");
  }

  private static void setupBasic_Collection_9012_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_3");
  }

  private static void setupBasic_Collection_9012_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
    }
  }

  private static void setupBasic_Alternation_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
    IFeature_default_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_9012_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_5");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
  }

  private static void setupBasic_Collection_9012_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Alternation_9012_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_9012_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_7");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_9012_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_8");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_9012_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_9");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_RefCell_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Component_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ReadOnlyModelAccessor_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_9012_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
  }

  private static void setupBasic_Collection_9012_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_9012_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_10");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_9012_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_12");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_9012_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_9012_13(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_13");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_12");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_9012_14(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9012_14");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9012_13(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9012_13");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_9012_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition9012_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "default");
  }

  public static boolean renderingCondition9012_1(SNode node, EditorContext editorContext, IScope scope) {
    return IFeature_Behavior.call_hasPartialOpposites_1213877499758(node);
  }

  public static boolean renderingCondition9012_2(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "opposite", false) != null) && SLinkOperations.getTarget(SLinkOperations.getTarget(node, "opposite", false), "opposite", false) != node;
  }

  public static boolean renderingCondition9012_3(SNode node, EditorContext editorContext, IScope scope) {
    return IFeature_Behavior.call_hasMutualOpposite_1213877499741(node);
  }

  public static boolean renderingCondition9012_4(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "opposite", false) != null);
  }

  public static class _Inline9012_0 extends AbstractCellProvider {

    public _Inline9012_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_9012_3(context, node);
    }

    public EditorCell createProperty_9012_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_9012_1(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_9012_3(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_9012_2_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_9012_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name_1");
      BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
    }

}
  public static class ListFeature_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public ListFeature_generic_cellMenu0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromListAndArray(new ArrayList<Boolean>(), true, false);
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Boolean)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Boolean parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "default", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Boolean)parameterObject);
    }

    public String getMatchingText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "default" :
        "regular"
      );
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Boolean)parameterObject);
    }

    public String getDescriptionText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "allows to omit the feature when iterating" :
        "feature must be always specified"
      );
    }

}
  public static class ListFeature_component_cellMenu0 implements SubstituteInfoPart {

    private menu_FeatureSetOpposite myComponent;

    public ListFeature_component_cellMenu0() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class ListFeature_component_cellMenu1 implements SubstituteInfoPart {

    private menu_FeatureSetOpposite myComponent;

    public ListFeature_component_cellMenu1() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class ListFeature_component_cellMenu2 implements SubstituteInfoPart {

    private menu_FeatureSetOpposite myComponent;

    public ListFeature_component_cellMenu2() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}

}
