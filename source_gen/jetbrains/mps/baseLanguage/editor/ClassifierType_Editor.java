package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ClassifierType_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myParameterListHandler_parameterList_;

  public static boolean _QueryFunction_NodeCondition_1145920376960(SNode node, IScope scope) {
    return SLinkOperations.getCount(node, "parameter") > 0;
  }
  private static void setupBasic_ClassifierReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569208432");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569244933");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ParameterList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569244934");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569244935");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569207250");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ClassifierReferenceCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1145473161607");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_CellAlternation(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569118323");
    editorCell.setDrawBorder(false);
  }
  private static void setupLabel_ClassifierReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ParameterList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ClassifierReferenceCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellAlternation(context, node);
  }
  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ClassifierType_Editor._QueryFunction_NodeCondition_1145920376960(node, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createRowCell(context, node);
    } else
    {
      editorCell = this.createClassifierReferenceCell1(context, node);
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569118323");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ClassifierType_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createClassifierReferenceCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "<"));
    editorCell.addEditorCell(this.createParameterList(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, ">"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    ClassifierType_Editor.setupBasic_ConstantCell(editorCell, node, context);
    ClassifierType_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    ClassifierType_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    ClassifierType_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createParameterList(EditorContext context, SNode node) {
    if(this.myParameterListHandler_parameterList_ == null) {
      this.myParameterListHandler_parameterList_ = new ClassifierType_Editor_ParameterListHandler_parameterList_(node, "parameter", context);
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
  public EditorCell createClassifierReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ClassifierType_Editor_classifier_InlineComponent());
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1140569208432");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createClassifierReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("classifier");
    provider.setNoTargetText("<no classifier>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createClassifierReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createClassifierReferenceCell1internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ClassifierType_Editor_classifier_InlineComponent1());
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1145473161607");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createClassifierReferenceCell1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("classifier");
    provider.setNoTargetText("<no classifier>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createClassifierReferenceCell1internal(context, node, provider);
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
