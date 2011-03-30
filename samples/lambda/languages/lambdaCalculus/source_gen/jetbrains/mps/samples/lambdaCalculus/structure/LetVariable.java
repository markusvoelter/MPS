package jetbrains.mps.samples.lambdaCalculus.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LetVariable extends Variable implements INamedConcept {
  public static final String concept = "jetbrains.mps.samples.lambdaCalculus.structure.LetVariable";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public LetVariable(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(LetVariable.NAME);
  }

  public void setName(String value) {
    this.setProperty(LetVariable.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(LetVariable.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LetVariable.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LetVariable.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LetVariable.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LetVariable.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LetVariable.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(LetVariable._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, LetVariable._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, LetVariable._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(LetVariable._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, LetVariable._$ATTRIBUTE, node);
  }

  public static LetVariable newInstance(SModel sm, boolean init) {
    return (LetVariable) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.lambdaCalculus.structure.LetVariable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LetVariable newInstance(SModel sm) {
    return LetVariable.newInstance(sm, false);
  }
}
