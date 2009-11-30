package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ToolTab extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ToolTab";
  public static final String COMPONENT_EXPRESSION = "componentExpression";
  public static final String TITLE_EXPRESSION = "titleExpression";
  public static final String ICON_EXPRESSION = "iconExpression";
  public static final String DISPOSE_TAB_CLOSURE = "disposeTabClosure";

  public ToolTab(SNode node) {
    super(node);
  }

  public Expression getComponentExpression() {
    return (Expression)this.getChild(Expression.class, ToolTab.COMPONENT_EXPRESSION);
  }

  public void setComponentExpression(Expression node) {
    super.setChild(ToolTab.COMPONENT_EXPRESSION, node);
  }

  public Expression getTitleExpression() {
    return (Expression)this.getChild(Expression.class, ToolTab.TITLE_EXPRESSION);
  }

  public void setTitleExpression(Expression node) {
    super.setChild(ToolTab.TITLE_EXPRESSION, node);
  }

  public Expression getIconExpression() {
    return (Expression)this.getChild(Expression.class, ToolTab.ICON_EXPRESSION);
  }

  public void setIconExpression(Expression node) {
    super.setChild(ToolTab.ICON_EXPRESSION, node);
  }

  public Expression getDisposeTabClosure() {
    return (Expression)this.getChild(Expression.class, ToolTab.DISPOSE_TAB_CLOSURE);
  }

  public void setDisposeTabClosure(Expression node) {
    super.setChild(ToolTab.DISPOSE_TAB_CLOSURE, node);
  }

  public static ToolTab newInstance(SModel sm, boolean init) {
    return (ToolTab)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ToolTab", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ToolTab newInstance(SModel sm) {
    return ToolTab.newInstance(sm, false);
  }
}
