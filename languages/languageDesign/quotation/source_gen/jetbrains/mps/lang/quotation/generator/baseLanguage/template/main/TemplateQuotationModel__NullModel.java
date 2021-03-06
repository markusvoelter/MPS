package jetbrains.mps.lang.quotation.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclarationWeavingAware;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateQuotationModel__NullModel implements TemplateDeclarationWeavingAware {
  private static SNodePointer templateNode_or1pk5_a0a0a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "4462183154303720478");
  private static SNodePointer weaveTfConst_or1pk5_a0b0d = new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "4462183154303720479");

  public TemplateQuotationModel__NullModel() {
  }

  public SNodePointer getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959034c(jetbrains.mps.lang.quotation.generator.baseLanguage.template.main@generator)", "1196351886651");
  }

  protected SNode applyPart0(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.NullLiteral", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_or1pk5_a0a0a1a1);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c8959034c/4462183154303720478");

    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_or1pk5_a0a0a1a1);
    }
    return tnode1;
  }

  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return TemplateUtil.singletonList(applyPart0(environment, context));
  }

  public Collection<SNode> weave(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context, @NotNull SNode outputContextNode) throws GenerationException {
    SNode tnodepart0 = applyPart0(environment, context);
    SNodePointer weaveTf0 = weaveTfConst_or1pk5_a0b0d;
    environment.weaveNode(outputContextNode, "contentNode", tnodepart0, weaveTf0, context.getInput());
    return TemplateUtil.singletonList(tnodepart0);
  }
}
