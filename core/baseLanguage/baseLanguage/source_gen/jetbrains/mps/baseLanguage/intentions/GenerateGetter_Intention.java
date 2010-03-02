package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class GenerateGetter_Intention extends GenerateIntention implements Intention {
  public GenerateGetter_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Getters";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    List<SNode> fields = SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "field", true);
    if (ListSequence.fromList(fields).isEmpty()) {
      return false;
    }
    boolean allGettersImplemented = true;
    for (SNode fieldDeclaration : fields) {
      Project project = editorContext.getOperationContext().getProject();
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(fieldDeclaration, project);
      boolean fieldHasGetter = false;
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode method) {
          return getterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty();
        }
      })) {
        fieldHasGetter = true;
      }
      if (!(fieldHasGetter)) {
        allGettersImplemented = false;
      }
    }
    return !(allGettersImplemented);

  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode lastAdded = null;
    for (final SNode field : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedFields"))) {
      Project ideaProject = editorContext.getOperationContext().getProject();
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field, ideaProject);
      if (ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode method) {
          return getterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty();
        }
      })) {
        continue;
      }
      // Method creation begins 
      final SNode thisExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
      SNode added = ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).addElement(new GenerateGetter_Intention.QuotationClass_wkvgdi_a0a0a5a2a7().createNode(SLinkOperations.getTarget(field, "type", true), thisExpression, field, getterName));
      lastAdded = added;
    }
    if (lastAdded != null) {
      editorContext.select(lastAdded);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, editorContext.getOperationContext().getMainFrame(), node);
    selectFieldsDialog.showDialog();
    intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
    return selectFieldsDialog.getAnswer();
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_wkvgdi_a0a0a5a2a7 {
    public QuotationClass_wkvgdi_a0a0a5a2a7() {
    }

    public SNode createNode(Object parameter_17, Object parameter_18, Object parameter_19, Object parameter_20) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9 = quotedNode_1;
        quotedNode1_9.setProperty("name", (String) parameter_20);
        {
          quotedNode_2 = (SNode) parameter_17;
          SNode quotedNode1_10;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_10 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_10 = quotedNode_2;
          }
          if (quotedNode1_10 != null) {
            quotedNode_1.addChild("returnType", HUtil.copyIfNecessary(quotedNode1_10));
          }
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_11 = quotedNode_3;
          quotedNode_1.addChild("visibility", quotedNode1_11);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_4;
          {
            quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_13 = quotedNode_5;
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_14 = quotedNode_6;
              {
                quotedNode_7 = (SNode) parameter_18;
                SNode quotedNode1_15;
                if (_parameterValues_129834374.contains(quotedNode_7)) {
                  quotedNode1_15 = CopyUtil.copy(quotedNode_7);
                } else {
                  _parameterValues_129834374.add(quotedNode_7);
                  quotedNode1_15 = quotedNode_7;
                }
                if (quotedNode1_15 != null) {
                  quotedNode_6.addChild("operand", HUtil.copyIfNecessary(quotedNode1_15));
                }
              }
              {
                quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                SNode quotedNode1_16 = quotedNode_8;
                quotedNode1_16.setReferent("fieldDeclaration", (SNode) parameter_19);
                quotedNode_6.addChild("operation", quotedNode1_16);
              }
              quotedNode_5.addChild("expression", quotedNode1_14);
            }
            quotedNode_4.addChild("statement", quotedNode1_13);
          }
          quotedNode_1.addChild("body", quotedNode1_12);
        }
        result = quotedNode1_9;
      }
      return result;
    }
  }
}
