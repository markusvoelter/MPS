package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class InstanceMethodDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility2;
  /* package */AbstractCellListHandler myParameterListHandler_parameterList_;
  /* package */AbstractCellListHandler myThrowsItemListHandler_throwsItemList_;

  private static void setup_Component_VisibilityCell(EditorCell editorCell, SNode node, EditorContext context) {
  }
  private static void setupConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
  }
  private static void setupReturnType(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupMethodName(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupParameterList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupThrowsItemList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupRowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell5(EditorCell editorCell, SNode node, EditorContext context) {
  }
  private static void setupConstantCell6(EditorCell editorCell, SNode node, EditorContext context) {
  }
  private static void setupHeaderRow(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupIndentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBodyCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupBodyArea(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }
  private static void setupMethodBox(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupConstantCell9(EditorCell editorCell, SNode node, EditorContext context) {
  }
  private static void setupIsAbstractCell(EditorCell editorCell, SNode node, EditorContext context) {
  }
  private static void setupRowCell1(EditorCell editorCell, SNode node, EditorContext context) {
  }
  public static boolean _QueryFunction_NodeCondition_1178608724220(SNode node, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isAbstract");
  }
  public static boolean _QueryFunction_NodeCondition_1178609166621(SNode node, IScope scope) {
    return SequenceOperations.getSize(SLinkOperations.getTargets(node, "throwsItem", true)) > 0;
  }
  public static boolean _QueryFunction_NodeCondition_1178609275710(SNode node, IScope scope) {
    return !(SPropertyOperations.getBoolean(node, "isAbstract"));
  }
  public static boolean _QueryFunction_NodeCondition_1178609161098(SNode node, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isAbstract");
  }
  public static boolean _QueryFunction_NodeCondition_1178609059858(SNode node, IScope scope) {
    return !(SPropertyOperations.getBoolean(node, "isAbstract"));
  }
  public static boolean _QueryFunction_NodeCondition_1178609091789(SNode node, IScope scope) {
    return !(SPropertyOperations.getBoolean(node, "isAbstract"));
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createMethodBox(context, node);
  }
  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createRowCell1(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InstanceMethodDeclaration_Editor.setupRowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "throws"));
    editorCell.addEditorCell(this.createThrowsItemList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178609159855");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InstanceMethodDeclaration_Editor.setupHeaderRow(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_Component_VisibilityCell(context, node));
    if(InstanceMethodDeclaration_Editor._QueryFunction_NodeCondition_1178608724220(node, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell(context, node, "abstract"));
    }
    editorCell.addEditorCell(this.createReturnType(context, node));
    editorCell.addEditorCell(this.createMethodName(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "("));
    editorCell.addEditorCell(this.createParameterList(context, node));
    editorCell.addEditorCell(this.createConstantCell3(context, node, ")"));
    if(InstanceMethodDeclaration_Editor._QueryFunction_NodeCondition_1178609166621(node, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRowCell(context, node));
    }
    if(InstanceMethodDeclaration_Editor._QueryFunction_NodeCondition_1178609275710(node, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell5(context, node, "{"));
    }
    if(InstanceMethodDeclaration_Editor._QueryFunction_NodeCondition_1178609161098(node, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell6(context, node, ";"));
    }
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459439");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createBodyArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InstanceMethodDeclaration_Editor.setupBodyArea(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell(context, node, "  "));
    editorCell.addEditorCell(this.createBodyCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459446");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createMethodBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    InstanceMethodDeclaration_Editor.setupMethodBox(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    if(InstanceMethodDeclaration_Editor._QueryFunction_NodeCondition_1178609059858(node, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createBodyArea(context, node));
    }
    if(InstanceMethodDeclaration_Editor._QueryFunction_NodeCondition_1178609091789(node, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell7(context, node, "}"));
    }
    editorCell.addEditorCell(this.createConstantCell8(context, node, ""));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459438");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    InstanceMethodDeclaration_Editor.setupRowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell9(context, node, "abstract : "));
    editorCell.addEditorCell(this.createIsAbstractCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178608701146");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell create_Component_VisibilityCell(EditorContext context, SNode node) {
    if(this.my_Component_Visibility2 == null) {
      this.my_Component_Visibility2 = new _Component_Visibility(node);
    }
    EditorCell componentCell = this.my_Component_Visibility2.createEditorCell(context);
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.addEditorCell(componentCell);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    _InstanceMethodDeclaration_AddAbstract.setCellActions(editorCell, node, context);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178547804783");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    _InstanceMethodDeclaration_RemoveAbstract.setCellActions(editorCell, node, context);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178608691960");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459442");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    _BaseMethodDeclaration_Actions.setCellActions(editorCell, node, context);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459445");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178609159856");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178609271729");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178609157560");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459447");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459449");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1171332353715");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178608704137");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createParameterList(EditorContext context, SNode node) {
    if(this.myParameterListHandler_parameterList_ == null) {
      this.myParameterListHandler_parameterList_ = new InstanceMethodDeclaration_Editor_ParameterListHandler_parameterList_(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myParameterListHandler_parameterList_.createCells(context, new CellLayout_Horizontal(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myParameterListHandler_parameterList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createThrowsItemList(EditorContext context, SNode node) {
    if(this.myThrowsItemListHandler_throwsItemList_ == null) {
      this.myThrowsItemListHandler_throwsItemList_ = new InstanceMethodDeclaration_Editor_ThrowsItemListHandler_throwsItemList_(node, "throwsItem", context);
    }
    EditorCell_Collection editorCell = this.myThrowsItemListHandler_throwsItemList_.createCells(context, new CellLayout_Horizontal(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myThrowsItemListHandler_throwsItemList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createReturnTypeinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233539828");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createReturnType(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("returnType");
    provider.setNoTargetText("<no return type>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createReturnTypeinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createMethodNameinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459441");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createMethodName(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createMethodNameinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createBodyCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075233459448");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createBodyCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createBodyCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createIsAbstractCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1178608708696");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createIsAbstractCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isAbstract");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createIsAbstractCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
}
