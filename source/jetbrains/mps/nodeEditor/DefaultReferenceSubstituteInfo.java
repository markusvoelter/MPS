package jetbrains.mps.nodeEditor;

/*Generated by MPS*/

import jetbrains.mps.bootstrap.structureLanguage.Cardinality;
import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.LinkMetaclass;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.DiagnosticUtil;
import jetbrains.mps.util.NameUtil;

import java.util.LinkedList;
import java.util.List;

public class DefaultReferenceSubstituteInfo extends AbstractNodeSubstituteInfo {
  private SNode mySourceNode;
  private LinkDeclaration myLinkDeclaration;
  private LinkDeclaration myGenuineLinkDeclaration;

  public DefaultReferenceSubstituteInfo(SNode sourceNode, LinkDeclaration linkDeclaration, EditorContext editorContext) {
    super(editorContext);
    mySourceNode = sourceNode;
    myLinkDeclaration = linkDeclaration;
    myGenuineLinkDeclaration = SModelUtil.getGenuineLinkDeclaration(linkDeclaration);
    if (myGenuineLinkDeclaration.getMetaClass() == LinkMetaclass.aggregation) {
      throw new RuntimeException("Only reference links are allowed here.");
    }
    Cardinality sourceCardinality = myGenuineLinkDeclaration.getSourceCardinality();
    if (!(sourceCardinality == Cardinality._1 || sourceCardinality == Cardinality._0_1)) {
      throw new RuntimeException("Only cardinalities 1 or 0..1 are allowed here.");
    }
  }

  public List<INodeSubstituteItem> createActions() {
    List<INodeSubstituteItem> list = new LinkedList<INodeSubstituteItem>();

    List<SNode> targetSemanticNodes = createTargetNodesList();
    for (final SNode targetNode : targetSemanticNodes) {
      list.add(new AbstractNodeSubstituteItem() {
        public String getMatchingText(String pattern) {
          if (targetNode instanceof LinkDeclaration) {
            return ((LinkDeclaration) targetNode).getRole();
          }
          return targetNode.getName();
        }

        public String getDescriptionText(String pattern) {
          if (targetNode instanceof LinkDeclaration) {
            SNode containingRoot = targetNode.getContainingRoot();
            return containingRoot.getName() + " (" + containingRoot.getModel().getUID() + ")";
          }
          return targetNode.getModel().getUID().toString();
        }

        public SNode doSubstitute(String pattern) {
          mySourceNode.setReferent(myGenuineLinkDeclaration.getRole(), targetNode);
          return null;
        }
      });
    }

    return list;
  }

  private List<SNode> createTargetNodesList() {
    final ConceptDeclaration targetConcept = myLinkDeclaration.getTarget();
    DiagnosticUtil.assertNodeValid(targetConcept, getEditorContext().getOperationContext());
    final boolean searchLinks = NameUtil.nodeFQName(targetConcept).equals("jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration");
    List<SNode> list = SModelUtil.allNodes(mySourceNode.getModel(), true, new Condition<SNode>() {
      public boolean met(SNode node) {
        DiagnosticUtil.assertNodeValid(node, getEditorContext().getOperationContext());
        if (searchLinks && (node instanceof LinkDeclaration)) return true;
        return node.getName() != null && SModelUtil.isInstanceOfType(node, targetConcept);
      }
    });
    return list;
  }
}
