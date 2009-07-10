package jetbrains.mps.lang.test.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AssertMatch_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AssertMatch_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    for(SNode node : ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "before", true))) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982433134", true), (SNode)new _Quotations.QuotationClass_2().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982433132", false, 0, intentionProvider);
      }
    }
    for(SNode node : ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "after", true))) {
      {
        SNode _nodeToCheck_1029348928467 = node;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982429080", true), (SNode)new _Quotations.QuotationClass_1().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1211982429078", false, 0, intentionProvider);
      }
    }
    {
      SNode nodeBefore;
      SNode nodeAfter;
      Iterator<SNode> nodeBefore_iterator = ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "before", true)).iterator();
      Iterator<SNode> nodeAfter_iterator = ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "after", true)).iterator();
      while (true) {
        if (!(nodeBefore_iterator.hasNext())) {
          break;
        }
        if (!(nodeAfter_iterator.hasNext())) {
          break;
        }
        nodeBefore = nodeBefore_iterator.next();
        nodeAfter = nodeAfter_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = nodeBefore;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1214922647143", true), (SNode)typeCheckingContext.typeOf(nodeAfter, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1214922660624", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590385(jetbrains.mps.lang.test.typesystem)", "1214922658994", intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.test.structure.AssertMatch";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
