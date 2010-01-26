package jetbrains.mps.langBeta.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GammaConcept extends BaseConcept {
  public static final String concept = "jetbrains.mps.langBeta.structure.GammaConcept";

  public GammaConcept(SNode node) {
    super(node);
  }

  public static GammaConcept newInstance(SModel sm, boolean init) {
    return (GammaConcept) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.langBeta.structure.GammaConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GammaConcept newInstance(SModel sm) {
    return GammaConcept.newInstance(sm, false);
  }
}
