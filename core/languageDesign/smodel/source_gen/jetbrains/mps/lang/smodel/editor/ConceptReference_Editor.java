package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import jetbrains.mps.lang.core.behavior.IDeprecatable_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.MPSColors;

public class ConceptReference_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRefCell1154547037209(context, node);
  }

  public EditorCell createRefCell1154547037209_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ConceptReference_Editor._Inline4215_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_concept1154547037209(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_concept_1154547037209((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1154547037209(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("concept");
    provider.setNoTargetText("<choose concept>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1154547037209_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_refCell_concept1154547037209(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refCell_concept");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          this.set(StyleAttributes.STRIKE_OUT, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return ConceptReference_Editor._StyleParameter_QueryFunction_1224258237546((cell == null ?
                null :
                cell.getSNode()
              ), (cell == null ?
                null :
                cell.getEditorContext()
              ));
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_refCell_concept_1154547037209(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean _StyleParameter_QueryFunction_1224258237546(SNode node, EditorContext editorContext) {
    return IDeprecatable_Behavior.call_isDeprecated_1224609060727(SLinkOperations.getTarget(node, "concept", false));
  }

  public static class _Inline4215_0 extends AbstractCellProvider {

    public _Inline4215_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1154547041930(context, node);
    }

    public EditorCell createProperty1154547041930_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1154547041930(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1154547041930((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1154547041930(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1154547041930_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1154547041930(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1154547041930(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
