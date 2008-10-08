package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Model_NodesIncludingImportedOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_NodesIncludingImportedOperation";
  public static String CONCEPT = "concept";
  public static String SCOPE = "scope";

  public Model_NodesIncludingImportedOperation(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(Model_NodesIncludingImportedOperation.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(Model_NodesIncludingImportedOperation.CONCEPT, node);
  }

  public Expression getScope() {
    return (Expression)this.getChild(Model_NodesIncludingImportedOperation.SCOPE);
  }

  public void setScope(Expression node) {
    super.setChild(Model_NodesIncludingImportedOperation.SCOPE, node);
  }


  public static Model_NodesIncludingImportedOperation newInstance(SModel sm, boolean init) {
    return (Model_NodesIncludingImportedOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Model_NodesIncludingImportedOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_NodesIncludingImportedOperation newInstance(SModel sm) {
    return Model_NodesIncludingImportedOperation.newInstance(sm, false);
  }

}
