package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class Model_NodesOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_NodesOperation";
  public static String CONCEPT = "concept";

  public Model_NodesOperation(SNode node) {
    super(node);
  }

  public static Model_NodesOperation newInstance(SModel sm, boolean init) {
    return (Model_NodesOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Model_NodesOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_NodesOperation newInstance(SModel sm) {
    return Model_NodesOperation.newInstance(sm, false);
  }


  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(Model_NodesOperation.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(Model_NodesOperation.CONCEPT, node);
  }

}
