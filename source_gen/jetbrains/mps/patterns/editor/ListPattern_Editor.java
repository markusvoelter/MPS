package jetbrains.mps.patterns.editor;

/*Generated by MPS 08.01.2006 16:54:12 */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.annotations.PropertyAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.resolve.BadReferenceTextProvider;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.CellAction_DeleteReferenceToNode;
import jetbrains.mps.annotations.LinkAttributeConcept;

public class ListPattern_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell(context, node, "*"));
    editorCell.addEditorCell(this.createVarNameCell(context, node));
    editorCell.addEditorCell(this.createAttributedNodeCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1136727263715");
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
    editorCell.setFontType(MPSFonts.BOLD);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_GREEN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1136727263716");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createVarNameCellinternal(EditorContext context, SNode node) {
    String propertyName = "varName";
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, propertyName, false, false, context);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.BOLD);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_GREEN);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "varName"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1136728429078");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createVarNameCell(EditorContext context, SNode node) {
    String propertyName = "varName";
    EditorCell propertyCell = this.createVarNameCellinternal(context, node);
    PropertyAttributeConcept propertyAttributeConcept = node.getPropertyAttribute(propertyName);
    if(propertyAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createPropertyAttributeCell(context, propertyAttributeConcept, propertyCell);
    } else 
    return propertyCell;
  }
  public EditorCell createAttributedNodeCellinternal(EditorContext context, SNode node) {
    SNode referencedNode = null;
    referencedNode = node.getReferent("attributedNode");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "attributedNode", context.getOperationContext().getScope());
    SReference reference = node.getReference("attributedNode");
    if(reference != null && !(reference.isResolved())) {
      EditorCell_Error noRefCell = EditorCell_Error.create(context, node, null);
      noRefCell.setText(BadReferenceTextProvider.getBadReferenceText(reference));
      noRefCell.setEditable(true);
      noRefCell.setSelectable(true);
      noRefCell.setDrawBorder(false);
      noRefCell.setDrawBrackets(true);
      noRefCell.setBracketsColor(Color.black);
      noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      noRefCell.putUserObject(EditorCell.CELL_ID, "1136727263717");
      noRefCell.setLayoutConstraint("");
      noRefCell.putUserObject(EditorCell.ROLE, "attributedNode");
      return noRefCell;
    }
    if(referencedNode == null) {
      {
        EditorCell_Constant noRefCell = EditorCell_Constant.create(context, node, null, true);
        noRefCell.setDefaultText("");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(true);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.putUserObject(EditorCell.CELL_ID, "1136727263717");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "attributedNode");
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(true);
    editorCell.putUserObject(EditorCell.ROLE, "attributedNode");
    editorCell.setLayoutConstraint("");
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteReferenceToNode(node, "attributedNode", referencedNode));
    return editorCell;
  }
  public EditorCell createAttributedNodeCell(EditorContext context, SNode node) {
    String linkRole = "attributedNode";
    EditorCell refCell = this.createAttributedNodeCellinternal(context, node);
    LinkAttributeConcept linkAttributeConcept = node.getLinkAttribute(linkRole);
    if(linkAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createLinkAttributeCell(context, linkAttributeConcept, refCell);
    } else 
    return refCell;
  }
}
