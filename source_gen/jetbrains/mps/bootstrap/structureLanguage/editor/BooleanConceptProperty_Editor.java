package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.resolve.BadReferenceTextProvider;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorUtil;

public class BooleanConceptProperty_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createNodeBox(context, node);
  }
  public EditorCell createNodeBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConceptPropertyDeclarationReferenceCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1105727453183");
    return editorCell;
  }
  public EditorCell createConceptPropertyDeclarationReferenceCell(EditorContext context, SNode node) {
    SNode effectiveNode = null;
    effectiveNode = node.getReferent("conceptPropertyDeclaration");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "conceptPropertyDeclaration", context.getOperationContext().getScope());
    SReference reference = node.getReference("conceptPropertyDeclaration");
    if(reference != null && !(reference.isResolved())) {
      EditorCell_Error noRefCell = EditorCell_Error.create(context, node, BadReferenceTextProvider.getBadReferenceText(reference));
      noRefCell.setEditable(true);
      noRefCell.setDrawBrackets(false);
      noRefCell.setBracketsColor(Color.black);
      noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
      noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
      noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
      BooleanConceptProperty_BooleanConceptProperties_Menu.setCellActions(noRefCell, node, context);
      noRefCell.putUserObject(EditorCell.CELL_ID, "1105727610547");
      noRefCell.putUserObject(EditorCell.ROLE, "conceptPropertyDeclaration");
      return noRefCell;
    }
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "<no property>");
        noRefCell.setEditable(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
        BooleanConceptProperty_BooleanConceptProperties_Menu.setCellActions(noRefCell, node, context);
        noRefCell.putUserObject(EditorCell.CELL_ID, "1105727610547");
        noRefCell.putUserObject(EditorCell.ROLE, "conceptPropertyDeclaration");
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new BooleanConceptProperty_Editor_conceptPropertyDeclaration_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.putUserObject(EditorCell.ROLE, "conceptPropertyDeclaration");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
    BooleanConceptProperty_BooleanConceptProperties_Menu.setCellActions(editorCell, node, context);
    return editorCell;
  }
}
