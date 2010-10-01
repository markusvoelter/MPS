package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_ConceptMethodCall_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Node_ConceptMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode conceptMethodCall, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!((SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false) != null))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(conceptMethodCall, "no method declaration", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410829052", intentionProvider, errorTarget);
    }
    int actCount = ListSequence.fromList(SLinkOperations.getTargets(conceptMethodCall, "actualArgument", true)).count();
    int expCount = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false), "parameter", true)).count();
    if (!(actCount == expCount)) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(conceptMethodCall, "Wrong parameters number: expected " + expCount + ", actual " + actCount, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410886099", intentionProvider, errorTarget);
    }
    {
      SNode arg;
      SNode parameter;
      Iterator<SNode> arg_iterator = ListSequence.fromList(SLinkOperations.getTargets(conceptMethodCall, "actualArgument", true)).iterator();
      Iterator<SNode> parameter_iterator = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false), "parameter", true)).iterator();
      while (true) {
        if (!(arg_iterator.hasNext())) {
          break;
        }
        if (!(parameter_iterator.hasNext())) {
          break;
        }
        arg = arg_iterator.next();
        parameter = parameter_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = arg;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179411081637", 0, intentionProvider);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179411075565", true), (SNode) typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179411084134", true), false, _info_12389875345);
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = conceptMethodCall;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410535708", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410528345", true), (SNode) SLinkOperations.getTarget(SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false), "returnType", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall";
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
