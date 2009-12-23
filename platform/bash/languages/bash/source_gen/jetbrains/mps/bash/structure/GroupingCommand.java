package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GroupingCommand extends AbstractCommand implements ICompoundCommand {
  public static final String concept = "jetbrains.mps.bash.structure.GroupingCommand";
  public static final String CPR_LeftBracket = "leftBracket";
  public static final String CPR_RigthBracket = "rigthBracket";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String COMMANDS = "commands";

  public GroupingCommand(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GroupingCommand.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GroupingCommand.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GroupingCommand.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GroupingCommand.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GroupingCommand.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GroupingCommand.VIRTUAL_PACKAGE, value);
  }

  public InputLines getCommands() {
    return (InputLines) this.getChild(InputLines.class, GroupingCommand.COMMANDS);
  }

  public void setCommands(InputLines node) {
    super.setChild(GroupingCommand.COMMANDS, node);
  }

  public static GroupingCommand newInstance(SModel sm, boolean init) {
    return (GroupingCommand) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.GroupingCommand", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GroupingCommand newInstance(SModel sm) {
    return GroupingCommand.newInstance(sm, false);
  }
}
