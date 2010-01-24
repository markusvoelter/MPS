package jetbrains.mps.baseLanguageInternal.generator.template.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ContextUtil {
  public ContextUtil() {
  }

  public static SNode getContextForConstant(TemplateQueryContext genContext, SNode node, boolean topmost) {
    SNode usage = genContext.getOutputNodeByInputNodeAndMappingLabelAndOutputNode(node, genContext.getOutputNode(), "exprUsage");
    if ((usage != null)) {
      if (topmost) {
        return ListSequence.fromList(SNodeOperations.getAncestors(usage, "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).last();
      } else {
        return ListSequence.fromList(SNodeOperations.getAncestors(usage, "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return Classifier_Behavior.call_isStatic_521412098689998668(it);
          }
        }).first();
      }
    } else {
      SNode outclass = genContext.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
      if ((outclass != null)) {
        return ListSequence.fromList(SNodeOperations.getAncestors(outclass, "jetbrains.mps.baseLanguage.structure.ClassConcept", true)).last();
      }
    }
    return null;
  }

  public static SNode getContextForMethod(TemplateQueryContext genContext, SNode node, boolean topmost) {
    SNode usage = genContext.getOutputNodeByInputNodeAndMappingLabelAndOutputNode(SLinkOperations.getTarget(node, "inner", true), genContext.getOutputNode(), "methUsageExpr");
    if ((usage != null)) {
      if (topmost) {
        return ListSequence.fromList(SNodeOperations.getAncestors(usage, "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).last();
      } else {
        return ListSequence.fromList(SNodeOperations.getAncestors(usage, "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return Classifier_Behavior.call_isStatic_521412098689998668(it);
          }
        }).first();
      }
    } else {
      SNode outclass = genContext.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
      if ((outclass != null)) {
        return ListSequence.fromList(SNodeOperations.getAncestors(outclass, "jetbrains.mps.baseLanguage.structure.ClassConcept", true)).last();
      }
    }
    return null;
  }

  public static SNode getContextForInnerClass(TemplateQueryContext genContext, SNode node, boolean topmost) {
    SNode usage = genContext.getOutputNodeByInputNodeAndMappingLabelAndOutputNode(SLinkOperations.getTarget(node, "inner", true), genContext.getOutputNode(), "classUsageExpr");
    if ((usage != null)) {
      if (topmost) {
        return ListSequence.fromList(SNodeOperations.getAncestors(usage, "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).last();
      } else {
        return ListSequence.fromList(SNodeOperations.getAncestors(usage, "jetbrains.mps.baseLanguage.structure.ClassConcept", false)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return Classifier_Behavior.call_isStatic_521412098689998668(it);
          }
        }).first();
      }
    } else {
      SNode outclass = genContext.getCopiedOutputNodeForInputNode(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false));
      if ((outclass != null)) {
        return ListSequence.fromList(SNodeOperations.getAncestors(outclass, "jetbrains.mps.baseLanguage.structure.ClassConcept", true)).last();
      }
    }
    return null;
  }
}
