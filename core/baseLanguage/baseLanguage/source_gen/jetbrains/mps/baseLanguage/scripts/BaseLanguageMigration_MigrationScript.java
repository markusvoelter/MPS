package jetbrains.mps.baseLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.search.ParameterScope;
import jetbrains.mps.baseLanguage.search.LocalVariablesScope;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class BaseLanguageMigration_MigrationScript extends BaseMigrationScript {
  public BaseLanguageMigration_MigrationScript(IOperationContext operationContext) {
    super("BaseLanguage migration");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "convert commented statements";
      }

      public String getAdditionalInfo() {
        return "convert commented statements";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.CommentedStatement";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode comment = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.SingleLineComment", null);
        SNode statementCommentPart = SLinkOperations.addNewChild(comment, "commentPart", "jetbrains.mps.baseLanguage.structure.StatementCommentPart");
        SNodeOperations.replaceWithAnother(node, comment);
        SLinkOperations.setTarget(statementCommentPart, "commentedStatement", SLinkOperations.getTarget(node, "statement", true), true);
      }

      public boolean isShowAsIntention() {
        return true;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "convert remark statements";
      }

      public String getAdditionalInfo() {
        return "convert remark statements";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.RemarkStatement";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode comment = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.SingleLineComment", null);
        SNodeOperations.replaceWithAnother(node, comment);
        if (StringUtils.isNotEmpty(SPropertyOperations.getString(node, "value"))) {
          SNode textCommentPart = SLinkOperations.addNewChild(comment, "commentPart", "jetbrains.mps.baseLanguage.structure.TextCommentPart");
          SPropertyOperations.set(textCommentPart, "text", SPropertyOperations.getString(node, "value"));
        }
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "ConvertToIncrements";
      }

      public String getAdditionalInfo() {
        return "ConvertToIncrements";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.AssignmentExpression";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"))) {
          return false;
        }
        SNode declaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false);
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "rValue", true), "jetbrains.mps.baseLanguage.structure.PlusExpression"))) {
          return false;
        }
        SNode plusExpr = SNodeOperations.cast(SLinkOperations.getTarget(node, "rValue", true), "jetbrains.mps.baseLanguage.structure.PlusExpression");
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(plusExpr, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"))) {
          return false;
        }
        if (SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(plusExpr, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false) != declaration) {
          return false;
        }
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(plusExpr, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"))) {
          return false;
        }
        if (SPropertyOperations.getInteger(SNodeOperations.cast(SLinkOperations.getTarget(plusExpr, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"), "value") != 1) {
          return false;
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode declaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false);
        SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
        SLinkOperations.setTarget(ref, "variableDeclaration", declaration, false);
        SNode inc = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression", null);
        SLinkOperations.setTarget(inc, "expression", ref, true);
        SNodeOperations.replaceWithAnother(node, inc);
      }

      public boolean isShowAsIntention() {
        return true;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "ConvertToDecrements";
      }

      public String getAdditionalInfo() {
        return "ConvertToDecrements";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.AssignmentExpression";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"))) {
          return false;
        }
        SNode declaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false);
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "rValue", true), "jetbrains.mps.baseLanguage.structure.MinusExpression"))) {
          return false;
        }
        SNode minusExpr = SNodeOperations.cast(SLinkOperations.getTarget(node, "rValue", true), "jetbrains.mps.baseLanguage.structure.MinusExpression");
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(minusExpr, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"))) {
          return false;
        }
        if (SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(minusExpr, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false) != declaration) {
          return false;
        }
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(minusExpr, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"))) {
          return false;
        }
        if (SPropertyOperations.getInteger(SNodeOperations.cast(SLinkOperations.getTarget(minusExpr, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"), "value") != 1) {
          return false;
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode declaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false);
        SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
        SLinkOperations.setTarget(ref, "variableDeclaration", declaration, false);
        SNode dec = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.PostfixDecrementExpression", null);
        SLinkOperations.setTarget(dec, "expression", ref, true);
        SNodeOperations.replaceWithAnother(node, dec);
      }

      public boolean isShowAsIntention() {
        return true;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "String classifiers";
      }

      public String getAdditionalInfo() {
        return "String classifiers";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SLinkOperations.getTarget(node, "classifier", false) == SLinkOperations.getTarget(new BaseLanguageMigration_MigrationScript.QuotationClass_g7rti7_a0a0a0d0a0a0f0a().createNode(), "classifier", false);
      }

      public void doUpdateInstanceNode(SNode node) {
        SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.StringType");
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "ConvertLocalInstanceMethodCall";
      }

      public String getAdditionalInfo() {
        return "ConvertLocalInstanceMethodCall";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(IOperation_Behavior.call_getOperand_1213877410070(node), "jetbrains.mps.baseLanguage.structure.ThisExpression"))) {
          return false;
        }
        if (SLinkOperations.getTarget(SNodeOperations.cast(IOperation_Behavior.call_getOperand_1213877410070(node), "jetbrains.mps.baseLanguage.structure.ThisExpression"), "classConcept", false) == null) {
          return true;
        }
        SNode declaration = SLinkOperations.getTarget(node, "baseMethodDeclaration", false);
        SNode classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(node);
        SNode declarationClassifier = SNodeOperations.getAncestor(declaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
        int constraint = IClassifiersSearchScope.INSTANCE_METHOD;
        while (classifier != declarationClassifier) {
          for (SNode method : (List<SNode>) Classifier_Behavior.call_getVisibleMembers_1213877306257(classifier, node, constraint)) {
            if (SPropertyOperations.getString(method, "name").equals(SPropertyOperations.getString(declaration, "name"))) {
              return false;
            }
          }
          classifier = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode methodCall = SNodeOperations.replaceWithNewChild(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall");
        SLinkOperations.setTarget(methodCall, "baseMethodDeclaration", SLinkOperations.getTarget(node, "baseMethodDeclaration", false), false);
        ListSequence.fromList(SLinkOperations.getTargets(methodCall, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)));
      }

      public boolean isShowAsIntention() {
        return true;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "ConvertLocalFieldReference";
      }

      public String getAdditionalInfo() {
        return "ConvertLocalFieldReference";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(IOperation_Behavior.call_getOperand_1213877410070(node), "jetbrains.mps.baseLanguage.structure.ThisExpression"))) {
          return false;
        }
        List<SNode> param = new ParameterScope(node).getNodes();
        List<SNode> vars = new LocalVariablesScope(node).getNodes();
        vars.addAll(param);
        SNode field = SLinkOperations.getTarget(node, "fieldDeclaration", false);
        if (field == null) {
          return false;
        }
        for (SNode var : vars) {
          if (SNodeOperations.isInstanceOf(var, "jetbrains.mps.lang.core.structure.INamedConcept") && SPropertyOperations.getString(SNodeOperations.cast(var, "jetbrains.mps.lang.core.structure.INamedConcept"), "name").equals(SPropertyOperations.getString(field, "name")) && ListSequence.fromList(SNodeOperations.getAncestors(SNodeOperations.getAncestor(field, "jetbrains.mps.baseLanguage.structure.Classifier", false, false), "jetbrains.mps.baseLanguage.structure.Classifier", true)).contains(SNodeOperations.getAncestor(var, "jetbrains.mps.baseLanguage.structure.Classifier", false, false))) {
            return false;
          }
        }
        if (SLinkOperations.getTarget(SNodeOperations.cast(IOperation_Behavior.call_getOperand_1213877410070(node), "jetbrains.mps.baseLanguage.structure.ThisExpression"), "classConcept", false) == null) {
          return true;
        }
        SNode classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(node);
        SNode declarationClassifier = SNodeOperations.getAncestor(field, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
        int constraint = IClassifiersSearchScope.INSTANCE_FIELD;
        while (classifier != declarationClassifier) {
          for (SNode fieldDeclaration : (List<SNode>) Classifier_Behavior.call_getVisibleMembers_1213877306257(classifier, node, constraint)) {
            if (SPropertyOperations.getString(fieldDeclaration, "name") != null && SPropertyOperations.getString(fieldDeclaration, "name").equals(SPropertyOperations.getString(field, "name"))) {
              return false;
            }
          }
          classifier = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode fieldReference = SNodeOperations.replaceWithNewChild(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference");
        SLinkOperations.setTarget(fieldReference, "variableDeclaration", SLinkOperations.getTarget(node, "fieldDeclaration", false), false);
      }

      public boolean isShowAsIntention() {
        return true;
      }
    });
  }

  public static class QuotationClass_g7rti7_a0a0a0d0a0a0f0a {
    public QuotationClass_g7rti7_a0a0a0d0a0a0f0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~String")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
