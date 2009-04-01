package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IStructureDeprecatable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptPropertyDeclaration extends BaseConcept implements INamedConcept, IStructureDeprecatable {
  public static final String concept = "jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String INHERITABLE = "inheritable";

  public ConceptPropertyDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConceptPropertyDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptPropertyDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptPropertyDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptPropertyDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptPropertyDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptPropertyDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(ConceptPropertyDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConceptPropertyDeclaration.NAME, value);
  }

  public boolean getInheritable() {
    return this.getBooleanProperty(ConceptPropertyDeclaration.INHERITABLE);
  }

  public void setInheritable(boolean value) {
    this.setBooleanProperty(ConceptPropertyDeclaration.INHERITABLE, value);
  }


  public static ConceptPropertyDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptPropertyDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptPropertyDeclaration newInstance(SModel sm) {
    return ConceptPropertyDeclaration.newInstance(sm, false);
  }

}
