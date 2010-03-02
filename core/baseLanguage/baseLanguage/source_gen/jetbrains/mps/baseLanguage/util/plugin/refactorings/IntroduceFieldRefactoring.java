package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class IntroduceFieldRefactoring extends IntroduceVariableRefactoring {
  private FieldInitializationPlace myFieldInitialization;

  public IntroduceFieldRefactoring() {
  }

  public void run() {
  }

  public SNode doRefactoring() {
    SNode newDeclaration;
    if (this.myFieldInitialization == FieldInitializationPlace.FIELD) {
      newDeclaration = new IntroduceFieldRefactoring.QuotationClass_baxqxe_a0a0a1a1().createNode(SNodeOperations.copyNode(this.getExpressionType()), SNodeOperations.copyNode(this.getExpression()), this.getName());
    } else {
      newDeclaration = new IntroduceFieldRefactoring.QuotationClass_baxqxe_a0a0a0b0b().createNode(SNodeOperations.copyNode(this.getExpressionType()), this.getName());
    }
    SNode classConcept = SNodeOperations.getAncestor(this.getExpression(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    ListSequence.fromList(SLinkOperations.getTargets(classConcept, "field", true)).addElement(newDeclaration);
    SNode assignStatement = new IntroduceFieldRefactoring.QuotationClass_baxqxe_a0a4a1().createNode(newDeclaration, SNodeOperations.copyNode(this.getExpression()));
    if (this.myFieldInitialization == FieldInitializationPlace.METHOD) {
      SNodeOperations.insertPrevSiblingChild(SNodeOperations.getAncestor(this.getExpression(), "jetbrains.mps.baseLanguage.structure.Statement", false, false), SNodeOperations.copyNode(assignStatement));
    }
    if (this.myFieldInitialization == FieldInitializationPlace.CONSTRUCTOR) {
      SNode declaration = SNodeOperations.getAncestor(this.getExpression(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      for (SNode constructor : ListSequence.fromList(SLinkOperations.getTargets(declaration, "constructor", true))) {
        SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(constructor, "body", true), "statement", true)).first(), SNodeOperations.copyNode(assignStatement));
      }
    }
    SNodeOperations.replaceWithAnother(this.getExpression(), new IntroduceFieldRefactoring.QuotationClass_baxqxe_a0a0h0b().createNode(newDeclaration));
    return newDeclaration;
  }

  public void setFieldInitializationPlace(FieldInitializationPlace place) {
    this.myFieldInitialization = place;
  }

  public boolean isInitialyzeInFieldAvailable() {
    final Wrappers._boolean result = new Wrappers._boolean();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        result.value = ListSequence.fromList(SNodeOperations.getDescendants(IntroduceFieldRefactoring.this.getExpression(), "jetbrains.mps.baseLanguage.structure.LocalVariableReference", true, new String[]{})).isEmpty();
      }
    });
    return result.value;
  }

  public static class QuotationClass_baxqxe_a0a0a1a1 {
    public QuotationClass_baxqxe_a0a0a1a1() {
    }

    public SNode createNode(Object parameter_9, Object parameter_10, Object parameter_11) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        quotedNode1_5.setProperty("name", (String) parameter_11);
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PrivateVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_6);
        }
        {
          quotedNode_3 = (SNode) parameter_9;
          SNode quotedNode1_7;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_7 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_7 = quotedNode_3;
          }
          if (quotedNode1_7 != null) {
            quotedNode_1.addChild("type", HUtil.copyIfNecessary(quotedNode1_7));
          }
        }
        {
          quotedNode_4 = (SNode) parameter_10;
          SNode quotedNode1_8;
          if (_parameterValues_129834374.contains(quotedNode_4)) {
            quotedNode1_8 = CopyUtil.copy(quotedNode_4);
          } else {
            _parameterValues_129834374.add(quotedNode_4);
            quotedNode1_8 = quotedNode_4;
          }
          if (quotedNode1_8 != null) {
            quotedNode_1.addChild("initializer", HUtil.copyIfNecessary(quotedNode1_8));
          }
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_baxqxe_a0a0a0b0b {
    public QuotationClass_baxqxe_a0a0a0b0b() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        quotedNode1_4.setProperty("name", (String) parameter_8);
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PrivateVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("visibility", quotedNode1_5);
        }
        {
          quotedNode_3 = (SNode) parameter_7;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("type", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_baxqxe_a0a4a1 {
    public QuotationClass_baxqxe_a0a4a1() {
    }

    public SNode createNode(Object parameter_13, Object parameter_14) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_2;
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_9 = quotedNode_3;
            {
              quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_10 = quotedNode_5;
              quotedNode_3.addChild("operand", quotedNode1_10);
            }
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_11 = quotedNode_6;
              quotedNode1_11.setReferent("fieldDeclaration", (SNode) parameter_13);
              quotedNode_3.addChild("operation", quotedNode1_11);
            }
            quotedNode_2.addChild("lValue", quotedNode1_9);
          }
          {
            quotedNode_4 = (SNode) parameter_14;
            SNode quotedNode1_12;
            if (_parameterValues_129834374.contains(quotedNode_4)) {
              quotedNode1_12 = CopyUtil.copy(quotedNode_4);
            } else {
              _parameterValues_129834374.add(quotedNode_4);
              quotedNode1_12 = quotedNode_4;
            }
            if (quotedNode1_12 != null) {
              quotedNode_2.addChild("rValue", HUtil.copyIfNecessary(quotedNode1_12));
            }
          }
          quotedNode_1.addChild("expression", quotedNode1_8);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }

  public static class QuotationClass_baxqxe_a0a0h0b {
    public QuotationClass_baxqxe_a0a0h0b() {
    }

    public SNode createNode(Object parameter_7) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("operand", quotedNode1_5);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_3;
          quotedNode1_6.setReferent("fieldDeclaration", (SNode) parameter_7);
          quotedNode_1.addChild("operation", quotedNode1_6);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
