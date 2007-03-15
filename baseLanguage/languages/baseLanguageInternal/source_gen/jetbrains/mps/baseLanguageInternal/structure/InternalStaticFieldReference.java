package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InternalStaticFieldReference extends Expression {
  public static String FQ_CLASS_NAME = "fqClassName";
  public static String FIELD_NAME = "fieldName";

  public  InternalStaticFieldReference(SNode node) {
    super(node);
  }

  public static InternalStaticFieldReference newInstance(SModel sm, boolean init) {
    return (InternalStaticFieldReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.InternalStaticFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static InternalStaticFieldReference newInstance(SModel sm) {
    return InternalStaticFieldReference.newInstance(sm, false);
  }

  public String getFqClassName() {
    return this.getProperty(InternalStaticFieldReference.FQ_CLASS_NAME);
  }
  public void setFqClassName(String value) {
    this.setProperty(InternalStaticFieldReference.FQ_CLASS_NAME, value);
  }
  public String getFieldName() {
    return this.getProperty(InternalStaticFieldReference.FIELD_NAME);
  }
  public void setFieldName(String value) {
    this.setProperty(InternalStaticFieldReference.FIELD_NAME, value);
  }
}
