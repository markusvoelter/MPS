package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Feb 9, 2006 8:07:58 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.annotations.PropertyAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CellAction_DeleteSmart;
import jetbrains.mps.annotations.LinkAttributeConcept;

public class ParameterDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createDeclarationBox(context, node);
  }
  public EditorCell createDeclarationBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createTypeCell(context, node));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1075302295735");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCellinternal(EditorContext context, SNode node) {
    String propertyName = "name";
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, propertyName, false, false, context);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("<no name>");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    ParameterDeclaration_NameCellActions.setCellActions(editorCell, node, context);
    editorCell.addKeyMap(new _ParameterDeclaration_KeyMap());
    editorCell.putUserObject(EditorCell.CELL_ID, "1075302295737");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SNode node) {
    String propertyName = "name";
    EditorCell propertyCell = this.createNameCellinternal(context, node);
    PropertyAttributeConcept propertyAttributeConcept = node.getPropertyAttribute(propertyName);
    if(propertyAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createPropertyAttributeCell(context, propertyAttributeConcept, propertyCell);
    } else 
    return propertyCell;
  }
  public EditorCell createTypeCellinternal(EditorContext context, SNode node) {
    SNode referencedNode = null;
    referencedNode = node.getChild("type");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "type", context.getOperationContext().getScope());
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "<no type>");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration, context));
        noRefCell.putUserObject(EditorCell.CELL_ID, "1075302295736");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "type");
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.putUserObject(EditorCell.ROLE, "type");
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.setLayoutConstraint("");
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteSmart(node, linkDeclaration, referencedNode));
    editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration, context));
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext context, SNode node) {
    String linkRole = "type";
    EditorCell refCell = this.createTypeCellinternal(context, node);
    LinkAttributeConcept linkAttributeConcept = node.getLinkAttribute(linkRole);
    if(linkAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createLinkAttributeCell(context, linkAttributeConcept, refCell);
    } else 
    return refCell;
  }
}
