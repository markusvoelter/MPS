package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class PathComponent_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createProperty_2580_1(context, node);
  }

  public EditorCell createProperty_2580_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_path");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, Measure.SPACES));
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_2580_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("path");
    provider.setNoTargetText("<no path>");
    provider.setReadOnly(true);
    EditorCell cellWithRole = this.createProperty_2580_0_internal(context, node, provider);
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
