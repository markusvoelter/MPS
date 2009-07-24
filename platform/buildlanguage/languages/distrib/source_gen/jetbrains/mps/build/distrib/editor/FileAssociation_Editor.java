package jetbrains.mps.build.distrib.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;

public class FileAssociation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_8887_0(context, node);
  }

  public EditorCell createCollection_8887_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8887_0(editorCell, node, context);
    editorCell.addEditorCell(this.createProperty_8887_1(context, node));
    editorCell.addEditorCell(this.createConstant_8887_0(context, node, "->"));
    editorCell.addEditorCell(this.createProperty_8887_3(context, node));
    editorCell.addEditorCell(this.createConstant_8887_1(context, node, "where"));
    editorCell.addEditorCell(this.createConstant_8887_2(context, node, "icon:"));
    editorCell.addEditorCell(this.createRefNode_8887_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_8887_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8887_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8887_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8887_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8887_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8887_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_8887_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_8887_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_8887_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("extensions");
    provider.setNoTargetText("<no extensions>");
    EditorCell cellWithRole = this.createProperty_8887_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_8887_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_8887_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_8887_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_8887_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_8887_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_8887_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_8887_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("icon");
    provider.setNoTargetText("<no icon>");
    EditorCell cellWithRole = this.createRefNode_8887_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_8887_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8887_0");
  }

  private static void setupBasic_Property_8887_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_extensions");
  }

  private static void setupBasic_Constant_8887_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8887_0");
  }

  private static void setupBasic_Property_8887_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Constant_8887_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8887_1");
    DistribConfiguration_Styles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_8887_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8887_2");
    DistribConfiguration_Styles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNode_8887_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

}
