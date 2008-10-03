package jetbrains.mps.bootstrap.helgins.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class SimpleRule_Annotated_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1223036042243(context, node);
  }

  public EditorCell createCollection1223036042243(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12230360422431223036042243(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1223036045437(context, node, "annotated"));
    editorCell.addEditorCell(this.createRefNode1223036050085(context, node));
    editorCell.addEditorCell(this.createConstant1223036052127(context, node, "has type annotation"));
    editorCell.addEditorCell(this.createRefNode1223036061772(context, node));
    return editorCell;
  }

  public EditorCell createConstant1223036045437(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12230360454371223036045437(editorCell, node, context);
    setupLabel_Constant_1223036045437_1223036045437(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1223036052127(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12230360521271223036052127(editorCell, node, context);
    setupLabel_Constant_1223036052127_1223036052127(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1223036050085_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_conceptReference1223036050085(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_conceptReference_1223036050085((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1223036050085(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("conceptReference");
    provider.setNoTargetText("<no conceptReference>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1223036050085_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1223036061772_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_pathExpression1223036061772(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_pathExpression_1223036061772((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1223036061772(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("pathExpression");
    provider.setNoTargetText("<no pathExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1223036061772_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12230360422431223036042243(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1223036042243");
  }

  private static void setupBasic_Constant_12230360454371223036045437(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1223036045437");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_conceptReference1223036050085(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12230360521271223036052127(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1223036052127");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_pathExpression1223036061772(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1223036045437_1223036045437(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_conceptReference_1223036050085(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1223036052127_1223036052127(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_pathExpression_1223036061772(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
