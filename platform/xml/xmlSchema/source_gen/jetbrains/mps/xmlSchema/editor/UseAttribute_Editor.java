package jetbrains.mps.xmlSchema.editor;

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

public class UseAttribute_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_5639_0(context, node);
  }

  public EditorCell createCollection_5639_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5639_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_5639_0(context, node, "["));
    editorCell.addEditorCell(this.createProperty_5639_1(context, node));
    editorCell.addEditorCell(this.createConstant_5639_1(context, node, "]"));
    return editorCell;
  }

  public EditorCell createConstant_5639_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5639_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5639_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5639_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_5639_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_5639_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_5639_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("use");
    provider.setNoTargetText("<no use>");
    EditorCell cellWithRole = this.createProperty_5639_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_5639_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5639_0");
  }

  private static void setupBasic_Constant_5639_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5639_0");
  }

  private static void setupBasic_Constant_5639_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5639_1");
  }

  private static void setupBasic_Property_5639_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_use");
  }

}
