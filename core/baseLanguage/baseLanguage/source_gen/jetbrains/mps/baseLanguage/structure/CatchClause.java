package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CatchClause extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.CatchClause";
  public static final String THROWABLE = "throwable";
  public static final String CATCH_BODY = "catchBody";

  public CatchClause(SNode node) {
    super(node);
  }

  public INodeAdapter getThrowable() {
    return (INodeAdapter)this.getChild(, CatchClause.THROWABLE);
  }

  public void setThrowable(INodeAdapter node) {
    super.setChild(CatchClause.THROWABLE, node);
  }

  public INodeAdapter getCatchBody() {
    return (INodeAdapter)this.getChild(, CatchClause.CATCH_BODY);
  }

  public void setCatchBody(INodeAdapter node) {
    super.setChild(CatchClause.CATCH_BODY, node);
  }


  public static CatchClause newInstance(SModel sm, boolean init) {
    return (CatchClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CatchClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CatchClause newInstance(SModel sm) {
    return CatchClause.newInstance(sm, false);
  }

}
