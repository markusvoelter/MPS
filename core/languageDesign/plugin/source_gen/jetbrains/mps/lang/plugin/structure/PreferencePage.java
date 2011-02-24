package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PreferencePage extends BaseConcept implements INamedConcept, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.PreferencePage";
  public static final String ICON = "icon";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String COMPONENT = "component";
  public static final String IS_MODIFIED_BLOCK = "isModifiedBlock";
  public static final String RESET_BLOCK = "resetBlock";
  public static final String COMMIT_BLOCK = "commitBlock";
  public static final String _$ATTRIBUTE = "_$attribute";

  public PreferencePage(SNode node) {
    super(node);
  }

  public String getIcon() {
    return this.getProperty(PreferencePage.ICON);
  }

  public void setIcon(String value) {
    this.setProperty(PreferencePage.ICON, value);
  }

  public String getName() {
    return this.getProperty(PreferencePage.NAME);
  }

  public void setName(String value) {
    this.setProperty(PreferencePage.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PreferencePage.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PreferencePage.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PreferencePage.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PreferencePage.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PreferencePage.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PreferencePage.VIRTUAL_PACKAGE, value);
  }

  public Expression getComponent() {
    return (Expression) this.getChild(Expression.class, PreferencePage.COMPONENT);
  }

  public void setComponent(Expression node) {
    super.setChild(PreferencePage.COMPONENT, node);
  }

  public PreferencePageIsModifiedBlock getIsModifiedBlock() {
    return (PreferencePageIsModifiedBlock) this.getChild(PreferencePageIsModifiedBlock.class, PreferencePage.IS_MODIFIED_BLOCK);
  }

  public void setIsModifiedBlock(PreferencePageIsModifiedBlock node) {
    super.setChild(PreferencePage.IS_MODIFIED_BLOCK, node);
  }

  public PreferencePageResetBlock getResetBlock() {
    return (PreferencePageResetBlock) this.getChild(PreferencePageResetBlock.class, PreferencePage.RESET_BLOCK);
  }

  public void setResetBlock(PreferencePageResetBlock node) {
    super.setChild(PreferencePage.RESET_BLOCK, node);
  }

  public PreferencePageCommitBlock getCommitBlock() {
    return (PreferencePageCommitBlock) this.getChild(PreferencePageCommitBlock.class, PreferencePage.COMMIT_BLOCK);
  }

  public void setCommitBlock(PreferencePageCommitBlock node) {
    super.setChild(PreferencePage.COMMIT_BLOCK, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(PreferencePage._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, PreferencePage._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, PreferencePage._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(PreferencePage._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PreferencePage._$ATTRIBUTE, node);
  }

  public static PreferencePage newInstance(SModel sm, boolean init) {
    return (PreferencePage) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.PreferencePage", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PreferencePage newInstance(SModel sm) {
    return PreferencePage.newInstance(sm, false);
  }
}
