package jetbrains.mps.debugger.java.evaluation.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseVariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LowLevelVariableReference extends BaseVariableReference {
  public static final String concept = "jetbrains.mps.debugger.java.evaluation.structure.LowLevelVariableReference";

  public LowLevelVariableReference(SNode node) {
    super(node);
  }

  public LowLevelVariable getVariableDeclaration() {
    return this.ensureAdapter(LowLevelVariable.class, "baseVariableDeclaration", this.getBaseVariableDeclaration());
  }

  public void setVariableDeclaration(LowLevelVariable node) {
    this.setBaseVariableDeclaration(node);
  }

  public static LowLevelVariableReference newInstance(SModel sm, boolean init) {
    return (LowLevelVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debugger.java.evaluation.structure.LowLevelVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LowLevelVariableReference newInstance(SModel sm) {
    return LowLevelVariableReference.newInstance(sm, false);
  }
}
