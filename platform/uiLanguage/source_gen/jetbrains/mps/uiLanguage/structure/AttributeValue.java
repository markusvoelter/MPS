package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AttributeValue extends BaseConcept implements IComponentPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.AttributeValue";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String ATTRIBUTE = "attribute";
  public static String VALUE = "value";

  public AttributeValue(SNode node) {
    super(node);
  }

  public static AttributeValue newInstance(SModel sm, boolean init) {
    return (AttributeValue)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.AttributeValue", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AttributeValue newInstance(SModel sm) {
    return AttributeValue.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(AttributeValue.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AttributeValue.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AttributeValue.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AttributeValue.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AttributeValue.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AttributeValue.VIRTUAL_PACKAGE, value);
  }

  public AttributeDeclaration getAttribute() {
    return (AttributeDeclaration)this.getReferent(AttributeValue.ATTRIBUTE);
  }

  public void setAttribute(AttributeDeclaration node) {
    super.setReferent(AttributeValue.ATTRIBUTE, node);
  }

  public Expression getValue() {
    return (Expression)this.getChild(AttributeValue.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(AttributeValue.VALUE, node);
  }

}
