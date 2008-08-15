package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptFunctionParameter_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_ConceptFunctionParameter_NonTypesystemRule() {
  }

  public void applyRule(final SNode parameter) {
    SNode conceptFunction = SNodeOperations.getAncestor(parameter, "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, false);
    if (SNodeOperations.isInstanceOf(conceptFunction, "jetbrains.mps.baseLanguage.structure.Closure")) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(parameter, "concept function parameter can not be used in closure", "jetbrains.mps.baseLanguage.helgins@3_0", "1218797715708", intentionProvider);
      }
    } else
    {
      final SNode parameterConcept = SNodeOperations.getConceptDeclaration(parameter);
      Iterable<SNode> seq = ListSequence.fromList(ConceptFunction_Behavior.call_getParameters_1213877374450(conceptFunction)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(it));
        }

      });
      if (Sequence.fromIterable(seq).isEmpty()) {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(parameter, "not applicable in this context", "jetbrains.mps.baseLanguage.helgins@3_0", "1218797715741", intentionProvider);
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
