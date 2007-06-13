package jetbrains.mps.bootstrap.actionsLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuPart_1177495846676(SNode parentNode, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(parentNode, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false) != null;
  }
  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuPart_1177496214780(SNode parentNode, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(parentNode, "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", false, false) != null;
  }
  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuBuilderPart_1180112146090(SNode parentNode, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(parentNode, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", true, false) != null;
  }
  public static boolean nodeSubstituteActionsBuilder_Precondition_MenuBuilderPart_1180112503623(SNode parentNode, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(parentNode, "jetbrains.mps.bootstrap.actionsLanguage.structure.RTransformHintSubstituteActionsBuilder", true, false) != null;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuPart_1177495821852(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuPart_1177496206972(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuBuilderPart_1180112146087(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.RemoveDefaultsPart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    return result;
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MenuBuilderPart_1180112212391(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration conceptToAdd = SModelUtil_new.findConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.IncludeRightTransformForNodePart", operationContext.getScope());
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, parentNode, currentTargetNode, childSetter, operationContext.getScope());
      result.addAll(defaultActions);
    }
    return result;
  }
  public static boolean removeConceptByCondition_1177495897822(SNode concept, SNode parentNode, SNode currentChild, SNode childConcept, IOperationContext operationContext) {
    return !(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.bootstrap.actionsLanguage.structure.SubstituteMenuPart"));
  }
  public static boolean removeConceptByCondition_1177496231840(SNode concept, SNode parentNode, SNode currentChild, SNode childConcept, IOperationContext operationContext) {
    return !(SConceptOperations.isSubConceptOf(concept, "jetbrains.mps.bootstrap.actionsLanguage.structure.RightTransformMenuPart"));
  }
}
