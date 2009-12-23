package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NotCommand extends AbstractCommand {
  public static final String concept = "jetbrains.mps.bash.structure.NotCommand";
  public static final String COMMAND = "command";

  public NotCommand(SNode node) {
    super(node);
  }

  public AbstractCommand getCommand() {
    return (AbstractCommand) this.getChild(AbstractCommand.class, NotCommand.COMMAND);
  }

  public void setCommand(AbstractCommand node) {
    super.setChild(NotCommand.COMMAND, node);
  }

  public static NotCommand newInstance(SModel sm, boolean init) {
    return (NotCommand) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.NotCommand", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NotCommand newInstance(SModel sm) {
    return NotCommand.newInstance(sm, false);
  }
}
