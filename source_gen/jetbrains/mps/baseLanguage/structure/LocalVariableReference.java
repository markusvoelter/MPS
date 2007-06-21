package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LocalVariableReference extends VariableReference {

  public  LocalVariableReference(SNode node) {
    super(node);
  }

  public static LocalVariableReference newInstance(SModel sm, boolean init) {
    return (LocalVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.LocalVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LocalVariableReference newInstance(SModel sm) {
    return LocalVariableReference.newInstance(sm, false);
  }

  public LocalVariableDeclaration getLocalVariableDeclaration() {
    return (LocalVariableDeclaration)this.getVariableDeclaration();
  }
  public void setLocalVariableDeclaration(LocalVariableDeclaration node) {
    this.setVariableDeclaration(node);
  }
}
