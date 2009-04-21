package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.buildlanguage.structure.IProjectComponent;
import jetbrains.mps.buildlanguage.structure.IPropertyHolder;
import jetbrains.mps.buildlanguage.structure.ICommented;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.buildlanguage.structure.Call;
import java.util.List;
import jetbrains.mps.buildlanguage.structure.TargetReference;
import jetbrains.mps.buildlanguage.structure.PropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TargetDeclaration extends BaseConcept implements IProjectComponent, IPropertyHolder, ICommented {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.TargetDeclaration";
  public static final String IF = "if";
  public static final String UNLESS = "unless";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TASK_CALL = "taskCall";
  public static final String DEPENDS = "depends";
  public static final String PROPERTY_LIST = "propertyList";

  public TargetDeclaration(SNode node) {
    super(node);
  }

  public String getIf() {
    return this.getProperty(TargetDeclaration.IF);
  }

  public void setIf(String value) {
    this.setProperty(TargetDeclaration.IF, value);
  }

  public String getUnless() {
    return this.getProperty(TargetDeclaration.UNLESS);
  }

  public void setUnless(String value) {
    this.setProperty(TargetDeclaration.UNLESS, value);
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

  public int getTaskCallsCount() {
    return this.getChildCount(TargetDeclaration.TASK_CALL);
  }

  public Iterator<Call> taskCalls() {
    return this.children(Call.class, TargetDeclaration.TASK_CALL);
  }

  public List<Call> getTaskCalls() {
    return this.getChildren(Call.class, TargetDeclaration.TASK_CALL);
  }

  public void addTaskCall(Call node) {
    this.addChild(TargetDeclaration.TASK_CALL, node);
  }

  public void insertTaskCall(Call prev, Call node) {
    this.insertChild(prev, TargetDeclaration.TASK_CALL, node);
  }

  public int getDependsesCount() {
    return this.getChildCount(TargetDeclaration.DEPENDS);
  }

  public Iterator<TargetReference> dependses() {
    return this.children(TargetReference.class, TargetDeclaration.DEPENDS);
  }

  public List<TargetReference> getDependses() {
    return this.getChildren(TargetReference.class, TargetDeclaration.DEPENDS);
  }

  public void addDepends(TargetReference node) {
    this.addChild(TargetDeclaration.DEPENDS, node);
  }

  public void insertDepends(TargetReference prev, TargetReference node) {
    this.insertChild(prev, TargetDeclaration.DEPENDS, node);
  }

  public int getPropertyListsCount() {
    return this.getChildCount(TargetDeclaration.PROPERTY_LIST);
  }

  public Iterator<PropertyDeclaration> propertyLists() {
    return this.children(PropertyDeclaration.class, TargetDeclaration.PROPERTY_LIST);
  }

  public List<PropertyDeclaration> getPropertyLists() {
    return this.getChildren(PropertyDeclaration.class, TargetDeclaration.PROPERTY_LIST);
  }

  public void addPropertyList(PropertyDeclaration node) {
    this.addChild(TargetDeclaration.PROPERTY_LIST, node);
  }

  public void insertPropertyList(PropertyDeclaration prev, PropertyDeclaration node) {
    this.insertChild(prev, TargetDeclaration.PROPERTY_LIST, node);
  }


  public static TargetDeclaration newInstance(SModel sm, boolean init) {
    return (TargetDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.TargetDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TargetDeclaration newInstance(SModel sm) {
    return TargetDeclaration.newInstance(sm, false);
  }

}
