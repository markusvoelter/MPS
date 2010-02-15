package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import java.util.Iterator;
import java.util.List;

public interface IMethodCall extends TypeDerivable, TypeAnnotable {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.IMethodCall";
  public static final String TYPE_ARGUMENT = "typeArgument";
  public static final String ACTUAL_ARGUMENT = "actualArgument";
  public static final String BASE_METHOD_DECLARATION = "baseMethodDeclaration";

  public int getActualArgumentsCount();
  public Iterator<Expression> actualArguments();
  public List<Expression> getActualArguments();
  public void addActualArgument(Expression node);
  public void insertActualArgument(Expression prev, Expression node);
  public BaseMethodDeclaration getBaseMethodDeclaration();
  public void setBaseMethodDeclaration(BaseMethodDeclaration node);
}
