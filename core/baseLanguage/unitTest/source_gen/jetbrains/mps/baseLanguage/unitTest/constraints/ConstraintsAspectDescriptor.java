package jetbrains.mps.baseLanguage.unitTest.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals", "jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse", "jetbrains.mps.baseLanguage.unitTest.structure.AssertInNotNull", "jetbrains.mps.baseLanguage.unitTest.structure.AssertIsNull", "jetbrains.mps.baseLanguage.unitTest.structure.AssertSame", "jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows", "jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue", "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase", "jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert", "jetbrains.mps.baseLanguage.unitTest.structure.Fail", "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.baseLanguage.unitTest.structure.ITestable", "jetbrains.mps.baseLanguage.unitTest.structure.Message", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder", "jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", "jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 15:
        return new DataHolderConstraintsDescriptor(new TestMethod_Constraints());
      case 7:
        return new DataHolderConstraintsDescriptor(new BTestCase_Constraints());
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList"));
      case 0:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals"));
      case 6:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue"));
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertSame"));
      case 9:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.Fail"));
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertIsNull"));
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows"));
      case 13:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.Message"));
      case 14:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"));
      case 12:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.ITestable"));
      case 10:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"));
      case 11:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"));
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.AssertInNotNull"));
      case 8:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert"));
      default:
        return null;
    }
  }
}
