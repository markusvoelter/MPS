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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.MPSColors;
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
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

public class GenericFeature_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIFeature_Properties6125_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6125_0(context, node);
  }

  public EditorCell createAlternation_6125_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = GenericFeature_Editor.renderingCondition6125_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_6125_0(context, node, "default");
    } else
    {
      editorCell = this.createConstant_6125_1(context, node, "");
    }
    IFeature_default_DELETE.setCellActions(editorCell, node, context);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new GenericFeature_Editor.GenericFeature_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createAlternation_6125_1(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = GenericFeature_Editor.renderingCondition6125_1(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_6125_3(context, node);
    } else
    {
      editorCell = this.createCollection_6125_4(context, node);
    }
    return editorCell;
  }

  public EditorCell createCollection_6125_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6125_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_6125_1(context, node));
    editorCell.addEditorCell(this.createCollection_6125_5(context, node));
    editorCell.addEditorCell(this.createCollection_6125_9(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addKeyMap(new keymap_ListFeature());
    editorCell.addEditorCell(this.createAlternation_6125_0(context, node));
    editorCell.addEditorCell(this.createProperty_6125_1(context, node));
    editorCell.addEditorCell(this.createCollection_6125_2(context, node));
    editorCell.addEditorCell(this.createConstant_6125_5(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection_6125_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
    editorCell.addEditorCell(this.createAlternation_6125_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_2(context, node, "<<--"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_6125_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    if (renderingCondition6125_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_6125_3(context, node, "<--"));
    }
    if (renderingCondition6125_3(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_6125_4(context, node, "<-->"));
    }
    if (renderingCondition6125_4(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell_6125_1(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection_6125_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_6(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_6125_6(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6125_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setCanBeFolded(true);
    editorCell.addEditorCell(this.createComponent_6125_0(context, node));
    editorCell.addEditorCell(this.createCollection_6125_7(context, node));
    editorCell.addEditorCell(this.createCollection_6125_8(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_7(context, node, "accessors"));
    return editorCell;
  }

  public EditorCell createCollection_6125_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_8(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_6125_10(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_9(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection_6125_10(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6125_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_6125_11(context, node));
    editorCell.addEditorCell(this.createCollection_6125_12(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6125_11(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_10(context, node, "get"));
    return editorCell;
  }

  public EditorCell createCollection_6125_12(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6125_12");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6125_11(context, node, "  "));
    editorCell.addEditorCell(this.createRefNode_6125_1(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6125_0(EditorContext context, SNode node) {
    if (this.myIFeature_Properties6125_0 == null) {
      this.myIFeature_Properties6125_0 = new IFeature_Properties(node);
    }
    EditorCell editorCell = this.myIFeature_Properties6125_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConstant_6125_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_2");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new GenericFeature_Editor.GenericFeature_component_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant_6125_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_3");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new GenericFeature_Editor.GenericFeature_component_cellMenu1()}));
    return editorCell;
  }

  public EditorCell createConstant_6125_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_4");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new GenericFeature_Editor.GenericFeature_component_cellMenu2()}));
    return editorCell;
  }

  public EditorCell createConstant_6125_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_5");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_8");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_9");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_10");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6125_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6125_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_6125_0(final EditorContext context, final SNode node) {
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
    editorCell.setCellId("ReadOnlyModelAccessor_6125_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    return editorCell;
  }

  public EditorCell createProperty_6125_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_name");
    BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_6125_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("?name?");
    EditorCell cellWithRole = this.createProperty_6125_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_6125_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new GenericFeature_Editor._Inline6125_0());
    EditorCell editorCell = provider.createEditorCell(context);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_6125_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("opposite");
    provider.setNoTargetText("<no opposite>");
    EditorCell cellWithRole = this.createRefCell_6125_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_6125_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6125_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getter");
    provider.setNoTargetText("<no getter>");
    EditorCell cellWithRole = this.createRefNode_6125_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  public static boolean renderingCondition6125_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "default");
  }

  public static boolean renderingCondition6125_1(SNode node, EditorContext editorContext, IScope scope) {
    return IFeature_Behavior.call_hasPartialOpposites_1213877499758(node);
  }

  public static boolean renderingCondition6125_2(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "opposite", false) != null) && SLinkOperations.getTarget(SLinkOperations.getTarget(node, "opposite", false), "opposite", false) != node;
  }

  public static boolean renderingCondition6125_3(SNode node, EditorContext editorContext, IScope scope) {
    return IFeature_Behavior.call_hasMutualOpposite_1213877499741(node);
  }

  public static boolean renderingCondition6125_4(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "opposite", false) != null);
  }

  public static class _Inline6125_0 extends AbstractCellProvider {

    public _Inline6125_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_6125_3(context, node);
    }

    public EditorCell createProperty_6125_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      editorCell.setCellId("property_name_1");
      BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_6125_3(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_6125_2_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class GenericFeature_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public GenericFeature_generic_cellMenu0() {
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
  public static class GenericFeature_component_cellMenu0 implements SubstituteInfoPart {

    private menu_FeatureSetOpposite myComponent;

    public GenericFeature_component_cellMenu0() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class GenericFeature_component_cellMenu1 implements SubstituteInfoPart {

    private menu_FeatureSetOpposite myComponent;

    public GenericFeature_component_cellMenu1() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class GenericFeature_component_cellMenu2 implements SubstituteInfoPart {

    private menu_FeatureSetOpposite myComponent;

    public GenericFeature_component_cellMenu2() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}

}
