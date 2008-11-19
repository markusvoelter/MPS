package jetbrains.mps.lang.typesystem.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;

public class ReportErrorStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1175517968839(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1210773187492(context, node);
  }

  public EditorCell createCollection1175517968839(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11755179688391175517968839(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1175517970856(context, node, "error"));
    editorCell.addEditorCell(this.createRefNode1175517983013(context, node));
    editorCell.addEditorCell(this.createConstant1175517986109(context, node, "->"));
    editorCell.addEditorCell(this.createRefNode1175517990173(context, node));
    editorCell.addEditorCell(this.createConstant1175518052514(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection1210773187492(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12107731874921210773187492(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227102598101(context, node, "node feature to highlight(optional)"));
    editorCell.addEditorCell(this.createRefNode1227102598102(context, node));
    editorCell.addEditorCell(this.createConstant1227102598103(context, node, " "));
    editorCell.addEditorCell(this.createConstant1210773247720(context, node, "intention to fix an error(optional)"));
    editorCell.addEditorCell(this.createRefNode1210784741834(context, node));
    return editorCell;
  }

  public EditorCell createConstant1175517970856(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11755179708561175517970856(editorCell, node, context);
    setupLabel_Constant_1175517970856_1175517970856(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175517986109(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11755179861091175517986109(editorCell, node, context);
    setupLabel_Constant_1175517986109_1175517986109(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175518052514(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11755180525141175518052514(editorCell, node, context);
    setupLabel_Constant_1175518052514_1175518052514(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1210773247720(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12107732477201210773247720(editorCell, node, context);
    setupLabel_Constant_1210773247720_1210773247720(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227102598101(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12271025981011227102598101(editorCell, node, context);
    setupLabel_Constant_1227102598101_1227102598101(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227102598103(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12271025981031227102598103(editorCell, node, context);
    setupLabel_Constant_1227102598103_1227102598103(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1175517983013_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_errorString1175517983013(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_errorString_1175517983013((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1175517983013(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("errorString");
    provider.setNoTargetText("<error string>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1175517983013_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1175517990173_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_nodeToReport1175517990173(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_nodeToReport_1175517990173((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1175517990173(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeToReport");
    provider.setNoTargetText("<node to highlight>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1175517990173_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1210784741834_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_helginsIntention1210784741834(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_helginsIntention_1210784741834((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1210784741834(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("helginsIntention");
    provider.setNoTargetText("<no intention>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1210784741834_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1227102598102_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_messageTarget1227102598102(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_messageTarget_1227102598102((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227102598102(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("messageTarget");
    provider.setNoTargetText("<no messageTarget>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227102598102_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11755179688391175517968839(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1175517968839");
  }

  private static void setupBasic_Constant_11755179708561175517970856(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175517970856");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_errorString1175517983013(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11755179861091175517986109(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175517986109");
  }

  private static void setupBasic_refNode_nodeToReport1175517990173(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11755180525141175518052514(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175518052514");
  }

  private static void setupBasic_Collection_12107731874921210773187492(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1210773187492");
  }

  private static void setupBasic_Constant_12107732477201210773247720(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1210773247720");
  }

  private static void setupBasic_refNode_helginsIntention1210784741834(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12271025981011227102598101(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227102598101");
  }

  private static void setupBasic_refNode_messageTarget1227102598102(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12271025981031227102598103(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227102598103");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1175517970856_1175517970856(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_errorString_1175517983013(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175517986109_1175517986109(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_nodeToReport_1175517990173(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175518052514_1175518052514(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1210773247720_1210773247720(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_helginsIntention_1210784741834(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227102598101_1227102598101(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_messageTarget_1227102598102(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227102598103_1227102598103(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
