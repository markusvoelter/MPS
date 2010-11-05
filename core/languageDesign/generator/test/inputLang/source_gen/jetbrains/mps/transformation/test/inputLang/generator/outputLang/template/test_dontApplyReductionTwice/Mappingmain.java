package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_dontApplyReductionTwice;

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

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1209604575152(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      final SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
      // TODO notify environment 
      tnode1.setProperty("name", "outputRoot");
      tnode1.setProperty("text", "output for 'don't apply reduction rule twice' test");
      {
        final SNode tnode2 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode_forDontApplyReductionTwice_test", false);
        // TODO notify environment 
        tnode2.setProperty("text", "this is OutputNode_forDontApplyReductionTwice_test actually");
        tnode1.addChild("outputChild", tnode2);
      }
      return TemplateUtil.singletonList(tnode1);
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
