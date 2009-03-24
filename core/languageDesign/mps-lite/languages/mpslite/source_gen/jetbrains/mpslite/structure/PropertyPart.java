package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyPart extends jetbrains.mpslite.structure.LinePart {
  public static final String concept = "jetbrains.mpslite.structure.PropertyPart";

  public PropertyPart(SNode node) {
    super(node);
  }

  public static PropertyPart newInstance(SModel sm, boolean init) {
    return (PropertyPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.PropertyPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyPart newInstance(SModel sm) {
    return PropertyPart.newInstance(sm, false);
  }

}
