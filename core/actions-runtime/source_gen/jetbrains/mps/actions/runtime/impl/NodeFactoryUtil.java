package jetbrains.mps.actions.runtime.impl;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import java.util.Collections;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.util.QueryMethodGenerated;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;

public class NodeFactoryUtil {
  private static final Logger LOG = Logger.getLogger(NodeFactoryUtil.class);

  public NodeFactoryUtil() {
  }

  public static List<SNode> getApplicableNodeFactories(final SNode concept, Language language) {
    EditableSModelDescriptor actionsModelDescriptor = language.getActionsModelDescriptor();
    if (actionsModelDescriptor == null) {
      return Collections.emptyList();
    }
    SModel model = actionsModelDescriptor.getSModel();
    return ListSequence.fromList(SModelOperations.getRoots(model, "jetbrains.mps.lang.actions.structure.NodeFactories")).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "nodeFactory", true);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "applicableConcept", false) == concept;
      }
    }).toListSequence();
  }

  public static void invokeNodeSetupFunction(SNode factory, SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if (SLinkOperations.getTarget(factory, "setupFunction", true) == null) {
      return;
    }
    try {
      QueryMethodGenerated.invoke(((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(factory, "jetbrains.mps.lang.actions.structure.NodeFactory"), "call_getQueryMethodName_1220279061997", new Class[]{SNode.class})), null, new NodeSetupContext(newNode, sampleNode, enclosingNode, model), SNodeOperations.getModel(factory));
    } catch (Exception e) {
      LOG.error(e);
    }
  }
}
