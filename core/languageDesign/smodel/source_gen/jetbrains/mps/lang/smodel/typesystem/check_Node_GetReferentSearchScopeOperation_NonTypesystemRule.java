package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_Node_GetReferentSearchScopeOperation_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Node_GetReferentSearchScopeOperation_NonTypesystemRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    // check link role argument 
    final SNode linkDecl = SLinkOperations.getTarget(op, "referenceLink", false);
    if (linkDecl != null) {
      if (!(SPropertyOperations.hasValue(linkDecl, "metaClass", "reference", "reference"))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(op, "reference link is expected", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1226068687986", intentionProvider, errorTarget);
      }
      final SNode Concept_typevar_1226068687995 = typeCheckingContext.createNewRuntimeTypesVariable();
      SNode inputNodeConcept = RulesUtil.get_inputNodeConcept(op, false);
      List<SNode> declaredLinks = AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(inputNodeConcept);
      if (!(ListSequence.fromList(declaredLinks).contains(linkDecl))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(op, "access to link '" + SPropertyOperations.getString(linkDecl, "role") + "' is not expected here", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1226068688014", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_GetReferentSearchScopeOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
