package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;

public class ArrayCreatorWithInitializer extends AbstractCreator {
  public static String COMPONENT_TYPE = "componentType";
  public static String INIT_VALUE = "initValue";

  public  ArrayCreatorWithInitializer(SNode node) {
    super(node);
  }

  public Type getComponentType() {
    return (Type)this.getChild(ArrayCreatorWithInitializer.COMPONENT_TYPE);
  }
  public void setComponentType(Type node) {
    super.setChild(ArrayCreatorWithInitializer.COMPONENT_TYPE, node);
  }
  public int getInitValuesCount() {
    return this.getChildCount(ArrayCreatorWithInitializer.INIT_VALUE);
  }
  public Iterator<Expression> initValues() {
    return this.children(ArrayCreatorWithInitializer.INIT_VALUE);
  }
  public List<Expression> getInitValues() {
    return this.getChildren(ArrayCreatorWithInitializer.INIT_VALUE);
  }
  public void addInitValue(Expression node) {
    this.addChild(ArrayCreatorWithInitializer.INIT_VALUE, node);
  }
  public void insertInitValue(Expression prev, Expression node) {
    this.insertChild(prev, ArrayCreatorWithInitializer.INIT_VALUE, node);
  }
}
