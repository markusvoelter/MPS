package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration;

public class SPropertyAccess extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess";
  public static String PROPERTY = "property";

  public SPropertyAccess(SNode node) {
    super(node);
  }

  public static SPropertyAccess newInstance(SModel sm, boolean init) {
    return (SPropertyAccess)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SPropertyAccess newInstance(SModel sm) {
    return SPropertyAccess.newInstance(sm, false);
  }


  public PropertyDeclaration getProperty() {
    return (PropertyDeclaration)this.getReferent(SPropertyAccess.PROPERTY);
  }

  public void setProperty(PropertyDeclaration node) {
    super.setReferent(SPropertyAccess.PROPERTY, node);
  }

}
