package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.BaseScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseMethodDeclaration extends BaseConcept implements BaseScope, BaseScope, BaseScope, BaseScope, BaseScope, BaseScope, BaseScope {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_FINAL = "isFinal";
  public static final String IS_DEPRECATED = "isDeprecated";
  public static final String RETURN_TYPE = "returnType";
  public static final String BODY = "body";
  public static final String PARAMETER = "parameter";
  public static final String THROWS_ITEM = "throwsItem";
  public static final String ANNOTATION = "annotation";

  public BaseMethodDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(BaseMethodDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(BaseMethodDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BaseMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseMethodDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseMethodDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseMethodDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsFinal() {
    return this.getBooleanProperty(BaseMethodDeclaration.IS_FINAL);
  }

  public void setIsFinal(boolean value) {
    this.setBooleanProperty(BaseMethodDeclaration.IS_FINAL, value);
  }

  public boolean getIsDeprecated() {
    return this.getBooleanProperty(BaseMethodDeclaration.IS_DEPRECATED);
  }

  public void setIsDeprecated(boolean value) {
    this.setBooleanProperty(BaseMethodDeclaration.IS_DEPRECATED, value);
  }

  public INodeAdapter getReturnType() {
    return (INodeAdapter)this.getChild(, BaseMethodDeclaration.RETURN_TYPE);
  }

  public void setReturnType(INodeAdapter node) {
    super.setChild(BaseMethodDeclaration.RETURN_TYPE, node);
  }

  public INodeAdapter getBody() {
    return (INodeAdapter)this.getChild(, BaseMethodDeclaration.BODY);
  }

  public void setBody(INodeAdapter node) {
    super.setChild(BaseMethodDeclaration.BODY, node);
  }

  public int getParametersCount() {
    return this.getChildCount(BaseMethodDeclaration.PARAMETER);
  }

  public Iterator<INodeAdapter> parameters() {
    return this.children(, BaseMethodDeclaration.PARAMETER);
  }

  public List<INodeAdapter> getParameters() {
    return this.getChildren(, BaseMethodDeclaration.PARAMETER);
  }

  public void addParameter(INodeAdapter node) {
    this.addChild(BaseMethodDeclaration.PARAMETER, node);
  }

  public void insertParameter(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, BaseMethodDeclaration.PARAMETER, node);
  }

  public int getThrowsItemsCount() {
    return this.getChildCount(BaseMethodDeclaration.THROWS_ITEM);
  }

  public Iterator<INodeAdapter> throwsItems() {
    return this.children(, BaseMethodDeclaration.THROWS_ITEM);
  }

  public List<INodeAdapter> getThrowsItems() {
    return this.getChildren(, BaseMethodDeclaration.THROWS_ITEM);
  }

  public void addThrowsItem(INodeAdapter node) {
    this.addChild(BaseMethodDeclaration.THROWS_ITEM, node);
  }

  public void insertThrowsItem(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, BaseMethodDeclaration.THROWS_ITEM, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(BaseMethodDeclaration.ANNOTATION);
  }

  public Iterator<INodeAdapter> annotations() {
    return this.children(, BaseMethodDeclaration.ANNOTATION);
  }

  public List<INodeAdapter> getAnnotations() {
    return this.getChildren(, BaseMethodDeclaration.ANNOTATION);
  }

  public void addAnnotation(INodeAdapter node) {
    this.addChild(BaseMethodDeclaration.ANNOTATION, node);
  }

  public void insertAnnotation(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, BaseMethodDeclaration.ANNOTATION, node);
  }


  public static BaseMethodDeclaration newInstance(SModel sm, boolean init) {
    return (BaseMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseMethodDeclaration newInstance(SModel sm) {
    return BaseMethodDeclaration.newInstance(sm, false);
  }

}
