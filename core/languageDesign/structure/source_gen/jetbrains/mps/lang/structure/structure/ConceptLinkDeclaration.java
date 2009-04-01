package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IStructureDeprecatable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptLinkDeclaration extends BaseConcept implements INamedConcept, IStructureDeprecatable {
  public static final String concept = "jetbrains.mps.lang.structure.structure.ConceptLinkDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String TARGET_TYPE = "targetType";

  public ConceptLinkDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConceptLinkDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptLinkDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptLinkDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptLinkDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptLinkDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptLinkDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(ConceptLinkDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConceptLinkDeclaration.NAME, value);
  }

  public ConceptDeclaration getTargetType() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.class, ConceptLinkDeclaration.TARGET_TYPE);
  }

  public void setTargetType(ConceptDeclaration node) {
    super.setReferent(ConceptLinkDeclaration.TARGET_TYPE, node);
  }


  public static ConceptLinkDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptLinkDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.ConceptLinkDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptLinkDeclaration newInstance(SModel sm) {
    return ConceptLinkDeclaration.newInstance(sm, false);
  }

}
