package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.smodelLanguage.structure.AbstractOperationParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference;
import java.util.List;

public class OperationParm_ConceptList extends AbstractOperationParameter {
  public static String CONCEPT = "concept";

  public  OperationParm_ConceptList(SNode node) {
    super(node);
  }

  public static OperationParm_ConceptList newInstance(SModel sm, boolean init) {
    return (OperationParm_ConceptList)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.OperationParm_ConceptList", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static OperationParm_ConceptList newInstance(SModel sm) {
    return OperationParm_ConceptList.newInstance(sm, false);
  }

  public int getConceptsCount() {
    return this.getChildCount(OperationParm_ConceptList.CONCEPT);
  }
  public Iterator<ConceptReference> concepts() {
    return this.children(OperationParm_ConceptList.CONCEPT);
  }
  public List<ConceptReference> getConcepts() {
    return this.getChildren(OperationParm_ConceptList.CONCEPT);
  }
  public void addConcept(ConceptReference node) {
    this.addChild(OperationParm_ConceptList.CONCEPT, node);
  }
  public void insertConcept(ConceptReference prev, ConceptReference node) {
    this.insertChild(prev, OperationParm_ConceptList.CONCEPT, node);
  }
}
