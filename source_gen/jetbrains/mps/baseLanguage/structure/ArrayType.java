package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;

public class ArrayType extends Type {
  public static String COMPONENT_TYPE = "componentType";

  public  ArrayType(SNode node) {
    super(node);
  }

  public Type getComponentType() {
    return (Type)this.getChild(ArrayType.COMPONENT_TYPE);
  }
  public void setComponentType(Type node) {
    super.setChild(ArrayType.COMPONENT_TYPE, node);
  }
}
