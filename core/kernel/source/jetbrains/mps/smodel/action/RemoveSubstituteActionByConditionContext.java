package jetbrains.mps.smodel.action;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;

import java.util.Iterator;

public class RemoveSubstituteActionByConditionContext {
  private Iterator<INodeSubstituteAction> myActions;
  private SNode myParentNode;
  private SNode myCurrentChild;
  private SNode myChildConcept;

  public RemoveSubstituteActionByConditionContext(Iterator<INodeSubstituteAction> actions, SNode parentNode, SNode currentChild, SNode childConcept) {
    myActions = actions;
    myParentNode = parentNode;
    myCurrentChild = currentChild;
    myChildConcept = childConcept;
  }

  public Iterator<INodeSubstituteAction> getActions() {
    return myActions;
  }

  public SModel getModel() {
    return myParentNode.getModel();
  }

  public SNode getParentNode() {
    return myParentNode;
  }

  public SNode getCurrentTargetNode() {
    return myCurrentChild;
  }

  public SNode getChildConcept() {
    return myChildConcept;
  }
}
