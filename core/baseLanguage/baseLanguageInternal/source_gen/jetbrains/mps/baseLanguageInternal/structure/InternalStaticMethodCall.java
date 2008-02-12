package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodCall;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import java.util.List;

public class InternalStaticMethodCall extends BaseMethodCall {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalStaticMethodCall";
  public static String FQ_CLASS_NAME = "fqClassName";
  public static String METHOD_NAME = "methodName";
  public static String RETURN_TYPE = "returnType";
  public static String TYPE_PARAMETER = "typeParameter";

  public  InternalStaticMethodCall(SNode node) {
    super(node);
  }

  public static InternalStaticMethodCall newInstance(SModel sm, boolean init) {
    return (InternalStaticMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalStaticMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalStaticMethodCall newInstance(SModel sm) {
    return InternalStaticMethodCall.newInstance(sm, false);
  }


  public String getFqClassName() {
    return this.getProperty(InternalStaticMethodCall.FQ_CLASS_NAME);
  }

  public void setFqClassName(String value) {
    this.setProperty(InternalStaticMethodCall.FQ_CLASS_NAME, value);
  }

  public String getMethodName() {
    return this.getProperty(InternalStaticMethodCall.METHOD_NAME);
  }

  public void setMethodName(String value) {
    this.setProperty(InternalStaticMethodCall.METHOD_NAME, value);
  }

  public Type getReturnType() {
    return (Type)this.getChild(InternalStaticMethodCall.RETURN_TYPE);
  }

  public void setReturnType(Type node) {
    super.setChild(InternalStaticMethodCall.RETURN_TYPE, node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(InternalStaticMethodCall.TYPE_PARAMETER);
  }

  public Iterator<Type> typeParameters() {
    return this.children(InternalStaticMethodCall.TYPE_PARAMETER);
  }

  public List<Type> getTypeParameters() {
    return this.getChildren(InternalStaticMethodCall.TYPE_PARAMETER);
  }

  public void addTypeParameter(Type node) {
    this.addChild(InternalStaticMethodCall.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(Type prev, Type node) {
    this.insertChild(prev, InternalStaticMethodCall.TYPE_PARAMETER, node);
  }

}
