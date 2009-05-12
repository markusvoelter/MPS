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
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class AssertThrows_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1017_0(context, node);
  }

  public EditorCell createCollection_1017_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_1017_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1017_0(context, node, "assert"));
    editorCell.addEditorCell(this.createRefNode_1017_1(context, node));
    editorCell.addEditorCell(this.createConstant_1017_1(context, node, "throws"));
    editorCell.addEditorCell(this.createRefNode_1017_3(context, node));
    editorCell.addEditorCell(this.createRefNode_1017_5(context, node));
    editorCell.addEditorCell(this.createConstant_1017_2(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant_1017_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1017_0(editorCell, node, context);
    setupLabel_Constant_1017_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1017_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1017_1(editorCell, node, context);
    setupLabel_Constant_1017_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1017_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1017_2(editorCell, node, context);
    setupLabel_Constant_1017_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_1017_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1017_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_1017_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1017_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statement");
    provider.setNoTargetText("<no statement>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_1017_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1017_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1017_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_1017_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1017_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("exceptionType");
    provider.setNoTargetText("<no exceptionType>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_1017_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1017_4_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1017_2(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_1017_2((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1017_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("message");
    provider.setNoTargetText("<no message>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_1017_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1017_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1017_0");
  }

  private static void setupBasic_Constant_1017_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1017_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1017_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1017_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1017_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1017_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_1017_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_1017_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_1017_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1017_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1017_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1017_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_1017_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_1017_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_1017_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
