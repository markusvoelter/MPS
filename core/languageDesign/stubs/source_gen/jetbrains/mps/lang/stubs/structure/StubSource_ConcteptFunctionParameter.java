package jetbrains.mps.lang.stubs.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StubSource_ConcteptFunctionParameter extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.stubs.structure.StubSource_ConcteptFunctionParameter";

  public StubSource_ConcteptFunctionParameter(SNode node) {
    super(node);
  }

  public static StubSource_ConcteptFunctionParameter newInstance(SModel sm, boolean init) {
    return (StubSource_ConcteptFunctionParameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.stubs.structure.StubSource_ConcteptFunctionParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StubSource_ConcteptFunctionParameter newInstance(SModel sm) {
    return StubSource_ConcteptFunctionParameter.newInstance(sm, false);
  }
}
