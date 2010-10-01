package jetbrains.mps.lang.plugin.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.plugin.behavior.ICheckedNamePolicy_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.typesystem.inference.PropertyErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_NamingPolicy_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_NamingPolicy_NonTypesystemRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    for (SNode s : ICheckedNamePolicy_Behavior.call_getDescendantsToCheck_1628770029971140562(node)) {
      if (!(NameUtil.satisfiesPartNamingPolicy(SPropertyOperations.getString(s, "value")))) {
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.lang.plugin.typesystem.FixNamingPolicy_QuickFix", false);
          intentionProvider.putArgument("nodeToFix", node);
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(s, "String does not satisfy naming policies", "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "1628770029971140725", intentionProvider, errorTarget);
        }
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.lang.plugin.typesystem.FixNamingPolicy_literal_once_QuickFix", false);
          intentionProvider.putArgument("caption", "Fix String");
          intentionProvider.putArgument("literal", s);
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(s, "String does not satisfy naming policies", "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "1628770029971140731", intentionProvider, errorTarget);
        }
      }
    }
    for (PropertyReference p : ICheckedNamePolicy_Behavior.call_getPropertiesToCheck_1628770029971140570(node)) {
      if (p.getValue() == null) {
        continue;
      }
      if (!(NameUtil.satisfiesNamingPolicy(p.getValue()))) {
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.lang.plugin.typesystem.FixNamingPolicy_QuickFix", false);
          intentionProvider.putArgument("nodeToFix", node);
          IErrorTarget errorTarget = new NodeErrorTarget();
          errorTarget = new PropertyErrorTarget(p.getProperty());
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(p.getNode(), "String does not satisfy naming policies", "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "1628770029971140761", intentionProvider, errorTarget);
        }
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.lang.plugin.typesystem.FixNamingPolicy_property_once_QuickFix", false);
          intentionProvider.putArgument("caption", "Fix " + NameUtil.capitalize(p.getProperty()));
          intentionProvider.putArgument("property", p);
          IErrorTarget errorTarget = new NodeErrorTarget();
          errorTarget = new PropertyErrorTarget(p.getProperty());
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(p.getNode(), "String does not satisfy naming policies", "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "1628770029971140773", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy";
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
