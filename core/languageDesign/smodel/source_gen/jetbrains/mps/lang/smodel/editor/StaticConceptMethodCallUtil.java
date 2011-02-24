package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.behavior.behavior.ConceptBehavior_Behavior;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;

public class StaticConceptMethodCallUtil {
  public static List<SNode> getParameterObjectsForMethodDeclaration(SNode staticConceptMethodCall, IScope scope) {
    List<SNode> result = new ArrayList<SNode>();
    SNode behavior = SNodeOperations.cast(AbstractConceptDeclaration_Behavior.call_findConceptAspect_8360039740498068384(SLinkOperations.getTarget(staticConceptMethodCall, "concept", false), LanguageAspect.BEHAVIOR), "jetbrains.mps.lang.behavior.structure.ConceptBehavior");
    if (behavior != null) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(ConceptBehavior_Behavior.call_getVisibleStaticMethods_1225194243338(behavior, staticConceptMethodCall)));
    }
    return result;
  }

  public static SNode createNewNodeForMethodDeclarationParameter(SNode existingNode, SNode parameter) {
    final SNode staticConceptMethodCall = SNodeFactoryOperations.createNewNode(SNodeOperations.getModel(existingNode), "jetbrains.mps.lang.smodel.structure.StaticConceptMethodCall", null);
    SLinkOperations.setTarget(staticConceptMethodCall, "concept", SLinkOperations.getTarget(existingNode, "concept", false), false);
    SLinkOperations.setTarget(staticConceptMethodCall, "baseMethodDeclaration", parameter, false);
    ListSequence.fromList(SLinkOperations.getTargets(existingNode, "actualArgument", true)).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        ListSequence.fromList(SLinkOperations.getTargets(staticConceptMethodCall, "actualArgument", true)).addElement(SNodeOperations.copyNode(it));
      }
    });
    for (SNode attribute : ListSequence.fromList(AttributeOperations.getAttributeList(existingNode, new IAttributeDescriptor.AllAttributes()))) {
      String role = existingNode.getRoleOf(attribute);
      staticConceptMethodCall.addChild(role, SNodeOperations.copyNode(attribute));
    }
    return staticConceptMethodCall;
  }
}
