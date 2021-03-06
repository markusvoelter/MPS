package jetbrains.mps.vcs.diff.oldchanges;

/*Generated by MPS */

import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SNode;

@Deprecated
public class DeleteReferenceChange extends OldSetReferenceChange {
  @Deprecated
  public DeleteReferenceChange(SNodeId nodeId, SModel model, SReference reference) {
    super(nodeId, model, reference, null);
  }

  @Override
  public boolean isBrokenReference() {
    return false;
  }

  @Override
  public String toString() {
    return "deleted reference " + myNodeId + " in role " + myRole;
  }

  @Override
  public boolean apply(SModel m) {
    SNode node = m.getNodeById(myNodeId);
    if (node != null) {
      node.removeReferent(myRole);
    }
    return true;
  }
}
