package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.smodel.SModelUtil_new;

public class set_type_equivalent_to_subconcepts_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public set_type_equivalent_to_subconcepts_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    if (!(SConceptOperations.isSubConceptOf(SNodeOperations.getConceptDeclaration(subtype), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(supertype))))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "Incompatible types", "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240249913658", intentionProvider, errorTarget);
      _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
    }
    {
      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1241473625701", 0, intentionProvider);
      _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
      typeCheckingContext.createEquation((SNode)SLinkOperations.getTarget(subtype, "elementType", true), (SNode)SLinkOperations.getTarget(supertype, "elementType", true), _info_12389875345);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    if (!(SConceptOperations.isSubConceptOf(SNodeOperations.getConceptDeclaration(subtype), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(supertype))))) {
      result_14532009 = false;
    }
    result_14532009 = result_14532009 && MatchingUtil.matchNodes((SNode)SLinkOperations.getTarget(subtype, "elementType", true), (SNode)SLinkOperations.getTarget(supertype, "elementType", true));
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicableSubtype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
  }

  public boolean isApplicableSupertype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SetType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SetType";
  }
}
