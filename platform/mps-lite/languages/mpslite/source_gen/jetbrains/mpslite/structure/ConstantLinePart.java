package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstantLinePart extends LinePart {
  public static String TEXT = "text";

  public  ConstantLinePart(SNode node) {
    super(node);
  }

  public static ConstantLinePart newInstance(SModel sm, boolean init) {
    return (ConstantLinePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.ConstantLinePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstantLinePart newInstance(SModel sm) {
    return ConstantLinePart.newInstance(sm, false);
  }


  public String getText() {
    return this.getProperty(ConstantLinePart.TEXT);
  }

  public void setText(String value) {
    this.setProperty(ConstantLinePart.TEXT, value);
  }

}
