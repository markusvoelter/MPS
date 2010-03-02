package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class LocalVariableDeclaration_delete_name {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new LocalVariableDeclaration_delete_name.LocalVariableDeclaration_delete_name_DELETE(node));
  }

  public static class LocalVariableDeclaration_delete_name_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public LocalVariableDeclaration_delete_name_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
        SNode type = SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType");
        SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), new LocalVariableDeclaration_delete_name.LocalVariableDeclaration_delete_name_DELETE.QuotationClass_f3i3w9_a1a1a0a1a().createNode(SLinkOperations.getTarget(type, "classifier", false)));
      }
    }

    public static class QuotationClass_f3i3w9_a1a1a0a1a {
      public QuotationClass_f3i3w9_a1a1a0a1a() {
      }

      public SNode createNode(Object parameter_5) {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_3 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AbstractClassifierReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_4 = quotedNode_2;
            quotedNode1_4.setReferent("classifier", (SNode) parameter_5);
            quotedNode_1.addChild("expression", quotedNode1_4);
          }
          result = quotedNode1_3;
        }
        return result;
      }
    }
  }
}
