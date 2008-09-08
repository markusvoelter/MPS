package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StringLiteralRegexp extends Regexp {
  public static final String concept = "jetbrains.mps.regexp.structure.StringLiteralRegexp";
  public static String TEXT = "text";

  public StringLiteralRegexp(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(StringLiteralRegexp.TEXT);
  }

  public void setText(String value) {
    this.setProperty(StringLiteralRegexp.TEXT, value);
  }


  public static StringLiteralRegexp newInstance(SModel sm, boolean init) {
    return (StringLiteralRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.structure.StringLiteralRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StringLiteralRegexp newInstance(SModel sm) {
    return StringLiteralRegexp.newInstance(sm, false);
  }

}
