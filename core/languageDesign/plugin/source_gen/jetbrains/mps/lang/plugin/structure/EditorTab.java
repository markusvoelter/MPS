package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EditorTab extends BaseConcept implements INamedConcept, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.EditorTab";
  public static final String SHORTCUT_CHAR = "shortcutChar";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String COMMAND_ON_CREATE = "commandOnCreate";
  public static final String BASE_NODE_CONCEPT = "baseNodeConcept";
  public static final String ORDER = "order";
  public static final String LISTEN_BLOCK = "listenBlock";
  public static final String BASE_NODE_BLOCK = "baseNodeBlock";
  public static final String IS_APPLICABLE_BLOCK = "isApplicableBlock";
  public static final String NODES_BLOCK = "nodesBlock";
  public static final String CONCEPTS_BLOCK = "conceptsBlock";
  public static final String CREATE_BLOCK = "createBlock";

  public EditorTab(SNode node) {
    super(node);
  }

  public String getShortcutChar() {
    return this.getProperty(EditorTab.SHORTCUT_CHAR);
  }

  public void setShortcutChar(String value) {
    this.setProperty(EditorTab.SHORTCUT_CHAR, value);
  }

  public String getName() {
    return this.getProperty(EditorTab.NAME);
  }

  public void setName(String value) {
    this.setProperty(EditorTab.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EditorTab.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EditorTab.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EditorTab.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EditorTab.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EditorTab.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EditorTab.VIRTUAL_PACKAGE, value);
  }

  public boolean getCommandOnCreate() {
    return this.getBooleanProperty(EditorTab.COMMAND_ON_CREATE);
  }

  public void setCommandOnCreate(boolean value) {
    this.setBooleanProperty(EditorTab.COMMAND_ON_CREATE, value);
  }

  public AbstractConceptDeclaration getBaseNodeConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, EditorTab.BASE_NODE_CONCEPT);
  }

  public void setBaseNodeConcept(AbstractConceptDeclaration node) {
    super.setReferent(EditorTab.BASE_NODE_CONCEPT, node);
  }

  public OrderConstraints getOrder() {
    return (OrderConstraints) this.getChild(OrderConstraints.class, EditorTab.ORDER);
  }

  public void setOrder(OrderConstraints node) {
    super.setChild(EditorTab.ORDER, node);
  }

  public ListenBlock getListenBlock() {
    return (ListenBlock) this.getChild(ListenBlock.class, EditorTab.LISTEN_BLOCK);
  }

  public void setListenBlock(ListenBlock node) {
    super.setChild(EditorTab.LISTEN_BLOCK, node);
  }

  public BaseNodeBlock getBaseNodeBlock() {
    return (BaseNodeBlock) this.getChild(BaseNodeBlock.class, EditorTab.BASE_NODE_BLOCK);
  }

  public void setBaseNodeBlock(BaseNodeBlock node) {
    super.setChild(EditorTab.BASE_NODE_BLOCK, node);
  }

  public IsApplicableTabBlock getIsApplicableBlock() {
    return (IsApplicableTabBlock) this.getChild(IsApplicableTabBlock.class, EditorTab.IS_APPLICABLE_BLOCK);
  }

  public void setIsApplicableBlock(IsApplicableTabBlock node) {
    super.setChild(EditorTab.IS_APPLICABLE_BLOCK, node);
  }

  public NodesBlock getNodesBlock() {
    return (NodesBlock) this.getChild(NodesBlock.class, EditorTab.NODES_BLOCK);
  }

  public void setNodesBlock(NodesBlock node) {
    super.setChild(EditorTab.NODES_BLOCK, node);
  }

  public GetConceptsBlock getConceptsBlock() {
    return (GetConceptsBlock) this.getChild(GetConceptsBlock.class, EditorTab.CONCEPTS_BLOCK);
  }

  public void setConceptsBlock(GetConceptsBlock node) {
    super.setChild(EditorTab.CONCEPTS_BLOCK, node);
  }

  public NewCreateBlock getCreateBlock() {
    return (NewCreateBlock) this.getChild(NewCreateBlock.class, EditorTab.CREATE_BLOCK);
  }

  public void setCreateBlock(NewCreateBlock node) {
    super.setChild(EditorTab.CREATE_BLOCK, node);
  }

  public static EditorTab newInstance(SModel sm, boolean init) {
    return (EditorTab) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.EditorTab", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EditorTab newInstance(SModel sm) {
    return EditorTab.newInstance(sm, false);
  }
}
