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

public class InputNode extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.transformation.test.inputLang.structure.InputNode";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String INPUT_CHILD = "inputChild";

  public InputNode(SNode node) {
    super(node);
  }

  public static InputNode newInstance(SModel sm, boolean init) {
    return (InputNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.inputLang.structure.InputNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputNode newInstance(SModel sm) {
    return InputNode.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(InputNode.NAME);
  }

  public void setName(String value) {
    this.setProperty(InputNode.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InputNode.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InputNode.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InputNode.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InputNode.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InputNode.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InputNode.VIRTUAL_PACKAGE, value);
  }

  public int getInputChildsCount() {
    return this.getChildCount(InputNode.INPUT_CHILD);
  }

  public Iterator<InputNode> inputChilds() {
    return this.children(InputNode.INPUT_CHILD);
  }

  public List<InputNode> getInputChilds() {
    return this.getChildren(InputNode.INPUT_CHILD);
  }

  public void addInputChild(InputNode node) {
    this.addChild(InputNode.INPUT_CHILD, node);
  }

  public void insertInputChild(InputNode prev, InputNode node) {
    this.insertChild(prev, InputNode.INPUT_CHILD, node);
  }

}
