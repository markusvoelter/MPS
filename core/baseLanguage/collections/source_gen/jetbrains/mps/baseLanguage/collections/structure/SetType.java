package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SetType extends jetbrains.mps.baseLanguage.structure.Type {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SetType";
  public static final String ELEMENT_TYPE = "elementType";

  public SetType(SNode node) {
    super(node);
  }

  public jetbrains.mps.baseLanguage.structure.Type getElementType() {
    return (jetbrains.mps.baseLanguage.structure.Type)this.getChild(Type.class, SetType.ELEMENT_TYPE);
  }

  public void setElementType(jetbrains.mps.baseLanguage.structure.Type node) {
    super.setChild(SetType.ELEMENT_TYPE, node);
  }


  public static SetType newInstance(SModel sm, boolean init) {
    return (SetType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SetType newInstance(SModel sm) {
    return SetType.newInstance(sm, false);
  }

}
