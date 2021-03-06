package jetbrains.mps.ui.internal.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.ui.internal.structure.AuxObjectHandler", "jetbrains.mps.ui.internal.structure.ContextBindingWrapper", "jetbrains.mps.ui.internal.structure.ContextCompartmentWrapper", "jetbrains.mps.ui.internal.structure.ContextControllerWrapper", "jetbrains.mps.ui.internal.structure.ContextViewWrapper", "jetbrains.mps.ui.internal.structure.ContextWrapper", "jetbrains.mps.ui.internal.structure.ContextWrapperExpression", "jetbrains.mps.ui.internal.structure.ExpressionStub", "jetbrains.mps.ui.internal.structure.GeometryHandler", "jetbrains.mps.ui.internal.structure.StatementStub", "jetbrains.mps.ui.internal.structure.TypeStub"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 1:
        return new ContextBindingWrapper_BehaviorDescriptor();
      case 5:
        return new ContextWrapper_BehaviorDescriptor();
      case 4:
        return new ContextViewWrapper_BehaviorDescriptor();
      case 2:
        return new ContextCompartmentWrapper_BehaviorDescriptor();
      case 3:
        return new ContextControllerWrapper_BehaviorDescriptor();
      case 0:
        return new AuxObjectHandler_BehaviorDescriptor();
      case 8:
        return new GeometryHandler_BehaviorDescriptor();
      case 6:
        return new ContextWrapperExpression_BehaviorDescriptor();
      case 10:
        return new TypeStub_BehaviorDescriptor();
      case 7:
        return new ExpressionStub_BehaviorDescriptor();
      case 9:
        return new StatementStub_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
