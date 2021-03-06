package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InputNode_C extends InputNode_B {
  public static final String concept = "jetbrains.mps.transformation.test.inputLang.structure.InputNode_C";

  public InputNode_C(SNode node) {
    super(node);
  }

  public static InputNode_C newInstance(SModel sm, boolean init) {
    return (InputNode_C) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.inputLang.structure.InputNode_C", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputNode_C newInstance(SModel sm) {
    return InputNode_C.newInstance(sm, false);
  }
}
