package jetbrains.mps.lang.behavior.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodCall;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LocalBehaviorMethodCall extends BaseMethodCall {
  public static final String concept = "jetbrains.mps.lang.behavior.structure.LocalBehaviorMethodCall";

  public LocalBehaviorMethodCall(SNode node) {
    super(node);
  }

  public ConceptMethodDeclaration getDeclaration() {
    return this.ensureAdapter(ConceptMethodDeclaration.class, "baseMethodDeclaration", this.getBaseMethodDeclaration());
  }

  public void setDeclaration(ConceptMethodDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }

  public static LocalBehaviorMethodCall newInstance(SModel sm, boolean init) {
    return (LocalBehaviorMethodCall) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.LocalBehaviorMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LocalBehaviorMethodCall newInstance(SModel sm) {
    return LocalBehaviorMethodCall.newInstance(sm, false);
  }
}
