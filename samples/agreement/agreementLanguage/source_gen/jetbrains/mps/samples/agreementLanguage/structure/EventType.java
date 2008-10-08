package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EventType extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.EventType";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String VARIABLE = "variable";

  public EventType(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(EventType.NAME);
  }

  public void setName(String value) {
    this.setProperty(EventType.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EventType.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EventType.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EventType.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EventType.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EventType.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EventType.VIRTUAL_PACKAGE, value);
  }

  public int getVariablesCount() {
    return this.getChildCount(EventType.VARIABLE);
  }

  public Iterator<EventVariable> variables() {
    return this.children(EventType.VARIABLE);
  }

  public List<EventVariable> getVariables() {
    return this.getChildren(EventType.VARIABLE);
  }

  public void addVariable(EventVariable node) {
    this.addChild(EventType.VARIABLE, node);
  }

  public void insertVariable(EventVariable prev, EventVariable node) {
    this.insertChild(prev, EventType.VARIABLE, node);
  }


  public static EventType newInstance(SModel sm, boolean init) {
    return (EventType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.EventType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventType newInstance(SModel sm) {
    return EventType.newInstance(sm, false);
  }

}
