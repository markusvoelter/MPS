package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_BaseMethodDeclaration_InferenceRule implements InferenceRule_Runtime {

  public typeOf_BaseMethodDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode bmd) {
    for(SNode throwsItem : SLinkOperations.getTargets(bmd, "throwsItem", true)) {
      {
        SNode _nodeToCheck_1029348928467 = bmd;
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(throwsItem, new QuotationClass_103().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1215105338790", false, 0);
      }
    }
    // ==========
    if (SLinkOperations.getTarget(bmd, "body", true) == null) {
      return;
    }
    if (SConceptPropertyOperations.getBoolean(bmd, "abstract")) {
      return;
    }
    if (SNodeOperations.isInstanceOf(bmd, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SPropertyOperations.getBoolean(bmd, "isAbstract")) {
      return;
    }
    // =============
    SNode expectedRetType = SLinkOperations.getTarget(bmd, "returnType", true);
    if (SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(expectedRetType), "jetbrains.mps.baseLanguage.structure.Type") || SNodeOperations.isInstanceOf(expectedRetType, "jetbrains.mps.baseLanguage.structure.VoidType") || SNodeOperations.isInstanceOf(bmd, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration")) {
      // actually - no return type
      expectedRetType = null;
    }
    // =============
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(bmd, "body", true));
    if (expectedRetType == null) {
      // shouldn't return any values
      for(SNode returnStatement : returnStatements) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportTypeError(returnStatement, "no return value expected", "jetbrains.mps.baseLanguage.helgins@5_0", "1216141199216", intentionProvider);
          }
        }
      }
    } else
    {
      // should return subtypes of the 'expected type'
      for(SNode returnStatement : returnStatements) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportTypeError(returnStatement, "should return value", "jetbrains.mps.baseLanguage.helgins@5_0", "1216141199231", intentionProvider);
          }
        } else
        {
          SNode returnType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(returnStatement, "expression", true), "jetbrains.mps.baseLanguage.helgins", "1178765405776", true);
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
            TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(returnType, expectedRetType, _nodeToCheck_1029348928467, "" + expectedRetType + " is expected", "jetbrains.mps.baseLanguage.helgins", "1185363921400", false, 0);
          }
        }
      }
    }
    // =============
    if (expectedRetType != null) {
      // last expression statement can serve as return statement
      SNode lastStatement = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(bmd, "body", true), "statement", true)).last();
      if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode returnType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(lastStatement, "expression", true), "jetbrains.mps.baseLanguage.helgins", "1178765601477", true);
        {
          SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(lastStatement, "expression", true);
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(returnType, expectedRetType, _nodeToCheck_1029348928467, expectedRetType + " is expected", "jetbrains.mps.baseLanguage.helgins", "1185363855090", false, 0);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
