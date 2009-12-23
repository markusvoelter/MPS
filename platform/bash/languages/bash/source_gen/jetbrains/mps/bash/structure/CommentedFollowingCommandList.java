package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommentedFollowingCommandList extends AbstractFollowingCommandList implements IComment {
  public static final String concept = "jetbrains.mps.bash.structure.CommentedFollowingCommandList";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String COMMAND = "command";

  public CommentedFollowingCommandList(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CommentedFollowingCommandList.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CommentedFollowingCommandList.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CommentedFollowingCommandList.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CommentedFollowingCommandList.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CommentedFollowingCommandList.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CommentedFollowingCommandList.VIRTUAL_PACKAGE, value);
  }

  public FollowingCommandList getCommand() {
    return (FollowingCommandList) this.getChild(FollowingCommandList.class, CommentedFollowingCommandList.COMMAND);
  }

  public void setCommand(FollowingCommandList node) {
    super.setChild(CommentedFollowingCommandList.COMMAND, node);
  }

  public static CommentedFollowingCommandList newInstance(SModel sm, boolean init) {
    return (CommentedFollowingCommandList) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.CommentedFollowingCommandList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommentedFollowingCommandList newInstance(SModel sm) {
    return CommentedFollowingCommandList.newInstance(sm, false);
  }
}
