package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.sharedConcepts.editor.SharedStyles_StyleSheet;

public class Model_NodesIncludingImportedOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAlias_Comp3997_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1182511083881(context, node);
  }

  public EditorCell createCollection1182511083881(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11825110838811182511083881(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1206486612667(context, node));
    editorCell.addEditorCell(this.createConstant1206486612668(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1182511100904(context, node));
    editorCell.addEditorCell(this.createConstant1182511105406(context, node, ","));
    editorCell.addEditorCell(this.createRefCell1182511109971(context, node));
    editorCell.addEditorCell(this.createConstant1206486629587(context, node, ")"));
    return editorCell;
  }

  public EditorCell createComponent1206486612667(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp3997_0 == null) {
      this.myReplaceableAlias_Comp3997_0 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp3997_0.createEditorCell(context);
    setupBasic_component_ReplaceableAlias_Comp1206486612667(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1182511105406(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11825111054061182511105406(editorCell, node, context);
    setupLabel_Constant_1182511105406_1182511105406(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206486612668(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064866126681206486612668(editorCell, node, context);
    setupLabel_Constant_1206486612668_1206486612668(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206486629587(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12064866295871206486629587(editorCell, node, context);
    setupLabel_Constant_1206486629587_1206486629587(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1182511100904_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_scope1182511100904(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_scope_1182511100904((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1182511100904(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("scope");
    provider.setNoTargetText("<no scope>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1182511100904_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1182511109971_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new Model_NodesIncludingImportedOperation_Editor._Inline3997_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_concept1182511109971(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_concept_1182511109971((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1182511109971(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("concept");
    provider.setNoTargetText("<no concept>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1182511109971_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11825110838811182511083881(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1182511083881");
  }

  private static void setupBasic_refNode_scope1182511100904(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11825111054061182511105406(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1182511105406");
  }

  private static void setupBasic_refCell_concept1182511109971(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refCell_concept");
  }

  private static void setupBasic_component_ReplaceableAlias_Comp1206486612667(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component_ReplaceableAlias_Comp");
  }

  private static void setupBasic_Constant_12064866126681206486612668(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206486612668");
    BaseLanguageStyle_StyleSheet.LEFT_PAREN.apply(editorCell);
  }

  private static void setupBasic_Constant_12064866295871206486629587(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206486629587");
    BaseLanguageStyle_StyleSheet.RIGHT_PAREN.apply(editorCell);
  }

  private static void setupLabel_refNode_scope_1182511100904(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1182511105406_1182511105406(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_concept_1182511109971(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206486612668_1206486612668(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206486629587_1206486629587(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline3997_0 extends AbstractCellProvider {

    public _Inline3997_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1182511125130(context, node);
    }

    public EditorCell createProperty1182511125130_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1182511125130(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1182511125130((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1182511125130(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(false);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1182511125130_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1182511125130(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "property_name");
      SharedStyles_StyleSheet.REFERENCE_ON_CONCEPT.apply(editorCell);
    }

    private static void setupLabel_property_name_1182511125130(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
