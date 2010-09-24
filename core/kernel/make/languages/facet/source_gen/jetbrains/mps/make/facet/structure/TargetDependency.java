package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TargetDependency extends BaseConcept {
  public static final String concept = "jetbrains.mps.make.facet.structure.TargetDependency";
  public static final String DEPENDS_ON = "dependsOn";
  public static final String CONFIGURATION = "configuration";

  public TargetDependency(SNode node) {
    super(node);
  }

  public TargetDeclaration getDependsOn() {
    return (TargetDeclaration) this.getReferent(TargetDeclaration.class, TargetDependency.DEPENDS_ON);
  }

  public void setDependsOn(TargetDeclaration node) {
    super.setReferent(TargetDependency.DEPENDS_ON, node);
  }

  public TargetConfiguration getConfiguration() {
    return (TargetConfiguration) this.getChild(TargetConfiguration.class, TargetDependency.CONFIGURATION);
  }

  public void setConfiguration(TargetConfiguration node) {
    super.setChild(TargetDependency.CONFIGURATION, node);
  }

  public static TargetDependency newInstance(SModel sm, boolean init) {
    return (TargetDependency) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.TargetDependency", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TargetDependency newInstance(SModel sm) {
    return TargetDependency.newInstance(sm, false);
  }
}
