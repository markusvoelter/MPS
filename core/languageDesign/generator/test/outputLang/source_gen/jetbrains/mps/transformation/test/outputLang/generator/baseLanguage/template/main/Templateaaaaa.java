package jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNode;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Templateaaaaa implements TemplateDeclaration {
  private static SNodePointer templateNode_54ml0j_a0a0a2a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "7870321878389731890");
  private static SNodePointer templateNode_54ml0j_a0a0a1a3a2a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "7870321878389731891");

  private SNode myNnnn;

  public Templateaaaaa(SNode nnnn) {
    this.myNnnn = nnnn;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    TemplateContext contextWithParameters = context;
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.BlockStatement", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_54ml0j_a0a0a2a0);
      environment.nodeCopied(contextWithParameters, tnode1, "tpl/r:00000000-0000-4000-0000-011c89590606/7870321878389731890");

      {
        final SNode tnode2 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.StatementList", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_54ml0j_a0a0a1a3a2a0);
          environment.nodeCopied(contextWithParameters, tnode2, "tpl/r:00000000-0000-4000-0000-011c89590606/7870321878389731891");

        } finally {
          environment.getTracer().pushOutputNode(tnode2);
          environment.getTracer().closeTemplateNode(templateNode_54ml0j_a0a0a1a3a2a0);
        }
        tnode1.addChild("statements", tnode2);
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_54ml0j_a0a0a2a0);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}
