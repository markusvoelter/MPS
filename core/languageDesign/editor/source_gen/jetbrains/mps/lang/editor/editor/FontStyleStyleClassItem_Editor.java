package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.lang.editor.structure._Colors_Enum;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;

public class FontStyleStyleClassItem_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1186403889179(context, node);
  }

  public EditorCell createCollection1186403889179(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11864038891791186403889179(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1186403889931(context, node, "font-style"));
    editorCell.addEditorCell(this.createConstant1186403894198(context, node, ":"));
    if (renderingCondition0528_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty1186403896216(context, node));
    }
    if (renderingCondition0528_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefNode1220975756218(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant1186403889931(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11864038899311186403889931(editorCell, node, context);
    setupLabel_Constant_1186403889931_1186403889931(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new FontStyleStyleClassItem_Editor.FontStyleStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant1186403894198(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11864038941981186403894198(editorCell, node, context);
    setupLabel_Constant_1186403894198_1186403894198(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1186403896216_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_style1186403896216(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_style_1186403896216((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1186403896216(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("style");
    provider.setNoTargetText("<no style>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1186403896216_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1220975756218_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_query1220975756218(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_query_1220975756218((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new FontStyleStyleClassItem_Editor.FontStyleStyleClassItem_generic_cellMenu1(),new FontStyleStyleClassItem_Editor.FontStyleStyleClassItem_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createRefNode1220975756218(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("query");
    provider.setNoTargetText("<no query>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1220975756218_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11864038891791186403889179(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1186403889179");
  }

  private static void setupBasic_Constant_11864038899311186403889931(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1186403889931");
    Styles_StyleSheet.getItem(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11864038941981186403894198(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1186403894198");
  }

  private static void setupBasic_property_style1186403896216(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_style");
  }

  private static void setupBasic_refNode_query1220975756218(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1186403889931_1186403889931(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1186403894198_1186403894198(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_style_1186403896216(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_query_1220975756218(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0528_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "query", true) == null;
  }

  public static boolean renderingCondition0528_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "query", true) != null;
  }

  public static class FontStyleStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public FontStyleStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.editor.structure.StyleClassItem";
    }

}
  public static class FontStyleStyleClassItem_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public FontStyleStyleClassItem_generic_cellMenu0() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      List<_Colors_Enum> types = ListSequence.<_Colors_Enum>fromArray();
      for(_Colors_Enum color : _Colors_Enum.values()) {
        ListSequence.fromList(types).addElement(color);
      }
      return types;
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((_Colors_Enum)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(_Colors_Enum parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SLinkOperations.removeChild(node, "query");
      SPropertyOperations.set(node, "style", parameterObject.getValue());
    }

    public boolean isReferentPresentation() {
      return false;
    }

}
  public static class FontStyleStyleClassItem_generic_cellMenu1 extends AbstractCellMenuPart_Generic_Item {

    public FontStyleStyleClassItem_generic_cellMenu1() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SLinkOperations.setNewChild(node, "query", "jetbrains.mps.lang.editor.structure.QueryFunction_FontStyle");
    }

    public String getMatchingText() {
      return "query";
    }

}

}
