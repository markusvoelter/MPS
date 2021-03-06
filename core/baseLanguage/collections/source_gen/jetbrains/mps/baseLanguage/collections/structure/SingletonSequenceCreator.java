package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SingletonSequenceCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SingletonSequenceCreator";
  public static final String ELEMENT_TYPE = "elementType";
  public static final String SINGLETON_VALUE = "singletonValue";

  public SingletonSequenceCreator(SNode node) {
    super(node);
  }

  public Type getElementType() {
    return (Type) this.getChild(Type.class, SingletonSequenceCreator.ELEMENT_TYPE);
  }

  public void setElementType(Type node) {
    super.setChild(SingletonSequenceCreator.ELEMENT_TYPE, node);
  }

  public Expression getSingletonValue() {
    return (Expression) this.getChild(Expression.class, SingletonSequenceCreator.SINGLETON_VALUE);
  }

  public void setSingletonValue(Expression node) {
    super.setChild(SingletonSequenceCreator.SINGLETON_VALUE, node);
  }

  public static SingletonSequenceCreator newInstance(SModel sm, boolean init) {
    return (SingletonSequenceCreator) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SingletonSequenceCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SingletonSequenceCreator newInstance(SModel sm) {
    return SingletonSequenceCreator.newInstance(sm, false);
  }
}
