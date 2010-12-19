package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import jetbrains.mps.generator.runtime.TemplateMappingScript;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.generator.impl.AbandonRuleInputException;

public class Mappingmain implements TemplateMappingConfiguration {
  private static SNodePointer reductionRule_417xrn_a0a2a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460378545");
  private static SNodePointer conseq_417xrn_a0a0a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460405394");
  private static SNodePointer templateNode_417xrn_a0a0a2a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460409521");
  private static SNodePointer reductionRule_417xrn_a0a2b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206461848250");
  private static SNodePointer conseq_417xrn_a0a0a4b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206461864723");
  private static SNodePointer templateNode_417xrn_a0a0a2a4b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206461864724");
  private static SNodePointer reductionRule_417xrn_a0a2c = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460387609");
  private static SNodePointer conseq_417xrn_a0a0a4c = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460444835");
  private static SNodePointer templateNode_417xrn_a0a0a2a4c = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460444836");
  private static SNodePointer rootMappingRule_417xrn_a0a0d = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460083385");
  private static SNodePointer rootMappingRule_417xrn_b0b0a0a4d = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206460083385");

  private final Collection<TemplateReductionRule> rules;
  private final Collection<TemplateRootMappingRule> rootRules;
  private final TemplateModel myModel;

  public Mappingmain(TemplateModel model) {
    this.myModel = model;
    rules = TemplateUtil.<TemplateReductionRule>asCollection(new Mappingmain.ReductionRule0(), new Mappingmain.ReductionRule1(), new Mappingmain.ReductionRule2());
    rootRules = TemplateUtil.<TemplateRootMappingRule>asCollection(new Mappingmain.RootMappingRule0());
  }

  public String getName() {
    return "main";
  }

  public TemplateModel getModel() {
    return this.myModel;
  }

  public SNodePointer getMappingNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "1206459766745");
  }

  public Collection<TemplateReductionRule> getReductionRules() {
    return rules;
  }

  public Collection<TemplateCreateRootRule> getCreateRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateRootMappingRule> getRootRules() {
    return rootRules;
  }

  public Collection<TemplateWeavingRule> getWeavingRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateDropRootRule> getDropRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPostScripts() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPreScripts() {
    return Collections.emptySet();
  }

  public class ReductionRule0 implements TemplateReductionRule {
    public ReductionRule0() {
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode";
    }

    public SNodePointer getRuleNode() {
      return reductionRule_417xrn_a0a2a;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206461124351(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), reductionRule_417xrn_a0a2a, environment.getGenerator())))) {
        return null;
      }

      environment.getTracer().pushRule(reductionRule_417xrn_a0a2a);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a2a);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a4a);
      final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      try {
        environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a4a);
        environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f9/1206460409521");
        tnode1.setProperty("text", "output from base InputNode");

      } finally {
        environment.getTracer().pushOutputNode(tnode1);
        environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a4a);
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }

  public class ReductionRule1 implements TemplateReductionRule {
    public ReductionRule1() {
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_B";
    }

    public SNodePointer getRuleNode() {
      return reductionRule_417xrn_a0a2b;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206461877475(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), reductionRule_417xrn_a0a2b, environment.getGenerator())))) {
        return null;
      }

      environment.getTracer().pushRule(reductionRule_417xrn_a0a2b);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a2b);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a4b);
      final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      try {
        environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a4b);
        environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f9/1206461864724");
        tnode1.setProperty("text", "output from InputNode_B");

      } finally {
        environment.getTracer().pushOutputNode(tnode1);
        environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a4b);
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }

  public class ReductionRule2 implements TemplateReductionRule {
    public ReductionRule2() {
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
    }

    public SNodePointer getRuleNode() {
      return reductionRule_417xrn_a0a2c;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206461190505(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), reductionRule_417xrn_a0a2c, environment.getGenerator())))) {
        return null;
      }

      environment.getTracer().pushRule(reductionRule_417xrn_a0a2c);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a2c);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a4c);
      final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      try {
        environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a4c);
        environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f9/1206460444836");
        tnode1.setProperty("text", "output from InputNode_A");

      } finally {
        environment.getTracer().pushOutputNode(tnode1);
        environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a4c);
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0d;
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

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1206460092545(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a0a4d, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      Collection<SNode> result = new TemplateOutputRoot().apply(environment, context);
      return result;
    }
  }
}
