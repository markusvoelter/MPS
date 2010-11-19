package jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateRootCustom implements TemplateDeclaration {
  private static SNodePointer templateNode_kyghau_a0a0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412775");
  private static SNodePointer templateNode_kyghau_a0a0a1a4a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412782");
  private static SNodePointer templateNode_kyghau_a0a0a1a4a1a4a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412783");
  private static SNodePointer templateNode_kyghau_a0a0a1a5a1a4a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412784");
  private static SNodePointer copySrcMacro_kyghau_a0a0a1a6a1a4a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412787");
  private static SNodePointer templateNode_kyghau_a0a0a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412776");
  private static SNodePointer templateNode_kyghau_a0a0a1a6a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412777");
  private static SNodePointer templateNode_kyghau_a0a0a1a3a1a6a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412778");
  private static SNodePointer templateNode_kyghau_a0a0a1a4a1a6a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412779");
  private static SNodePointer templateNode_kyghau_a0a0a1a5a1a6a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c89590606(jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main@generator)", "4146564171992412780");

  public TemplateRootCustom() {
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a0);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412775");
      tnode1.setProperty("name", "RootCustom");

      {
        final SNode tnode2 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a4a1a0);
          environment.nodeCopied(context, tnode2, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412782");
          tnode2.setProperty("name", "main");

          {
            final SNode tnode3 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.VoidType", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a4a1a4a1a0);
              environment.nodeCopied(context, tnode3, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412783");

            } finally {
              environment.getTracer().pushOutputNode(tnode3);
              environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a4a1a4a1a0);
            }
            tnode2.addChild("returnType", tnode3);
            // TODO validate child 
          }
          {
            final SNode tnode4 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a5a1a4a1a0);
              environment.nodeCopied(context, tnode4, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412784");

            } finally {
              environment.getTracer().pushOutputNode(tnode4);
              environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a5a1a4a1a0);
            }
            tnode2.addChild("visibility", tnode4);
            // TODO validate child 
          }
          {
            Collection<SNode> tlist5 = null;
            try {
              environment.getTracer().pushMacro(copySrcMacro_kyghau_a0a0a1a6a1a4a1a0);
              final SNode copySrcInput5 = QueriesGenerated.sourceNodeQuery_4146564171992412788(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), copySrcMacro_kyghau_a0a0a1a6a1a4a1a0, context, environment.getGenerator()));
              tlist5 = environment.copyNodes(Collections.singletonList(copySrcInput5), null);
            } finally {
              environment.getTracer().closeMacro(copySrcMacro_kyghau_a0a0a1a6a1a4a1a0);
            }
            for (SNode child6 : tlist5) {
              tnode2.addChild("body", child6);
            }
            // TODO validate child 
          }
        } finally {
          environment.getTracer().pushOutputNode(tnode2);
          environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a4a1a0);
        }
        tnode1.addChild("method", tnode2);
        // TODO validate child 
      }
      {
        final SNode tnode7 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a5a1a0);
          environment.nodeCopied(context, tnode7, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412776");

        } finally {
          environment.getTracer().pushOutputNode(tnode7);
          environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a5a1a0);
        }
        tnode1.addChild("visibility", tnode7);
        // TODO validate child 
      }
      {
        final SNode tnode8 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a6a1a0);
          environment.nodeCopied(context, tnode8, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412777");

          {
            final SNode tnode9 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.VoidType", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a3a1a6a1a0);
              environment.nodeCopied(context, tnode9, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412778");

            } finally {
              environment.getTracer().pushOutputNode(tnode9);
              environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a3a1a6a1a0);
            }
            tnode8.addChild("returnType", tnode9);
            // TODO validate child 
          }
          {
            final SNode tnode10 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a4a1a6a1a0);
              environment.nodeCopied(context, tnode10, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412779");

            } finally {
              environment.getTracer().pushOutputNode(tnode10);
              environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a4a1a6a1a0);
            }
            tnode8.addChild("visibility", tnode10);
            // TODO validate child 
          }
          {
            final SNode tnode11 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.StatementList", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_kyghau_a0a0a1a5a1a6a1a0);
              environment.nodeCopied(context, tnode11, "tpl/r:00000000-0000-4000-0000-011c89590606/4146564171992412780");

            } finally {
              environment.getTracer().pushOutputNode(tnode11);
              environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a5a1a6a1a0);
            }
            tnode8.addChild("body", tnode11);
            // TODO validate child 
          }
        } finally {
          environment.getTracer().pushOutputNode(tnode8);
          environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a6a1a0);
        }
        tnode1.addChild("constructor", tnode8);
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_kyghau_a0a0a1a0);
    }
    return TemplateUtil.singletonList(tnode1);

  }
}
