package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UnicodeCharacterRegexp extends Regexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.UnicodeCharacterRegexp";
  public static final String CODE = "code";

  public UnicodeCharacterRegexp(SNode node) {
    super(node);
  }

  public String getCode() {
    return this.getProperty(UnicodeCharacterRegexp.CODE);
  }

  public void setCode(String value) {
    this.setProperty(UnicodeCharacterRegexp.CODE, value);
  }

  public static UnicodeCharacterRegexp newInstance(SModel sm, boolean init) {
    return (UnicodeCharacterRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.UnicodeCharacterRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UnicodeCharacterRegexp newInstance(SModel sm) {
    return UnicodeCharacterRegexp.newInstance(sm, false);
  }
}
