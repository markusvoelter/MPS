package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class WrapperSubstituteMenuPart extends SubstituteMenuPart {
  public static String WRAPPER_BLOCK = "wrapperBlock";
  public static String WRAPPED_CONCEPT = "wrappedConcept";

  public  WrapperSubstituteMenuPart(SNode node) {
    super(node);
  }

  public static WrapperSubstituteMenuPart newInstance(SModel sm, boolean init) {
    return (WrapperSubstituteMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.WrapperSubstituteMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static WrapperSubstituteMenuPart newInstance(SModel sm) {
    return WrapperSubstituteMenuPart.newInstance(sm, false);
  }

  public QueryFunction_SubstituteWrapper getWrapperBlock() {
    return (QueryFunction_SubstituteWrapper)this.getChild(WrapperSubstituteMenuPart.WRAPPER_BLOCK);
  }
  public void setWrapperBlock(QueryFunction_SubstituteWrapper node) {
    super.setChild(WrapperSubstituteMenuPart.WRAPPER_BLOCK, node);
  }
  public ConceptDeclaration getWrappedConcept() {
    return (ConceptDeclaration)this.getReferent(WrapperSubstituteMenuPart.WRAPPED_CONCEPT);
  }
  public void setWrappedConcept(ConceptDeclaration node) {
    super.setReferent(WrapperSubstituteMenuPart.WRAPPED_CONCEPT, node);
  }
}
