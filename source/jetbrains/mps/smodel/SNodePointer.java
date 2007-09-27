package jetbrains.mps.smodel;

import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.ide.command.ICommandListener;
import jetbrains.mps.ide.command.CommandAdapter;
import jetbrains.mps.ide.command.CommandEvent;
import jetbrains.mps.util.WeakSet;
import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.HashSet;

/**
 * Replacement for SNodeProxy, not used yet
 * <p/>
 * Igor Alshannikov
 * Sep 21, 2007
 */
public class SNodePointer {
  private SModelUID myModelUID;
  private SNodeId myNodeId;

  public SNodePointer(String modelUID, SNodeId nodeId) {
    this(SModelUID.fromString(modelUID), nodeId);
  }

  public SNodePointer(@NotNull INodeAdapter node) {
    this(node.getModel().getUID(), node.getNode().getSNodeId());
  }

  public SNodePointer(@NotNull SNode node) {
    this(node.getModel().getUID(), node.getSNodeId());
  }

  public SNodePointer(SModelUID modelUID, SNodeId nodeId) {
    myModelUID = modelUID;
    myNodeId = nodeId;
    registerPointer(this);
  }

  public SNode getNode() {
    SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(myModelUID);
    if (modelDescriptor != null) {
      return modelDescriptor.getSModel().getNodeById(myNodeId);
    }
    return null;
  }

  public SModelDescriptor getModel() {
    return SModelRepository.getInstance().getModelDescriptor(myModelUID);
  }

  public String toString() {
    if (getNode() == null) {
      return "[bad pointer] model=" + myModelUID + " node id=" + myNodeId;
    }
    return getNode().toString();
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SNode node = this.getNode();
    if (node == null) return false;
    return node == ((SNodePointer) o).getNode();
  }

  public int hashCode() {
    return myModelUID.hashCode() + myNodeId.hashCode();
  }

  //----------------------
  // model rename support
  //----------------------
  private static final WeakHashMap<SModelUID, WeakSet<SNodePointer>> ourPointersByModelUID = new WeakHashMap<SModelUID, WeakSet<SNodePointer>>();

  private static void registerPointer(SNodePointer pointer) {
    assert pointer.myModelUID != null : "only mature pointers can be registered";
    if (!ourPointersByModelUID.containsKey(pointer.myModelUID)) {
      ourPointersByModelUID.put(pointer.myModelUID, new WeakSet<SNodePointer>());
    }
    ourPointersByModelUID.get(pointer.myModelUID).add(pointer);
  }

  /*package*/
  static void changeModelUID(SModelUID oldModelUID, SModelUID newModelUID) {
    WeakSet<SNodePointer> pointers = ourPointersByModelUID.remove(oldModelUID);
    if (pointers != null) {
      for (SNodePointer pointer : pointers) {
        pointer.myModelUID = newModelUID;
        registerPointer(pointer);
      }
    }
  }
}
