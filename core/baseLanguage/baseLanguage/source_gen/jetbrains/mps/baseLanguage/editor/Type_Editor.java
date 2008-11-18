package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.EnumMeasure;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class Type_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createAlternation1138060380694(context, node);
  }

  public EditorCell createAlternation1138060380694(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = Type_Editor.renderingCondition9010_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createError1138060384542(context, node);
    } else
    {
      editorCell = this.createConceptProperty1138060501183(context, node);
    }
    setupBasic_Alternation_11380603806941138060380694(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createError1138060384542(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "<type>");
    setupBasic_Error_11380603845421138060384542(editorCell, node, context);
    setupLabel_Error_1138060384542_1138060384542(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConceptProperty1138060501183_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1138060501183(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1138060501183((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1138060501183(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<type has no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1138060501183_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Alternation_11380603806941138060380694(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Alternation_1138060380694");
  }

  private static void setupBasic_Error_11380603845421138060384542(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Error_1138060384542");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, EnumMeasure.spaces));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_conceptProperty_alias1138060501183(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, EnumMeasure.spaces));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Error_1138060384542_1138060384542(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1138060501183(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition9010_0(SNode node, EditorContext editorContext, IScope scope) {
    return SConceptPropertyOperations.getBoolean(node, "abstract");
  }

}
