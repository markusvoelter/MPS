package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import jetbrains.mps.nodeEditor.MPSFonts;

public class ConceptFunctionParameter_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConceptProperty1139533905854(context, node);
  }

  public EditorCell createConceptProperty1139533905854_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1139533905854(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1139533905854((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1139533905854(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<ConceptFunctionParameter with no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1139533905854_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_conceptProperty_alias1139533905854(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "conceptProperty_alias");
    BaseLanguageStyle_StyleSheet.KEY_WORD.apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

            public Integer calculate(EditorCell cell) {
              return ConceptFunctionParameter_Editor.calculateFontStyle7229_0(cell);
            }

          });
          this.set(StyleAttributes.PADDING_LEFT, 0.0);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_conceptProperty_alias_1139533905854(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Integer calculateFontStyle7229_0(EditorCell cell) {
    int result;
    result = MPSFonts.ITALIC;
    return result;
  }

}
