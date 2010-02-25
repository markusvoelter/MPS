package jetbrains.mps.lang.refactoring.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Refactoring_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6756_15ro1oav73mny(editorContext, node);
  }

  private EditorCell createCollection_6756_15ro1oav73mny(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6756_15ro1oav73mny");
    editorCell.addEditorCell(this.createCollection_6756_15ro1oav73mnz(editorContext, node));
    editorCell.addEditorCell(this.createCollection_6756_15ro1oav73moc(editorContext, node));
    if (renderingCondition6756_15ro1oav73mok(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_6756_15ro1oav73moh(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mou(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mow(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_6756_15ro1oav73mox(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73moz(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mp1(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_6756_15ro1oav73mp2(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mp4(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_15ro1oav73mp6(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_lsx1702r1gyz(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_lsx1702r1gyw(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mp7(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_15ro1oav73mpf(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_fn31m068ejuj(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_4omsxpnrrds4(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_4omsxpnrrds2(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_fn31m068ejui(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_a8ksam4esa4v(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_a8ksam4esa50(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6756_15ro1oav73mnz(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6756_15ro1oav73mnz");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mo0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_6756_15ro1oav73mo1(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mo2(editorContext, node));
    editorCell.addEditorCell(this.createProperty_6756_15ro1oav73mo3(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mo5(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mo6(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_6756_15ro1oav73mo7(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6756_15ro1oav73moc(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6756_15ro1oav73moc");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73mod(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_15ro1oav73moe(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6756_15ro1oav73moh(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6756_15ro1oav73moh");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6756_15ro1oav73moi(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6756_15ro1oav73moj(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_6756_4omsxpnrrds2(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_4omsxpnrrds2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_a8ksam4esa4v(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_a8ksam4esa4v");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_fn31m068ejuj(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_fn31m068ejuj");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_lsx1702r1gyz(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_lsx1702r1gyz");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mo0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "refactoring");
    editorCell.setCellId("Constant_6756_15ro1oav73mo0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mo2(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_6756_15ro1oav73mo2");
    BaseLanguageStyle_StyleSheet.getMatching(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mo5(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_6756_15ro1oav73mo5");
    BaseLanguageStyle_StyleSheet.getMatching(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mo6(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "overrides");
    editorCell.setCellId("Constant_6756_15ro1oav73mo6");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mod(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "target:");
    editorCell.setCellId("Constant_6756_15ro1oav73mod");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73moi(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "keystroke:");
    editorCell.setCellId("Constant_6756_15ro1oav73moi");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mou(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_15ro1oav73mou");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mow(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "parameters:");
    editorCell.setCellId("Constant_6756_15ro1oav73mow");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73moz(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_15ro1oav73moz");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mp1(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "internal fields:");
    editorCell.setCellId("Constant_6756_15ro1oav73mp1");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mp4(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_15ro1oav73mp4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6756_15ro1oav73mp7(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_6756_15ro1oav73mp7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_6756_15ro1oav73mox(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new Refactoring_Editor.parameterListHandler_6756_15ro1oav73mox(node, "parameter", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_parameter");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNodeList_6756_15ro1oav73mp2(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new Refactoring_Editor.fieldListHandler_6756_15ro1oav73mp2(node, "field", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_field");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNode_6756_4omsxpnrrds4(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("modelsToGenerateBlock");
    provider.setNoTargetText("<no modelsToGenerateBlock>");
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

  private EditorCell createRefNode_6756_a8ksam4esa50(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("updateModelBlock");
    provider.setNoTargetText("<non-loggable>");
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

  private EditorCell createRefNode_6756_fn31m068ejui(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("doWhenDoneBlock");
    provider.setNoTargetText("<no doWhenDoneBlock>");
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

  private EditorCell createRefNode_6756_lsx1702r1gyw(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("affectedNodesBlock");
    provider.setNoTargetText("<affected nodes>");
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

  private EditorCell createProperty_6756_15ro1oav73mo1(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
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

  private EditorCell createProperty_6756_15ro1oav73mo3(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("userFriendlyName");
    provider.setNoTargetText("<no caption>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_userFriendlyName");
    BaseLanguageStyle_StyleSheet.getStringLiteral(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    }
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

  private EditorCell createRefCell_6756_15ro1oav73mo7(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("overrides");
    provider.setNoTargetText("<nothing>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new Refactoring_Editor._Inline6756_15ro1oav73mo8());
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

  private EditorCell createRefNode_6756_15ro1oav73moe(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("target");
    provider.setNoTargetText("<no target>");
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

  private EditorCell createRefNode_6756_15ro1oav73moj(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("keystroke");
    provider.setNoTargetText("<no keystroke>");
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

  private EditorCell createRefNode_6756_15ro1oav73mp6(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("initBlock");
    provider.setNoTargetText("<no init block>");
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

  private EditorCell createRefNode_6756_15ro1oav73mpf(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("doRefactorBlock");
    provider.setNoTargetText("<no doRefactorBlock>");
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

  private static boolean renderingCondition6756_15ro1oav73mok(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "overrides", false) == null);
  }

  public static class _Inline6756_15ro1oav73mo8 extends InlineCellProvider {
    public _Inline6756_15ro1oav73mo8() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_6756_15ro1oav73mo9(editorContext, node);
    }

    private EditorCell createProperty_6756_15ro1oav73mo9(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
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
  }

  private static class parameterListHandler_6756_15ro1oav73mox extends RefNodeListHandler {
    public parameterListHandler_6756_15ro1oav73mox(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext editorContext) {
      return super.createSeparatorCell(editorContext);
    }
  }

  private static class fieldListHandler_6756_15ro1oav73mp2 extends RefNodeListHandler {
    public fieldListHandler_6756_15ro1oav73mp2(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext editorContext) {
      return super.createSeparatorCell(editorContext);
    }
  }
}
