package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.test.structure.INodeAnnotattion;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TestNodeAnnotation extends BaseConcept implements INamedConcept, INodeAnnotattion {
  public static final String concept = "jetbrains.mps.lang.test.structure.TestNodeAnnotation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";

  public TestNodeAnnotation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(TestNodeAnnotation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TestNodeAnnotation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TestNodeAnnotation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TestNodeAnnotation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TestNodeAnnotation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TestNodeAnnotation.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(TestNodeAnnotation.NAME);
  }

  public void setName(String value) {
    this.setProperty(TestNodeAnnotation.NAME, value);
  }


  public static TestNodeAnnotation newInstance(SModel sm, boolean init) {
    return (TestNodeAnnotation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.TestNodeAnnotation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TestNodeAnnotation newInstance(SModel sm) {
    return TestNodeAnnotation.newInstance(sm, false);
  }

}
