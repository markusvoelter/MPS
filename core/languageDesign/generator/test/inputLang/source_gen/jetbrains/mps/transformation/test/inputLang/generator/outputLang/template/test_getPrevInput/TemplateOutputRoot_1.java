package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.PostProcessor;
import jetbrains.mps.generator.template.MapSrcMacroPostProcContext;

public class TemplateOutputRoot_1 implements TemplateDeclaration {
  private static SNodePointer templateNode_rz5qmv_a0a0a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255620269");
  private static SNodePointer mapsrclMacroRef_rz5qmv_a0a0a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1233603475877");
  private static SNodePointer loopMacroRef_rz5qmv_a0a0a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202256587516");
  private static SNodePointer loopMacroRef_rz5qmv_a0a0a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202256594379");
  private static SNodePointer mapsrcMacroRef_rz5qmv_a0a0a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202337434278");
  private static SNodePointer templateNode_rz5qmv_a0a0a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202256495546");
  private static SNodePointer propertyMacro_rz5qmv_c0b0b0a2a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202326517570");
  private static SNodePointer templateNode_rz5qmv_a0a0a1a4a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202327206676");
  private static SNodePointer propertyMacro_rz5qmv_c0b0b0a2a1a4a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202327274818");
  private static SNodePointer ifMacroRef_rz5qmv_a0a0a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202332796046");
  private static SNodePointer templateNode_rz5qmv_a0a0a1a1a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202327778745");
  private static SNodePointer propertyMacro_rz5qmv_c0b0b0a2a1a1a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202327887567");
  private static SNodePointer templateNode_rz5qmv_a0a0a1a6a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202327949446");
  private static SNodePointer propertyMacro_rz5qmv_c0b0b0a2a1a6a2a3a2a2a3a2a2a2a3a3a1a5a1a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202327970030");
  private static SNodePointer mapsrcMacroRef_rz5qmv_b0b0a0a0a0a0b0d0d0c0c0d0c0c0c0d0d0b0f0b0a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202337434278");

  public TemplateOutputRoot_1() {
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_rz5qmv_a0a0a1a0);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f7/1202255620269");
      tnode1.setProperty("name", "OutputRoot_1");
      tnode1.setProperty("text", "'getPrevInputTest' output root (1)");

