package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration;

public class EnumMemberReference extends Expression {
  public static String ENUM_MEMBER = "enumMember";

  public  EnumMemberReference(SNode node) {
    super(node);
  }

  public static EnumMemberReference newInstance(SModel sm) {
    return (EnumMemberReference)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.EnumMemberReference", sm, GlobalScope.getInstance()).getAdaptor();
  }

  public EnumerationMemberDeclaration getEnumMember() {
    return (EnumerationMemberDeclaration)this.getReferent(EnumMemberReference.ENUM_MEMBER);
  }
  public void setEnumMember(EnumerationMemberDeclaration node) {
    super.setReferent(EnumMemberReference.ENUM_MEMBER, node);
  }
}
