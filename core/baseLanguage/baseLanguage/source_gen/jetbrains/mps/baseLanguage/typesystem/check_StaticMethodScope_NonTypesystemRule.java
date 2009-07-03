package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_StaticMethodScope_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_StaticMethodScope_NonTypesystemRule() {
  }

  public void applyRule(final SNode staticMethodCall, final TypeCheckingContext typeCheckingContext) {
    List<SNode> staticMethods = (List<SNode>)new ClassifierVisibleStaticMembersScope(((ClassConcept)SNodeOperations.getAdapter(SLinkOperations.getTarget(staticMethodCall, "classConcept", false))), staticMethodCall, IClassifiersSearchScope.STATIC_METHOD).getNodes();
    if (!(ListSequence.fromList(staticMethods).contains(SLinkOperations.getTarget(staticMethodCall, "baseMethodDeclaration", false)))) {
      {
        BaseIntentionProvider intentionProvider = null;
        intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.typesystem.ChooseAppropriateMethodDeclaration_QuickFix", true);
        intentionProvider.putArgument("methodCall", staticMethodCall);
        intentionProvider.putArgument("classifier", null);
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(staticMethodCall, "Incorrect method reference", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2913480580301828959", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.StaticMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
