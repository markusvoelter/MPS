package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineRegexpExpression extends RegexpExpression {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression";
  public static final String DOT_ALL = "dotAll";
  public static final String MULTI_LINE = "multiLine";
  public static final String CASE_INSENSITIVE = "caseInsensitive";
  public static final String REGEXP = "regexp";

  public InlineRegexpExpression(SNode node) {
    super(node);
  }

  public boolean getDotAll() {
    return this.getBooleanProperty(InlineRegexpExpression.DOT_ALL);
  }

  public void setDotAll(boolean value) {
    this.setBooleanProperty(InlineRegexpExpression.DOT_ALL, value);
  }

  public boolean getMultiLine() {
    return this.getBooleanProperty(InlineRegexpExpression.MULTI_LINE);
  }

  public void setMultiLine(boolean value) {
    this.setBooleanProperty(InlineRegexpExpression.MULTI_LINE, value);
  }

  public boolean getCaseInsensitive() {
    return this.getBooleanProperty(InlineRegexpExpression.CASE_INSENSITIVE);
  }

  public void setCaseInsensitive(boolean value) {
    this.setBooleanProperty(InlineRegexpExpression.CASE_INSENSITIVE, value);
  }

  public Regexp getRegexp() {
    return (Regexp)this.getChild(Regexp.class, InlineRegexpExpression.REGEXP);
  }

  public void setRegexp(Regexp node) {
    super.setChild(InlineRegexpExpression.REGEXP, node);
  }

  public static InlineRegexpExpression newInstance(SModel sm, boolean init) {
    return (InlineRegexpExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineRegexpExpression newInstance(SModel sm) {
    return InlineRegexpExpression.newInstance(sm, false);
  }
}
