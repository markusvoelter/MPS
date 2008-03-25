package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class InputRoot extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.transformation.test.inputLang.structure.InputRoot";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String USE_IN_TEST = "useInTest";
  public static String INPUT_CHILD = "inputChild";

  public  InputRoot(SNode node) {
    super(node);
  }

  public static InputRoot newInstance(SModel sm, boolean init) {
    return (InputRoot)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.inputLang.structure.InputRoot", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputRoot newInstance(SModel sm) {
    return InputRoot.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(InputRoot.NAME);
  }

  public void setName(String value) {
    this.setProperty(InputRoot.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InputRoot.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InputRoot.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InputRoot.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InputRoot.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InputRoot.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InputRoot.VIRTUAL_PACKAGE, value);
  }

  public UseInTest getUseInTest() {
    String value = super.getProperty(InputRoot.USE_IN_TEST);
    return UseInTest.parseValue(value);
  }

  public void setUseInTest(UseInTest value) {
    super.setProperty(InputRoot.USE_IN_TEST, value.getValueAsString());
  }

  public int getInputChildsCount() {
    return this.getChildCount(InputRoot.INPUT_CHILD);
  }

  public Iterator<InputNode> inputChilds() {
    return this.children(InputRoot.INPUT_CHILD);
  }

  public List<InputNode> getInputChilds() {
    return this.getChildren(InputRoot.INPUT_CHILD);
  }

  public void addInputChild(InputNode node) {
    this.addChild(InputRoot.INPUT_CHILD, node);
  }

  public void insertInputChild(InputNode prev, InputNode node) {
    this.insertChild(prev, InputRoot.INPUT_CHILD, node);
  }

}
