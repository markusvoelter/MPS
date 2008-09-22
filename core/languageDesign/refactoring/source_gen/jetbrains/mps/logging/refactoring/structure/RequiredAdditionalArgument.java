package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RequiredAdditionalArgument extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument";
  public static String PRESENTATION = "presentation";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String ARGUMENT_TYPE = "argumentType";

  public RequiredAdditionalArgument(SNode node) {
    super(node);
  }

  public String getPresentation() {
    return this.getProperty(RequiredAdditionalArgument.PRESENTATION);
  }

  public void setPresentation(String value) {
    this.setProperty(RequiredAdditionalArgument.PRESENTATION, value);
  }

  public String getName() {
    return this.getProperty(RequiredAdditionalArgument.NAME);
  }

  public void setName(String value) {
    this.setProperty(RequiredAdditionalArgument.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(RequiredAdditionalArgument.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RequiredAdditionalArgument.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RequiredAdditionalArgument.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RequiredAdditionalArgument.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RequiredAdditionalArgument.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RequiredAdditionalArgument.VIRTUAL_PACKAGE, value);
  }

  public Type getArgumentType() {
    return (Type)this.getChild(RequiredAdditionalArgument.ARGUMENT_TYPE);
  }

  public void setArgumentType(Type node) {
    super.setChild(RequiredAdditionalArgument.ARGUMENT_TYPE, node);
  }


  public static RequiredAdditionalArgument newInstance(SModel sm, boolean init) {
    return (RequiredAdditionalArgument)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RequiredAdditionalArgument newInstance(SModel sm) {
    return RequiredAdditionalArgument.newInstance(sm, false);
  }

}
