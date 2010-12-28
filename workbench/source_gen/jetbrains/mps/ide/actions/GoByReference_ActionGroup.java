package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNodePointer;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.resolve.Resolver;
import org.jetbrains.annotations.Nullable;

public class GoByReference_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GoByReference_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GoByReference_ActionGroup";

  private Set<Pair<ActionPlace, Condition<BaseAction>>> myPlaces = SetSequence.fromSet(new HashSet<Pair<ActionPlace, Condition<BaseAction>>>());

  public GoByReference_ActionGroup() {
    super("Go by Reference", ID);
    this.setIsAlwaysVisible(false);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void doUpdate(AnActionEvent event) {
    try {
      GoByReference_ActionGroup.this.removeAll();

      final IOperationContext context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node == null || context == null) {
        GoByReference_ActionGroup.this.disable(event.getPresentation());
        return;
      }

      List<SReference> refs = node.getReferences();
      if (ListSequence.fromList(refs).isEmpty()) {
        GoByReference_ActionGroup.this.add(new StringAction("No References"));
        return;
      }

      boolean onlyBad = true;
      for (SReference ref : ListSequence.fromList(refs)) {
        SNode targetNode = ref.getTargetNode();
        if (targetNode != null) {
          String text = "[" + ref.getRole() + "]" + targetNode.getDebugText();
          GoByReference_ActionGroup.this.addParameterizedAction(new EditGivenNode_Action(new SNodePointer(targetNode), text), PluginId.getId("jetbrains.mps.ide"), new SNodePointer(targetNode), text);
          onlyBad = false;
          continue;
        }

        String text = "Bad reference: [" + ref.getRole() + "]" + ref.getResolveInfo();

        Resolver.resolve1(ref, context);
        String role = ref.getRole();
        SNode sourceNode = ref.getSourceNode();
        SReference newRef = sourceNode.getReference(role);
        assert newRef != null;
        targetNode = ref.getTargetNode();
        if (targetNode == null) {
          return;
        }

        GoByReference_ActionGroup.this.addParameterizedAction(new EditGivenNode_Action(new SNodePointer(targetNode), text), PluginId.getId("jetbrains.mps.ide"), new SNodePointer(targetNode), text);
      }

      if (onlyBad) {
        GoByReference_ActionGroup.this.add(new StringAction("(Only Bad References)"));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
    for (Pair<ActionPlace, Condition<BaseAction>> p : this.myPlaces) {
      this.addPlace(p.first, p.second);
    }
  }

  public void addPlace(ActionPlace place, @Nullable Condition<BaseAction> cond) {
    SetSequence.fromSet(this.myPlaces).addElement(new Pair<ActionPlace, Condition<BaseAction>>(place, cond));
  }

  public boolean isStrict() {
    return false;
  }
}
