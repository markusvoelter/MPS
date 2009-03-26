package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.lang.typesystem.structure.HelginsIntention;
import jetbrains.mps.lang.typesystem.structure.MessageTarget;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WarningStatement extends jetbrains.mps.baseLanguage.structure.Statement implements jetbrains.mps.lang.typesystem.structure.MessageStatement {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.WarningStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String WARNING_TEXT = "warningText";
  public static final String NODE_TO_REPORT = "nodeToReport";
  public static final String HELGINS_INTENTION = "helginsIntention";
  public static final String MESSAGE_TARGET = "messageTarget";

  public WarningStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(WarningStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(WarningStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(WarningStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(WarningStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(WarningStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(WarningStatement.VIRTUAL_PACKAGE, value);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getWarningText() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, WarningStatement.WARNING_TEXT);
  }

  public void setWarningText(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(WarningStatement.WARNING_TEXT, node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getNodeToReport() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, WarningStatement.NODE_TO_REPORT);
  }

  public void setNodeToReport(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(WarningStatement.NODE_TO_REPORT, node);
  }

  public jetbrains.mps.lang.typesystem.structure.HelginsIntention getHelginsIntention() {
    return (jetbrains.mps.lang.typesystem.structure.HelginsIntention)this.getChild(HelginsIntention.class, WarningStatement.HELGINS_INTENTION);
  }

  public void setHelginsIntention(jetbrains.mps.lang.typesystem.structure.HelginsIntention node) {
    super.setChild(WarningStatement.HELGINS_INTENTION, node);
  }

  public jetbrains.mps.lang.typesystem.structure.MessageTarget getMessageTarget() {
    return (jetbrains.mps.lang.typesystem.structure.MessageTarget)this.getChild(MessageTarget.class, WarningStatement.MESSAGE_TARGET);
  }

  public void setMessageTarget(jetbrains.mps.lang.typesystem.structure.MessageTarget node) {
    super.setChild(WarningStatement.MESSAGE_TARGET, node);
  }


  public static WarningStatement newInstance(SModel sm, boolean init) {
    return (WarningStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.WarningStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WarningStatement newInstance(SModel sm) {
    return WarningStatement.newInstance(sm, false);
  }

}
