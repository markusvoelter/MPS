package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class Expression_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myCellProvider6116_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createAlternation_6116_0(context, node);
  }

  public EditorCell createAlternation_6116_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = Expression_Editor.renderingCondition6116_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCustom_6116_0(context, node);
    } else
    {
      editorCell = this.createConceptProperty_6116_1(context, node);
    }
    setupBasic_Alternation_6116_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCustom_6116_0(EditorContext context, SNode node) {
    if (this.myCellProvider6116_0 == null) {
      this.myCellProvider6116_0 = this._cellProviderFactory_1209147315298(node, context);
    }
    EditorCell editorCell = this.myCellProvider6116_0.createEditorCell(context);
    setupBasic_Custom_6116_0(editorCell, node, context);
    return editorCell;
  }

  public AbstractCellProvider _cellProviderFactory_1209147315298(final SNode node, final EditorContext editorContext) {
    return new AbstractCellProvider() {

      public EditorCell createEditorCell(EditorContext context) {
        EditorCell_Error result = new EditorCell_Error(editorContext, node, "<" + node.getRole_() + ">");
        result.getStyle().set(StyleAttributes.PADDING_LEFT, new Padding(0.0));
        result.getStyle().set(StyleAttributes.PADDING_RIGHT, new Padding(0.0));
        return result;
      }

    };
  }

  public EditorCell createConceptProperty_6116_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_6116_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptProperty_6116_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_6116_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty_6116_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Alternation_6116_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Custom_6116_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Custom_6116_0");
  }

  private static void setupBasic_ConceptProperty_6116_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
  }

  private static void setupLabel_ConceptProperty_6116_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6116_0(SNode node, EditorContext editorContext, IScope scope) {
    return SConceptPropertyOperations.getString(node, "alias") == null;
  }

}
