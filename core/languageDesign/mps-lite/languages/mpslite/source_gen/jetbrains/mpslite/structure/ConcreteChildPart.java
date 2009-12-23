package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConcreteChildPart extends ChildPart implements INamedConcept {
  public static final String concept = "jetbrains.mpslite.structure.ConcreteChildPart";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONCEPT_REFERENCE = "conceptReference";

  public ConcreteChildPart(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ConcreteChildPart.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConcreteChildPart.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ConcreteChildPart.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConcreteChildPart.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConcreteChildPart.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConcreteChildPart.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConcreteChildPart.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConcreteChildPart.VIRTUAL_PACKAGE, value);
  }

  public AbstractConceptReference getConceptReference() {
    return (AbstractConceptReference) this.getChild(AbstractConceptReference.class, ConcreteChildPart.CONCEPT_REFERENCE);
  }

  public void setConceptReference(AbstractConceptReference node) {
    super.setChild(ConcreteChildPart.CONCEPT_REFERENCE, node);
  }

  public static ConcreteChildPart newInstance(SModel sm, boolean init) {
    return (ConcreteChildPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.ConcreteChildPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConcreteChildPart newInstance(SModel sm) {
    return ConcreteChildPart.newInstance(sm, false);
  }
}
