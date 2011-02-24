package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.GenericDeclaration;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.IVisible;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.Visibility;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomContainerDeclaration extends GenericDeclaration implements INamedConcept, IVisible {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.CustomContainerDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONTAINER_TYPE = "containerType";
  public static final String RUNTIME_TYPE = "runtimeType";
  public static final String FACTORY = "factory";
  public static final String VISIBILITY = "visibility";
  public static final String _$ATTRIBUTE = "_$attribute";

  public CustomContainerDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(CustomContainerDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(CustomContainerDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(CustomContainerDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CustomContainerDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CustomContainerDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CustomContainerDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CustomContainerDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CustomContainerDeclaration.VIRTUAL_PACKAGE, value);
  }

  public Type getContainerType() {
    return (Type) this.getChild(Type.class, CustomContainerDeclaration.CONTAINER_TYPE);
  }

  public void setContainerType(Type node) {
    super.setChild(CustomContainerDeclaration.CONTAINER_TYPE, node);
  }

  public ClassifierType getRuntimeType() {
    return (ClassifierType) this.getChild(ClassifierType.class, CustomContainerDeclaration.RUNTIME_TYPE);
  }

  public void setRuntimeType(ClassifierType node) {
    super.setChild(CustomContainerDeclaration.RUNTIME_TYPE, node);
  }

  public Expression getFactory() {
    return (Expression) this.getChild(Expression.class, CustomContainerDeclaration.FACTORY);
  }

  public void setFactory(Expression node) {
    super.setChild(CustomContainerDeclaration.FACTORY, node);
  }

  public Visibility getVisibility() {
    return (Visibility) this.getChild(Visibility.class, CustomContainerDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(CustomContainerDeclaration.VISIBILITY, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(CustomContainerDeclaration._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, CustomContainerDeclaration._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, CustomContainerDeclaration._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(CustomContainerDeclaration._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, CustomContainerDeclaration._$ATTRIBUTE, node);
  }

  public static CustomContainerDeclaration newInstance(SModel sm, boolean init) {
    return (CustomContainerDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.CustomContainerDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomContainerDeclaration newInstance(SModel sm) {
    return CustomContainerDeclaration.newInstance(sm, false);
  }
}
