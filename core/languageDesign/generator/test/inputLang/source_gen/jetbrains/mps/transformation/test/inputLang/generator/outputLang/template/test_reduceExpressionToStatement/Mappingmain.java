package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement;

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
  private static SNodePointer reductionRule_417xrn_a0a2a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150610748");
  private static SNodePointer conseq_417xrn_a0a0a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150677803");
  private static SNodePointer templateNode_417xrn_a0a0a2a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150725887");
  private static SNodePointer templateNode_417xrn_a0a0a1a3a2a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150737045");
  private static SNodePointer rootMappingRule_417xrn_a0a0b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150078117");
  private static SNodePointer rootMappingRule_417xrn_b0b0a0a4b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150078117");

  private final Collection<TemplateReductionRule> rules;
  private final Collection<TemplateRootMappingRule> rootRules;
  private final TemplateModel myModel;

  public Mappingmain(TemplateModel model) {
    this.myModel = model;
    rules = TemplateUtil.<TemplateReductionRule>asCollection(new Mappingmain.ReductionRule0());
    rootRules = TemplateUtil.<TemplateRootMappingRule>asCollection(new Mappingmain.RootMappingRule0());
  }

  public String getName() {
    return "main";
  }

  public TemplateModel getModel() {
    return this.myModel;
  }

  public SNodePointer getMappingNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150022679");
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
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.ExpressionToReduceToStatement";
    }

    public SNodePointer getRuleNode() {
      return reductionRule_417xrn_a0a2a;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1209150617830(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), reductionRule_417xrn_a0a2a, environment.getGenerator())))) {
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
      final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ExpressionStatement", false);
      try {
        environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a4a);
        environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f8/1209150725887");

        {
          final SNode tnode2 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.StringLiteral", false);
          try {
            environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a1a3a2a4a);
            environment.nodeCopied(context, tnode2, "tpl/r:00000000-0000-4000-0000-011c895905f8/1209150737045");
            tnode2.setProperty("value", "my expression");

          } finally {
            environment.getTracer().pushOutputNode(tnode2);
            environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a1a3a2a4a);
          }
          if (tnode2 != null) {
            tnode1.addChild("expression", tnode2);
          }
          // TODO validate child 
        }
      } finally {
        environment.getTracer().pushOutputNode(tnode1);
        environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a4a);
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0b;
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputRootWithStatementList";
    }

    public boolean keepSourceRoot() {
      return false;
    }

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1209150502311(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a0a4b, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      Collection<SNode> result = new Templateout_class().apply(environment, context);
      return result;
    }
  }
}
