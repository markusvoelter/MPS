package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SideTransformVariableReference extends VariableReference {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransformVariableReference";

  public SideTransformVariableReference(SNode node) {
    super(node);
  }

  public static SideTransformVariableReference newInstance(SModel sm, boolean init) {
    return (SideTransformVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransformVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SideTransformVariableReference newInstance(SModel sm) {
    return SideTransformVariableReference.newInstance(sm, false);
  }


  public SideTransformVariableDeclaration getRightTransformVariableDeclaration() {
    return (SideTransformVariableDeclaration)this.getVariableDeclaration();
  }

  public void setRightTransformVariableDeclaration(SideTransformVariableDeclaration node) {
    this.setVariableDeclaration(node);
  }

}
