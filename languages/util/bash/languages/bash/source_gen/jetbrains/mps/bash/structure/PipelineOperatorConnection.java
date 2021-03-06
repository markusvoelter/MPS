package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PipelineOperatorConnection extends FollowingPipeline {
  public static final String concept = "jetbrains.mps.bash.structure.PipelineOperatorConnection";

  public PipelineOperatorConnection(SNode node) {
    super(node);
  }

  public static PipelineOperatorConnection newInstance(SModel sm, boolean init) {
    return (PipelineOperatorConnection) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.PipelineOperatorConnection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PipelineOperatorConnection newInstance(SModel sm) {
    return PipelineOperatorConnection.newInstance(sm, false);
  }
}
