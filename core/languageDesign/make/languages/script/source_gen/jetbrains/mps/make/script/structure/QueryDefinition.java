package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.IWillBeClassifier;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryDefinition extends BaseConcept implements INamedConcept, IWillBeClassifier {
  public static final String concept = "jetbrains.mps.make.script.structure.QueryDefinition";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPECTED = "expected";
  public static final String PRESENTATION = "presentation";

  public QueryDefinition(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(QueryDefinition.NAME);
  }

  public void setName(String value) {
    this.setProperty(QueryDefinition.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(QueryDefinition.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(QueryDefinition.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(QueryDefinition.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(QueryDefinition.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(QueryDefinition.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(QueryDefinition.VIRTUAL_PACKAGE, value);
  }

  public IExpected getExpected() {
    return (IExpected) this.getChild(IExpected.class, QueryDefinition.EXPECTED);
  }

  public void setExpected(IExpected node) {
    super.setChild(QueryDefinition.EXPECTED, node);
  }

  public Text getPresentation() {
    return (Text) this.getChild(Text.class, QueryDefinition.PRESENTATION);
  }

  public void setPresentation(Text node) {
    super.setChild(QueryDefinition.PRESENTATION, node);
  }

  public static QueryDefinition newInstance(SModel sm, boolean init) {
    return (QueryDefinition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.script.structure.QueryDefinition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryDefinition newInstance(SModel sm) {
    return QueryDefinition.newInstance(sm, false);
  }
}
