package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;

public class check_VariableArityType_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_VariableArityType_NonTypesystemRule() {
  }

  public void applyRule(final SNode variableArityType, final TypeCheckingContext typeCheckingContext) {
    do {
      SNode matchedNode_2 = SNodeOperations.getParent(variableArityType);
      {
        boolean matches_2 = false;
        {
          SNode matchingNode_2 = SNodeOperations.getParent(variableArityType);
          if (matchingNode_2 != null) {
            matches_2 = SModelUtil_new.isAssignableConcept(matchingNode_2.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
          }
        }
        if (matches_2) {
          if ((SNodeOperations.getNextSibling(matchedNode_2) != null)) {
            {
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().reportTypeError(matchedNode_2, "parameter of variable arity must be a last one", "r:1222183538981(jetbrains.mps.baseLanguage.helgins@3_0)", "1222183888491", intentionProvider);
            }
          }
          break;
        }
      }
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(variableArityType, "variable arity types should only be used in method parameters", "r:1222183538981(jetbrains.mps.baseLanguage.helgins@3_0)", "1222183888497", intentionProvider);
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.VariableArityType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
