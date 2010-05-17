package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UIObject extends BaseConcept implements INamedConcept, HasTemplate {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.UIObject";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ABSTRACT = "abstract";
  public static final String EXTENDS = "extends";
  public static final String BELONGS_TO = "belongsTo";
  public static final String PROPERTY = "property";
  public static final String ACTION = "action";
  public static final String PRODUCE_EVENT = "produceEvent";
  public static final String COMPARTMENT = "compartment";

  public UIObject(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(UIObject.NAME);
  }

  public void setName(String value) {
    this.setProperty(UIObject.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(UIObject.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(UIObject.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(UIObject.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(UIObject.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(UIObject.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(UIObject.VIRTUAL_PACKAGE, value);
  }

  public boolean getAbstract() {
    return this.getBooleanProperty(UIObject.ABSTRACT);
  }

  public void setAbstract(boolean value) {
    this.setBooleanProperty(UIObject.ABSTRACT, value);
  }

  public UIObject getExtends() {
    return (UIObject) this.getReferent(UIObject.class, UIObject.EXTENDS);
  }

  public void setExtends(UIObject node) {
    super.setReferent(UIObject.EXTENDS, node);
  }

  public UIObject getBelongsTo() {
    return (UIObject) this.getReferent(UIObject.class, UIObject.BELONGS_TO);
  }

  public void setBelongsTo(UIObject node) {
    super.setReferent(UIObject.BELONGS_TO, node);
  }

  public int getPropertiesCount() {
    return this.getChildCount(UIObject.PROPERTY);
  }

  public Iterator<UIProperty> properties() {
    return this.children(UIProperty.class, UIObject.PROPERTY);
  }

  public List<UIProperty> getProperties() {
    return this.getChildren(UIProperty.class, UIObject.PROPERTY);
  }

  public void addProperty(UIProperty node) {
    this.addChild(UIObject.PROPERTY, node);
  }

  public void insertProperty(UIProperty prev, UIProperty node) {
    this.insertChild(prev, UIObject.PROPERTY, node);
  }

  public int getActionsCount() {
    return this.getChildCount(UIObject.ACTION);
  }

  public Iterator<UIAction> actions() {
    return this.children(UIAction.class, UIObject.ACTION);
  }

  public List<UIAction> getActions() {
    return this.getChildren(UIAction.class, UIObject.ACTION);
  }

  public void addAction(UIAction node) {
    this.addChild(UIObject.ACTION, node);
  }

  public void insertAction(UIAction prev, UIAction node) {
    this.insertChild(prev, UIObject.ACTION, node);
  }

  public int getProduceEventsCount() {
    return this.getChildCount(UIObject.PRODUCE_EVENT);
  }

  public Iterator<EventProducer> produceEvents() {
    return this.children(EventProducer.class, UIObject.PRODUCE_EVENT);
  }

  public List<EventProducer> getProduceEvents() {
    return this.getChildren(EventProducer.class, UIObject.PRODUCE_EVENT);
  }

  public void addProduceEvent(EventProducer node) {
    this.addChild(UIObject.PRODUCE_EVENT, node);
  }

  public void insertProduceEvent(EventProducer prev, EventProducer node) {
    this.insertChild(prev, UIObject.PRODUCE_EVENT, node);
  }

  public int getCompartmentsCount() {
    return this.getChildCount(UIObject.COMPARTMENT);
  }

  public Iterator<Container> compartments() {
    return this.children(Container.class, UIObject.COMPARTMENT);
  }

  public List<Container> getCompartments() {
    return this.getChildren(Container.class, UIObject.COMPARTMENT);
  }

  public void addCompartment(Container node) {
    this.addChild(UIObject.COMPARTMENT, node);
  }

  public void insertCompartment(Container prev, Container node) {
    this.insertChild(prev, UIObject.COMPARTMENT, node);
  }

  public static UIObject newInstance(SModel sm, boolean init) {
    return (UIObject) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.UIObject", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UIObject newInstance(SModel sm) {
    return UIObject.newInstance(sm, false);
  }
}
