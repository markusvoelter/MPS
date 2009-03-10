package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.ConceptFunctionParameter_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptFunctionParameter_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_ConceptFunctionParameter_NonTypesystemRule() {
  }

  public void applyRule(final SNode parameter, final TypeCheckingContext typeCheckingContext) {
    SNode conceptFunction = SNodeOperations.getAncestor(parameter, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    if (SNodeOperations.isInstanceOf(conceptFunction, "jetbrains.mps.baseLanguage.structure.Closure")) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(parameter, "concept function parameter can not be used in closure", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1197313614703", intentionProvider, errorTarget);
      }
    } else
    {
      final SNode parameterConcept = SNodeOperations.getConceptDeclaration(parameter);
      Iterable<SNode> seq = ListSequence.fromList(ConceptFunction_Behavior.call_getParameters_1213877374450(conceptFunction)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(it));
        }

      });
      if (Sequence.fromIterable(seq).isEmpty() && ConceptFunctionParameter_Behavior.call_needConceptFunction_1236687728308(parameter)) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(parameter, "not applicable in this context", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1197313958459", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
