package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class Expression_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myCellProvider2;

  private static void setupBasic_Alternation_12091473152971209147315297(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Alternation_1209147315297");
  }

  private static void setupBasic_Custom_12091473152981209147315298(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Custom_1209147315298");
  }

  private static void setupBasic_conceptProperty_alias1209748868405(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "conceptProperty_alias");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, 0.0);
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_conceptProperty_alias_1209748868405(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition75(SNode node, EditorContext editorContext, IScope scope) {
    return SConceptPropertyOperations.getString(node, "alias") == null;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createAlternation1209147315297(context, node);
  }

  public EditorCell createAlternation1209147315297(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = Expression_Editor.renderingCondition75(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCustom1209147315298(context, node);
    } else
    {
      editorCell = this.createConceptProperty1209748868405(context, node);
    }
    setupBasic_Alternation_12091473152971209147315297(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCustom1209147315298(EditorContext context, SNode node) {
    if (this.myCellProvider2 == null) {
      this.myCellProvider2 = this._cellProviderFactory_1209147315298(node, context);
    }
    EditorCell editorCell = this.myCellProvider2.createEditorCell(context);
    setupBasic_Custom_12091473152981209147315298(editorCell, node, context);
    return editorCell;
  }

  public AbstractCellProvider _cellProviderFactory_1209147315298(final SNode node, final EditorContext editorContext) {
    return new AbstractCellProvider() {

      public EditorCell createEditorCell(EditorContext context) {
        EditorCell_Error result = new EditorCell_Error(editorContext, node, "<" + node.getRole_() + ">");
        result.getStyle().set(StyleAttributes.PADDING_LEFT, 0.0);
        result.getStyle().set(StyleAttributes.PADDING_RIGHT, 0.0);
        return result;
      }

    };
  }

  public EditorCell createConceptProperty1209748868405_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1209748868405(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1209748868405((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1209748868405(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1209748868405_internal(context, node, provider);
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
