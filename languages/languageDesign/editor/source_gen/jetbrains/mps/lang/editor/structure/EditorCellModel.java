package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EditorCellModel extends BaseConcept implements IStyleContainer {
  public static final String concept = "jetbrains.mps.lang.editor.structure.EditorCellModel";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ATTRACTS_FOCUS = "attractsFocus";
  public static final String ACTION_MAP = "actionMap";
  public static final String KEY_MAP = "keyMap";
  public static final String STYLE_CLASS = "styleClass";
  public static final String RENDERING_CONDITION = "renderingCondition";
  public static final String MENU_DESCRIPTOR = "menuDescriptor";
  public static final String CELL_BACKGROUND_FUNCTION = "cellBackgroundFunction";
  public static final String FOCUS_POLICY_APPLICABLE = "focusPolicyApplicable";
  public static final String STYLE_ITEM = "styleItem";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public EditorCellModel(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(EditorCellModel.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EditorCellModel.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EditorCellModel.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EditorCellModel.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EditorCellModel.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EditorCellModel.VIRTUAL_PACKAGE, value);
  }

  public FocusPolicy getAttractsFocus() {
    String value = super.getProperty(EditorCellModel.ATTRACTS_FOCUS);
    return FocusPolicy.parseValue(value);
  }

  public void setAttractsFocus(FocusPolicy value) {
    super.setProperty(EditorCellModel.ATTRACTS_FOCUS, value.getValueAsString());
  }

  public CellActionMapDeclaration getActionMap() {
    return (CellActionMapDeclaration) this.getReferent(CellActionMapDeclaration.class, EditorCellModel.ACTION_MAP);
  }

  public void setActionMap(CellActionMapDeclaration node) {
    super.setReferent(EditorCellModel.ACTION_MAP, node);
  }

  public CellKeyMapDeclaration getKeyMap() {
    return (CellKeyMapDeclaration) this.getReferent(CellKeyMapDeclaration.class, EditorCellModel.KEY_MAP);
  }

  public void setKeyMap(CellKeyMapDeclaration node) {
    super.setReferent(EditorCellModel.KEY_MAP, node);
  }

  public StyleSheetClass getStyleClass() {
    return (StyleSheetClass) this.getReferent(StyleSheetClass.class, EditorCellModel.STYLE_CLASS);
  }

  public void setStyleClass(StyleSheetClass node) {
    super.setReferent(EditorCellModel.STYLE_CLASS, node);
  }

  public QueryFunction_NodeCondition getRenderingCondition() {
    return (QueryFunction_NodeCondition) this.getChild(QueryFunction_NodeCondition.class, EditorCellModel.RENDERING_CONDITION);
  }

  public void setRenderingCondition(QueryFunction_NodeCondition node) {
    super.setChild(EditorCellModel.RENDERING_CONDITION, node);
  }

  public CellMenuDescriptor getMenuDescriptor() {
    return (CellMenuDescriptor) this.getChild(CellMenuDescriptor.class, EditorCellModel.MENU_DESCRIPTOR);
  }

  public void setMenuDescriptor(CellMenuDescriptor node) {
    super.setChild(EditorCellModel.MENU_DESCRIPTOR, node);
  }

  public QueryFunction_Color getCellBackgroundFunction() {
    return (QueryFunction_Color) this.getChild(QueryFunction_Color.class, EditorCellModel.CELL_BACKGROUND_FUNCTION);
  }

  public void setCellBackgroundFunction(QueryFunction_Color node) {
    super.setChild(EditorCellModel.CELL_BACKGROUND_FUNCTION, node);
  }

  public QueryFunction_NodeCondition getFocusPolicyApplicable() {
    return (QueryFunction_NodeCondition) this.getChild(QueryFunction_NodeCondition.class, EditorCellModel.FOCUS_POLICY_APPLICABLE);
  }

  public void setFocusPolicyApplicable(QueryFunction_NodeCondition node) {
    super.setChild(EditorCellModel.FOCUS_POLICY_APPLICABLE, node);
  }

  public int getStyleItemsCount() {
    return this.getChildCount(EditorCellModel.STYLE_ITEM);
  }

  public Iterator<StyleClassItem> styleItems() {
    return this.children(StyleClassItem.class, EditorCellModel.STYLE_ITEM);
  }

  public List<StyleClassItem> getStyleItems() {
    return this.getChildren(StyleClassItem.class, EditorCellModel.STYLE_ITEM);
  }

  public void addStyleItem(StyleClassItem node) {
    this.addChild(EditorCellModel.STYLE_ITEM, node);
  }

  public void insertStyleItem(StyleClassItem prev, StyleClassItem node) {
    this.insertChild(prev, EditorCellModel.STYLE_ITEM, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(EditorCellModel.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, EditorCellModel.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, EditorCellModel.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(EditorCellModel.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, EditorCellModel.SMODEL_ATTRIBUTE, node);
  }

  public static EditorCellModel newInstance(SModel sm, boolean init) {
    return (EditorCellModel) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EditorCellModel newInstance(SModel sm) {
    return EditorCellModel.newInstance(sm, false);
  }
}
