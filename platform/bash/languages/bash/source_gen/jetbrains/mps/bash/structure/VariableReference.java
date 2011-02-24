package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariableReference extends LValue implements IGeneralizedWordUnit {
  public static final String concept = "jetbrains.mps.bash.structure.VariableReference";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String VARIABLE = "variable";
  public static final String _$ATTRIBUTE = "_$attribute";

  public VariableReference(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(VariableReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(VariableReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(VariableReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(VariableReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(VariableReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(VariableReference.VIRTUAL_PACKAGE, value);
  }

  public VariableNameDeclaration getVariable() {
    return (VariableNameDeclaration) this.getReferent(VariableNameDeclaration.class, VariableReference.VARIABLE);
  }

  public void setVariable(VariableNameDeclaration node) {
    super.setReferent(VariableReference.VARIABLE, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(VariableReference._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, VariableReference._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, VariableReference._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(VariableReference._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, VariableReference._$ATTRIBUTE, node);
  }

  public static VariableReference newInstance(SModel sm, boolean init) {
    return (VariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.VariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VariableReference newInstance(SModel sm) {
    return VariableReference.newInstance(sm, false);
  }
}
