package jetbrains.mps.debugger.java.runtime.evaluation.transform;

/*Generated by MPS */

import jetbrains.mps.debug.evaluation.transform.TransformatorBuilder;
import jetbrains.mps.smodel.SNode;

public class TransformatorBuilderImpl extends TransformatorBuilder {
  public TransformatorBuilderImpl() {
  }

  public void init() {
    synchronized (LOCK) {
      INSTANCE = this;
    }
  }

  public void dispose() {
    synchronized (LOCK) {
      INSTANCE = null;
    }
  }

  public TransformatorBuilder.Transformator build(SNode node, boolean insideTransformation) {
    return new TransformatorImpl(node, insideTransformation);
  }

  public String getJniSignatureFromType(SNode type) {
    return TransformationUtil.getJniSignatureFromType(type);
  }

  public SNode getProxyTypeFromType(SNode type) {
    return TransformationUtil.getValueProxyTypeFromType(type);
  }
}
