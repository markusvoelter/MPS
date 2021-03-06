package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatrixConstructor extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.MatrixConstructor";
  public static final String COLUMN = "column";
  public static final String COMPONENTS = "components";

  public MatrixConstructor(SNode node) {
    super(node);
  }

  public boolean getColumn() {
    return this.getBooleanProperty(MatrixConstructor.COLUMN);
  }

  public void setColumn(boolean value) {
    this.setBooleanProperty(MatrixConstructor.COLUMN, value);
  }

  public int getComponentsesCount() {
    return this.getChildCount(MatrixConstructor.COMPONENTS);
  }

  public Iterator<Expression> componentses() {
    return this.children(Expression.class, MatrixConstructor.COMPONENTS);
  }

  public List<Expression> getComponentses() {
    return this.getChildren(Expression.class, MatrixConstructor.COMPONENTS);
  }

  public void addComponents(Expression node) {
    this.addChild(MatrixConstructor.COMPONENTS, node);
  }

  public void insertComponents(Expression prev, Expression node) {
    this.insertChild(prev, MatrixConstructor.COMPONENTS, node);
  }

  public static MatrixConstructor newInstance(SModel sm, boolean init) {
    return (MatrixConstructor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.MatrixConstructor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatrixConstructor newInstance(SModel sm) {
    return MatrixConstructor.newInstance(sm, false);
  }
}
