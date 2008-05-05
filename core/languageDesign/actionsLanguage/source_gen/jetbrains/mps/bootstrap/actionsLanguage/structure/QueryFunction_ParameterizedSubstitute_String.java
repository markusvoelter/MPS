package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ParameterizedSubstitute_String extends ConceptFunction implements ISubstitute_String {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ParameterizedSubstitute_String";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public QueryFunction_ParameterizedSubstitute_String(SNode node) {
    super(node);
  }

  public static QueryFunction_ParameterizedSubstitute_String newInstance(SModel sm, boolean init) {
    return (QueryFunction_ParameterizedSubstitute_String)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ParameterizedSubstitute_String", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_ParameterizedSubstitute_String newInstance(SModel sm) {
    return QueryFunction_ParameterizedSubstitute_String.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(QueryFunction_ParameterizedSubstitute_String.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(QueryFunction_ParameterizedSubstitute_String.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(QueryFunction_ParameterizedSubstitute_String.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(QueryFunction_ParameterizedSubstitute_String.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(QueryFunction_ParameterizedSubstitute_String.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(QueryFunction_ParameterizedSubstitute_String.VIRTUAL_PACKAGE, value);
  }

}
