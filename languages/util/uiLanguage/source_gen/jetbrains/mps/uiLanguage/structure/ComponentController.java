package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComponentController extends BaseConcept implements INamedConcept, IClassifierPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ComponentController";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String COMPONENT = "component";
  public static final String AFTER_CONSTRUCTION = "afterConstruction";
  public static final String BEFORE_CONSTRUCTION = "beforeConstruction";
  public static final String ATTRIBUTE = "attribute";
  public static final String EVENT = "event";
  public static final String COMPONENT_METHOD = "componentMethod";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ComponentController(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ComponentController.NAME);
  }

  public void setName(String value) {
    this.setProperty(ComponentController.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ComponentController.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ComponentController.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ComponentController.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ComponentController.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ComponentController.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ComponentController.VIRTUAL_PACKAGE, value);
  }

  public ComponentDeclaration getComponent() {
    return (ComponentDeclaration) this.getReferent(ComponentDeclaration.class, ComponentController.COMPONENT);
  }

  public void setComponent(ComponentDeclaration node) {
    super.setReferent(ComponentController.COMPONENT, node);
  }

  public AfterConstructionBlock getAfterConstruction() {
    return (AfterConstructionBlock) this.getChild(AfterConstructionBlock.class, ComponentController.AFTER_CONSTRUCTION);
  }

  public void setAfterConstruction(AfterConstructionBlock node) {
    super.setChild(ComponentController.AFTER_CONSTRUCTION, node);
  }

  public BeforeConstructionBlock getBeforeConstruction() {
    return (BeforeConstructionBlock) this.getChild(BeforeConstructionBlock.class, ComponentController.BEFORE_CONSTRUCTION);
  }

  public void setBeforeConstruction(BeforeConstructionBlock node) {
    super.setChild(ComponentController.BEFORE_CONSTRUCTION, node);
  }

  public int getAttributesCount() {
    return this.getChildCount(ComponentController.ATTRIBUTE);
  }

  public Iterator<AttributeDeclaration> attributes() {
    return this.children(AttributeDeclaration.class, ComponentController.ATTRIBUTE);
  }

  public List<AttributeDeclaration> getAttributes() {
    return this.getChildren(AttributeDeclaration.class, ComponentController.ATTRIBUTE);
  }

  public void addAttribute(AttributeDeclaration node) {
    this.addChild(ComponentController.ATTRIBUTE, node);
  }

  public void insertAttribute(AttributeDeclaration prev, AttributeDeclaration node) {
    this.insertChild(prev, ComponentController.ATTRIBUTE, node);
  }

  public int getEventsCount() {
    return this.getChildCount(ComponentController.EVENT);
  }

  public Iterator<EventDeclaration> events() {
    return this.children(EventDeclaration.class, ComponentController.EVENT);
  }

  public List<EventDeclaration> getEvents() {
    return this.getChildren(EventDeclaration.class, ComponentController.EVENT);
  }

  public void addEvent(EventDeclaration node) {
    this.addChild(ComponentController.EVENT, node);
  }

  public void insertEvent(EventDeclaration prev, EventDeclaration node) {
    this.insertChild(prev, ComponentController.EVENT, node);
  }

  public int getComponentMethodsCount() {
    return this.getChildCount(ComponentController.COMPONENT_METHOD);
  }

  public Iterator<DefaultClassifierMethodDeclaration> componentMethods() {
    return this.children(DefaultClassifierMethodDeclaration.class, ComponentController.COMPONENT_METHOD);
  }

  public List<DefaultClassifierMethodDeclaration> getComponentMethods() {
    return this.getChildren(DefaultClassifierMethodDeclaration.class, ComponentController.COMPONENT_METHOD);
  }

  public void addComponentMethod(DefaultClassifierMethodDeclaration node) {
    this.addChild(ComponentController.COMPONENT_METHOD, node);
  }

  public void insertComponentMethod(DefaultClassifierMethodDeclaration prev, DefaultClassifierMethodDeclaration node) {
    this.insertChild(prev, ComponentController.COMPONENT_METHOD, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ComponentController.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ComponentController.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ComponentController.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ComponentController.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ComponentController.SMODEL_ATTRIBUTE, node);
  }

  public static ComponentController newInstance(SModel sm, boolean init) {
    return (ComponentController) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ComponentController", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComponentController newInstance(SModel sm) {
    return ComponentController.newInstance(sm, false);
  }
}
