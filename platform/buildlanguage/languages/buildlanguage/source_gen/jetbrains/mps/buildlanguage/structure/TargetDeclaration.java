package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class TargetDeclaration extends BaseConcept implements INamedConcept, IPropertyHolder {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.TargetDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String STATEMENT_LIST = "statementList";
  public static String DEPENDS_LIST = "dependsList";
  public static String PROPERTY_LIST = "propertyList";

  public  TargetDeclaration(SNode node) {
    super(node);
  }

  public static TargetDeclaration newInstance(SModel sm, boolean init) {
    return (TargetDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.TargetDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TargetDeclaration newInstance(SModel sm) {
    return TargetDeclaration.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(TargetDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(TargetDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TargetDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TargetDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TargetDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TargetDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TargetDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TargetDeclaration.VIRTUAL_PACKAGE, value);
  }

  public int getStatementListsCount() {
    return this.getChildCount(TargetDeclaration.STATEMENT_LIST);
  }

  public Iterator<SimpleStatement> statementLists() {
    return this.children(TargetDeclaration.STATEMENT_LIST);
  }

  public List<SimpleStatement> getStatementLists() {
    return this.getChildren(TargetDeclaration.STATEMENT_LIST);
  }

  public void addStatementList(SimpleStatement node) {
    this.addChild(TargetDeclaration.STATEMENT_LIST, node);
  }

  public void insertStatementList(SimpleStatement prev, SimpleStatement node) {
    this.insertChild(prev, TargetDeclaration.STATEMENT_LIST, node);
  }

  public int getDependsListsCount() {
    return this.getChildCount(TargetDeclaration.DEPENDS_LIST);
  }

  public Iterator<TargetReference> dependsLists() {
    return this.children(TargetDeclaration.DEPENDS_LIST);
  }

  public List<TargetReference> getDependsLists() {
    return this.getChildren(TargetDeclaration.DEPENDS_LIST);
  }

  public void addDependsList(TargetReference node) {
    this.addChild(TargetDeclaration.DEPENDS_LIST, node);
  }

  public void insertDependsList(TargetReference prev, TargetReference node) {
    this.insertChild(prev, TargetDeclaration.DEPENDS_LIST, node);
  }

  public int getPropertyListsCount() {
    return this.getChildCount(TargetDeclaration.PROPERTY_LIST);
  }

  public Iterator<PropertyDeclaration> propertyLists() {
    return this.children(TargetDeclaration.PROPERTY_LIST);
  }

  public List<PropertyDeclaration> getPropertyLists() {
    return this.getChildren(TargetDeclaration.PROPERTY_LIST);
  }

  public void addPropertyList(PropertyDeclaration node) {
    this.addChild(TargetDeclaration.PROPERTY_LIST, node);
  }

  public void insertPropertyList(PropertyDeclaration prev, PropertyDeclaration node) {
    this.insertChild(prev, TargetDeclaration.PROPERTY_LIST, node);
  }

}
