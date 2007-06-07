package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.PrimitiveDataTypeDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration;
import java.util.Iterator;
import java.util.List;

public class EnumerationDataTypeDeclaration extends DataTypeDeclaration {
  public static String MEMBER_DATA_TYPE = "memberDataType";
  public static String DEFAULT_MEMBER = "defaultMember";
  public static String MEMBER = "member";

  public  EnumerationDataTypeDeclaration(SNode node) {
    super(node);
  }

  public static EnumerationDataTypeDeclaration newInstance(SModel sm, boolean init) {
    return (EnumerationDataTypeDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.EnumerationDataTypeDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static EnumerationDataTypeDeclaration newInstance(SModel sm) {
    return EnumerationDataTypeDeclaration.newInstance(sm, false);
  }

  public PrimitiveDataTypeDeclaration getMemberDataType() {
    return (PrimitiveDataTypeDeclaration)this.getReferent(EnumerationDataTypeDeclaration.MEMBER_DATA_TYPE);
  }
  public void setMemberDataType(PrimitiveDataTypeDeclaration node) {
    super.setReferent(EnumerationDataTypeDeclaration.MEMBER_DATA_TYPE, node);
  }
  public EnumerationMemberDeclaration getDefaultMember() {
    return (EnumerationMemberDeclaration)this.getReferent(EnumerationDataTypeDeclaration.DEFAULT_MEMBER);
  }
  public void setDefaultMember(EnumerationMemberDeclaration node) {
    super.setReferent(EnumerationDataTypeDeclaration.DEFAULT_MEMBER, node);
  }
  public int getMembersCount() {
    return this.getChildCount(EnumerationDataTypeDeclaration.MEMBER);
  }
  public Iterator<EnumerationMemberDeclaration> members() {
    return this.children(EnumerationDataTypeDeclaration.MEMBER);
  }
  public List<EnumerationMemberDeclaration> getMembers() {
    return this.getChildren(EnumerationDataTypeDeclaration.MEMBER);
  }
  public void addMember(EnumerationMemberDeclaration node) {
    this.addChild(EnumerationDataTypeDeclaration.MEMBER, node);
  }
  public void insertMember(EnumerationMemberDeclaration prev, EnumerationMemberDeclaration node) {
    this.insertChild(prev, EnumerationDataTypeDeclaration.MEMBER, node);
  }
}
