package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class SConceptType_Editor extends DefaultNodeEditor {

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180481149412");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.BOLD);
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180481149413");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConceptDeclaratonReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180481149414");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180481149417");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180481149411");
    editorCell.setDrawBorder(false);
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConceptDeclaratonReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    SConceptType_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "sconcept"));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "<"));
    editorCell.addEditorCell(this.createConceptDeclaratonReferenceCell(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ">"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    SConceptType_Editor.setupBasic_ConstantCell(editorCell, node, context);
    SConceptType_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    SConceptType_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    SConceptType_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    SConceptType_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    SConceptType_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConceptDeclaratonReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new SConceptType_Editor_conceptDeclaraton_InlineComponent());
    EditorCell editorCell = provider.createEditorCell(context);
    SConceptType_Editor.setupBasic_ConceptDeclaratonReferenceCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      SConceptType_Editor.setupLabel_ConceptDeclaratonReferenceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createConceptDeclaratonReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptDeclaraton");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptDeclaratonReferenceCellinternal(context, node, provider);
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
