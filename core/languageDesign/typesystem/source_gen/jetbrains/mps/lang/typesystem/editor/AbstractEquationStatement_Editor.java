package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class AbstractEquationStatement_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myAbstractEquationInspector7653_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_7653_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createComponent_7653_0(context, node);
  }

  public EditorCell createCollection_7653_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7653_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNode_7653_1(context, node));
    editorCell.addEditorCell(this.createConceptProperty_7653_1(context, node));
    editorCell.addEditorCell(this.createRefNode_7653_3(context, node));
    editorCell.addEditorCell(this.createConstant_7653_0(context, node, ";"));
    return editorCell;
  }

  public EditorCell createComponent_7653_0(EditorContext context, SNode node) {
    if (this.myAbstractEquationInspector7653_0 == null) {
      this.myAbstractEquationInspector7653_0 = new jetbrains.mps.lang.typesystem.editor.AbstractEquationInspector(node);
    }
    EditorCell editorCell = this.myAbstractEquationInspector7653_0.createEditorCell(context);
    setupBasic_Component_7653_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_7653_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7653_0(editorCell, node, context);
    setupLabel_Constant_7653_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_7653_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7653_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_7653_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7653_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftExpression");
    provider.setNoTargetText("<no leftExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_7653_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_7653_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7653_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_7653_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7653_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("rightExpression");
    provider.setNoTargetText("<no rightExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_7653_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createConceptProperty_7653_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_7653_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptProperty_7653_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new AbstractEquationStatement_Editor.AbstractEquationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConceptProperty_7653_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty_7653_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_7653_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7653_0");
  }

  private static void setupBasic_RefNode_7653_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_7653_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_7653_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7653_0");
  }

  private static void setupBasic_ConceptProperty_7653_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return AbstractEquationStatement_Editor._StyleParameter_QueryFunction_1214399678504((cell == null ?
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

  private static void setupBasic_Component_7653_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_7653_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_7653_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_7653_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConceptProperty_7653_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _StyleParameter_QueryFunction_1214399678504(SNode node, EditorContext editorContext) {
    if (SPropertyOperations.getBoolean(node, "checkOnly")) {
      return Color.GRAY;
    } else
    {
      return Color.BLACK;
    }
  }

  public static class AbstractEquationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public AbstractEquationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.typesystem.structure.AbstractEquationStatement";
    }

}

}
