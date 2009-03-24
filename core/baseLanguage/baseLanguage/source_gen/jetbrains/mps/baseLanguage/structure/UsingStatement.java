package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UsingStatement extends jetbrains.mps.baseLanguage.structure.Statement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.UsingStatement";
  public static final String BODY = "body";
  public static final String RESOURCE = "resource";

  public UsingStatement(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.StatementList getBody() {
    return (jetbrains.mps.baseLanguage.structure.StatementList)this.getChild(StatementList.class, UsingStatement.BODY);
  }

  public void setBody(jetbrains.mps.baseLanguage.structure.StatementList node) {
    super.setChild(UsingStatement.BODY, node);
  }

  public int getResourcesCount() {
    return this.getChildCount(UsingStatement.RESOURCE);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.Expression> resources() {
    return this.children(Expression.class, UsingStatement.RESOURCE);
  }

  public List<jetbrains.mps.baseLanguage.structure.Expression> getResources() {
    return this.getChildren(Expression.class, UsingStatement.RESOURCE);
  }

  public void addResource(jetbrains.mps.baseLanguage.structure.Expression node) {
    this.addChild(UsingStatement.RESOURCE, node);
  }

  public void insertResource(jetbrains.mps.baseLanguage.structure.Expression prev, jetbrains.mps.baseLanguage.structure.Expression node) {
    this.insertChild(prev, UsingStatement.RESOURCE, node);
  }


  public static UsingStatement newInstance(SModel sm, boolean init) {
    return (UsingStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.UsingStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UsingStatement newInstance(SModel sm) {
    return UsingStatement.newInstance(sm, false);
  }

}
