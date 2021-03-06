package jetbrains.mps.make.script.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ResourceType_subtypeOf_IResource_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public ResourceType_subtypeOf_IResource_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode rt, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return ListSequence.fromListAndArray(new ArrayList<SNode>(), new ResourceType_subtypeOf_IResource_SubtypingRule.QuotationClass_9rsqz7_a1a0a0().createNode(typeCheckingContext));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.make.script.structure.ResourceType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_9rsqz7_a1a0a0 {
    public QuotationClass_9rsqz7_a1a0a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:4ea5a78b-cb8a-4831-b227-f7860a22491d(jetbrains.mps.make.resources)"), SNodeId.fromString("6168415856807657256")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:4ea5a78b-cb8a-4831-b227-f7860a22491d(jetbrains.mps.make.resources)"), SNodeId.fromString("6168415856807657256")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
