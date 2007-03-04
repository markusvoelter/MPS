package webr.xml.editor;

/*Generated by MPS  */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import webr.xml.util.XmlQueryUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;

public class ContentList_Editor extends DefaultNodeEditor {

  public AbstractCellListHandler myContentListHandler_ver1_;
  public AbstractCellListHandler myContentListHandler_ver2_;
  public AbstractCellListHandler myContentListHandler_hor2_;
  public AbstractCellListHandler myContentListHandler_hor1_;

  public static boolean _QueryFunction_NodeCondition_1166301006370(SNode node, IScope scope) {
    return XmlQueryUtil.isHorizontal(node, scope);
  }
  public static boolean _QueryFunction_NodeCondition_1166303669051(SNode node, IScope scope) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "webr.xml.structure.ContentList");
  }
  public static boolean _QueryFunction_NodeCondition_1166316630613(SNode node, IScope scope) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "webr.xml.structure.Element");
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellAlternation(context, node);
  }
  public EditorCell createCellAlternation1(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ContentList_Editor._QueryFunction_NodeCondition_1166303669051(node, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createColumnCell(context, node);
    } else 
    {
      editorCell = this.createVer2(context, node);
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1166303669050");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createCellAlternation2(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ContentList_Editor._QueryFunction_NodeCondition_1166316630613(node, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createHor1(context, node);
    } else 
    {
      editorCell = this.createRowCell1(context, node);
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1166316630612");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ContentList_Editor._QueryFunction_NodeCondition_1166301006370(node, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createCellAlternation2(context, node);
    } else 
    {
      editorCell = this.createCellAlternation1(context, node);
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1166301006369");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "  "));
    editorCell.addEditorCell(this.createVer1(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1166304045426");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "("));
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createConstantCell3(context, node, ")"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1166304045424");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell5(context, node, "("));
    editorCell.addEditorCell(this.createHor2(context, node));
    editorCell.addEditorCell(this.createConstantCell7(context, node, ")"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1166316633197");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1166304045425");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1166304045427");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1166304772939");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1166316633198");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1166316633201");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createVer1(EditorContext context, SNode node) {
    if(this.myContentListHandler_ver1_ == null) {
      this.myContentListHandler_ver1_ = new ContentList_Editor_ContentListHandler_ver1_(node, "content", context);
    }
    EditorCell_Collection editorCell = this.myContentListHandler_ver1_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myContentListHandler_ver1_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createVer2(EditorContext context, SNode node) {
    if(this.myContentListHandler_ver2_ == null) {
      this.myContentListHandler_ver2_ = new ContentList_Editor_ContentListHandler_ver2_(node, "content", context);
    }
    EditorCell_Collection editorCell = this.myContentListHandler_ver2_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myContentListHandler_ver2_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createHor2(EditorContext context, SNode node) {
    if(this.myContentListHandler_hor2_ == null) {
      this.myContentListHandler_hor2_ = new ContentList_Editor_ContentListHandler_hor2_(node, "content", context);
    }
    EditorCell_Collection editorCell = this.myContentListHandler_hor2_.createCells(context, new CellLayout_Horizontal(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myContentListHandler_hor2_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createHor1(EditorContext context, SNode node) {
    if(this.myContentListHandler_hor1_ == null) {
      this.myContentListHandler_hor1_ = new ContentList_Editor_ContentListHandler_hor1_(node, "content", context);
    }
    EditorCell_Collection editorCell = this.myContentListHandler_hor1_.createCells(context, new CellLayout_Horizontal(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myContentListHandler_hor1_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
