package jetbrains.mps.bootstrap.structureLanguage.actions;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil;

public class QueriesGenerated {

  public static void nodeFactory_NodeSetup_ConceptDeclaration_1163111194509(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SLinkOperations.setTarget(newNode, "extends", SModelUtil.getBaseConcept(), false);
  }
}
