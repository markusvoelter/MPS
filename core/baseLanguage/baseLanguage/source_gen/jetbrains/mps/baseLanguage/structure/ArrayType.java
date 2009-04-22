package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArrayType extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ArrayType";
  public static final String COMPONENT_TYPE = "componentType";

  public ArrayType(SNode node) {
    super(node);
  }

  public INodeAdapter getComponentType() {
    return (INodeAdapter)this.getChild(, ArrayType.COMPONENT_TYPE);
  }

  public void setComponentType(INodeAdapter node) {
    super.setChild(ArrayType.COMPONENT_TYPE, node);
  }


  public static ArrayType newInstance(SModel sm, boolean init) {
    return (ArrayType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArrayType newInstance(SModel sm) {
    return ArrayType.newInstance(sm, false);
  }

}
