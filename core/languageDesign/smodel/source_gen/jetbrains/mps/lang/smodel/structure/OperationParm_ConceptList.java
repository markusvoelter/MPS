package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.smodel.structure.ConceptReference;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OperationParm_ConceptList extends jetbrains.mps.lang.smodel.structure.AbstractOperationParameter {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList";
  public static final String CONCEPT = "concept";

  public OperationParm_ConceptList(SNode node) {
    super(node);
  }

  public int getConceptsCount() {
    return this.getChildCount(OperationParm_ConceptList.CONCEPT);
  }

  public Iterator<jetbrains.mps.lang.smodel.structure.ConceptReference> concepts() {
    return this.children(ConceptReference.class, OperationParm_ConceptList.CONCEPT);
  }

  public List<jetbrains.mps.lang.smodel.structure.ConceptReference> getConcepts() {
    return this.getChildren(ConceptReference.class, OperationParm_ConceptList.CONCEPT);
  }

  public void addConcept(jetbrains.mps.lang.smodel.structure.ConceptReference node) {
    this.addChild(OperationParm_ConceptList.CONCEPT, node);
  }

  public void insertConcept(jetbrains.mps.lang.smodel.structure.ConceptReference prev, jetbrains.mps.lang.smodel.structure.ConceptReference node) {
    this.insertChild(prev, OperationParm_ConceptList.CONCEPT, node);
  }


  public static OperationParm_ConceptList newInstance(SModel sm, boolean init) {
    return (OperationParm_ConceptList)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OperationParm_ConceptList newInstance(SModel sm) {
    return OperationParm_ConceptList.newInstance(sm, false);
  }

}
