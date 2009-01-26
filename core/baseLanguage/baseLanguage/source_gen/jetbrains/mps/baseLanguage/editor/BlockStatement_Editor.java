package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BlockStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6106_0(context, node);
  }

  public EditorCell createCollection_6106_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_6106_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6106_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_6106_2(context, node, "{"));
    }
    editorCell.addEditorCell(this.createCollection_6106_1(context, node));
    if (renderingCondition6106_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_6106_1(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection_6106_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6106_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6106_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_6106_0(context, node, "  "));
    }
    editorCell.addEditorCell(this.createRefNode_6106_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_6106_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6106_0(editorCell, node, context);
    setupLabel_Constant_6106_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6106_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6106_1(editorCell, node, context);
    setupLabel_Constant_6106_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6106_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6106_2(editorCell, node, context);
    setupLabel_Constant_6106_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_6106_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_6106_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_6106_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6106_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statements");
    provider.setNoTargetText("<no statements>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_6106_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_6106_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6106_0");
  }

  private static void setupBasic_Collection_6106_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6106_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_6106_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6106_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, Measure.SPACES));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_6106_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_6106_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6106_1");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_6106_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6106_2");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_6106_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_6106_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6106_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_6106_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6106_0(SNode node, EditorContext editorContext, IScope scope) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "ifFalseStatement"));
  }

  public static boolean renderingCondition6106_1(SNode node, EditorContext editorContext, IScope scope) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "ifFalseStatement"));
  }

  public static boolean renderingCondition6106_2(SNode node, EditorContext editorContext, IScope scope) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "ifFalseStatement"));
  }

}
