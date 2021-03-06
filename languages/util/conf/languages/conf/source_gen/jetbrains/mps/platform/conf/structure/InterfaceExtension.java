package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InterfaceExtension extends Extension {
  public static final String concept = "jetbrains.mps.platform.conf.structure.InterfaceExtension";
  public static final String IMPL = "impl";

  public InterfaceExtension(SNode node) {
    super(node);
  }

  public ClassConcept getImpl() {
    return (ClassConcept) this.getReferent(ClassConcept.class, InterfaceExtension.IMPL);
  }

  public void setImpl(ClassConcept node) {
    super.setReferent(InterfaceExtension.IMPL, node);
  }

  public IntefaceExtensionPoint getIntefaceExtensionPoint() {
    return this.ensureAdapter(IntefaceExtensionPoint.class, "extensionPoint", this.getExtensionPoint());
  }

  public void setIntefaceExtensionPoint(IntefaceExtensionPoint node) {
    this.setExtensionPoint(node);
  }

  public static InterfaceExtension newInstance(SModel sm, boolean init) {
    return (InterfaceExtension) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.platform.conf.structure.InterfaceExtension", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InterfaceExtension newInstance(SModel sm) {
    return InterfaceExtension.newInstance(sm, false);
  }
}
