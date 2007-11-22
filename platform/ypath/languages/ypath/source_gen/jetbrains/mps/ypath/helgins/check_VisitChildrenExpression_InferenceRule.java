package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ypath.constraints.VisitChildrenExpression_Behavior;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VisitChildrenExpression_InferenceRule implements InferenceRule_Runtime {

  public  check_VisitChildrenExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    int actualCount = SLinkOperations.getCount(argument, "actualArgument");
    SNode visitBlock = VisitChildrenExpression_Behavior.call_getEnclosingVisitNodesStatement_1180014794484(argument);
    if(!((visitBlock != null))) {
      TypeChecker.getInstance().reportTypeError(argument, "visit children is unexpected here", "jetbrains.mps.ypath.helgins", "1180014856089");
    }
    List<SNode> parameters = SLinkOperations.getTargets(SLinkOperations.getTarget(visitBlock, "visitParameterDeclarationList", true), "visitParameterDeclaration", true);
    int expectedCount = SequenceOperations.getSize(parameters);
    if(!(actualCount == expectedCount)) {
      TypeChecker.getInstance().reportTypeError(argument, "wrong parameters number: expected " + expectedCount + " , actual " + actualCount, "jetbrains.mps.ypath.helgins", "1180014444793");
    }
    {
      SNode arg;
      SNode param;
      Iterator<SNode> arg_iterator = SLinkOperations.getTargets(argument, "actualArgument", true).iterator();
      Iterator<SNode> param_iterator = parameters.iterator();
      while(true) {
        if(!(arg_iterator.hasNext())) {
          break;
        }
        if(!(param_iterator.hasNext())) {
          break;
        }
        arg = arg_iterator.next();
        param = param_iterator.next();
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(arg, "jetbrains.mps.ypath.helgins", "1180014730654", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(param, "jetbrains.mps.ypath.helgins", "1180014739452", true), arg, null, "jetbrains.mps.ypath.helgins", "1180014737422");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.VisitChildrenExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
