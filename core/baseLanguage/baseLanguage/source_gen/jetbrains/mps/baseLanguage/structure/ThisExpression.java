package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ThisExpression extends jetbrains.mps.baseLanguage.structure.Expression implements jetbrains.mps.baseLanguage.structure.IThisExpression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ThisExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CLASS_CONCEPT = "classConcept";

  public ThisExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ThisExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ThisExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ThisExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ThisExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ThisExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ThisExpression.VIRTUAL_PACKAGE, value);
  }

  public jetbrains.mps.baseLanguage.structure.Classifier getClassConcept() {
    return (jetbrains.mps.baseLanguage.structure.Classifier)this.getReferent(Classifier.class, ThisExpression.CLASS_CONCEPT);
  }

  public void setClassConcept(jetbrains.mps.baseLanguage.structure.Classifier node) {
    super.setReferent(ThisExpression.CLASS_CONCEPT, node);
  }


  public static ThisExpression newInstance(SModel sm, boolean init) {
    return (ThisExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ThisExpression newInstance(SModel sm) {
    return ThisExpression.newInstance(sm, false);
  }

}