      {
        final List<SNode> tlist2 = new ArrayList();
        try {
          environment.getTracer().pushMacro(mapsrclMacroRef_rz5qmv_a0a0a1a5a1a0);

          final Iterable<SNode> sourceList2 = QueriesGenerated.sourceNodesQuery_1233603475878(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, mapsrclMacroRef_rz5qmv_a0a0a1a5a1a0, context, environment.getGenerator()));
          for (SNode itnode2 : sourceList2) {
            if (itnode2 == null) {
              continue;
            }
            TemplateContext context2 = context.subContext("LEVEL 1", itnode2);
            boolean inputChanged2 = context.getInput() != itnode2;
            try {
              if (inputChanged2) {
                environment.getTracer().pushInputNode(itnode2);
              }
              final List<SNode> tlist3 = new ArrayList();
              try {
                environment.getTracer().pushMacro(loopMacroRef_rz5qmv_a0a0a2a3a3a1a5a1a0);
                final Iterable<SNode> loopList3 = QueriesGenerated.sourceNodesQuery_1202256587517(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context2.getInput(), null, loopMacroRef_rz5qmv_a0a0a2a3a3a1a5a1a0, context2, environment.getGenerator()));
                for (SNode itnode3 : loopList3) {
                  if (itnode3 == null) {
                    continue;
                  }
                  boolean inputChanged3 = context2.getInput() != itnode3;
                  try {
                    if (inputChanged3) {
                      environment.getTracer().pushInputNode(itnode3);
                    }
                    TemplateContext context3 = context2.subContext("LEVEL 2", itnode3);
                    final List<SNode> tlist4 = new ArrayList();
                    try {
                      environment.getTracer().pushMacro(loopMacroRef_rz5qmv_a0a0a3a2a2a2a3a3a1a5a1a0);
                      final Iterable<SNode> loopList4 = QueriesGenerated.sourceNodesQuery_1202256594380(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context3.getInput(), null, loopMacroRef_rz5qmv_a0a0a3a2a2a2a3a3a1a5a1a0, context3, environment.getGenerator()));
                      for (SNode itnode4 : loopList4) {
                        if (itnode4 == null) {
                          continue;
                        }
                        boolean inputChanged4 = context3.getInput() != itnode4;
                        try {
                          if (inputChanged4) {
                            environment.getTracer().pushInputNode(itnode4);
                          }
                          TemplateContext context4 = context3.subContext(null, itnode4);
                          final List<SNode> tlist5 = new ArrayList();
                          try {
                            environment.getTracer().pushMacro(mapsrcMacroRef_rz5qmv_a0a0a3a2a2a3a2a2a2a3a3a1a5a1a0);
                            final SNode tnode6 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
                            try {
                              environment.getTracer().pushTemplateNode(templateNode_rz5qmv_a0a0a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                              environment.nodeCopied(context4, tnode6, "tpl/r:00000000-0000-4000-0000-011c895905f7/1202256495546");
                              tnode6.setProperty("text", (String) QueriesGenerated.propertyMacro_GetPropertyValue_1202326517571(environment.getOperationContext(), new PropertyMacroContext(context4.getInput(), "_text_", propertyMacro_rz5qmv_c0b0b0a2a2a3a2a2a3a2a2a2a3a3a1a5a1a0, context4, environment.getGenerator())));

                              {
                                final SNode tnode7 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
                                try {
                                  environment.getTracer().pushTemplateNode(templateNode_rz5qmv_a0a0a1a4a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                  environment.nodeCopied(context4, tnode7, "tpl/r:00000000-0000-4000-0000-011c895905f7/1202327206676");
                                  tnode7.setProperty("text", (String) QueriesGenerated.propertyMacro_GetPropertyValue_1202327274819(environment.getOperationContext(), new PropertyMacroContext(context4.getInput(), "_root_level_was_", propertyMacro_rz5qmv_c0b0b0a2a1a4a2a3a2a2a3a2a2a2a3a3a1a5a1a0, context4, environment.getGenerator())));

                                } finally {
                                  environment.getTracer().pushOutputNode(tnode7);
                                  environment.getTracer().closeTemplateNode(templateNode_rz5qmv_a0a0a1a4a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                }
                                tnode6.addChild("outputChild", tnode7);
                                // TODO validate child 
                              }
                              {
                                Collection<SNode> tlist8 = null;
                                try {
                                  environment.getTracer().pushMacro(ifMacroRef_rz5qmv_a0a0a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                  if (QueriesGenerated.ifMacro_Condition_1202332796047(environment.getOperationContext(), new IfMacroContext(context4.getInput(), ifMacroRef_rz5qmv_a0a0a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0, context4, environment.getGenerator()))) {
                                    final SNode tnode9 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
                                    try {
                                      environment.getTracer().pushTemplateNode(templateNode_rz5qmv_a0a0a1a1a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                      environment.nodeCopied(context4, tnode9, "tpl/r:00000000-0000-4000-0000-011c895905f7/1202327778745");
                                      tnode9.setProperty("text", (String) QueriesGenerated.propertyMacro_GetPropertyValue_1202327887568(environment.getOperationContext(), new PropertyMacroContext(context4.getInput(), "_level_1_was_", propertyMacro_rz5qmv_c0b0b0a2a1a1a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0, context4, environment.getGenerator())));

                                    } finally {
                                      environment.getTracer().pushOutputNode(tnode9);
                                      environment.getTracer().closeTemplateNode(templateNode_rz5qmv_a0a0a1a1a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                    }
                                    tlist8 = TemplateUtil.singletonList(tnode9);
                                  }

                                } finally {
                                  environment.getTracer().closeMacro(ifMacroRef_rz5qmv_a0a0a1a5a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                }
                                for (SNode child10 : tlist8) {
                                  tnode6.addChild("outputChild", child10);
                                }
                                // TODO validate child 
                              }
                              {
                                final SNode tnode11 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
                                try {
                                  environment.getTracer().pushTemplateNode(templateNode_rz5qmv_a0a0a1a6a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                  environment.nodeCopied(context4, tnode11, "tpl/r:00000000-0000-4000-0000-011c895905f7/1202327949446");
                                  tnode11.setProperty("text", (String) QueriesGenerated.propertyMacro_GetPropertyValue_1202327970031(environment.getOperationContext(), new PropertyMacroContext(context4.getInput(), "_level_2_was_", propertyMacro_rz5qmv_c0b0b0a2a1a6a2a3a2a2a3a2a2a2a3a3a1a5a1a0, context4, environment.getGenerator())));

                                } finally {
                                  environment.getTracer().pushOutputNode(tnode11);
                                  environment.getTracer().closeTemplateNode(templateNode_rz5qmv_a0a0a1a6a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                                }
                                tnode6.addChild("outputChild", tnode11);
                                // TODO validate child 
                              }
                            } finally {
                              environment.getTracer().pushOutputNode(tnode6);
                              environment.getTracer().closeTemplateNode(templateNode_rz5qmv_a0a0a2a3a2a2a3a2a2a2a3a3a1a5a1a0);
                            }
                            if (tnode6 != null) {
                              tlist5.add(tnode6);
                              environment.postProcess(new PostProcessor() {
                                public void process(SNode outputNode, TemplateContext postProcessContext) {
                                  QueriesGenerated.mapSrcMacro_post_mapper_1225236165359(environment.getOperationContext(), new MapSrcMacroPostProcContext(postProcessContext.getInput(), mapsrcMacroRef_rz5qmv_b0b0a0a0a0a0b0d0d0c0c0d0c0c0c0d0d0b0f0b0a, outputNode, postProcessContext, environment.getGenerator()));
                                }
                              }, tnode6, context4);
                            }
                          } finally {
                            environment.getTracer().closeMacro(mapsrcMacroRef_rz5qmv_a0a0a3a2a2a3a2a2a2a3a3a1a5a1a0);
                          }
                          if (tlist5 != null) {
                            tlist4.addAll(tlist5);
                          }
                        } finally {
                          if (inputChanged4) {
                            environment.getTracer().closeInputNode(itnode4);
                          }
                        }
                      }
                    } finally {
                      environment.getTracer().closeMacro(loopMacroRef_rz5qmv_a0a0a3a2a2a2a3a3a1a5a1a0);
                    }
                    if (tlist4 != null) {
                      environment.registerLabel(itnode3, tlist4, "LEVEL 2");
                      tlist3.addAll(tlist4);
                    }
                  } finally {
                    if (inputChanged3) {
                      environment.getTracer().closeInputNode(itnode3);
                    }
                  }
                }
              } finally {
                environment.getTracer().closeMacro(loopMacroRef_rz5qmv_a0a0a2a3a3a1a5a1a0);
              }
              if (tlist3 != null) {
                tlist2.addAll(tlist3);
                environment.registerLabel(itnode2, tlist3, "LEVEL 1");
                for (SNode mapSrcOutput12 : tlist3) {
                  environment.postProcess(new PostProcessor() {
                    public void process(SNode outputNode, TemplateContext postProcessContext) {
                      QueriesGenerated.mapSrcMacro_post_mapper_1233603527948(environment.getOperationContext(), new MapSrcMacroPostProcContext(postProcessContext.getInput(), mapsrclMacroRef_rz5qmv_a0a0a1a5a1a0, outputNode, postProcessContext, environment.getGenerator()));
                    }
                  }, mapSrcOutput12, context2);
                }
              }
            } finally {
              if (inputChanged2) {
                environment.getTracer().closeInputNode(itnode2);
              }
            }
          }

        } finally {
          environment.getTracer().closeMacro(mapsrclMacroRef_rz5qmv_a0a0a1a5a1a0);
        }
        for (SNode child13 : tlist2) {
          tnode1.addChild("outputChild", child13);
        }
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_rz5qmv_a0a0a1a0);
    }
    return TemplateUtil.singletonList(tnode1);

  }
}
