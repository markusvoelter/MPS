package jetbrains.mps.lang.editor.editorTest.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BracesStubBlock extends BaseConcept implements IBaseTestBlock {
  public static final String concept = "jetbrains.mps.lang.editor.editorTest.structure.BracesStubBlock";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public BracesStubBlock(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BracesStubBlock.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BracesStubBlock.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BracesStubBlock.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BracesStubBlock.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BracesStubBlock.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BracesStubBlock.VIRTUAL_PACKAGE, value);
  }


  public static BracesStubBlock newInstance(SModel sm, boolean init) {
    return (BracesStubBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.editorTest.structure.BracesStubBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BracesStubBlock newInstance(SModel sm) {
    return BracesStubBlock.newInstance(sm, false);
  }

}
