package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EnumerationMemberDeclaration extends BaseConcept implements INamedConcept {
  public static String INTERNAL_VALUE = "internalValue";
  public static String EXTERNAL_VALUE = "externalValue";
  public static String NAME = "name";

  public  EnumerationMemberDeclaration(SNode node) {
    super(node);
  }

  public static EnumerationMemberDeclaration newInstance(SModel sm, boolean init) {
    return (EnumerationMemberDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.EnumerationMemberDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static EnumerationMemberDeclaration newInstance(SModel sm) {
    return EnumerationMemberDeclaration.newInstance(sm, false);
  }

  public String getInternalValue() {
    return this.getProperty(EnumerationMemberDeclaration.INTERNAL_VALUE);
  }
  public void setInternalValue(String value) {
    this.setProperty(EnumerationMemberDeclaration.INTERNAL_VALUE, value);
  }
  public String getExternalValue() {
    return this.getProperty(EnumerationMemberDeclaration.EXTERNAL_VALUE);
  }
  public void setExternalValue(String value) {
    this.setProperty(EnumerationMemberDeclaration.EXTERNAL_VALUE, value);
  }
  public String getName() {
    return this.getProperty(EnumerationMemberDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(EnumerationMemberDeclaration.NAME, value);
  }
}
