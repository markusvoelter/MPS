package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class Model_RootsOperation extends SNodeOperation {
  public static String CONCEPT = "concept";

  public  Model_RootsOperation(SNode node) {
    super(node);
  }

  public static Model_RootsOperation newInstance(SModel sm, boolean init) {
    return (Model_RootsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Model_RootsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Model_RootsOperation newInstance(SModel sm) {
    return Model_RootsOperation.newInstance(sm, false);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(Model_RootsOperation.CONCEPT);
  }
  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(Model_RootsOperation.CONCEPT, node);
  }
}
