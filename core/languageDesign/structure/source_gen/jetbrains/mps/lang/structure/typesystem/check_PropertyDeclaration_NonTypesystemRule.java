package jetbrains.mps.lang.structure.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_PropertyDeclaration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_PropertyDeclaration_NonTypesystemRule() {
  }

  public void applyRule(final SNode prop, final TypeCheckingContext typeCheckingContext) {
    //     property overriding is banned
    if (SPropertyOperations.getString(prop, "name") == null) {
      return;
    }
    SNode concept = SNodeOperations.getAncestor(prop, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
    SNode propInConcept = AbstractConceptDeclaration_Behavior.call_findPropertyDeclaration_1219835742593(concept, SPropertyOperations.getString(prop, "name"));
    if (prop != propInConcept) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(prop, "property '" + SPropertyOperations.getString(prop, "name") + "' is already declared in " + SPropertyOperations.getString(SNodeOperations.getAncestor(propInConcept, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false), "name"), "r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)", "1212182341577", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.structure.structure.PropertyDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
