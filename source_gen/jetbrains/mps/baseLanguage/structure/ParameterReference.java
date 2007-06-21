package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParameterReference extends VariableReference {

  public  ParameterReference(SNode node) {
    super(node);
  }

  public static ParameterReference newInstance(SModel sm, boolean init) {
    return (ParameterReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ParameterReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ParameterReference newInstance(SModel sm) {
    return ParameterReference.newInstance(sm, false);
  }

  public ParameterDeclaration getParameterDeclaration() {
    return (ParameterDeclaration)this.getVariableDeclaration();
  }
  public void setParameterDeclaration(ParameterDeclaration node) {
    this.setVariableDeclaration(node);
  }
}
