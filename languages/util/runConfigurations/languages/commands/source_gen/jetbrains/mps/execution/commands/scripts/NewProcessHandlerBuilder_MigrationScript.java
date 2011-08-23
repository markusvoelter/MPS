package jetbrains.mps.execution.commands.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class NewProcessHandlerBuilder_MigrationScript extends BaseMigrationScript {
  public NewProcessHandlerBuilder_MigrationScript(IOperationContext operationContext) {
    super("Upgrade process builder expressions");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Upgrade process builder expressions";
      }

      public String getAdditionalInfo() {
        return "Upgrade process builder expressions";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.execution.commands.structure.ProcessBuilderExpression";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode replacement = SConceptOperations.createNewNode("jetbrains.mps.execution.commands.structure.NewProcessBuilderExpression", null);
        for (SNode part : ListSequence.fromList(SLinkOperations.getTargets(node, "part", true))) {
          if (SNodeOperations.isInstanceOf(part, "jetbrains.mps.execution.commands.structure.ProcessBuilderPart")) {
            ListSequence.fromList(SLinkOperations.getTargets(replacement, "commandPart", true)).addElement(SLinkOperations.getTarget(SNodeOperations.cast(part, "jetbrains.mps.execution.commands.structure.ProcessBuilderPart"), "expression", true));
          } else if (SNodeOperations.isInstanceOf(part, "jetbrains.mps.execution.commands.structure.ProcessBuilderKeyPart")) {
            SNode keyValuePart = new NewProcessHandlerBuilder_MigrationScript.QuotationClass_n2pakd_a0a0a0a0b0e0a0a0b0a().createNode(SLinkOperations.getTarget(SNodeOperations.cast(part, "jetbrains.mps.execution.commands.structure.ProcessBuilderKeyPart"), "value", true), SLinkOperations.getTarget(SNodeOperations.cast(part, "jetbrains.mps.execution.commands.structure.ProcessBuilderKeyPart"), "key", true));
            ListSequence.fromList(SLinkOperations.getTargets(replacement, "commandPart", true)).addElement(keyValuePart);
          }
        }
        SLinkOperations.setTarget(replacement, "workingDirectory", SLinkOperations.getTarget(node, "workingDirectory", true), true);
        SNodeOperations.replaceWithAnother(node, replacement);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  public static class QuotationClass_n2pakd_a0a0a0a0b0e0a0a0b0a {
    public QuotationClass_n2pakd_a0a0a0a0b0e0a0a0b0a() {
    }

    public SNode createNode(Object parameter_11, Object parameter_12) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.KeyValueCommandPart", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_11;
          SNode quotedNode1_7;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_7 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_7 = quotedNode_2;
          }
          if (quotedNode1_7 != null) {
            quotedNode_1.addChild("value", HUtil.copyIfNecessary(quotedNode1_7));
          }
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_3;
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_9 = quotedNode_4;
            quotedNode1_9.setProperty("value", "-");
            quotedNode_3.addChild("leftExpression", quotedNode1_9);
          }
          {
            quotedNode_5 = (SNode) parameter_12;
            SNode quotedNode1_10;
            if (_parameterValues_129834374.contains(quotedNode_5)) {
              quotedNode1_10 = HUtil.copyIfNecessary(quotedNode_5);
            } else {
              _parameterValues_129834374.add(quotedNode_5);
              quotedNode1_10 = quotedNode_5;
            }
            if (quotedNode1_10 != null) {
              quotedNode_3.addChild("rightExpression", HUtil.copyIfNecessary(quotedNode1_10));
            }
          }
          quotedNode_1.addChild("key", quotedNode1_8);
        }
        result = quotedNode1_6;
      }
      return result;
    }
  }
}
