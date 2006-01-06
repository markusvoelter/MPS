package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS 06.01.2006 18:07:35 */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.resolve.BadReferenceTextProvider;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorUtil;

public class VariableReference_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createVariableDeclarationReferenceCell(context, node);
  }
  public EditorCell createVariableDeclarationReferenceCell(EditorContext context, SNode node) {
    SNode effectiveNode = null;
    effectiveNode = node.getReferent("variableDeclaration");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "variableDeclaration", context.getOperationContext().getScope());
    SReference reference = node.getReference("variableDeclaration");
    if(reference != null && !(reference.isResolved())) {
      EditorCell_Error noRefCell = EditorCell_Error.create(context, node, null);
      noRefCell.setText(BadReferenceTextProvider.getBadReferenceText(reference));
      noRefCell.setEditable(true);
      noRefCell.setDrawBrackets(false);
      noRefCell.setBracketsColor(Color.black);
      noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
      noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
      noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
      __Expression_RTransform_ActionSet.setCellActions(noRefCell, node, context);
      noRefCell.addKeyMap(new _Expression_KeyMap());
      noRefCell.putUserObject(EditorCell.CELL_ID, "1134569731483");
      noRefCell.putUserObject(EditorCell.ROLE, "variableDeclaration");
      return noRefCell;
    }
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "");
        noRefCell.setEditable(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
        __Expression_RTransform_ActionSet.setCellActions(noRefCell, node, context);
        noRefCell.addKeyMap(new _Expression_KeyMap());
        noRefCell.putUserObject(EditorCell.CELL_ID, "1134569731483");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "variableDeclaration");
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new VariableReference_Editor_variableDeclaration_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setLayoutConstraint("");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.putUserObject(EditorCell.ROLE, "variableDeclaration");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
    __Expression_RTransform_ActionSet.setCellActions(editorCell, node, context);
    editorCell.addKeyMap(new _Expression_KeyMap());
    return editorCell;
  }
}
