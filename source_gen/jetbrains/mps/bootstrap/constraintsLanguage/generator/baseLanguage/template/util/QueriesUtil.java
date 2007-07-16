package jetbrains.mps.bootstrap.constraintsLanguage.generator.baseLanguage.template.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesUtil {

  public static SNode get_registerSelf_body(SNode clazz) {
    SNode regiserSelfMethod = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(clazz, "method", true), new zPredicate(null, null)));
    return SLinkOperations.getTarget(regiserSelfMethod, "body", true);
  }
  public static SNode get_unRegisterSelf_body(SNode clazz) {
    SNode unRegiserSelfMethod = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(clazz, "method", true), new zPredicate1(null, null)));
    return SLinkOperations.getTarget(unRegiserSelfMethod, "body", true);
  }
}
