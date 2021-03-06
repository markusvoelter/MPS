package jetbrains.mps.lang.editor.editorTest.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {
  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_IBaseTestBlock_5110219550150514378(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "left", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_IBaseTestBlock_5110219550150520248(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "right", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }
}
