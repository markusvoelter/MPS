package jetbrains.mps.transformation.TLBase.actions;

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
import jetbrains.mps.util.Calculable;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.smodel.BaseAdapter;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_RuleConsequence_1169582381136(SNode parentNode, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.transformation.TLBase.structure.Weaving_MappingRule");
  }
  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_RuleConsequence_1169570930693(final SNode parentNode, final SNode currentTargetNode, final AbstractConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.transformation.TLBase.structure.WeaveEach_RuleConsequence", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          return ListOperations.createList(new SNode[]{SConceptOperations.findConceptDeclaration("jetbrains.mps.transformation.TLBase.structure.WeaveEach_RuleConsequence")});
        }
      };
      Iterable queryResult = (Iterable)calc.calculate();
      for(Object item : queryResult) {
        List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions((ConceptDeclaration)BaseAdapter.fromNode((SNode)item), parentNode, currentTargetNode, childSetter, operationContext.getScope());
        result.addAll(defaultActions);
      }
    }
    return result;
  }
}
