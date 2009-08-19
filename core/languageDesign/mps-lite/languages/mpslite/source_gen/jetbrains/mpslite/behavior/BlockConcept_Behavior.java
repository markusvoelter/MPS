package jetbrains.mpslite.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class BlockConcept_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void virtual_fillConcept_1239891562930(SNode thisNode, SNode concept, Map<SNode, SNode> conceptsToTargets, Map<SNode, SNode> partsToLinks) {
    SNode linkDeclaration = SLinkOperations.addNewChild(concept, "linkDeclaration", "jetbrains.mps.lang.structure.structure.LinkDeclaration");
    SPropertyOperations.set(linkDeclaration, "role", "body");
    SPropertyOperations.set(linkDeclaration, "metaClass", "aggregation");
    SLinkOperations.setTarget(linkDeclaration, "target", MapSequence.fromMap(conceptsToTargets).get(SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mpslite.structure.ConceptContainer", false, false), "statementConcept", true)), false);
    SPropertyOperations.set(linkDeclaration, "sourceCardinality", "0..n");
    MapSequence.fromMap(partsToLinks).put(thisNode, linkDeclaration);
  }

  public static SNode virtual_createEditor_1239890004879(SNode thisNode, Map<SNode, SNode> conceptsToTargets, Map<SNode, SNode> partsToLinks) {
    SNode editor = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration", null);
    SNode lineList = SLinkOperations.getTarget(thisNode, "concreteSyntax", true);
    SNode contentCell = GenerationUtils.generateEditorCellModel(lineList, thisNode, partsToLinks);
    if (contentCell == null) {
      return null;
    }
    SLinkOperations.setTarget(editor, "cellModel", contentCell, true);
    return editor;
  }
}
