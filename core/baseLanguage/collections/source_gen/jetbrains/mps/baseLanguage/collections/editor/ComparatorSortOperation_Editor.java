package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class ComparatorSortOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4999_0(context, node);
  }

  private EditorCell createCollection_4999_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    editorCell.setCellId("Collection_4999_0");
    editorCell.addEditorCell(this.createConceptProperty_4999_0(context, node));
    editorCell.addEditorCell(this.createConstant_4999_0(context, node, "("));
    editorCell.addEditorCell(this.createRefNode_4999_0(context, node));
    editorCell.addEditorCell(this.createConstant_4999_1(context, node, ","));
    editorCell.addEditorCell(this.createRefNode_4999_1(context, node));
    editorCell.addEditorCell(this.createConstant_4999_2(context, node, ")"));
    return editorCell;
  }

  private EditorCell createConstant_4999_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4999_0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4999_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4999_1");
    BaseLanguageStyle_StyleSheet.getSemicolon(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.5, Measure.SPACES));
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_4999_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_4999_2");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConceptProperty_4999_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setCellId("conceptProperty_alias");
    Collections_Style_StyleSheet.getOperation(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new ComparatorSortOperation_Editor.ComparatorSortOperation_Editor_replaceWith_SequenceOperation_cellMenu0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_4999_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("comparator");
    provider.setNoTargetText("<no comparator>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_4999_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("ascending");
    provider.setNoTargetText("<no ascending>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class ComparatorSortOperation_Editor_replaceWith_SequenceOperation_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public ComparatorSortOperation_Editor_replaceWith_SequenceOperation_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.baseLanguage.collections.structure.SequenceOperation";
    }

}

}
