package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class Project extends BaseConcept implements INamedConcept, IPropertyHolder {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.Project";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String DEFAULT = "default";
  public static String DEFINITIONS = "definitions";
  public static String BASEDIR = "basedir";
  public static String TARGET = "target";
  public static String PATHS = "paths";
  public static String IMPORT_PROPERTIES = "importProperties";
  public static String PROPERTY = "property";

  public  Project(SNode node) {
    super(node);
  }

  public static Project newInstance(SModel sm, boolean init) {
    return (Project)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.Project", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Project newInstance(SModel sm) {
    return Project.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(Project.NAME);
  }

  public void setName(String value) {
    this.setProperty(Project.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Project.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Project.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Project.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Project.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Project.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Project.VIRTUAL_PACKAGE, value);
  }

  public TargetReference getDefault() {
    return (TargetReference)this.getChild(Project.DEFAULT);
  }

  public void setDefault(TargetReference node) {
    super.setChild(Project.DEFAULT, node);
  }

  public Definitions getDefinitions() {
    return (Definitions)this.getChild(Project.DEFINITIONS);
  }

  public void setDefinitions(Definitions node) {
    super.setChild(Project.DEFINITIONS, node);
  }

  public FileName getBasedir() {
    return (FileName)this.getChild(Project.BASEDIR);
  }

  public void setBasedir(FileName node) {
    super.setChild(Project.BASEDIR, node);
  }

  public int getTargetsCount() {
    return this.getChildCount(Project.TARGET);
  }

  public Iterator<TargetDeclaration> targets() {
    return this.children(Project.TARGET);
  }

  public List<TargetDeclaration> getTargets() {
    return this.getChildren(Project.TARGET);
  }

  public void addTarget(TargetDeclaration node) {
    this.addChild(Project.TARGET, node);
  }

  public void insertTarget(TargetDeclaration prev, TargetDeclaration node) {
    this.insertChild(prev, Project.TARGET, node);
  }

  public int getPathsesCount() {
    return this.getChildCount(Project.PATHS);
  }

  public Iterator<GenericCall> pathses() {
    return this.children(Project.PATHS);
  }

  public List<GenericCall> getPathses() {
    return this.getChildren(Project.PATHS);
  }

  public void addPaths(GenericCall node) {
    this.addChild(Project.PATHS, node);
  }

  public void insertPaths(GenericCall prev, GenericCall node) {
    this.insertChild(prev, Project.PATHS, node);
  }

  public int getImportPropertiesesCount() {
    return this.getChildCount(Project.IMPORT_PROPERTIES);
  }

  public Iterator<ImportProperties> importPropertieses() {
    return this.children(Project.IMPORT_PROPERTIES);
  }

  public List<ImportProperties> getImportPropertieses() {
    return this.getChildren(Project.IMPORT_PROPERTIES);
  }

  public void addImportProperties(ImportProperties node) {
    this.addChild(Project.IMPORT_PROPERTIES, node);
  }

  public void insertImportProperties(ImportProperties prev, ImportProperties node) {
    this.insertChild(prev, Project.IMPORT_PROPERTIES, node);
  }

  public int getPropertysCount() {
    return this.getChildCount(Project.PROPERTY);
  }

  public Iterator<PropertyDeclaration> propertys() {
    return this.children(Project.PROPERTY);
  }

  public List<PropertyDeclaration> getPropertys() {
    return this.getChildren(Project.PROPERTY);
  }

  public void addProperty(PropertyDeclaration node) {
    this.addChild(Project.PROPERTY, node);
  }

  public void insertProperty(PropertyDeclaration prev, PropertyDeclaration node) {
    this.insertChild(prev, Project.PROPERTY, node);
  }

}
