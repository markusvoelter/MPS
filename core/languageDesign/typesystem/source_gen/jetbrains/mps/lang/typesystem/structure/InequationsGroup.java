package jetbrains.mps.lang.typesystem.structure;

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

public class InequationsGroup extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.InequationsGroup";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public InequationsGroup(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(InequationsGroup.NAME);
  }

  public void setName(String value) {
    this.setProperty(InequationsGroup.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InequationsGroup.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InequationsGroup.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InequationsGroup.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InequationsGroup.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InequationsGroup.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InequationsGroup.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(InequationsGroup._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, InequationsGroup._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, InequationsGroup._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(InequationsGroup._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, InequationsGroup._$ATTRIBUTE, node);
  }

  public static InequationsGroup newInstance(SModel sm, boolean init) {
    return (InequationsGroup) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.InequationsGroup", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InequationsGroup newInstance(SModel sm) {
    return InequationsGroup.newInstance(sm, false);
  }
}
