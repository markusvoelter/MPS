package webr.xml.actions;

/*Generated by MPS  */

import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.action.IChildNodeSetter;
import jetbrains.mps.smodel.IOperationContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class QueriesGenerated {

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_BaseAttribute_1167699332639(final SNode parentNode, final SNode currentTargetNode, final ConceptDeclaration childConcept, final IChildNodeSetter childSetter, final IOperationContext operationContext) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      ConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("null", operationContext.getScope());
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode elementDeclaration = ElementUtil.getParentElement(parentNode);
          return AttributeUtil.getAttributeDeclarations(elementDeclaration);
        }
      };
      Iterable<SNode> queryResult = (Iterable)calc.calculate();
      for(SNode item : queryResult) {
        result.add(new DefaultChildNodeSubstituteAction(item, parentNode, currentTargetNode, childSetter, operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode attribute = SModelOperations.createNewNode(model, "webr.xml.structure.Attribute", null);
            SLinkOperations.setTarget(attribute, "attributeDeclaration", ((SNode)this.getParameterObject()), false);
            SLinkOperations.setNewChild(attribute, "value", "webr.xml.structure.Text");
            return attribute;
          }
          public String getMatchingText(String pattern) {
            return SPropertyOperations.getString(((SNode)this.getParameterObject()), "attributeName");
          }
        });
      }
    }
    return result;
  }
  public static boolean removeConceptByCondition_1177863610304(SNode concept, SNode parentNode, SNode currentChild, SNode childConcept, IOperationContext operationContext) {
    return SConceptOperations.isExactly(childConcept, "webr.xml.structure.Content") && SConceptOperations.isAssignableFrom(SConceptOperations.findConceptDeclaration("webr.xml.structure.BaseText"), concept);
  }
}
