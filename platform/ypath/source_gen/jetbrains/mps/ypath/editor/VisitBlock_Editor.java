package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class VisitBlock_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell12311_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell12311_0");
  }

  private static void setupBasic_CollectionCell12311_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell12311_01");
  }

  private static void setupBasic_ConstantCell12311_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell12311_0");
  }

  private static void setupBasic_ConstantCell12311_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell12311_01");
  }

  private static void setupBasic_CollectionCell12311_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell12311_02");
  }

  private static void setupBasic_ConstantCell12311_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell12311_02");
    {
      Style inlineStyle = new Style() {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell12311_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell12311_03");
  }

  private static void setupBasic_expressionRefNodeCell12311_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_bodyRefNodeCell12311_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_visitParameterDeclarationListRefNodeCell12311_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_parameterRefNodeCell12311_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell12311_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell12311_04");
  }

  private static void setupLabel_ConstantCell12311_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell12311_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell12311_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell12311_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_expressionRefNodeCell12311_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_bodyRefNodeCell12311_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_visitParameterDeclarationListRefNodeCell12311_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_parameterRefNodeCell12311_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell12311_04(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(MPSColors.DARK_BLUE);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell12311_0(context, node);
  }

  public EditorCell create_CollectionCell12311_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell12311_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell12311_01(context, node));
    editorCell.addEditorCell(this.create_CollectionCell12311_02(context, node));
    editorCell.addEditorCell(this.create_ConstantCell12311_01(context, node, "}"));
    return editorCell;
  }

  public EditorCell create_CollectionCell12311_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell12311_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell12311_03(context, node, "visit"));
    editorCell.addEditorCell(this.create_parameterRefNodeCell12311_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell12311_04(context, node, "in"));
    editorCell.addEditorCell(this.create_expressionRefNodeCell12311_0(context, node));
    editorCell.addEditorCell(this.create_visitParameterDeclarationListRefNodeCell12311_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell12311_0(context, node, "{"));
    return editorCell;
  }

  public EditorCell create_CollectionCell12311_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell12311_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell12311_02(context, node, "  "));
    editorCell.addEditorCell(this.create_bodyRefNodeCell12311_0(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell12311_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell12311_0(editorCell, node, context);
    setupLabel_ConstantCell12311_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell12311_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell12311_01(editorCell, node, context);
    setupLabel_ConstantCell12311_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell12311_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell12311_02(editorCell, node, context);
    setupLabel_ConstantCell12311_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell12311_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell12311_03(editorCell, node, context);
    setupLabel_ConstantCell12311_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell12311_04(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell12311_04(editorCell, node, context);
    setupLabel_ConstantCell12311_04(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_expressionRefNodeCell12311_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_expressionRefNodeCell12311_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_expressionRefNodeCell12311_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_expressionRefNodeCell12311_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_expressionRefNodeCell12311_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_bodyRefNodeCell12311_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_bodyRefNodeCell12311_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_bodyRefNodeCell12311_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_bodyRefNodeCell12311_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_bodyRefNodeCell12311_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_visitParameterDeclarationListRefNodeCell12311_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_visitParameterDeclarationListRefNodeCell12311_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_visitParameterDeclarationListRefNodeCell12311_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_visitParameterDeclarationListRefNodeCell12311_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("visitParameterDeclarationList");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_visitParameterDeclarationListRefNodeCell12311_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_parameterRefNodeCell12311_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_parameterRefNodeCell12311_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_parameterRefNodeCell12311_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_parameterRefNodeCell12311_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("parameter");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_parameterRefNodeCell12311_0_internal(context, node, provider);
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
