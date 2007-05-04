package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StaticFieldDeclaration extends VariableDeclaration implements ClassifierMember {
  public static String VISIBILITY = "visibility";

  public  StaticFieldDeclaration(SNode node) {
    super(node);
  }

  public static StaticFieldDeclaration newInstance(SModel sm, boolean init) {
    return (StaticFieldDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.StaticFieldDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static StaticFieldDeclaration newInstance(SModel sm) {
    return StaticFieldDeclaration.newInstance(sm, false);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(StaticFieldDeclaration.VISIBILITY);
  }
  public void setVisibility(Visibility node) {
    super.setChild(StaticFieldDeclaration.VISIBILITY, node);
  }
}
