package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_SubstituteString extends ConceptFunction implements ISubstitute_String {
  public static final String concept = "jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteString";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public QueryFunction_SubstituteString(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(QueryFunction_SubstituteString.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(QueryFunction_SubstituteString.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(QueryFunction_SubstituteString.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(QueryFunction_SubstituteString.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(QueryFunction_SubstituteString.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(QueryFunction_SubstituteString.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(QueryFunction_SubstituteString.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, QueryFunction_SubstituteString.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, QueryFunction_SubstituteString.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(QueryFunction_SubstituteString.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, QueryFunction_SubstituteString.SMODEL_ATTRIBUTE, node);
  }

  public static QueryFunction_SubstituteString newInstance(SModel sm, boolean init) {
    return (QueryFunction_SubstituteString) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteString", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_SubstituteString newInstance(SModel sm) {
    return QueryFunction_SubstituteString.newInstance(sm, false);
  }
}
