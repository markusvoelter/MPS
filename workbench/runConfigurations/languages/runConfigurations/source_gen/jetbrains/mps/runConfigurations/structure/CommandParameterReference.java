package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandParameterReference extends Expression {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.CommandParameterReference";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String PARAMETER = "parameter";

  public CommandParameterReference(SNode node) {
    super(node);
  }

  public String getResolveInfo() {
    return this.getProperty(CommandParameterReference.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(CommandParameterReference.RESOLVE_INFO, value);
  }

  public CommandParameterDeclaration getParameter() {
    return (CommandParameterDeclaration) this.getReferent(CommandParameterDeclaration.class, CommandParameterReference.PARAMETER);
  }

  public void setParameter(CommandParameterDeclaration node) {
    super.setReferent(CommandParameterReference.PARAMETER, node);
  }

  public static CommandParameterReference newInstance(SModel sm, boolean init) {
    return (CommandParameterReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.CommandParameterReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommandParameterReference newInstance(SModel sm) {
    return CommandParameterReference.newInstance(sm, false);
  }
}
