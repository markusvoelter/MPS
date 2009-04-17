package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.plugin.structure.OnAfterReadBlock;
import jetbrains.mps.lang.plugin.structure.OnBeforeWriteBlock;
import java.util.Iterator;
import jetbrains.mps.lang.plugin.structure.PersistentPropertyDeclaration;
import java.util.List;
import jetbrains.mps.lang.plugin.structure.PreferencePage;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PreferencesComponentDeclaration extends BaseConcept implements IClassifier {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.PreferencesComponentDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String AFTER_READ_BLOCK = "afterReadBlock";
  public static final String BEFORE_WRITE_BLOCK = "beforeWriteBlock";
  public static final String PERSISTEN_PROPERTY_DECLARATION = "persistenPropertyDeclaration";
  public static final String PREFERENCE_PAGE = "preferencePage";

  public PreferencesComponentDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PreferencesComponentDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(PreferencesComponentDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PreferencesComponentDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PreferencesComponentDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PreferencesComponentDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PreferencesComponentDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PreferencesComponentDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PreferencesComponentDeclaration.VIRTUAL_PACKAGE, value);
  }

  public OnAfterReadBlock getAfterReadBlock() {
    return (OnAfterReadBlock)this.getChild(OnAfterReadBlock.class, PreferencesComponentDeclaration.AFTER_READ_BLOCK);
  }

  public void setAfterReadBlock(OnAfterReadBlock node) {
    super.setChild(PreferencesComponentDeclaration.AFTER_READ_BLOCK, node);
  }

  public OnBeforeWriteBlock getBeforeWriteBlock() {
    return (OnBeforeWriteBlock)this.getChild(OnBeforeWriteBlock.class, PreferencesComponentDeclaration.BEFORE_WRITE_BLOCK);
  }

  public void setBeforeWriteBlock(OnBeforeWriteBlock node) {
    super.setChild(PreferencesComponentDeclaration.BEFORE_WRITE_BLOCK, node);
  }

  public int getPersistenPropertyDeclarationsCount() {
    return this.getChildCount(PreferencesComponentDeclaration.PERSISTEN_PROPERTY_DECLARATION);
  }

  public Iterator<PersistentPropertyDeclaration> persistenPropertyDeclarations() {
    return this.children(PersistentPropertyDeclaration.class, PreferencesComponentDeclaration.PERSISTEN_PROPERTY_DECLARATION);
  }

  public List<PersistentPropertyDeclaration> getPersistenPropertyDeclarations() {
    return this.getChildren(PersistentPropertyDeclaration.class, PreferencesComponentDeclaration.PERSISTEN_PROPERTY_DECLARATION);
  }

  public void addPersistenPropertyDeclaration(PersistentPropertyDeclaration node) {
    this.addChild(PreferencesComponentDeclaration.PERSISTEN_PROPERTY_DECLARATION, node);
  }

  public void insertPersistenPropertyDeclaration(PersistentPropertyDeclaration prev, PersistentPropertyDeclaration node) {
    this.insertChild(prev, PreferencesComponentDeclaration.PERSISTEN_PROPERTY_DECLARATION, node);
  }

  public int getPreferencePagesCount() {
    return this.getChildCount(PreferencesComponentDeclaration.PREFERENCE_PAGE);
  }

  public Iterator<PreferencePage> preferencePages() {
    return this.children(PreferencePage.class, PreferencesComponentDeclaration.PREFERENCE_PAGE);
  }

  public List<PreferencePage> getPreferencePages() {
    return this.getChildren(PreferencePage.class, PreferencesComponentDeclaration.PREFERENCE_PAGE);
  }

  public void addPreferencePage(PreferencePage node) {
    this.addChild(PreferencesComponentDeclaration.PREFERENCE_PAGE, node);
  }

  public void insertPreferencePage(PreferencePage prev, PreferencePage node) {
    this.insertChild(prev, PreferencesComponentDeclaration.PREFERENCE_PAGE, node);
  }


  public static PreferencesComponentDeclaration newInstance(SModel sm, boolean init) {
    return (PreferencesComponentDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.PreferencesComponentDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PreferencesComponentDeclaration newInstance(SModel sm) {
    return PreferencesComponentDeclaration.newInstance(sm, false);
  }

}
