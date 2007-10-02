package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class SNodeListType extends Type {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType";
  public static String ELEMENT_CONCEPT = "elementConcept";

  public  SNodeListType(SNode node) {
    super(node);
  }

  public static SNodeListType newInstance(SModel sm, boolean init) {
    return (SNodeListType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SNodeListType newInstance(SModel sm) {
    return SNodeListType.newInstance(sm, false);
  }


  public AbstractConceptDeclaration getElementConcept() {
    return (AbstractConceptDeclaration)this.getReferent(SNodeListType.ELEMENT_CONCEPT);
  }

  public void setElementConcept(AbstractConceptDeclaration node) {
    super.setReferent(SNodeListType.ELEMENT_CONCEPT, node);
  }

}
