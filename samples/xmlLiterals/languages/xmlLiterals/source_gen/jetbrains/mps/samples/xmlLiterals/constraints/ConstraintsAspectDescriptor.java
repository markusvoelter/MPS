package jetbrains.mps.samples.xmlLiterals.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.samples.xmlLiterals.structure.ElementMacro", "jetbrains.mps.samples.xmlLiterals.structure.TextMacro", "jetbrains.mps.samples.xmlLiterals.structure.XmlLiteral"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.xmlLiterals.structure.XmlLiteral"));
      case 1:
        return new DataHolderConstraintsDescriptor(new TextMacro_Constraints());
      case 0:
        return new DataHolderConstraintsDescriptor(new ElementMacro_Constraints());
      default:
        return null;
    }
  }
}
