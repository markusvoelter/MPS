package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ApplicableNodeCondition extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.lang.core.structure.INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.ApplicableNodeCondition";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public ApplicableNodeCondition(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ApplicableNodeCondition.NAME);
  }

  public void setName(String value) {
    this.setProperty(ApplicableNodeCondition.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ApplicableNodeCondition.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ApplicableNodeCondition.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ApplicableNodeCondition.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ApplicableNodeCondition.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ApplicableNodeCondition.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ApplicableNodeCondition.VIRTUAL_PACKAGE, value);
  }


  public static ApplicableNodeCondition newInstance(SModel sm, boolean init) {
    return (ApplicableNodeCondition)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.ApplicableNodeCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ApplicableNodeCondition newInstance(SModel sm) {
    return ApplicableNodeCondition.newInstance(sm, false);
  }

}
