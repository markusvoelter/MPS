package jetbrains.mps.debug.customViewers.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.debug.customViewers.structure.AllElementsOperation", "jetbrains.mps.debug.customViewers.structure.ArrayValueType", "jetbrains.mps.debug.customViewers.structure.CallMethodOperation", "jetbrains.mps.debug.customViewers.structure.CanWrapHighLevelValue_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.CanWrapValue_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.ClassFqNameOperation", "jetbrains.mps.debug.customViewers.structure.ClassNameOperation", "jetbrains.mps.debug.customViewers.structure.CustomViewer", "jetbrains.mps.debug.customViewers.structure.CustomWatchable", "jetbrains.mps.debug.customViewers.structure.CustomWatchablesContainer", "jetbrains.mps.debug.customViewers.structure.ElementOperation", "jetbrains.mps.debug.customViewers.structure.ElementsRangeOperation", "jetbrains.mps.debug.customViewers.structure.FieldOperation", "jetbrains.mps.debug.customViewers.structure.FieldsListOperation", "jetbrains.mps.debug.customViewers.structure.GetHighLevelValuePresentation_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetHighLevelWatchablesBlock_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetValuePresentation_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.GetWatchablesBlock_ConceptFunction", "jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer", "jetbrains.mps.debug.customViewers.structure.HighLevelValue_ConceptFunctionParameter", "jetbrains.mps.debug.customViewers.structure.HighLevelWatchableCreator", "jetbrains.mps.debug.customViewers.structure.IsInstanceOfOperation", "jetbrains.mps.debug.customViewers.structure.JavaValueOperation", "jetbrains.mps.debug.customViewers.structure.ObjectValueType", "jetbrains.mps.debug.customViewers.structure.OriginalValue_ConceptFunctionParameter", "jetbrains.mps.debug.customViewers.structure.PrimitiveValueType", "jetbrains.mps.debug.customViewers.structure.SizeOperation", "jetbrains.mps.debug.customViewers.structure.StringValueOperation", "jetbrains.mps.debug.customViewers.structure.StringValueType", "jetbrains.mps.debug.customViewers.structure.ToProcessMethod", "jetbrains.mps.debug.customViewers.structure.ValueType", "jetbrains.mps.debug.customViewers.structure.WatchableCreator", "jetbrains.mps.debug.customViewers.structure.WatchableListType", "jetbrains.mps.debug.customViewers.structure.WatchableType", "jetbrains.mps.debug.customViewers.structure.WatchablesListCreator"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 30:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.ValueType"));
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.ArrayValueType"));
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.ObjectValueType"));
      case 25:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.PrimitiveValueType"));
      case 8:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.CustomWatchable"));
      case 9:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.CustomWatchablesContainer"));
      case 7:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.CustomViewer"));
      case 33:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.WatchableType"));
      case 31:
        return new DataHolderConstraintsDescriptor(new WatchableCreator_Constraints());
      case 17:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.GetWatchablesBlock_ConceptFunction"));
      case 24:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.OriginalValue_ConceptFunctionParameter"));
      case 13:
        return new DataHolderConstraintsDescriptor(new FieldsListOperation_Constraints());
      case 12:
        return new DataHolderConstraintsDescriptor(new FieldOperation_Constraints());
      case 10:
        return new DataHolderConstraintsDescriptor(new ElementOperation_Constraints());
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.GetValuePresentation_ConceptFunction"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.CanWrapValue_ConceptFunction"));
      case 6:
        return new DataHolderConstraintsDescriptor(new ClassNameOperation_Constraints());
      case 5:
        return new DataHolderConstraintsDescriptor(new ClassFqNameOperation_Constraints());
      case 26:
        return new DataHolderConstraintsDescriptor(new SizeOperation_Constraints());
      case 0:
        return new DataHolderConstraintsDescriptor(new AllElementsOperation_Constraints());
      case 11:
        return new DataHolderConstraintsDescriptor(new ElementsRangeOperation_Constraints());
      case 2:
        return new DataHolderConstraintsDescriptor(new CallMethodOperation_Constraints());
      case 22:
        return new DataHolderConstraintsDescriptor(new JavaValueOperation_Constraints());
      case 28:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.StringValueType"));
      case 27:
        return new DataHolderConstraintsDescriptor(new StringValueOperation_Constraints());
      case 21:
        return new DataHolderConstraintsDescriptor(new IsInstanceOfOperation_Constraints());
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.HighLevelCustomViewer"));
      case 14:
        return new DataHolderConstraintsDescriptor(new GetHighLevelValuePresentation_ConceptFunction_Constraints());
      case 15:
        return new DataHolderConstraintsDescriptor(new GetHighLevelWatchablesBlock_ConceptFunction_Constraints());
      case 3:
        return new DataHolderConstraintsDescriptor(new CanWrapHighLevelValue_ConceptFunction_Constraints());
      case 19:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.HighLevelValue_ConceptFunctionParameter"));
      case 20:
        return new DataHolderConstraintsDescriptor(new HighLevelWatchableCreator_Constraints());
      case 34:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.WatchablesListCreator"));
      case 32:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.WatchableListType"));
      case 29:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.debug.customViewers.structure.ToProcessMethod"));
      default:
        return null;
    }
  }
}
