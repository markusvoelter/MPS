package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;

public class _LinkAccessT_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_0901_fdj65ejz(editorContext, node);
  }

  private EditorCell createCollection_0901_fdj65ejz(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_0901_fdj65ejz");
    editorCell.addEditorCell(this.createConstant_0901_fdj65h2b(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_0901_fdj9zogj(editorContext, node));
    editorCell.addEditorCell(this.createConstant_0901_fdovmwed(editorContext, node));
    editorCell.addEditorCell(this.createProperty_0901_fdovn6p3(editorContext, node));
    editorCell.addEditorCell(this.createConstant_0901_fdowgq44(editorContext, node));
    editorCell.addEditorCell(this.createProperty_0901_fdowgq45(editorContext, node));
    editorCell.addEditorCell(this.createConstant_0901_fdj664fk(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_0901_fdj65h2b(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "link acc<");
    editorCell.setCellId("Constant_0901_fdj65h2b");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_0901_fdj664fk(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">");
    editorCell.setCellId("Constant_0901_fdj664fk");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_0901_fdovmwed(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ",singular:");
    editorCell.setCellId("Constant_0901_fdovmwed");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_0901_fdowgq44(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ",aggregation:");
    editorCell.setCellId("Constant_0901_fdowgq44");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_0901_fdj9zogj(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("targetConcept");
    provider.setNoTargetText("<no targetConcept>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new _LinkAccessT_Editor._Inline0901_fdj9zogk());
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_0901_fdovn6p3(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("singularCradinality");
    provider.setNoTargetText("<no singularCradinality>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_singularCradinality");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_0901_fdowgq45(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("aggregation");
    provider.setNoTargetText("<no aggregation>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_aggregation");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class _Inline0901_fdj9zogk extends InlineCellProvider {
    public _Inline0901_fdj9zogk() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_0901_fdj9ztjs(editorContext, node);
    }

    private EditorCell createProperty_0901_fdj9ztjs(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = editorContext.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
      } else
      return editorCell;
    }
  }
}
