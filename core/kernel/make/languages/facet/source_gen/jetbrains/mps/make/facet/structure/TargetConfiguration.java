package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TargetConfiguration extends BaseConcept {
  public static final String concept = "jetbrains.mps.make.facet.structure.TargetConfiguration";

  public TargetConfiguration(SNode node) {
    super(node);
  }

  public static TargetConfiguration newInstance(SModel sm, boolean init) {
    return (TargetConfiguration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.TargetConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TargetConfiguration newInstance(SModel sm) {
    return TargetConfiguration.newInstance(sm, false);
  }
}
