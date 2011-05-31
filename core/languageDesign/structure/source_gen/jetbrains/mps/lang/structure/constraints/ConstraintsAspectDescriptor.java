package jetbrains.mps.lang.structure.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", "jetbrains.mps.lang.structure.structure.AggregationConceptLink", "jetbrains.mps.lang.structure.structure.AggregationConceptLinkDeclaration", "jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration", "jetbrains.mps.lang.structure.structure.BooleanConceptProperty", "jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration", "jetbrains.mps.lang.structure.structure.ConceptDeclaration", "jetbrains.mps.lang.structure.structure.ConceptLink", "jetbrains.mps.lang.structure.structure.ConceptLinkDeclaration", "jetbrains.mps.lang.structure.structure.ConceptProperty", "jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration", "jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration", "jetbrains.mps.lang.structure.structure.DataTypeDeclaration", "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation", "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration", "jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration", "jetbrains.mps.lang.structure.structure.IConceptAspect", "jetbrains.mps.lang.structure.structure.IStructureDeprecatable", "jetbrains.mps.lang.structure.structure.IntegerConceptProperty", "jetbrains.mps.lang.structure.structure.IntegerConceptPropertyDeclaration", "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration", "jetbrains.mps.lang.structure.structure.InterfaceConceptReference", "jetbrains.mps.lang.structure.structure.LinkDeclaration", "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration", "jetbrains.mps.lang.structure.structure.PropertyDeclaration", "jetbrains.mps.lang.structure.structure.ReferenceConceptLink", "jetbrains.mps.lang.structure.structure.ReferenceConceptLinkDeclaration", "jetbrains.mps.lang.structure.structure.StringConceptProperty", "jetbrains.mps.lang.structure.structure.StringConceptPropertyDeclaration"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 6:
        return new DataHolderConstraintsDescriptor(new ConceptDeclaration_Constraints());
      case 22:
        return new DataHolderConstraintsDescriptor(new LinkDeclaration_Constraints());
      case 24:
        return new DataHolderConstraintsDescriptor(new PropertyDeclaration_Constraints());
      case 12:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.DataTypeDeclaration"));
      case 14:
        return new DataHolderConstraintsDescriptor(new EnumerationDataTypeDeclaration_Constraints());
      case 11:
        return new DataHolderConstraintsDescriptor(new ConstrainedDataTypeDeclaration_Constraints());
      case 15:
        return new DataHolderConstraintsDescriptor(new EnumerationMemberDeclaration_Constraints());
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration"));
      case 10:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration"));
      case 19:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.IntegerConceptPropertyDeclaration"));
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration"));
      case 28:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.StringConceptPropertyDeclaration"));
      case 9:
        return new DataHolderConstraintsDescriptor(new ConceptProperty_Constraints());
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.IntegerConceptProperty"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.BooleanConceptProperty"));
      case 27:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.StringConceptProperty"));
      case 8:
        return new DataHolderConstraintsDescriptor(new ConceptLinkDeclaration_Constraints());
      case 7:
        return new DataHolderConstraintsDescriptor(new ConceptLink_Constraints());
      case 25:
        return new DataHolderConstraintsDescriptor(new ReferenceConceptLink_Constraints());
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.AggregationConceptLink"));
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.AggregationConceptLinkDeclaration"));
      case 26:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.ReferenceConceptLinkDeclaration"));
      case 3:
        return new DataHolderConstraintsDescriptor(new AnnotationLinkDeclaration_Constraints());
      case 0:
        return new DataHolderConstraintsDescriptor(new AbstractConceptDeclaration_Constraints());
      case 20:
        return new DataHolderConstraintsDescriptor(new InterfaceConceptDeclaration_Constraints());
      case 21:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.InterfaceConceptReference"));
      case 13:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"));
      case 17:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.IStructureDeprecatable"));
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.structure.structure.IConceptAspect"));
      default:
        return null;
    }
  }
}
