package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TestMethod extends InstanceMethodDeclaration implements ITestMethod {
  public static final String concept = "jetbrains.mps.baseLanguage.unitTest.structure.TestMethod";
  public static final String METHOD_NAME = "methodName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public TestMethod(SNode node) {
    super(node);
  }

  public String getMethodName() {
    return this.getProperty(TestMethod.METHOD_NAME);
  }

  public void setMethodName(String value) {
    this.setProperty(TestMethod.METHOD_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TestMethod.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TestMethod.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TestMethod.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TestMethod.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TestMethod.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TestMethod.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(TestMethod._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, TestMethod._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, TestMethod._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(TestMethod._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, TestMethod._$ATTRIBUTE, node);
  }

  public static TestMethod newInstance(SModel sm, boolean init) {
    return (TestMethod) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TestMethod newInstance(SModel sm) {
    return TestMethod.newInstance(sm, false);
  }
}
