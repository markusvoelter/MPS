package jetbrains.mps.baseLanguage.unitTest.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;

public class AssertTrue_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1171981036639(context, node);
  }

  public EditorCell createCollection1171981036639(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11719810366391171981036639(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1171981038344(context, node, "assert true"));
    editorCell.addEditorCell(this.createRefNode1171981072425(context, node));
    editorCell.addEditorCell(this.createConstant1171981274831(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant1171981038344(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11719810383441171981038344(editorCell, node, context);
    setupLabel_Constant_1171981038344_1171981038344(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1171981274831(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11719812748311171981274831(editorCell, node, context);
    setupLabel_Constant_1171981274831_1171981274831(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1171981072425_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_condition1171981072425(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_condition_1171981072425((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1171981072425(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("condition");
    provider.setNoTargetText("<no condition>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1171981072425_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11719810366391171981036639(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1171981036639");
  }

  private static void setupBasic_Constant_11719810383441171981038344(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1171981038344");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return AssertTrue_Editor.calculateColor9112_0(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_condition1171981072425(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11719812748311171981274831(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1171981274831");
  }

  private static void setupLabel_Constant_1171981038344_1171981038344(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_condition_1171981072425(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1171981274831_1171981274831(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor9112_0(EditorCell cell) {
    Color result;
    result = Color.blue;
    return result;
  }

}
