package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_FieldReferenceOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_FieldReferenceOperation_InferenceRule() {
  }

  public void applyRule(final SNode fieldReference, final TypeCheckingContext typeCheckingContext) {
    final SNode fieldDeclaration = SLinkOperations.getTarget(fieldReference, "fieldDeclaration", false);
    if ((fieldDeclaration == null)) {
      return;
    }
    final SNode InstanceType_typevar_1206554174334 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(fieldReference);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174335", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174339", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), info);
    }
    final SNode fieldClassifier = SNodeOperations.getAncestor(fieldDeclaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    {
      SNode _nodeToCheck_1029348928467 = fieldReference;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174350", 0, intentionProvider);
      info.setInequationGroup("default");
      typeCheckingContext.createLessThanInequationStrong((SNode)typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), (SNode)new _Quotations.QuotationClass_65().createNode(fieldClassifier, typeCheckingContext), true, info);
    }
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    SNode matchedType = RulesFunctions_BaseLanguage.inference_matchTypeWithTypeVariables(typeCheckingContext, SLinkOperations.getTarget(fieldDeclaration, "type", true), mmap);
    {
      SNode _nodeToCheck_1029348928467 = fieldReference;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174383", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1206554174385", true), (SNode)matchedType, info);
    }
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3254522536313044098", 0, intentionProvider);
      info.setInequationGroup("priority_4_1759628044690732301");
      info.addInequationGroupBefore("default");
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(fieldReference, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3254522536313044095", true), (SNode)new _Quotations.QuotationClass_112().createNode(typeCheckingContext), false, info);
    }
    RulesFunctions_BaseLanguage.inference_matchConcreteTypesWithTypeVariables(typeCheckingContext, fieldClassifier, typeCheckingContext.getEquationManager().getRepresentator(InstanceType_typevar_1206554174334), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
    RulesFunctions_BaseLanguage.inference_setConcreteUpperBorders(typeCheckingContext, mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
