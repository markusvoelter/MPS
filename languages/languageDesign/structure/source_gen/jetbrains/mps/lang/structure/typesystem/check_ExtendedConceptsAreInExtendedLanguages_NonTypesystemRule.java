package jetbrains.mps.lang.structure.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.kernel.model.SModelUtil;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ExtendedConceptsAreInExtendedLanguages_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ExtendedConceptsAreInExtendedLanguages_NonTypesystemRule() {
  }

  public void applyRule(final SNode cd, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    Language language = SModelUtil.getDeclaringLanguage(cd);
    if (language == null) {
      return;
    }
    List<SNode> superConcepts = AbstractConceptDeclaration_Behavior.call_getImmediateSuperconcepts_1222430305282(cd);
    List<Language> extendedLanguages = language.getAllExtendedLanguages();
    for (SNode superConcept : superConcepts) {
      Language conceptLanguage = SModelUtil.getDeclaringLanguage(superConcept);
      if (conceptLanguage == null) {
        continue;
      }
      if (conceptLanguage != language && !(ListSequence.fromList(extendedLanguages).contains(conceptLanguage))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget("name");
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(cd, "language " + conceptLanguage.getModuleFqName() + " of concept " + SPropertyOperations.getString(superConcept, "name") + " is not extended by " + language.getModuleFqName(), "r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)", "1235136520823", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.structure.typesystem.AddExtendedLanguage_QuickFix", false);
            intentionProvider.putArgument("extLang", conceptLanguage);
            intentionProvider.putArgument("lang", language);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
        break;
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
