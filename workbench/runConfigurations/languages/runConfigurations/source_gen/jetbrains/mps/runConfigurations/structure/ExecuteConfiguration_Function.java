package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.baseLanguage.structure.ILocalVariableElementList;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExecuteConfiguration_Function extends ConceptFunction implements ILocalVariableElementList {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.ExecuteConfiguration_Function";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public ExecuteConfiguration_Function(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ExecuteConfiguration_Function.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ExecuteConfiguration_Function.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ExecuteConfiguration_Function.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ExecuteConfiguration_Function.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ExecuteConfiguration_Function.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ExecuteConfiguration_Function.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ExecuteConfiguration_Function._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ExecuteConfiguration_Function._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ExecuteConfiguration_Function._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ExecuteConfiguration_Function._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ExecuteConfiguration_Function._$ATTRIBUTE, node);
  }

  public static ExecuteConfiguration_Function newInstance(SModel sm, boolean init) {
    return (ExecuteConfiguration_Function) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.ExecuteConfiguration_Function", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExecuteConfiguration_Function newInstance(SModel sm) {
    return ExecuteConfiguration_Function.newInstance(sm, false);
  }
}
