package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ResourceType extends Type {
  public static final String concept = "jetbrains.mps.make.script.structure.ResourceType";

  public ResourceType(SNode node) {
    super(node);
  }

  public static ResourceType newInstance(SModel sm, boolean init) {
    return (ResourceType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.script.structure.ResourceType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ResourceType newInstance(SModel sm) {
    return ResourceType.newInstance(sm, false);
  }
}
