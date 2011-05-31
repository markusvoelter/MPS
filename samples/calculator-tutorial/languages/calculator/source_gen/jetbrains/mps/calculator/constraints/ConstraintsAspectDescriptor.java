package jetbrains.mps.calculator.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.calculator.structure.Calculator", "jetbrains.mps.calculator.structure.InputField", "jetbrains.mps.calculator.structure.InputFieldReference", "jetbrains.mps.calculator.structure.OutputField"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 0:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.calculator.structure.Calculator"));
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.calculator.structure.InputField"));
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.calculator.structure.OutputField"));
      case 2:
        return new DataHolderConstraintsDescriptor(new InputFieldReference_Constraints());
      default:
        return null;
    }
  }
}
