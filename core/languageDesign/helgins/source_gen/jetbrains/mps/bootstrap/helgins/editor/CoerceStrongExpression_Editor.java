package jetbrains.mps.bootstrap.helgins.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class CoerceStrongExpression_Editor extends DefaultNodeEditor {

  private static void setupBasic_Collection_11788715576331178871557633(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1178871557633");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11788715576341178871557634(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1178871557634");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11788715576351178871557635(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1178871557635");
    BaseLanguageStyle_StyleSheet.LEFT_PAREN.apply(editorCell);
  }

  private static void setupBasic_refNode_nodeToCoerce1178871557636(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11788715576371178871557637(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1178871557637");
  }

  private static void setupBasic_refNode_pattern1178871557638(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11788715576391178871557639(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1178871557639");
    BaseLanguageStyle_StyleSheet.RIGHT_PAREN.apply(editorCell);
  }

  private static void setupLabel_Constant_1178871557634_1178871557634(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1178871557635_1178871557635(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_nodeToCoerce_1178871557636(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1178871557637_1178871557637(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_pattern_1178871557638(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1178871557639_1178871557639(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1178871557633(context, node);
  }

  public EditorCell createCollection1178871557633(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11788715576331178871557633(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1178871557634(context, node, "coerceStrong"));
    editorCell.addEditorCell(this.createConstant1178871557635(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1178871557636(context, node));
    editorCell.addEditorCell(this.createConstant1178871557637(context, node, ":<<"));
    editorCell.addEditorCell(this.createRefNode1178871557638(context, node));
    editorCell.addEditorCell(this.createConstant1178871557639(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1178871557634(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11788715576341178871557634(editorCell, node, context);
    setupLabel_Constant_1178871557634_1178871557634(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new CoerceStrongExpression_Editor.CoerceStrongExpression_Editor_replaceWith_CoerceExpression_cellMenu()}));
    return editorCell;
  }

  public EditorCell createConstant1178871557635(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11788715576351178871557635(editorCell, node, context);
    setupLabel_Constant_1178871557635_1178871557635(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1178871557637(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11788715576371178871557637(editorCell, node, context);
    setupLabel_Constant_1178871557637_1178871557637(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1178871557639(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11788715576391178871557639(editorCell, node, context);
    setupLabel_Constant_1178871557639_1178871557639(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1178871557636_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_nodeToCoerce1178871557636(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_nodeToCoerce_1178871557636((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1178871557636(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeToCoerce");
    provider.setNoTargetText("<no nodeToCoerce>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1178871557636_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1178871557638_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_pattern1178871557638(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_pattern_1178871557638((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1178871557638(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("pattern");
    provider.setNoTargetText("<no pattern>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1178871557638_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class CoerceStrongExpression_Editor_replaceWith_CoerceExpression_cellMenu extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public CoerceStrongExpression_Editor_replaceWith_CoerceExpression_cellMenu() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.bootstrap.helgins.structure.CoerceExpression";
    }

}

}
