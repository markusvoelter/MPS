package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.ClassifierMember;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Visibility;

public class ConstructorDeclaration extends BaseMethodDeclaration implements ClassifierMember {
  public static String VISIBILITY = "visibility";

  public  ConstructorDeclaration(SNode node) {
    super(node);
  }

  public static ConstructorDeclaration newInstance(SModel sm, boolean init) {
    return (ConstructorDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ConstructorDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConstructorDeclaration newInstance(SModel sm) {
    return ConstructorDeclaration.newInstance(sm, false);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(ConstructorDeclaration.VISIBILITY);
  }
  public void setVisibility(Visibility node) {
    super.setChild(ConstructorDeclaration.VISIBILITY, node);
  }
}
