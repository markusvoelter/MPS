package jetbrains.mps.bootstrap.helgins.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class IsSubtypeExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1176543992252(context, node);
  }

  public EditorCell createCollection1176543992252(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11765439922521176543992252(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1176543998552(context, node, "isSubtype"));
    editorCell.addEditorCell(this.createConstant1215442121382(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1176544005866(context, node));
    editorCell.addEditorCell(this.createConstant1176544008680(context, node, ":<"));
    editorCell.addEditorCell(this.createRefNode1176544012573(context, node));
    editorCell.addEditorCell(this.createConstant1176544016091(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1176543998552(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11765439985521176543998552(editorCell, node, context);
    setupLabel_Constant_1176543998552_1176543998552(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new IsSubtypeExpression_Editor.IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant1176544008680(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11765440086801176544008680(editorCell, node, context);
    setupLabel_Constant_1176544008680_1176544008680(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1176544016091(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11765440160911176544016091(editorCell, node, context);
    setupLabel_Constant_1176544016091_1176544016091(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1215442121382(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12154421213821215442121382(editorCell, node, context);
    setupLabel_Constant_1215442121382_1215442121382(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1176544005866_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_subtypeExpression1176544005866(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_subtypeExpression_1176544005866((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1176544005866(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("subtypeExpression");
    provider.setNoTargetText("<no subtypeExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1176544005866_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1176544012573_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_supertypeExpression1176544012573(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_supertypeExpression_1176544012573((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1176544012573(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("supertypeExpression");
    provider.setNoTargetText("<no supertypeExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1176544012573_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11765439922521176543992252(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1176543992252");
  }

  private static void setupBasic_Constant_11765439985521176543998552(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1176543998552");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_subtypeExpression1176544005866(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11765440086801176544008680(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1176544008680");
  }

  private static void setupBasic_refNode_supertypeExpression1176544012573(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11765440160911176544016091(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1176544016091");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12154421213821215442121382(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1215442121382");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1176543998552_1176543998552(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_subtypeExpression_1176544005866(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1176544008680_1176544008680(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_supertypeExpression_1176544012573(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1176544016091_1176544016091(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1215442121382_1215442121382(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression";
    }

}

}
