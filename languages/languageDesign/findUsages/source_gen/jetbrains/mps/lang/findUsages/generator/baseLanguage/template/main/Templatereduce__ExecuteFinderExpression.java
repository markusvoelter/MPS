package jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclarationWeavingAware;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.Collection;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.IfMacroContext;

public class Templatereduce__ExecuteFinderExpression implements TemplateDeclarationWeavingAware {
  private static SNodePointer templateNode_qubm7t_a0a0a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876025");
  private static SNodePointer templateNode_qubm7t_a0a0a1a5a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876026");
  private static SNodePointer propertyMacro_qubm7t_c0b0b0a2a1a5a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876027");
  private static SNodePointer copySrcMacro_qubm7t_a0a0a1a6a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876037");
  private static SNodePointer ifMacroRef_qubm7t_a0a0a1a7a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876045");
  private static SNodePointer templateNode_qubm7t_a0a0a1a1a1a7a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876044");
  private static SNodePointer conseq_qubm7t_a0a0a0b0b0h0b0b = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876054");
  private static SNodePointer copySrcMacro_qubm7t_a0a0a2a0b0b0h0b0b = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876056");
  private static SNodePointer ifMacroRef_qubm7t_a0a0a1a8a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511368");
  private static SNodePointer templateNode_qubm7t_a0a0a1a1a1a8a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511361");
  private static SNodePointer templateNode_qubm7t_a0a0a1a3a1a1a1a8a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511360");
  private static SNodePointer templateNode_qubm7t_a0a0a1a4a1a1a1a8a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511365");
  private static SNodePointer templateNode_qubm7t_a0a0a1a4a1a4a1a1a1a8a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511366");
  private static SNodePointer conseq_qubm7t_a0a0a0b0b0i0b0b = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511379");
  private static SNodePointer templateNode_qubm7t_a0a0a2a0b0b0i0b0b = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511380");
  private static SNodePointer templateNode_qubm7t_a0a0a1a3a2a0b0b0i0b0b = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511381");
  private static SNodePointer weaveTfConst_qubm7t_a0b0d = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876078");

  public Templatereduce__ExecuteFinderExpression() {
  }

