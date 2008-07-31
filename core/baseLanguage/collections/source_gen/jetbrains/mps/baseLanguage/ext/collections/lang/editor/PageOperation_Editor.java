package jetbrains.mps.baseLanguage.ext.collections.lang.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class PageOperation_Editor extends DefaultNodeEditor {

  private static void setupBasic_Collection_11726677767321172667776732(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1172667776732");
  }

  private static void setupBasic_Constant_11726677811871172667781187(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1172667781187");
    Collections_Style_StyleSheet.OPERATION.apply(editorCell);
  }

  private static void setupBasic_refNode_fromElement1172667790002(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11726677940351172667794035(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1172667794035");
  }

  private static void setupBasic_refNode_toElement1172667797240(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11726678004611172667800461(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1172667800461");
    BaseLanguageStyle_StyleSheet.RIGHT_PAREN.apply(editorCell);
  }

  private static void setupBasic_Constant_12157068013561215706801356(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1215706801356");
    BaseLanguageStyle_StyleSheet.LEFT_PAREN.apply(editorCell);
  }

  private static void setupLabel_Constant_1172667781187_1172667781187(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_fromElement_1172667790002(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1172667794035_1172667794035(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_toElement_1172667797240(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1172667800461_1172667800461(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1215706801356_1215706801356(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1172667776732(context, node);
  }

  public EditorCell createCollection1172667776732(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11726677767321172667776732(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1172667781187(context, node, "page"));
    editorCell.addEditorCell(this.createConstant1215706801356(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1172667790002(context, node));
    editorCell.addEditorCell(this.createConstant1172667794035(context, node, ","));
    editorCell.addEditorCell(this.createRefNode1172667797240(context, node));
    editorCell.addEditorCell(this.createConstant1172667800461(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1172667781187(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11726677811871172667781187(editorCell, node, context);
    setupLabel_Constant_1172667781187_1172667781187(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new PageOperation_Editor.PageOperation_Editor_replaceWith_SequenceOperation_cellMenu()}));
    return editorCell;
  }

  public EditorCell createConstant1172667794035(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11726677940351172667794035(editorCell, node, context);
    setupLabel_Constant_1172667794035_1172667794035(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1172667800461(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11726678004611172667800461(editorCell, node, context);
    setupLabel_Constant_1172667800461_1172667800461(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1215706801356(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12157068013561215706801356(editorCell, node, context);
    setupLabel_Constant_1215706801356_1215706801356(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1172667790002_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_fromElement1172667790002(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_fromElement_1172667790002((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1172667790002(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("fromElement");
    provider.setNoTargetText("<no fromElement>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1172667790002_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1172667797240_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_toElement1172667797240(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_toElement_1172667797240((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1172667797240(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("toElement");
    provider.setNoTargetText("<no toElement>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1172667797240_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class PageOperation_Editor_replaceWith_SequenceOperation_cellMenu extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public PageOperation_Editor_replaceWith_SequenceOperation_cellMenu() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperation";
    }

}

}
