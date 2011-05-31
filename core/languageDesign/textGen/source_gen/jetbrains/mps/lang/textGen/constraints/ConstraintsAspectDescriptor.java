package jetbrains.mps.lang.textGen.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.textGen.structure.AbstractAppendPart", "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration", "jetbrains.mps.lang.textGen.structure.AbstractTextGenParameter", "jetbrains.mps.lang.textGen.structure.AppendOperation", "jetbrains.mps.lang.textGen.structure.BufferParameter", "jetbrains.mps.lang.textGen.structure.CollectionAppendPart", "jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration", "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart", "jetbrains.mps.lang.textGen.structure.ContextParameter", "jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation", "jetbrains.mps.lang.textGen.structure.EncodingDeclaration", "jetbrains.mps.lang.textGen.structure.EncodingDeclarationBase", "jetbrains.mps.lang.textGen.structure.EncodingLiteral", "jetbrains.mps.lang.textGen.structure.ExtensionDeclaration", "jetbrains.mps.lang.textGen.structure.FoundErrorOperation", "jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration", "jetbrains.mps.lang.textGen.structure.IncreaseDepthOperation", "jetbrains.mps.lang.textGen.structure.IndentBufferOperation", "jetbrains.mps.lang.textGen.structure.InfoAppendPart", "jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration", "jetbrains.mps.lang.textGen.structure.NewLineAppendPart", "jetbrains.mps.lang.textGen.structure.NodeAppendPart", "jetbrains.mps.lang.textGen.structure.NodeParameter", "jetbrains.mps.lang.textGen.structure.OperationCall", "jetbrains.mps.lang.textGen.structure.OperationDeclaration", "jetbrains.mps.lang.textGen.structure.ReferenceAppendPart", "jetbrains.mps.lang.textGen.structure.ScopeConcept", "jetbrains.mps.lang.textGen.structure.SimpleTextGenOperation", "jetbrains.mps.lang.textGen.structure.TraceableConcept", "jetbrains.mps.lang.textGen.structure.UnitConcept", "jetbrains.mps.lang.textGen.structure.UtilityMethodCall", "jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration", "jetbrains.mps.lang.textGen.structure.WithIndentOperation"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 6:
        return new DataHolderConstraintsDescriptor(new ConceptTextGenDeclaration_Constraints());
      case 22:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.NodeParameter"));
      case 15:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration"));
      case 27:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.SimpleTextGenOperation"));
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.IncreaseDepthOperation"));
      case 9:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation"));
      case 17:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.IndentBufferOperation"));
      case 19:
        return new DataHolderConstraintsDescriptor(new LanguageTextGenDeclaration_Constraints());
      case 24:
        return new DataHolderConstraintsDescriptor(new OperationDeclaration_Constraints());
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.OperationCall"));
      case 8:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.ContextParameter"));
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.BufferParameter"));
      case 31:
        return new DataHolderConstraintsDescriptor(new UtilityMethodDeclaration_Constraints());
      case 30:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.UtilityMethodCall"));
      case 14:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.FoundErrorOperation"));
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.AbstractTextGenParameter"));
      case 32:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.WithIndentOperation"));
      case 0:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.AbstractAppendPart"));
      case 20:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.NewLineAppendPart"));
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.InfoAppendPart"));
      case 21:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.NodeAppendPart"));
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.CollectionAppendPart"));
      case 7:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart"));
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.AppendOperation"));
      case 13:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.ExtensionDeclaration"));
      case 25:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.ReferenceAppendPart"));
      case 29:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.UnitConcept"));
      case 26:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.ScopeConcept"));
      case 28:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.TraceableConcept"));
      case 12:
        return new DataHolderConstraintsDescriptor(new EncodingLiteral_Constraints());
      case 10:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.EncodingDeclaration"));
      case 11:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.textGen.structure.EncodingDeclarationBase"));
      default:
        return null;
    }
  }
}
