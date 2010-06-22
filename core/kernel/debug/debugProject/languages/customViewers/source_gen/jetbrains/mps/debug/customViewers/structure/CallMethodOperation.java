package jetbrains.mps.debug.customViewers.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CallMethodOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.debug.customViewers.structure.CallMethodOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String METHOD_NAME = "methodName";
  public static final String SIGNATURE = "signature";
  public static final String ARGUMENTS = "arguments";

  public CallMethodOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CallMethodOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CallMethodOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CallMethodOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CallMethodOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CallMethodOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CallMethodOperation.VIRTUAL_PACKAGE, value);
  }

  public Expression getMethodName() {
    return (Expression) this.getChild(Expression.class, CallMethodOperation.METHOD_NAME);
  }

  public void setMethodName(Expression node) {
    super.setChild(CallMethodOperation.METHOD_NAME, node);
  }

  public Expression getSignature() {
    return (Expression) this.getChild(Expression.class, CallMethodOperation.SIGNATURE);
  }

  public void setSignature(Expression node) {
    super.setChild(CallMethodOperation.SIGNATURE, node);
  }

  public int getArgumentsesCount() {
    return this.getChildCount(CallMethodOperation.ARGUMENTS);
  }

  public Iterator<Expression> argumentses() {
    return this.children(Expression.class, CallMethodOperation.ARGUMENTS);
  }

  public List<Expression> getArgumentses() {
    return this.getChildren(Expression.class, CallMethodOperation.ARGUMENTS);
  }

  public void addArguments(Expression node) {
    this.addChild(CallMethodOperation.ARGUMENTS, node);
  }

  public void insertArguments(Expression prev, Expression node) {
    this.insertChild(prev, CallMethodOperation.ARGUMENTS, node);
  }

  public static CallMethodOperation newInstance(SModel sm, boolean init) {
    return (CallMethodOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.customViewers.structure.CallMethodOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CallMethodOperation newInstance(SModel sm) {
    return CallMethodOperation.newInstance(sm, false);
  }
}
