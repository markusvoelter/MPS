package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExternalOptionDeclaration extends BaseConcept {
  public static final String concept = "jetbrains.mps.bash.structure.ExternalOptionDeclaration";

  public ExternalOptionDeclaration(SNode node) {
    super(node);
  }

  public static ExternalOptionDeclaration newInstance(SModel sm, boolean init) {
    return (ExternalOptionDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ExternalOptionDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExternalOptionDeclaration newInstance(SModel sm) {
    return ExternalOptionDeclaration.newInstance(sm, false);
  }
}
