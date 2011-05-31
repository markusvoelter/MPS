package jetbrains.mps.baseLanguage.builders.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.baseLanguage.builders.structure.AsBuilderStatement", "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder", "jetbrains.mps.baseLanguage.builders.structure.BaseSimpleBuilderDeclaration", "jetbrains.mps.baseLanguage.builders.structure.BeanBuilder", "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder", "jetbrains.mps.baseLanguage.builders.structure.Builder", "jetbrains.mps.baseLanguage.builders.structure.BuilderContainer", "jetbrains.mps.baseLanguage.builders.structure.BuilderCreator", "jetbrains.mps.baseLanguage.builders.structure.BuilderStatement", "jetbrains.mps.baseLanguage.builders.structure.ResultExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilder", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderChild", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderChildExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderDeclaration", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderExtensionDeclaration", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameter", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameterReference", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParentExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderProperty", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyParent", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyValue", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilders"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.Builder"));
      case 7:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.BuilderCreator"));
      case 8:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.BuilderStatement"));
      case 9:
        return new DataHolderConstraintsDescriptor(new ResultExpression_Constraints());
      case 24:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilders"));
      case 11:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderChild"));
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParentExpression"));
      case 12:
        return new DataHolderConstraintsDescriptor(new SimpleBuilderChildExpression_Constraints());
      case 14:
        return new DataHolderConstraintsDescriptor(new SimpleBuilderExpression_Constraints());
      case 13:
        return new DataHolderConstraintsDescriptor(new SimpleBuilderDeclaration_Constraints());
      case 10:
        return new DataHolderConstraintsDescriptor(new SimpleBuilder_Constraints());
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameter"));
      case 17:
        return new DataHolderConstraintsDescriptor(new SimpleBuilderParameterReference_Constraints());
      case 0:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.AsBuilderStatement"));
      case 6:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.BuilderContainer"));
      case 4:
        return new DataHolderConstraintsDescriptor(new BeanPropertyBuilder_Constraints());
      case 3:
        return new DataHolderConstraintsDescriptor(new BeanBuilder_Constraints());
      case 1:
        return new DataHolderConstraintsDescriptor(new AsTypeBuilder_Constraints());
      case 19:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderProperty"));
      case 21:
        return new DataHolderConstraintsDescriptor(new SimpleBuilderPropertyExpression_Constraints());
      case 22:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyParent"));
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyValue"));
      case 20:
        return new DataHolderConstraintsDescriptor(new SimpleBuilderPropertyBuilder_Constraints());
      case 2:
        return new DataHolderConstraintsDescriptor(new BaseSimpleBuilderDeclaration_Constraints());
      case 15:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderExtensionDeclaration"));
      default:
        return null;
    }
  }
}
