package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.sharedConcepts.editor.SharedStyles_StyleSheet;

public class ConceptRefExpression_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_5783_eylr118y(editorContext, node);
  }

  private EditorCell createCollection_5783_eylr118y(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_5783_eylr118y");
    editorCell.addEditorCell(this.createConstant_5783_eylr13b8(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5783_f0pwgrf9(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_5783_eylr1wl6(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5783_eylr170j(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_5783_eylr13b8(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "concept");
    editorCell.setCellId("Constant_5783_eylr13b8");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5783_eylr170j(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "/");
    editorCell.setCellId("Constant_5783_eylr170j");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_5783_f0pwgrf9(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "/");
    editorCell.setCellId("Constant_5783_f0pwgrf9");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_5783_eylr1wl6(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("conceptDeclaration");
    provider.setNoTargetText("<no concept>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new ConceptRefExpression_Editor._Inline5783_eylr1wl7());
    editorCell = provider.createEditorCell(editorContext);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
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

  public static class _Inline5783_eylr1wl7 extends InlineCellProvider {
    public _Inline5783_eylr1wl7() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_5783_eylr1ynh(editorContext, node);
    }

    private EditorCell createProperty_5783_eylr1ynh(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
      SharedStyles_StyleSheet.getReferenceOnConcept(editorCell).apply(editorCell);
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
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
  }
}
