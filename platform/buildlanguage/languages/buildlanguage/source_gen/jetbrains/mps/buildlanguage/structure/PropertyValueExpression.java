package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyValueExpression extends BaseConcept implements ISource {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.PropertyValueExpression";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public PropertyValueExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(PropertyValueExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PropertyValueExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PropertyValueExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PropertyValueExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PropertyValueExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PropertyValueExpression.VIRTUAL_PACKAGE, value);
  }


  public static PropertyValueExpression newInstance(SModel sm, boolean init) {
    return (PropertyValueExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.PropertyValueExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyValueExpression newInstance(SModel sm) {
    return PropertyValueExpression.newInstance(sm, false);
  }

}
