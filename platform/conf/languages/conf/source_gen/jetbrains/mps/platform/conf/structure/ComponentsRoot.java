package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComponentsRoot extends ConfigurationXmlNode implements IConfiguration {
  public static final String concept = "jetbrains.mps.platform.conf.structure.ComponentsRoot";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FRAGMENT = "fragment";
  public static final String _$ATTRIBUTE = "_$attribute";

  public ComponentsRoot(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ComponentsRoot.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ComponentsRoot.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ComponentsRoot.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ComponentsRoot.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ComponentsRoot.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ComponentsRoot.VIRTUAL_PACKAGE, value);
  }

  public int getFragmentsCount() {
    return this.getChildCount(ComponentsRoot.FRAGMENT);
  }

  public Iterator<IConfigurationFragment> fragments() {
    return this.children(IConfigurationFragment.class, ComponentsRoot.FRAGMENT);
  }

  public List<IConfigurationFragment> getFragments() {
    return this.getChildren(IConfigurationFragment.class, ComponentsRoot.FRAGMENT);
  }

  public void addFragment(IConfigurationFragment node) {
    this.addChild(ComponentsRoot.FRAGMENT, node);
  }

  public void insertFragment(IConfigurationFragment prev, IConfigurationFragment node) {
    this.insertChild(prev, ComponentsRoot.FRAGMENT, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ComponentsRoot._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ComponentsRoot._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ComponentsRoot._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ComponentsRoot._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ComponentsRoot._$ATTRIBUTE, node);
  }

  public static ComponentsRoot newInstance(SModel sm, boolean init) {
    return (ComponentsRoot) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.platform.conf.structure.ComponentsRoot", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComponentsRoot newInstance(SModel sm) {
    return ComponentsRoot.newInstance(sm, false);
  }
}
