package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class CreateMethodDeclaration_Intention extends BaseIntention implements Intention {
  public CreateMethodDeclaration_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IOperation";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Create Method Declaration";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return CreateMethodDeclarationUtil.isApplicable(editorContext, node);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode classifier = CreateMethodDeclarationUtil.getClassifier(node);
    boolean isSameClassifier = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) == classifier;
    final String name = CreateMethodDeclarationUtil.getMethodName(editorContext);
    SNode type;
    SNode inferType = TypeChecker.getInstance().getInferredTypeOf(node);
    if (SNodeOperations.isInstanceOf(inferType, "jetbrains.mps.baseLanguage.structure.Type")) {
      type = SNodeOperations.cast(inferType, "jetbrains.mps.baseLanguage.structure.Type");
    } else {
      type = new CreateMethodDeclaration_Intention.QuotationClass_qv3pxx_a0a0a0f0h().createNode();
    }
    SNode method = new CreateMethodDeclaration_Intention.QuotationClass_qv3pxx_a0a6a7().createNode(type, name);
    if (!(isSameClassifier)) {
      SLinkOperations.setTarget(method, "visibility", new CreateMethodDeclaration_Intention.QuotationClass_qv3pxx_a2a0a7a7().createNode(), true);
    }
    ListSequence.fromList(SLinkOperations.getTargets(classifier, "method", true)).addElement(method);
    SNodeOperations.replaceWithAnother(node, new CreateMethodDeclaration_Intention.QuotationClass_qv3pxx_a1a9a7().createNode(method));
    if (isSameClassifier) {
      editorContext.selectWRTFocusPolicy(method);
    } else {
      IOperationContext operationContext = editorContext.getOperationContext();
      IEditor editor = operationContext.getComponent(MPSEditorOpener.class).editNode(classifier, operationContext);
      editor.getEditorContext().selectWRTFocusPolicy(method);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_qv3pxx_a0a0a0f0h {
    public QuotationClass_qv3pxx_a0a0a0f0h() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qv3pxx_a0a6a7 {
    public QuotationClass_qv3pxx_a0a6a7() {
    }

    public SNode createNode(Object parameter_9, Object parameter_10) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        quotedNode1_5.setProperty("name", (String) parameter_10);
        {
          quotedNode_2 = (SNode) parameter_9;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_6 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_6 = quotedNode_2;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("returnType", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PrivateVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_3;
          quotedNode_1.addChild("visibility", quotedNode1_7);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_4;
          quotedNode_1.addChild("body", quotedNode1_8);
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_qv3pxx_a2a0a7a7 {
    public QuotationClass_qv3pxx_a2a0a7a7() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qv3pxx_a1a9a7 {
    public QuotationClass_qv3pxx_a1a9a7() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("baseMethodDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
