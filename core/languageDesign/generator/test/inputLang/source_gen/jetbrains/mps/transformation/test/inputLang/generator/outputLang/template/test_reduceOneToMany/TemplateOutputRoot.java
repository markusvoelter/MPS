package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateOutputRoot implements TemplateDeclaration {
  private static SNodePointer template_q702qm_a0a0 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "3893401255414086886");
  private static SNodePointer templateNode_q702qm_a0a0a1a1 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "3893401255414086886");
  private static SNodePointer copySrcListMacro_q702qm_a0a0a1a5a1a1 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "3893401255414086893");

  public TemplateOutputRoot() {
  }

  public SNodePointer getTemplateNode() {
    return template_q702qm_a0a0;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_q702qm_a0a0a1a1);
      environment.nodeCopied(context, tnode1, "tpl/r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691/3893401255414086886");
      tnode1.setProperty("name", "OutputRoot");
      tnode1.setProperty("text", "chilren were generated from a single child in input node.");

      {
        Collection<SNode> tlist2 = null;
        try {
          environment.getTracer().pushMacro(copySrcListMacro_q702qm_a0a0a1a5a1a1);
          final Iterable<SNode> copyListInput2 = QueriesGenerated.sourceNodesQuery_3893401255414086894(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, copySrcListMacro_q702qm_a0a0a1a5a1a1, context, environment.getGenerator()));
          tlist2 = environment.copyNodes(copyListInput2, copySrcListMacro_q702qm_a0a0a1a5a1a1, null, context);
        } finally {
          environment.getTracer().closeMacro(copySrcListMacro_q702qm_a0a0a1a5a1a1);
        }
        for (SNode child3 : tlist2) {
          tnode1.addChild("outputChild", child3);
        }
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_q702qm_a0a0a1a1);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}
