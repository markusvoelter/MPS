package jetbrains.mps.baseLanguage.blTypes.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeDescriptor;

public class PrimitiveTypeRef extends BaseConcept {
  public static String DESCRIPTOR = "descriptor";

  public  PrimitiveTypeRef(SNode node) {
    super(node);
  }

  public static PrimitiveTypeRef newInstance(SModel sm, boolean init) {
    return (PrimitiveTypeRef)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.PrimitiveTypeRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static PrimitiveTypeRef newInstance(SModel sm) {
    return PrimitiveTypeRef.newInstance(sm, false);
  }

  public PrimitiveTypeDescriptor getDescriptor() {
    return (PrimitiveTypeDescriptor)this.getReferent(PrimitiveTypeRef.DESCRIPTOR);
  }
  public void setDescriptor(PrimitiveTypeDescriptor node) {
    super.setReferent(PrimitiveTypeRef.DESCRIPTOR, node);
  }
}
