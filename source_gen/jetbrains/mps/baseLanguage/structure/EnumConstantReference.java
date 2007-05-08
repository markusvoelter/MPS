package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.EnumClass;
import jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration;

public class EnumConstantReference extends Expression {
  public static String ENUM_CLASS = "enumClass";
  public static String ENUM_CONSTANT_DECLARATION = "enumConstantDeclaration";

  public  EnumConstantReference(SNode node) {
    super(node);
  }

  public static EnumConstantReference newInstance(SModel sm, boolean init) {
    return (EnumConstantReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.EnumConstantReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static EnumConstantReference newInstance(SModel sm) {
    return EnumConstantReference.newInstance(sm, false);
  }

  public EnumClass getEnumClass() {
    return (EnumClass)this.getReferent(EnumConstantReference.ENUM_CLASS);
  }
  public void setEnumClass(EnumClass node) {
    super.setReferent(EnumConstantReference.ENUM_CLASS, node);
  }
  public EnumConstantDeclaration getEnumConstantDeclaration() {
    return (EnumConstantDeclaration)this.getReferent(EnumConstantReference.ENUM_CONSTANT_DECLARATION);
  }
  public void setEnumConstantDeclaration(EnumConstantDeclaration node) {
    super.setReferent(EnumConstantReference.ENUM_CONSTANT_DECLARATION, node);
  }
}
