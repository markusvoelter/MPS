package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EventAccessOperation extends BaseConcept implements IMemberOperation {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.EventAccessOperation";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String MEMBER = "member";

  public EventAccessOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(EventAccessOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EventAccessOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EventAccessOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EventAccessOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EventAccessOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EventAccessOperation.VIRTUAL_PACKAGE, value);
  }

  public IMember getMember() {
    return (IMember)this.getReferent(EventAccessOperation.MEMBER);
  }

  public void setMember(IMember node) {
    super.setReferent(EventAccessOperation.MEMBER, node);
  }

  public EventDeclaration getEvent() {
    return (EventDeclaration)this.getMember();
  }

  public void setEvent(EventDeclaration node) {
    this.setMember(node);
  }


  public static EventAccessOperation newInstance(SModel sm, boolean init) {
    return (EventAccessOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.EventAccessOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventAccessOperation newInstance(SModel sm) {
    return EventAccessOperation.newInstance(sm, false);
  }

}
