package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.plugin.structure.ProjectPluginInitBlock;
import jetbrains.mps.lang.plugin.structure.ProjectPluginDisposeBlock;
import jetbrains.mps.lang.plugin.structure.GetComponentBlock;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ToolDeclaration extends BaseConcept implements IClassifier {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ToolDeclaration";
  public static final String CAPTION = "caption";
  public static final String NUMBER = "number";
  public static final String ICON = "icon";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String INIT_BLOCK = "initBlock";
  public static final String DISPOSE_BLOCK = "disposeBlock";
  public static final String GET_COMPONENT_BLOCK = "getComponentBlock";
  public static final String METHOD_DECLARATION = "methodDeclaration";
  public static final String FIELD_DECLARATION = "fieldDeclaration";

  public ToolDeclaration(SNode node) {
    super(node);
  }

  public String getCaption() {
    return this.getProperty(ToolDeclaration.CAPTION);
  }

  public void setCaption(String value) {
    this.setProperty(ToolDeclaration.CAPTION, value);
  }

  public String getNumber() {
    return this.getProperty(ToolDeclaration.NUMBER);
  }

  public void setNumber(String value) {
    this.setProperty(ToolDeclaration.NUMBER, value);
  }

  public String getIcon() {
    return this.getProperty(ToolDeclaration.ICON);
  }

  public void setIcon(String value) {
    this.setProperty(ToolDeclaration.ICON, value);
  }

  public String getName() {
    return this.getProperty(ToolDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ToolDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ToolDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ToolDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ToolDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ToolDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ToolDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ToolDeclaration.VIRTUAL_PACKAGE, value);
  }

  public ProjectPluginInitBlock getInitBlock() {
    return (ProjectPluginInitBlock)this.getChild(ProjectPluginInitBlock.class, ToolDeclaration.INIT_BLOCK);
  }

  public void setInitBlock(ProjectPluginInitBlock node) {
    super.setChild(ToolDeclaration.INIT_BLOCK, node);
  }

  public ProjectPluginDisposeBlock getDisposeBlock() {
    return (ProjectPluginDisposeBlock)this.getChild(ProjectPluginDisposeBlock.class, ToolDeclaration.DISPOSE_BLOCK);
  }

  public void setDisposeBlock(ProjectPluginDisposeBlock node) {
    super.setChild(ToolDeclaration.DISPOSE_BLOCK, node);
  }

  public GetComponentBlock getGetComponentBlock() {
    return (GetComponentBlock)this.getChild(GetComponentBlock.class, ToolDeclaration.GET_COMPONENT_BLOCK);
  }

  public void setGetComponentBlock(GetComponentBlock node) {
    super.setChild(ToolDeclaration.GET_COMPONENT_BLOCK, node);
  }

  public int getMethodDeclarationsCount() {
    return this.getChildCount(ToolDeclaration.METHOD_DECLARATION);
  }

  public Iterator<DefaultClassifierMethodDeclaration> methodDeclarations() {
    return this.children(DefaultClassifierMethodDeclaration.class, ToolDeclaration.METHOD_DECLARATION);
  }

  public List<DefaultClassifierMethodDeclaration> getMethodDeclarations() {
    return this.getChildren(DefaultClassifierMethodDeclaration.class, ToolDeclaration.METHOD_DECLARATION);
  }

  public void addMethodDeclaration(DefaultClassifierMethodDeclaration node) {
    this.addChild(ToolDeclaration.METHOD_DECLARATION, node);
  }

  public void insertMethodDeclaration(DefaultClassifierMethodDeclaration prev, DefaultClassifierMethodDeclaration node) {
    this.insertChild(prev, ToolDeclaration.METHOD_DECLARATION, node);
  }

  public int getFieldDeclarationsCount() {
    return this.getChildCount(ToolDeclaration.FIELD_DECLARATION);
  }

  public Iterator<DefaultClassifierFieldDeclaration> fieldDeclarations() {
    return this.children(DefaultClassifierFieldDeclaration.class, ToolDeclaration.FIELD_DECLARATION);
  }

  public List<DefaultClassifierFieldDeclaration> getFieldDeclarations() {
    return this.getChildren(DefaultClassifierFieldDeclaration.class, ToolDeclaration.FIELD_DECLARATION);
  }

  public void addFieldDeclaration(DefaultClassifierFieldDeclaration node) {
    this.addChild(ToolDeclaration.FIELD_DECLARATION, node);
  }

  public void insertFieldDeclaration(DefaultClassifierFieldDeclaration prev, DefaultClassifierFieldDeclaration node) {
    this.insertChild(prev, ToolDeclaration.FIELD_DECLARATION, node);
  }


  public static ToolDeclaration newInstance(SModel sm, boolean init) {
    return (ToolDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ToolDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ToolDeclaration newInstance(SModel sm) {
    return ToolDeclaration.newInstance(sm, false);
  }

}
