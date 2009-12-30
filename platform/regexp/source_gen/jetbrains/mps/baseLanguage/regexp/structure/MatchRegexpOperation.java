package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchRegexpOperation extends BaseConcept implements IOperation, RegexpUsingConstruction {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String REGEXP = "regexp";

  public MatchRegexpOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(MatchRegexpOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MatchRegexpOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MatchRegexpOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MatchRegexpOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MatchRegexpOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MatchRegexpOperation.VIRTUAL_PACKAGE, value);
  }

  public RegexpExpression getRegexp() {
    return (RegexpExpression) this.getChild(RegexpExpression.class, MatchRegexpOperation.REGEXP);
  }

  public void setRegexp(RegexpExpression node) {
    super.setChild(MatchRegexpOperation.REGEXP, node);
  }

  public static MatchRegexpOperation newInstance(SModel sm, boolean init) {
    return (MatchRegexpOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatchRegexpOperation newInstance(SModel sm) {
    return MatchRegexpOperation.newInstance(sm, false);
  }
}
