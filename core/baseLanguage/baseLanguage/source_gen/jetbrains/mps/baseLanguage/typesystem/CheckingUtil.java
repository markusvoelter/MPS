package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.apache.commons.lang.StringUtils;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class CheckingUtil {
  public CheckingUtil() {
  }

  public static boolean isAssigned(SNode node) {
    SNode assignment = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression", false, false);
    if (assignment == null) {
      return false;
    }
    SNode lValue = SLinkOperations.getTarget(assignment, "lValue", true);
    if (node == lValue) {
      return true;
    }
    SNode parent = SNodeOperations.getParent(node);
    if (parent == lValue && SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.DotExpression") && SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true) == node) {
      return true;
    }
    return false;
  }

  public static boolean isFieldDuplicated(final SNode fieldDecl) {
    final String name = SPropertyOperations.getString(fieldDecl, "name");
    if (StringUtils.isEmpty(name)) {
      return false;
    }
    SNode classifier = SNodeOperations.getAncestor(fieldDecl, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    // <node> 
    List<SNode> allFields = new ArrayList<SNode>();
    ListSequence.fromList(allFields).addSequence(ListSequence.fromList(SLinkOperations.getTargets(classifier, "staticField", true))).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "field", true)));
    return ListSequence.fromList(allFields).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return it != fieldDecl && SPropertyOperations.hasValue(it, "name", name);
      }
    });
  }
}
