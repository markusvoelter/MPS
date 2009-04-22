package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContinueStatement extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ContinueStatement";
  public static final String LABEL = "label";

  public ContinueStatement(SNode node) {
    super(node);
  }

  public String getLabel() {
    return this.getProperty(ContinueStatement.LABEL);
  }

  public void setLabel(String value) {
    this.setProperty(ContinueStatement.LABEL, value);
  }


  public static ContinueStatement newInstance(SModel sm, boolean init) {
    return (ContinueStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ContinueStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContinueStatement newInstance(SModel sm) {
    return ContinueStatement.newInstance(sm, false);
  }

}
