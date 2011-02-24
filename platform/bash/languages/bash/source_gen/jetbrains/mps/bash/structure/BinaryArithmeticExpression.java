package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BinaryArithmeticExpression extends ArithmeticExpression implements IPriorityExpression {
  public static final String concept = "jetbrains.mps.bash.structure.BinaryArithmeticExpression";
  public static final String CPR_Sign = "sign";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LEFT_EXPRESSION = "leftExpression";
  public static final String RIGHT_EXPRESSION = "rightExpression";
  public static final String _$ATTRIBUTE = "_$attribute";

  public BinaryArithmeticExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BinaryArithmeticExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BinaryArithmeticExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BinaryArithmeticExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BinaryArithmeticExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BinaryArithmeticExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BinaryArithmeticExpression.VIRTUAL_PACKAGE, value);
  }

  public ArithmeticExpression getLeftExpression() {
    return (ArithmeticExpression) this.getChild(ArithmeticExpression.class, BinaryArithmeticExpression.LEFT_EXPRESSION);
  }

  public void setLeftExpression(ArithmeticExpression node) {
    super.setChild(BinaryArithmeticExpression.LEFT_EXPRESSION, node);
  }

  public ArithmeticExpression getRightExpression() {
    return (ArithmeticExpression) this.getChild(ArithmeticExpression.class, BinaryArithmeticExpression.RIGHT_EXPRESSION);
  }

  public void setRightExpression(ArithmeticExpression node) {
    super.setChild(BinaryArithmeticExpression.RIGHT_EXPRESSION, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(BinaryArithmeticExpression._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, BinaryArithmeticExpression._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, BinaryArithmeticExpression._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(BinaryArithmeticExpression._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, BinaryArithmeticExpression._$ATTRIBUTE, node);
  }

  public static BinaryArithmeticExpression newInstance(SModel sm, boolean init) {
    return (BinaryArithmeticExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BinaryArithmeticExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BinaryArithmeticExpression newInstance(SModel sm) {
    return BinaryArithmeticExpression.newInstance(sm, false);
  }
}
