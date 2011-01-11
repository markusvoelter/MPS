package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.editorTabs.EditorTabDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.workbench.actions.nodes.GoToRulesHelper;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Comparator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.LanguageAspect;

public class Typesystem_TabDescriptor extends EditorTabDescriptor {
  public Typesystem_TabDescriptor() {
  }

  public String getTitle() {
    return "Typesystem";
  }

  public Character getShortcutChar() {
    return 'T';
  }

  public void startListening() {
    // <node> 
  }

  public SNode getBaseNode(SNode node) {
    return ConceptEditorOpenHelper.getBaseNode(node);
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }

  public List<SNode> getNodes(SNode node) {
    List<SNode> rules = (List<SNode>) GoToRulesHelper.getRules(((AbstractConceptDeclaration) SNodeOperations.getAdapter(node)), false);
    return ListSequence.fromList(rules).sort(new Comparator<SNode>() {
      public int compare(SNode a, SNode b) {
        boolean aConceptRef = SNodeOperations.isInstanceOf(SLinkOperations.getTarget(a, "applicableNode", true), "jetbrains.mps.lang.typesystem.structure.ConceptReference");
        boolean bConceptRef = SNodeOperations.isInstanceOf(SLinkOperations.getTarget(b, "applicableNode", true), "jetbrains.mps.lang.typesystem.structure.ConceptReference");

        // rules with concept references go first 
        if (aConceptRef && !(bConceptRef)) {
          return 1;
        }
        if (!(aConceptRef) && bConceptRef) {
          return -1;
        }

        // rules with concept references - more specific goes first 
        if (aConceptRef && bConceptRef) {
          SNode aConcept = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(a, "applicableNode", true), "jetbrains.mps.lang.typesystem.structure.ConceptReference"), "concept", false);
          SNode bConcept = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(b, "applicableNode", true), "jetbrains.mps.lang.typesystem.structure.ConceptReference"), "concept", false);
          if (SConceptOperations.isSubConceptOf(aConcept, NameUtil.nodeFQName(bConcept))) {
            return 1;
          }
          if (SConceptOperations.isSubConceptOf(bConcept, NameUtil.nodeFQName(aConcept))) {
            return -1;
          }
        }

        return 0;
      }
    }, false).toListSequence();
  }

  public List<SNode> getConcepts(final SNode node) {
    return ConceptEditorHelper.getAvailableConceptAspects(LanguageAspect.TYPESYSTEM, node);
  }

  public SNode createNode(final SNode node, final SNode concept) {
    return ConceptEditorHelper.createNewConceptAspectInstance(LanguageAspect.TYPESYSTEM, node, concept);
  }
}
