package jetbrains.mps.lang.typesystem.dependencies;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.util.Pair;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.typesystem.dependencies._Quotations;
import java.util.List;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class DependenciesCollector {

  public DependenciesCollector() {
  }

  public void collectDependencies(SNode inferenceRule, Map<SNode, Pair<SNode, SNode>> dependencies, Set<SNode> leaves) {
    Set<SNode> roots = SetSequence.<SNode>fromArray();
    for(SNode applicableNodeReference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference", false)) {
      if (SLinkOperations.getTarget(applicableNodeReference, "applicableNode", false) == SLinkOperations.getTarget(inferenceRule, "applicableNode", true)) {
        SetSequence.fromSet(roots).addElement(applicableNodeReference);
      }
    }
    int prevSize = dependencies.size();
    int leavesSize = SetSequence.fromSet(leaves).count();
    for(SNode root : roots) {
      MapSequence.fromMap(dependencies).put(root, null);
    }
    while (dependencies.size() > prevSize || SetSequence.fromSet(leaves).count() > leavesSize) {
      prevSize = dependencies.size();
      leavesSize = SetSequence.fromSet(leaves).count();
      for(SNode node : SetSequence.fromSet(SetSequence.<SNode>fromArray()).addSequence(SetSequence.fromSet(MapSequence.fromMap(dependencies).keySet()))) {
        SNode parent = SNodeOperations.getParent(node);
        do {
          SNode matchedNode_0 = parent;
          {
            boolean matches_0 = false;
            {
              SNode matchingNode_0 = parent;
              if (matchingNode_0 != null) {
                matches_0 = SModelUtil_new.isAssignableConcept(matchingNode_0.getConceptFqName(), "jetbrains.mps.lang.typesystem.structure.TypeOfExpression");
              }
            }
            if (matches_0) {
              if (!(SetSequence.fromSet(roots).contains(node))) {
                SetSequence.fromSet(leaves).addElement(node);
              }
              break;
            }
          }
          {
            boolean matches_1 = false;
            {
              SNode matchingNode_1 = parent;
              if (matchingNode_1 != null) {
                matches_1 = SModelUtil_new.isAssignableConcept(matchingNode_1.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
              }
            }
            if (matches_1) {
              if (SLinkOperations.getTarget(matchedNode_0, "rValue", true) == node) {
                MapSequence.fromMap(dependencies).put(SLinkOperations.getTarget(matchedNode_0, "lValue", true), new Pair<SNode, SNode>(node, new _Quotations.QuotationClass_0().createNode()));
              }
              break;
            }
          }
          {
            boolean matches_2 = false;
            {
              SNode matchingNode_2 = parent;
              if (matchingNode_2 != null) {
                matches_2 = SModelUtil_new.isAssignableConcept(matchingNode_2.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
              }
            }
            if (matches_2) {
              if (SLinkOperations.getTarget(matchedNode_0, "initializer", true) == node) {
                MapSequence.fromMap(dependencies).put(matchedNode_0, new Pair<SNode, SNode>(node, new _Quotations.QuotationClass_1().createNode()));
              }
              break;
            }
          }
          do {
            SNode matchedNode_1 = node;
            {
              boolean matches_3 = false;
              {
                SNode matchingNode_3 = node;
                if (matchingNode_3 != null) {
                  matches_3 = SModelUtil_new.isAssignableConcept(matchingNode_3.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
                }
              }
              if (matches_3) {
                for(SNode variableReference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.baseLanguage.structure.VariableReference", false)) {
                  if (SLinkOperations.getTarget(variableReference, "variableDeclaration", false) == node) {
                    MapSequence.fromMap(dependencies).put(variableReference, new Pair<SNode, SNode>(node, new _Quotations.QuotationClass_2().createNode()));
                  }
                }
                break;
              }
            }
            {
              boolean matches_4 = false;
              {
                SNode matchingNode_4 = node;
                if (matchingNode_4 != null) {
                  matches_4 = SModelUtil_new.isAssignableConcept(matchingNode_4.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.VariableReference");
                }
              }
              if (matches_4) {
                {
                  SNode variableDeclaration = SLinkOperations.getTarget(matchedNode_1, "variableDeclaration", false);
                  for(SNode reference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.baseLanguage.structure.VariableReference", false)) {
                    if (SLinkOperations.getTarget(matchedNode_1, "variableDeclaration", false) == variableDeclaration) {
                      SNode nodeStatement = SNodeOperations.getAncestor(matchedNode_1, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
                      SNode usageStatement = SNodeOperations.getAncestor(reference, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
                      while (SNodeOperations.getParent(nodeStatement) != SNodeOperations.getParent(usageStatement)) {
                        usageStatement = SNodeOperations.getAncestor(usageStatement, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
                      }
                      List<SNode> list = CollectionUtil.filter(SNodeOperations.getParent(nodeStatement).getChildren(), new Condition() {

                        public boolean met(Object p0) {
                          return SNodeOperations.isInstanceOf(((SNode)p0), "jetbrains.mps.baseLanguage.structure.Statement");
                        }
                      });
                      if (ListSequence.fromList(list).indexOf(nodeStatement) <= ListSequence.fromList(list).indexOf(usageStatement)) {
                        MapSequence.fromMap(dependencies).put(reference, new Pair<SNode, SNode>(node, new _Quotations.QuotationClass_3().createNode()));
                      }
                    }
                  }
                }
                break;
              }
            }
          } while(false);
        } while(false);
      }
    }
  }

}
