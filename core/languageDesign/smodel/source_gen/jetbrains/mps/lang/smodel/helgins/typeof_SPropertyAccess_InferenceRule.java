package jetbrains.mps.lang.smodel.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SPropertyAccess_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SPropertyAccess_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedCorrectly_generic(typeCheckingContext, op);
    if ((SLinkOperations.getTarget(op, "property", false) != null)) {
      final SNode Concept_typevar_1186062582563 = typeCheckingContext.createNewRuntimeTypesVariable();
      RulesUtil.equate_inputNodeConcept(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1186062582563));
      {
        final SNode C = typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1186062582563);
        TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

          public void run() {
            SNode inputNodeConcept = typeCheckingContext.getEquationManager().getRepresentator(C);
            List<SNode> declaredProperties = AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1213877394546(inputNodeConcept);
            SNode property = SLinkOperations.getTarget(op, "property", false);
            String conceptName = SPropertyOperations.getString(inputNodeConcept, "name");
            if (!(ListSequence.fromList(declaredProperties).contains(property))) {
              TypeChecker.getInstance().reportTypeError(op, "access to property '" + SPropertyOperations.getString(property, "name") + "' is not expected for an instance of " + conceptName, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1186062616321");
            }
          }

        }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1186062603529");
      }
    }
    SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(op, "property", false), "dataType", false);
    if (dataType != null) {
      {
        SNode _nodeToCheck_1029348928467 = op;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1203712090792", true), DataTypeDeclaration_Behavior.call_toBaseLanguageType_1213877229718(dataType), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.helgins)", "1203712090790", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SPropertyAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
