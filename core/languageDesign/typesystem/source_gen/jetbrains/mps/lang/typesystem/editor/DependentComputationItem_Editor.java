package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;

public class DependentComputationItem_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_5359_0(editorContext, node);
  }

  private EditorCell createCollection_5359_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_5359_0");
    editorCell.addEditorCell(this.createConstant_5359_5(editorContext, node));
    editorCell.addEditorCell(this.createProperty_5359_1(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_6(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_5359_1(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_7(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5359_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_1(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_4(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_5359_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_8(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_2(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5359_1(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_3(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5359_9(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5359_2(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_5359_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "is applicable:");
    editorCell.setCellId("Constant_5359_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_1(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
    editorCell.setCellId("Constant_5359_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_2(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "is blocking:");
    editorCell.setCellId("Constant_5359_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_3(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
    editorCell.setCellId("Constant_5359_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_4(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "blocking node's concept:");
    editorCell.setCellId("Constant_5359_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_5(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "dependent computation");
    editorCell.setCellId("Constant_5359_5");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_6(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "applicable for concept:");
    editorCell.setCellId("Constant_5359_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_7(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
    editorCell.setCellId("Constant_5359_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_8(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
    editorCell.setCellId("Constant_5359_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5359_9(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "find blocking node:");
    editorCell.setCellId("Constant_5359_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_5359_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("isApplicableBlock");
    provider.setNoTargetText("true");
    EditorCell editorCell;
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

  private EditorCell createRefNode_5359_1(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("isBlockingBlock");
    provider.setNoTargetText("true");
    EditorCell editorCell;
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

  private EditorCell createRefCell_5359_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("blockingNodeConcept");
    provider.setNoTargetText("<no blockingNodeConcept>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new DependentComputationItem_Editor._Inline5359_0());
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

  private EditorCell createProperty_5359_1(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name_1");
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

  private EditorCell createRefCell_5359_1(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("applicableConcept");
    provider.setNoTargetText("<no applicableConcept>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new DependentComputationItem_Editor._Inline5359_1());
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

  private EditorCell createRefNode_5359_2(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("findMasterBlock");
    provider.setNoTargetText("<no findMasterBlock>");
    EditorCell editorCell;
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

  public static class _Inline5359_0 extends InlineCellProvider {
    public _Inline5359_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_5359_0(editorContext, node);
    }

    private EditorCell createProperty_5359_0(EditorContext editorContext, SNode node) {
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

  public static class _Inline5359_1 extends InlineCellProvider {
    public _Inline5359_1() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_5359_2(editorContext, node);
    }

    private EditorCell createProperty_5359_2(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_2");
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
