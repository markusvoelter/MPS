package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractProjectComponent extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.AbstractProjectComponent";
  public static final String CPR_AcceptFiles = "acceptFiles";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TITLE = "title";
  public static final String CONFIGURATION = "configuration";
  public static final String _$ATTRIBUTE = "_$attribute";

  public AbstractProjectComponent(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(AbstractProjectComponent.NAME);
  }

  public void setName(String value) {
    this.setProperty(AbstractProjectComponent.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AbstractProjectComponent.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AbstractProjectComponent.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AbstractProjectComponent.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AbstractProjectComponent.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AbstractProjectComponent.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AbstractProjectComponent.VIRTUAL_PACKAGE, value);
  }

  public IStringExpression getTitle() {
    return (IStringExpression) this.getChild(IStringExpression.class, AbstractProjectComponent.TITLE);
  }

  public void setTitle(IStringExpression node) {
    super.setChild(AbstractProjectComponent.TITLE, node);
  }

  public int getConfigurationsCount() {
    return this.getChildCount(AbstractProjectComponent.CONFIGURATION);
  }

  public Iterator<ConfigurationReference> configurations() {
    return this.children(ConfigurationReference.class, AbstractProjectComponent.CONFIGURATION);
  }

  public List<ConfigurationReference> getConfigurations() {
    return this.getChildren(ConfigurationReference.class, AbstractProjectComponent.CONFIGURATION);
  }

  public void addConfiguration(ConfigurationReference node) {
    this.addChild(AbstractProjectComponent.CONFIGURATION, node);
  }

  public void insertConfiguration(ConfigurationReference prev, ConfigurationReference node) {
    this.insertChild(prev, AbstractProjectComponent.CONFIGURATION, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(AbstractProjectComponent._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, AbstractProjectComponent._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, AbstractProjectComponent._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(AbstractProjectComponent._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, AbstractProjectComponent._$ATTRIBUTE, node);
  }

  public static AbstractProjectComponent newInstance(SModel sm, boolean init) {
    return (AbstractProjectComponent) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.AbstractProjectComponent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractProjectComponent newInstance(SModel sm) {
    return AbstractProjectComponent.newInstance(sm, false);
  }
}
