package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_generationScripts;

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
import jetbrains.mps.generator.impl.AbandonRuleInputException;

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
      if (!(QueriesGenerated.baseMappingRule_Condition_1202780919451(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      Collection<SNode> tlist1 = null;
      if (QueriesGenerated.baseMappingRule_Condition_1195172400866(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null))) {
        final SNode tnode2 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
        // TODO notify environment 
        tnode2.setProperty("text", "<input option : 1>");
        tlist1 = TemplateUtil.singletonList(tnode2);
      } else {
        final SNode tnode3 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
        // TODO notify environment 
        tnode3.setProperty("text", "<input option : default>");
        tlist1 = TemplateUtil.singletonList(tnode3);
      }
      return tlist1;
    }

    public boolean applyToInheritors() {
      return true;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
    }
  }

  public class ReductionRule1 implements TemplateReductionRule {
    public ReductionRule1() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1202780894871(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      throw new AbandonRuleInputException();
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1202243113773(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      return new TemplateOutputRoot_by_MappingRule().apply(environment, context, null);
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
