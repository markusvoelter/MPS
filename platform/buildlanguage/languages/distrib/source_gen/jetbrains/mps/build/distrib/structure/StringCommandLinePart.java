package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StringCommandLinePart extends AbstractCommandLinePart {
  public static final String concept = "jetbrains.mps.build.distrib.structure.StringCommandLinePart";
  public static final String TEXT = "text";

  public StringCommandLinePart(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(StringCommandLinePart.TEXT);
  }

  public void setText(String value) {
    this.setProperty(StringCommandLinePart.TEXT, value);
  }

  public static StringCommandLinePart newInstance(SModel sm, boolean init) {
    return (StringCommandLinePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.StringCommandLinePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StringCommandLinePart newInstance(SModel sm) {
    return StringCommandLinePart.newInstance(sm, false);
  }
}
