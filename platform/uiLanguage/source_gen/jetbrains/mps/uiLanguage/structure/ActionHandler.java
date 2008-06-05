package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class ActionHandler extends BaseConcept implements IComponentPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ActionHandler";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String HANDLER = "handler";

  public ActionHandler(SNode node) {
    super(node);
  }

  public static ActionHandler newInstance(SModel sm, boolean init) {
    return (ActionHandler)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ActionHandler", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionHandler newInstance(SModel sm) {
    return ActionHandler.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(ActionHandler.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionHandler.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionHandler.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionHandler.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionHandler.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionHandler.VIRTUAL_PACKAGE, value);
  }

  public Expression getHandler() {
    return (Expression)this.getChild(ActionHandler.HANDLER);
  }

  public void setHandler(Expression node) {
    super.setChild(ActionHandler.HANDLER, node);
  }

}
