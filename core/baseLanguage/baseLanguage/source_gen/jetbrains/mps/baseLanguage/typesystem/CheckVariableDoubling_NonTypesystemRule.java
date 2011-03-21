package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.List;
import jetbrains.mps.baseLanguage.search.ParameterScope;
import jetbrains.mps.baseLanguage.search.LocalVariablesScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class CheckVariableDoubling_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public CheckVariableDoubling_NonTypesystemRule() {
  }

  public void applyRule(final SNode iVariableDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> param = new ParameterScope(iVariableDeclaration).getNodes();
    List<SNode> vars = new LocalVariablesScope(iVariableDeclaration).getNodes();
    vars.addAll(param);
    SNode nearestMethod = SNodeOperations.getAncestor(iVariableDeclaration, "jetbrains.mps.baseLanguage.structure.IMethodLike", false, false);
    List<SNode> methodVariables = SNodeOperations.getDescendants(nearestMethod, "jetbrains.mps.baseLanguage.structure.VariableDeclaration", false, new String[]{});
    List<SNode> intersection = new ArrayList<SNode>();
    for (SNode var : methodVariables) {
      if (vars.contains(var)) {
        ListSequence.fromList(intersection).addElement(var);
      }
    }
    for (SNode var : intersection) {
      if (var == null || SPropertyOperations.getString(SNodeOperations.cast(var, "jetbrains.mps.lang.core.structure.INamedConcept"), "name") == null) {
        continue;
      }
      if (SPropertyOperations.getString(SNodeOperations.cast(var, "jetbrains.mps.lang.core.structure.INamedConcept"), "name").equals(SPropertyOperations.getString(iVariableDeclaration, "name")) && !(var == iVariableDeclaration)) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget("name");
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(iVariableDeclaration, "Variable " + SPropertyOperations.getString(iVariableDeclaration, "name") + " is already defined in the scope", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4164094338984214928", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.IVariableDeclaration";
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
