package jetbrains.mps.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.ClassifierType;

public class FunctionType extends Type {
  public static final String concept = "jetbrains.mps.closures.structure.FunctionType";
  public static String RESULT_TYPE = "resultType";
  public static String PARAMETER_TYPE = "parameterType";
  public static String THROWS_TYPE = "throwsType";

  public FunctionType(SNode node) {
    super(node);
  }

  public static FunctionType newInstance(SModel sm, boolean init) {
    return (FunctionType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.closures.structure.FunctionType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FunctionType newInstance(SModel sm) {
    return FunctionType.newInstance(sm, false);
  }


  public Type getResultType() {
    return (Type)this.getChild(FunctionType.RESULT_TYPE);
  }

  public void setResultType(Type node) {
    super.setChild(FunctionType.RESULT_TYPE, node);
  }

  public int getParameterTypesCount() {
    return this.getChildCount(FunctionType.PARAMETER_TYPE);
  }

  public Iterator<Type> parameterTypes() {
    return this.children(FunctionType.PARAMETER_TYPE);
  }

  public List<Type> getParameterTypes() {
    return this.getChildren(FunctionType.PARAMETER_TYPE);
  }

  public void addParameterType(Type node) {
    this.addChild(FunctionType.PARAMETER_TYPE, node);
  }

  public void insertParameterType(Type prev, Type node) {
    this.insertChild(prev, FunctionType.PARAMETER_TYPE, node);
  }

  public int getThrowsTypesCount() {
    return this.getChildCount(FunctionType.THROWS_TYPE);
  }

  public Iterator<ClassifierType> throwsTypes() {
    return this.children(FunctionType.THROWS_TYPE);
  }

  public List<ClassifierType> getThrowsTypes() {
    return this.getChildren(FunctionType.THROWS_TYPE);
  }

  public void addThrowsType(ClassifierType node) {
    this.addChild(FunctionType.THROWS_TYPE, node);
  }

  public void insertThrowsType(ClassifierType prev, ClassifierType node) {
    this.insertChild(prev, FunctionType.THROWS_TYPE, node);
  }

}
