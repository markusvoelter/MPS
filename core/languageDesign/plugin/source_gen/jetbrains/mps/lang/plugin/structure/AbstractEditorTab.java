package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractEditorTab extends BaseConcept implements IClassifier, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.AbstractEditorTab";
  public static final String EMPTY_CAPTION = "emptyCaption";
  public static final String SHORTCUT_CHAR = "shortcutChar";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String OUTSIDE_COMMAND = "outsideCommand";
  public static final String BASE_NODE_CONCEPT = "baseNodeConcept";
  public static final String GOES_AFTER = "goesAfter";
  public static final String BASE_NODE_BLOCK = "baseNodeBlock";
  public static final String INIT_BLOCK = "initBlock";
  public static final String ASK_BLOCK = "askBlock";
  public static final String CREATE_BLOCK = "createBlock";

  public AbstractEditorTab(SNode node) {
    super(node);
  }

  public String getEmptyCaption() {
    return this.getProperty(AbstractEditorTab.EMPTY_CAPTION);
  }

  public void setEmptyCaption(String value) {
    this.setProperty(AbstractEditorTab.EMPTY_CAPTION, value);
  }

  public String getShortcutChar() {
    return this.getProperty(AbstractEditorTab.SHORTCUT_CHAR);
  }

  public void setShortcutChar(String value) {
    this.setProperty(AbstractEditorTab.SHORTCUT_CHAR, value);
  }

  public String getName() {
    return this.getProperty(AbstractEditorTab.NAME);
  }

  public void setName(String value) {
    this.setProperty(AbstractEditorTab.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AbstractEditorTab.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AbstractEditorTab.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AbstractEditorTab.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AbstractEditorTab.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AbstractEditorTab.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AbstractEditorTab.VIRTUAL_PACKAGE, value);
  }

  public boolean getOutsideCommand() {
    return this.getBooleanProperty(AbstractEditorTab.OUTSIDE_COMMAND);
  }

  public void setOutsideCommand(boolean value) {
    this.setBooleanProperty(AbstractEditorTab.OUTSIDE_COMMAND, value);
  }

  public AbstractConceptDeclaration getBaseNodeConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, AbstractEditorTab.BASE_NODE_CONCEPT);
  }

  public void setBaseNodeConcept(AbstractConceptDeclaration node) {
    super.setReferent(AbstractEditorTab.BASE_NODE_CONCEPT, node);
  }

  public AbstractEditorTab getGoesAfter() {
    return (AbstractEditorTab) this.getReferent(AbstractEditorTab.class, AbstractEditorTab.GOES_AFTER);
  }

  public void setGoesAfter(AbstractEditorTab node) {
    super.setReferent(AbstractEditorTab.GOES_AFTER, node);
  }

  public GetBaseNodeBlock getBaseNodeBlock() {
    return (GetBaseNodeBlock) this.getChild(GetBaseNodeBlock.class, AbstractEditorTab.BASE_NODE_BLOCK);
  }

  public void setBaseNodeBlock(GetBaseNodeBlock node) {
    super.setChild(AbstractEditorTab.BASE_NODE_BLOCK, node);
  }

  public InitTabBlock getInitBlock() {
    return (InitTabBlock) this.getChild(InitTabBlock.class, AbstractEditorTab.INIT_BLOCK);
  }

  public void setInitBlock(InitTabBlock node) {
    super.setChild(AbstractEditorTab.INIT_BLOCK, node);
  }

  public AskBlock getAskBlock() {
    return (AskBlock) this.getChild(AskBlock.class, AbstractEditorTab.ASK_BLOCK);
  }

  public void setAskBlock(AskBlock node) {
    super.setChild(AbstractEditorTab.ASK_BLOCK, node);
  }

  public CreateBlock getCreateBlock() {
    return (CreateBlock) this.getChild(CreateBlock.class, AbstractEditorTab.CREATE_BLOCK);
  }

  public void setCreateBlock(CreateBlock node) {
    super.setChild(AbstractEditorTab.CREATE_BLOCK, node);
  }

  public static AbstractEditorTab newInstance(SModel sm, boolean init) {
    return (AbstractEditorTab) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.AbstractEditorTab", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractEditorTab newInstance(SModel sm) {
    return AbstractEditorTab.newInstance(sm, false);
  }
}
