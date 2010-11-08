package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Mappingmain implements TemplateMappingConfiguration {
  public Mappingmain() {
  }

  public Collection<TemplateReductionRule> getReductionRules() {
    return null;
  }

  public Collection<TemplateCreateRootRule> getCreateRules() {
    return null;
  }

  public Collection<TemplateRootMappingRule> getRootRules() {
    return null;
  }

  public class ReductionRule0 implements TemplateReductionRule {
    public ReductionRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206461124351(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      final SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      // TODO notify environment 
      tnode1.setProperty("text", "output from base InputNode");
      return TemplateUtil.singletonList(tnode1);
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode";
    }
  }

  public class ReductionRule1 implements TemplateReductionRule {
    public ReductionRule1() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206461877475(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      final SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      // TODO notify environment 
      tnode1.setProperty("text", "output from InputNode_B");
      return TemplateUtil.singletonList(tnode1);
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_B";
    }
  }

  public class ReductionRule2 implements TemplateReductionRule {
    public ReductionRule2() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206461190505(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      final SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      // TODO notify environment 
      tnode1.setProperty("text", "output from InputNode_A");
      return TemplateUtil.singletonList(tnode1);
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206460092545(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      return new TemplateOutputRoot().apply(environment, context, null);
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputRoot";
    }

    public boolean keepSourceRoot() {
      return false;
    }
  }
}
