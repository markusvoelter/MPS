package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SymbolClassPart extends BaseConcept implements SymbolClassRegexpAndPart {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassPart";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public SymbolClassPart(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SymbolClassPart.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SymbolClassPart.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SymbolClassPart.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SymbolClassPart.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SymbolClassPart.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SymbolClassPart.VIRTUAL_PACKAGE, value);
  }

  public static SymbolClassPart newInstance(SModel sm, boolean init) {
    return (SymbolClassPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.SymbolClassPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SymbolClassPart newInstance(SModel sm) {
    return SymbolClassPart.newInstance(sm, false);
  }
}
