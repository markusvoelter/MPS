package jetbrains.mps.nodeEditor;

/*Generated by MPS*/


import jetbrains.mps.bootstrap.structureLanguage.Cardinality;
import jetbrains.mps.bootstrap.structureLanguage.LinkMetaclass;
import jetbrains.mps.bootstrap.structureLanguage.SemanticLinkDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.SemanticTypeDeclaration;
import jetbrains.mps.semanticModel.SemanticModelUtil;
import jetbrains.mps.semanticModel.SemanticNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DefaultReferenceSubstituteInfo extends AbstractNodeSubstituteInfo {

  private SemanticNode mySourceNode;
  private SemanticLinkDeclaration myLinkDeclaration;

  public DefaultReferenceSubstituteInfo(SemanticNode sourceNode, SemanticLinkDeclaration linkDeclaration) {
    mySourceNode = sourceNode;
    myLinkDeclaration = linkDeclaration;
    if (linkDeclaration.getMetaClass() == LinkMetaclass.aggregation) {
      throw new RuntimeException("Only reference links are allowed here.");
    }
    Cardinality sourceCardinality = myLinkDeclaration.getSourceCardinality();
    if (!(sourceCardinality == Cardinality._1 || sourceCardinality == Cardinality._0_1)) {
      throw new RuntimeException("Only cardinalities 1 or 0..1 are allowed here.");
    }
  }

  public List<INodeSubstituteItem> createActions() {
    List<INodeSubstituteItem> list = new LinkedList<INodeSubstituteItem>();

    List<SemanticNode> targetSemanticNodes = createTargetNodesList();
    for (final SemanticNode targetNode : targetSemanticNodes) {
      list.add(new AbstractNodeSubstituteItem() {
        public String getMatchingText(String pattern) {
          return targetNode.getName();
        }

        public String getDescriptionText(String pattern) {
          return targetNode.getSemanticModel().getFQName();
        }

        public SemanticNode doSubstitute(String pattern) {
          Cardinality sourceCardinality = myLinkDeclaration.getSourceCardinality();
          if (sourceCardinality == Cardinality._1 || sourceCardinality == Cardinality._0_1) {
            mySourceNode.setReferent(myLinkDeclaration.getRole(), targetNode);
          }
          return null;
        }
      });
    }

    return list;
  }

  private List<SemanticNode> createTargetNodesList() {
    List<SemanticNode> list = new LinkedList<SemanticNode>();
    SemanticTypeDeclaration targetType = myLinkDeclaration.getTarget();

    // look through all node declared in parent
    SemanticNode parentNode = mySourceNode;
    while (parentNode != null && parentNode.getParent() != null) {
      parentNode = parentNode.getParent();
    }
    Iterator<SemanticNode> iterator = parentNode.depthFirstChildren();
    while (iterator.hasNext()) {
      SemanticNode node = iterator.next();
      if (SemanticModelUtil.isInstanceOfType(node, targetType)) {
        list.add(node);
      }
    }

    list.addAll(SemanticModelUtil.allInstancesOfType(targetType, mySourceNode.getSemanticModel()));
    return list;
  }
}
