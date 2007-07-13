package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchParensRegexp extends Regexp implements INamedConcept {
  public static String NAME = "name";
  public static String REGEXP = "regexp";

  public  MatchParensRegexp(SNode node) {
    super(node);
  }

  public static MatchParensRegexp newInstance(SModel sm, boolean init) {
    return (MatchParensRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.MatchParensRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static MatchParensRegexp newInstance(SModel sm) {
    return MatchParensRegexp.newInstance(sm, false);
  }

  public String getName() {
    return this.getProperty(MatchParensRegexp.NAME);
  }
  public void setName(String value) {
    this.setProperty(MatchParensRegexp.NAME, value);
  }
  public Regexp getRegexp() {
    return (Regexp)this.getChild(MatchParensRegexp.REGEXP);
  }
  public void setRegexp(Regexp node) {
    super.setChild(MatchParensRegexp.REGEXP, node);
  }
}
