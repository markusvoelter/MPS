package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyAttributeAccessQualifier_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PropertyAttributeAccessQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode annotationLink = SLinkOperations.getTarget(nodeToCheck, "annotationLink", false);
    if (annotationLink == null) {
      return;
    }
    // assign type
    if (SPropertyOperations.hasValue(annotationLink, "sourceCardinality", "0..1", "0..1")) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741186", true), (SNode)new _Quotations.QuotationClass_128().createNode(SLinkOperations.getTarget(annotationLink, "target", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741184", intentionProvider);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741212", true), (SNode)new _Quotations.QuotationClass_129().createNode(SLinkOperations.getTarget(annotationLink, "target", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741203", intentionProvider);
      }
    }
    // ---
    if (!(SPropertyOperations.hasValue(annotationLink, "stereotype", "property", "node"))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(nodeToCheck, "property annotation link is expected", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204832870610", intentionProvider, errorTarget);
    }
    final SNode propQ = SLinkOperations.getTarget(nodeToCheck, "propertyQualifier", true);
    if (SNodeOperations.isInstanceOf(propQ, "jetbrains.mps.lang.smodel.structure.PoundExpression")) {
      // # property name
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(propQ, "jetbrains.mps.lang.smodel.structure.PoundExpression"), "expression", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204835998062", false), (SNode)new _Quotations.QuotationClass_58().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204835998060", false, 0, intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.PropertyAttributeAccessQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
