package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration;

public class LocalStaticFieldReference extends VariableReference {

  public  LocalStaticFieldReference(SNode node) {
    super(node);
  }

  public static LocalStaticFieldReference newInstance(SModel sm, boolean init) {
    return (LocalStaticFieldReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.LocalStaticFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LocalStaticFieldReference newInstance(SModel sm) {
    return LocalStaticFieldReference.newInstance(sm, false);
  }

  public StaticFieldDeclaration getStaticFieldDeclaration() {
    return (StaticFieldDeclaration)this.getVariableDeclaration();
  }
  public void setStaticFieldDeclaration(StaticFieldDeclaration node) {
    this.setVariableDeclaration(node);
  }
}