  public SNodePointer getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1206446326133");
  }

  protected SNode applyPart0(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.StaticMethodCall", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a1);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c8959035c/5140158946217876025");
      tnode1.addReference(SReference.create("classConcept", tnode1, SModelReference.fromString("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), SNodeId.fromString("~FindUtils")));
      tnode1.addReference(SReference.create("baseMethodDeclaration", tnode1, SModelReference.fromString("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), SNodeId.fromString("~FindUtils.executeFinder(java.lang.String,jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.IScope,jetbrains.mps.progress.ProgressMonitor):java.util.List")));

      {
        final SNode tnode2 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.StringLiteral", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a5a1a1);
          environment.nodeCopied(context, tnode2, "tpl/r:00000000-0000-4000-0000-011c8959035c/5140158946217876026");
          tnode2.setProperty("value", TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_5140158946217876028(environment.getOperationContext(), new PropertyMacroContext(context.getInput(), "", propertyMacro_qubm7t_c0b0b0a2a1a5a1a1, context, environment.getGenerator()))));

        } finally {
          environment.getTracer().pushOutputNode(tnode2);
          environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a5a1a1);
        }
        if (tnode2 != null) {
          tnode1.addChild("actualArgument", tnode2);
        }
        // TODO validate child 
      }
      {
        Collection<SNode> tlist3 = null;
        try {
          environment.getTracer().pushMacro(copySrcMacro_qubm7t_a0a0a1a6a1a1);
          final SNode copySrcInput3 = QueriesGenerated.sourceNodeQuery_5140158946217876038(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), copySrcMacro_qubm7t_a0a0a1a6a1a1, context, environment.getGenerator()));
          tlist3 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput3), copySrcMacro_qubm7t_a0a0a1a6a1a1, "tpl/r:00000000-0000-4000-0000-011c8959035c/5140158946217876036", null, context);
        } finally {
          environment.getTracer().closeMacro(copySrcMacro_qubm7t_a0a0a1a6a1a1);
        }
        for (SNode child4 : TemplateUtil.asNotNull(tlist3)) {
          tnode1.addChild("actualArgument", child4);
        }
        // TODO validate child 
      }
      {
        Collection<SNode> tlist5 = null;
        try {
          environment.getTracer().pushMacro(ifMacroRef_qubm7t_a0a0a1a7a1a1);
          if (QueriesGenerated.ifMacro_Condition_5140158946217876046(environment.getOperationContext(), new IfMacroContext(context.getInput(), ifMacroRef_qubm7t_a0a0a1a7a1a1, context, environment.getGenerator()))) {
            final SNode tnode6 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ParameterReference", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a1a1a7a1a1);
              environment.nodeCopied(context, tnode6, "tpl/r:00000000-0000-4000-0000-011c8959035c/5140158946217876044");
              environment.resolveInTemplateLater(tnode6, "variableDeclaration", new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "5140158946217876044"), "tpl/r:00000000-0000-4000-0000-011c8959035c/1207142292341", "scope", context);

            } finally {
              environment.getTracer().pushOutputNode(tnode6);
              environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a1a1a7a1a1);
            }
            tlist5 = TemplateUtil.singletonList(tnode6);
          } else {
            environment.getTracer().pushRuleConsequence(conseq_qubm7t_a0a0a0b0b0h0b0b);
            Collection<SNode> tlist7 = null;
            try {
              environment.getTracer().pushMacro(copySrcMacro_qubm7t_a0a0a2a0b0b0h0b0b);
              final SNode copySrcInput7 = QueriesGenerated.sourceNodeQuery_5140158946217876057(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), copySrcMacro_qubm7t_a0a0a2a0b0b0h0b0b, context, environment.getGenerator()));
              tlist7 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput7), copySrcMacro_qubm7t_a0a0a2a0b0b0h0b0b, "tpl/r:00000000-0000-4000-0000-011c8959035c/5140158946217876055", null, context);
            } finally {
              environment.getTracer().closeMacro(copySrcMacro_qubm7t_a0a0a2a0b0b0h0b0b);
            }
            tlist5 = tlist7;
          }

        } finally {
          environment.getTracer().closeMacro(ifMacroRef_qubm7t_a0a0a1a7a1a1);
        }
        for (SNode child8 : TemplateUtil.asNotNull(tlist5)) {
          tnode1.addChild("actualArgument", child8);
        }
        // TODO validate child 
      }
      {
        Collection<SNode> tlist9 = null;
        try {
          environment.getTracer().pushMacro(ifMacroRef_qubm7t_a0a0a1a8a1a1);
          if (QueriesGenerated.ifMacro_Condition_7810572934689511369(environment.getOperationContext(), new IfMacroContext(context.getInput(), ifMacroRef_qubm7t_a0a0a1a8a1a1, context, environment.getGenerator()))) {
            final SNode tnode10 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.DotExpression", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a1a1a8a1a1);
              environment.nodeCopied(context, tnode10, "tpl/r:00000000-0000-4000-0000-011c8959035c/7810572934689511361");

              {
                final SNode tnode11 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ParameterReference", false);
                try {
                  environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a3a1a1a1a8a1a1);
                  environment.nodeCopied(context, tnode11, "tpl/r:00000000-0000-4000-0000-011c8959035c/7810572934689511360");
                  environment.resolveInTemplateLater(tnode11, "variableDeclaration", new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7810572934689511360"), "tpl/r:00000000-0000-4000-0000-011c8959035c/1207142292345", "monitor", context);

                } finally {
                  environment.getTracer().pushOutputNode(tnode11);
                  environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a3a1a1a1a8a1a1);
                }
                if (tnode11 != null) {
                  tnode10.addChild("operand", tnode11);
                }
                // TODO validate child 
              }
              {
                final SNode tnode12 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", false);
                try {
                  environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a4a1a1a1a8a1a1);
                  environment.nodeCopied(context, tnode12, "tpl/r:00000000-0000-4000-0000-011c8959035c/7810572934689511365");
                  tnode12.addReference(SReference.create("baseMethodDeclaration", tnode12, SModelReference.fromString("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.progress(MPS.Core/jetbrains.mps.progress@java_stub)"), SNodeId.fromString("~ProgressMonitor.subTask(int):jetbrains.mps.progress.ProgressMonitor")));

                  {
                    final SNode tnode13 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.IntegerConstant", false);
                    try {
                      environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a4a1a4a1a1a1a8a1a1);
                      environment.nodeCopied(context, tnode13, "tpl/r:00000000-0000-4000-0000-011c8959035c/7810572934689511366");
                      tnode13.setProperty("value", "1");

                    } finally {
                      environment.getTracer().pushOutputNode(tnode13);
                      environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a4a1a4a1a1a1a8a1a1);
                    }
                    if (tnode13 != null) {
                      tnode12.addChild("actualArgument", tnode13);
                    }
                    // TODO validate child 
                  }
                } finally {
                  environment.getTracer().pushOutputNode(tnode12);
                  environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a4a1a1a1a8a1a1);
                }
                if (tnode12 != null) {
                  tnode10.addChild("operation", tnode12);
                }
                // TODO validate child 
              }
            } finally {
              environment.getTracer().pushOutputNode(tnode10);
              environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a1a1a8a1a1);
            }
            tlist9 = TemplateUtil.singletonList(tnode10);
          } else {
            environment.getTracer().pushRuleConsequence(conseq_qubm7t_a0a0a0b0b0i0b0b);
            final SNode tnode14 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.GenericNewExpression", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a2a0b0b0i0b0b);
              environment.nodeCopied(context, tnode14, "tpl/r:00000000-0000-4000-0000-011c8959035c/7810572934689511380");

              {
                final SNode tnode15 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ClassCreator", false);
                try {
                  environment.getTracer().pushTemplateNode(templateNode_qubm7t_a0a0a1a3a2a0b0b0i0b0b);
                  environment.nodeCopied(context, tnode15, "tpl/r:00000000-0000-4000-0000-011c8959035c/7810572934689511381");
                  tnode15.addReference(SReference.create("baseMethodDeclaration", tnode15, SModelReference.fromString("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.progress(MPS.Core/jetbrains.mps.progress@java_stub)"), SNodeId.fromString("~EmptyProgressMonitor.<init>()")));

                } finally {
                  environment.getTracer().pushOutputNode(tnode15);
                  environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a3a2a0b0b0i0b0b);
                }
                if (tnode15 != null) {
                  tnode14.addChild("creator", tnode15);
                }
                // TODO validate child 
              }
            } finally {
              environment.getTracer().pushOutputNode(tnode14);
              environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a2a0b0b0i0b0b);
            }
            tlist9 = TemplateUtil.singletonList(tnode14);
          }

        } finally {
          environment.getTracer().closeMacro(ifMacroRef_qubm7t_a0a0a1a8a1a1);
        }
        for (SNode child16 : TemplateUtil.asNotNull(tlist9)) {
          tnode1.addChild("actualArgument", child16);
        }
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_qubm7t_a0a0a1a1);
    }
    return tnode1;
  }

  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return TemplateUtil.singletonList(applyPart0(environment, context));
  }

  public Collection<SNode> weave(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context, @NotNull SNode outputContextNode) throws GenerationException {
    SNode tnodepart0 = applyPart0(environment, context);
    SNodePointer weaveTf0 = weaveTfConst_qubm7t_a0b0d;
    environment.weaveNode(outputContextNode, "expression", tnodepart0, weaveTf0, context.getInput());
    return TemplateUtil.singletonList(tnodepart0);
  }
}
