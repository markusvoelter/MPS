package jetbrains.mps.lang.behavior.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.behavior.structure.ConceptBehavior", "jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration", "jetbrains.mps.lang.behavior.structure.ConceptDeclarationReference", "jetbrains.mps.lang.behavior.structure.ConceptDeclarationsHolder", "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", "jetbrains.mps.lang.behavior.structure.LocalBehaviorMethodCall", "jetbrains.mps.lang.behavior.structure.StaticConceptMethodDeclaration", "jetbrains.mps.lang.behavior.structure.SuperNodeExpression", "jetbrains.mps.lang.behavior.structure.ThisNodeExpression"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 0:
        return new DataHolderConstraintsDescriptor(new ConceptBehavior_Constraints());
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration"));
      case 4:
        return new DataHolderConstraintsDescriptor(new ConceptMethodDeclaration_Constraints());
      case 6:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.behavior.structure.StaticConceptMethodDeclaration"));
      case 7:
        return new DataHolderConstraintsDescriptor(new SuperNodeExpression_Constraints());
      case 8:
        return new DataHolderConstraintsDescriptor(new ThisNodeExpression_Constraints());
      case 5:
        return new DataHolderConstraintsDescriptor(new LocalBehaviorMethodCall_Constraints());
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.behavior.structure.ConceptDeclarationReference"));
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.behavior.structure.ConceptDeclarationsHolder"));
      default:
        return null;
    }
  }
}
