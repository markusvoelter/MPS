package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_InsertPrevSiblingOperation extends SNodeOperation {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.Node_InsertPrevSiblingOperation";
public    static final String INSERTED_NODE = "insertedNode";

  public Node_InsertPrevSiblingOperation(SNode node) {
    super(node);
  }

  public Expression getInsertedNode() {
    return (Expression)this.getChild(Node_InsertPrevSiblingOperation.INSERTED_NODE);
  }

  public void setInsertedNode(Expression node) {
    super.setChild(Node_InsertPrevSiblingOperation.INSERTED_NODE, node);
  }


  public static Node_InsertPrevSiblingOperation newInstance(SModel sm, boolean init) {
    return (Node_InsertPrevSiblingOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_InsertPrevSiblingOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_InsertPrevSiblingOperation newInstance(SModel sm) {
    return Node_InsertPrevSiblingOperation.newInstance(sm, false);
  }

}
