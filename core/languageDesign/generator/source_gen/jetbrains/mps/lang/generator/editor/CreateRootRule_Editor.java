package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class CreateRootRule_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1730_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1730_1(context, node);
  }

  public EditorCell createCollection_1730_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    editorCell.setCellId("Collection_1730_0");
    editorCell.addEditorCell(this.createConstant_1730_0(context, node, "condition"));
    editorCell.addEditorCell(this.createRefNode_1730_1(context, node));
    editorCell.addEditorCell(this.createConstant_1730_1(context, node, "-->"));
    editorCell.addEditorCell(this.createCollection_1730_3(context, node));
    editorCell.addEditorCell(this.createRefCell_1730_1(context, node));
    editorCell.addEditorCell(this.createConstant_1730_7(context, node, ""));
    return editorCell;
  }

  public EditorCell createCollection_1730_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_1730_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_1730_2(context, node, "conditional root rule"));
    editorCell.addEditorCell(this.createConstant_1730_3(context, node, ""));
    editorCell.addEditorCell(this.createCollection_1730_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1730_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_1730_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_1730_4(context, node, "mapping label"));
    editorCell.addEditorCell(this.createConstant_1730_5(context, node, ":"));
    editorCell.addEditorCell(this.createRefCell_1730_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1730_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_1730_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    if (renderingCondition1730_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell_1730_3(context, node));
    }
    editorCell.addEditorCell(this.createConstant_1730_6(context, node, ":"));
    return editorCell;
  }

  public EditorCell createConstant_1730_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_0");
    Styles_StyleSheet.getGeneratorKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.lightGray);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_4");
    Styles_StyleSheet.getGeneratorKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_6");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1730_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_1730_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_1730_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new CreateRootRule_Editor._Inline1730_0());
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1730_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("templateNode");
    provider.setNoTargetText("<no template>");
    EditorCell cellWithRole = this.createRefCell_1730_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1730_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1730_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("conditionFunction");
    provider.setNoTargetText("<always>");
    EditorCell cellWithRole = this.createRefNode_1730_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_1730_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new CreateRootRule_Editor._Inline1730_1());
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1730_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("label");
    provider.setNoTargetText("<no label>");
    EditorCell cellWithRole = this.createRefCell_1730_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_1730_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new CreateRootRule_Editor._Inline1730_2());
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1730_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("label");
    provider.setNoTargetText("<no label>");
    EditorCell cellWithRole = this.createRefCell_1730_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  public static boolean renderingCondition1730_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "label", false) != null;
  }

  public static class _Inline1730_0 extends AbstractCellProvider {

    public _Inline1730_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_1730_1(context, node);
    }

    public EditorCell createProperty_1730_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      editorCell.setCellId("property_name");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
        style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_1730_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_1730_0_internal(context, node, provider);
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
  public static class _Inline1730_1 extends AbstractCellProvider {

    public _Inline1730_1() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_1730_3(context, node);
    }

    public EditorCell createProperty_1730_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      editorCell.setCellId("property_name_1");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.orange);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_1730_3(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_1730_2_internal(context, node, provider);
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
  public static class _Inline1730_2 extends AbstractCellProvider {

    public _Inline1730_2() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_1730_5(context, node);
    }

    public EditorCell createProperty_1730_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      editorCell.setCellId("property_name_2");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.orange);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_1730_5(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_1730_4_internal(context, node, provider);
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

}
