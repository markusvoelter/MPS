package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import jetbrains.mps.generator.runtime.TemplateMappingScript;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class Mappingmain implements TemplateMappingConfiguration {
  private static SNodePointer rootMappingRule_417xrn_a0a0a = new SNodePointer("r:00000000-0000-4000-0000-011c895905fa(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild@generator)", "1218738658950");
  private static SNodePointer rootMappingRule_417xrn_b0b0a0a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905fa(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild@generator)", "1218738658950");
  private static SNodePointer weavingRule_417xrn_a0a0b = new SNodePointer("r:00000000-0000-4000-0000-011c895905fa(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild@generator)", "1218738863683");

  private final Collection<TemplateRootMappingRule> rootRules;
  private final Collection<TemplateWeavingRule> weavings;
  private final TemplateModel myModel;

  public Mappingmain(TemplateModel model) {
    this.myModel = model;
    rootRules = TemplateUtil.<TemplateRootMappingRule>asCollection(new Mappingmain.RootMappingRule0());
    weavings = TemplateUtil.<TemplateWeavingRule>asCollection(new Mappingmain.WeavingRule0());
  }

  public String getName() {
    return null;
  }

  public TemplateModel getModel() {
    return null;
  }

  public SNodePointer getMappingNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905fa(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild@generator)", "1218738629621");
  }

  public Collection<TemplateReductionRule> getReductionRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateCreateRootRule> getCreateRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateRootMappingRule> getRootRules() {
    return rootRules;
  }

  public Collection<TemplateWeavingRule> getWeavingRules() {
    return weavings;
  }

  public Collection<TemplateDropRootRule> getDropRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPostScripts() {
    return null;
  }

  public Collection<TemplateMappingScript> getPreScripts() {
    return null;
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0a;
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
      if (!(QueriesGenerated.baseMappingRule_Condition_1218738676457(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a0a4a, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      return new Templatemap_outputNode().apply(environment, context);
    }
  }

  public class WeavingRule0 implements TemplateWeavingRule {
    public WeavingRule0() {
    }

    public SNodePointer getRuleNode() {
      return weavingRule_417xrn_a0a0b;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
    }

    public boolean applyToInheritors() {
      return false;
    }

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1218738876108(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), weavingRule_417xrn_a0a0b, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public SNode getContextNode(TemplateExecutionEnvironment environment, TemplateContext context) {
      return QueriesGenerated.weaving_MappingRule_ContextNodeQuery_1218738863685(environment.getOperationContext(), new WeavingMappingRuleContext(context.getInput(), weavingRule_417xrn_a0a0b, environment.getGenerator()));
    }

    public boolean apply(TemplateExecutionEnvironment environment, TemplateContext context, SNode node) throws GenerationException {
      return false;
    }
  }
}
