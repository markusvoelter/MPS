package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.build.generictasks.structure.Attribute", "jetbrains.mps.build.generictasks.structure.AttributeDeclaration", "jetbrains.mps.build.generictasks.structure.BuiltInTaskDeclaration", "jetbrains.mps.build.generictasks.structure.ITaskDeclaration", "jetbrains.mps.build.generictasks.structure.NestedDeclaration", "jetbrains.mps.build.generictasks.structure.PathReference", "jetbrains.mps.build.generictasks.structure.TaskCall", "jetbrains.mps.build.generictasks.structure.TaskInterfaceDeclaration", "jetbrains.mps.build.generictasks.structure.TaskReference"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 0:
        return new DataHolderConstraintsDescriptor(new Attribute_Constraints());
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.generictasks.structure.AttributeDeclaration"));
      case 6:
        return new DataHolderConstraintsDescriptor(new TaskCall_Constraints());
      case 7:
        return new DataHolderConstraintsDescriptor(new TaskInterfaceDeclaration_Constraints());
      case 2:
        return new DataHolderConstraintsDescriptor(new BuiltInTaskDeclaration_Constraints());
      case 4:
        return new DataHolderConstraintsDescriptor(new NestedDeclaration_Constraints());
      case 5:
        return new DataHolderConstraintsDescriptor(new PathReference_Constraints());
      case 8:
        return new DataHolderConstraintsDescriptor(new TaskReference_Constraints());
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.generictasks.structure.ITaskDeclaration"));
      default:
        return null;
    }
  }
}
