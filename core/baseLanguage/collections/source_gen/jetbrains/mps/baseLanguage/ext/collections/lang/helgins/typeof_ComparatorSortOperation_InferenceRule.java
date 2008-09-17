package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ComparatorSortOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_ComparatorSortOperation_InferenceRule() {
  }

  public void applyRule(final SNode cso) {
    final SNode paramType_typevar_1209728259188 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    final SNode resType_typevar_1209728259189 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = cso;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(cso, "closure", true), "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259192", true), new QuotationClass_80().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(paramType_typevar_1209728259188), TypeChecker.getInstance().getEquationManager().getRepresentator(paramType_typevar_1209728259188), TypeChecker.getInstance().getEquationManager().getRepresentator(resType_typevar_1209728259189)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259190", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = cso;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(resType_typevar_1209728259189), new QuotationClass_81().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259205", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = cso;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(cso, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259213", true), new QuotationClass_82().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(paramType_typevar_1209728259188)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259211", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = cso;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(cso, "ascending", true), "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259224", true), new QuotationClass_83().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1209728259222", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ComparatorSortOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
