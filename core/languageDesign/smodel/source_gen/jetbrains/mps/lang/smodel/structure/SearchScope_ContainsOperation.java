package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SearchScope_ContainsOperation extends BaseConcept implements IOperation {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.SearchScope_ContainsOperation";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";
public    static final String NODE_TO_CHECK = "nodeToCheck";

  public SearchScope_ContainsOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SearchScope_ContainsOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SearchScope_ContainsOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SearchScope_ContainsOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SearchScope_ContainsOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SearchScope_ContainsOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SearchScope_ContainsOperation.VIRTUAL_PACKAGE, value);
  }

  public Expression getNodeToCheck() {
    return (Expression)this.getChild(SearchScope_ContainsOperation.NODE_TO_CHECK);
  }

  public void setNodeToCheck(Expression node) {
    super.setChild(SearchScope_ContainsOperation.NODE_TO_CHECK, node);
  }


  public static SearchScope_ContainsOperation newInstance(SModel sm, boolean init) {
    return (SearchScope_ContainsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SearchScope_ContainsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SearchScope_ContainsOperation newInstance(SModel sm) {
    return SearchScope_ContainsOperation.newInstance(sm, false);
  }

}
