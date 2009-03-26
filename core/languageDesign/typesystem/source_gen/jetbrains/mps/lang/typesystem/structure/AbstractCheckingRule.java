package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractCheckingRule extends jetbrains.mps.lang.typesystem.structure.AbstractRule {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule";
  public static final String OVERRIDES = "overrides";
  public static final String BODY = "body";

  public AbstractCheckingRule(SNode node) {
    super(node);
  }

  public boolean getOverrides() {
    return this.getBooleanProperty(AbstractCheckingRule.OVERRIDES);
  }

  public void setOverrides(boolean value) {
    this.setBooleanProperty(AbstractCheckingRule.OVERRIDES, value);
  }

  public jetbrains.mps.baseLanguage.structure.StatementList getBody() {
    return (jetbrains.mps.baseLanguage.structure.StatementList)this.getChild(StatementList.class, AbstractCheckingRule.BODY);
  }

  public void setBody(jetbrains.mps.baseLanguage.structure.StatementList node) {
    super.setChild(AbstractCheckingRule.BODY, node);
  }


  public static AbstractCheckingRule newInstance(SModel sm, boolean init) {
    return (AbstractCheckingRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractCheckingRule newInstance(SModel sm) {
    return AbstractCheckingRule.newInstance(sm, false);
  }

}
