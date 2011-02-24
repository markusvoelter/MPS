package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExtensionPoint extends BaseConcept implements INamedConcept, IConfigurationElement {
  public static final String concept = "jetbrains.mps.platform.conf.structure.ExtensionPoint";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public ExtensionPoint(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ExtensionPoint.NAME);
  }

  public void setName(String value) {
    this.setProperty(ExtensionPoint.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ExtensionPoint.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ExtensionPoint.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ExtensionPoint.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ExtensionPoint.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ExtensionPoint.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ExtensionPoint.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ExtensionPoint._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ExtensionPoint._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ExtensionPoint._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ExtensionPoint._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ExtensionPoint._$ATTRIBUTE, node);
  }

  public static ExtensionPoint newInstance(SModel sm, boolean init) {
    return (ExtensionPoint) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.platform.conf.structure.ExtensionPoint", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExtensionPoint newInstance(SModel sm) {
    return ExtensionPoint.newInstance(sm, false);
  }
}
