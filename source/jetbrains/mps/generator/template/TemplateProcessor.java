package jetbrains.mps.generator.template;

import jetbrains.mps.smodel.*;
import jetbrains.mps.transformation.TLBase.plugin.debug.GenerationTracer;
import jetbrains.mps.transformation.TLBase.structure.*;
import jetbrains.mps.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class TemplateProcessor {
  private TemplateGenerator myGenerator;
  private SModel myOutputModel;
  private List<Pair<SNode, String>> myInputHistory = new ArrayList<Pair<SNode, String>>();

  public TemplateProcessor(TemplateGenerator generator) {
    myGenerator = generator;
    myOutputModel = myGenerator.getOutputModel();
  }


  public static List<SNode> createOutputNodesForTemplateNode(String mappingName,
                                                             SNode templateNode,
                                                             SNode inputNode,
                                                             TemplateGenerator generator) throws DismissTopMappingRuleException, TemplateProcessingFailureException {
    TemplateProcessor templateProcessor = new TemplateProcessor(generator);
    // todo: generator push/pop template processor
    List<SNode> outputNodels = templateProcessor.createOutputNodesForTemplateNode(mappingName, templateNode, inputNode, 0, true);
    if (outputNodels == null) {
      throw new TemplateProcessingFailureException();
    }
    return outputNodels;
  }

  private List<SNode> createOutputNodesForTemplateNode(String mappingName,
                                                       SNode templateNode,
                                                       SNode inputNode,
                                                       int nodeMacrosToSkip,
                                                       boolean registerTopOutput) throws DismissTopMappingRuleException {
    GenerationTracer generationTracer = myGenerator.getGeneratorSessionContext().getGenerationTracer();

    int macroCount = 0;
    List<SNode> outputNodes = new ArrayList<SNode>();
    // templateNode has unprocessed node-macros?
    for (INodeAdapter templateChildNode : templateNode.getAdapter().getChildren()) {
      if (!(templateChildNode instanceof NodeMacro)) continue;
      macroCount++;
      if (macroCount <= nodeMacrosToSkip) continue;
      NodeMacro nodeMacro = (NodeMacro) templateChildNode;

      generationTracer.pushMacro(nodeMacro.getNode());
      try {
        return createOutputNodesForTemplateNodeWithMacro(nodeMacro, templateNode, inputNode, nodeMacrosToSkip, registerTopOutput, generationTracer, macroCount);
      } finally {
        generationTracer.popMacro(nodeMacro.getNode());
      }
    }

    // templateNode has no unprocessed node-macros - create output instance for the tempate node
    SNode outputNode = SModelUtil_new.instantiateConceptDeclaration(templateNode.getConceptFqName(), myOutputModel, myGenerator.getScope(), false);
    if (outputNode == null) {
      myGenerator.showErrorMessage(null, templateNode, "'createOutputNodesForTemplateNode' cannot create output node");
      return null;
    }
    outputNodes.add(outputNode);
    if (registerTopOutput) {
      myGenerator.addTopOutputNodeByInputNode(inputNode, outputNode);
    }
    myGenerator.addOutputNodeByInputAndTemplateNode(inputNode, templateNode, outputNode);
    if (!myInputHistory.isEmpty()) {
      for (Pair<SNode, String> nodeAndMappingName : myInputHistory) {
        myGenerator.addOutputNodeByIndirectInputAndTemplateNode(nodeAndMappingName.o1, templateNode, outputNode);
      }
    }
    myGenerator.addOutputNodeByInputNodeAndMappingName(inputNode, mappingName, outputNode);
    myGenerator.addTemplateNodeByOutputNode(outputNode, templateNode);
    myGenerator.addOutputNodeByTemplateNode(templateNode, outputNode);
    outputNode.putProperties(templateNode);

    SModel templateModel = templateNode.getModel();
    for (SReference reference : templateNode.getReferences()) {
      if (templateNode.getLinkAttribute("referenceMacro", reference.getRole()) != null) {
        continue;
      }
      SNode templateReferentNode = reference.getTargetNode();
      if (templateReferentNode == null) {
        myGenerator.showErrorMessage(null, templateNode, "'createOutputNodesForTemplateNode()' referent '" + reference.getRole() + "' is null in template model");
        continue;
      }
      if (templateReferentNode.getModel() == templateModel) { // internal reference
        ReferenceInfo_TemplateNode refInfo = new ReferenceInfo_TemplateNode(
          outputNode,
          reference,
          inputNode,
          myInputHistory.isEmpty() ? null : new ArrayList<Pair<SNode, String>>(myInputHistory));
        PostponedReference postponedReference = new PostponedReference(
          refInfo,
          myGenerator
        );
        outputNode.addReference(postponedReference);
      } else {
        outputNode.setReferent(reference.getRole(), templateReferentNode);
      }
    }

    // process property and reference macros
    List<INodeAdapter> templateChildNodes = new ArrayList<INodeAdapter>();
    for (INodeAdapter templateChildNode : templateNode.getAdapter().getChildren()) {
      if (templateChildNode instanceof PropertyMacro) {
        MacroUtil.expandPropertyMacro(myGenerator, (PropertyMacro) templateChildNode, inputNode, templateNode, outputNode);
      } else if (templateChildNode instanceof ReferenceMacro) {
        ReferenceInfo_Macro refInfo = new ReferenceInfo_Macro(
          outputNode, (ReferenceMacro) templateChildNode,
          inputNode,
          templateNode
        );
        PostponedReference postponedReference = new PostponedReference(
          refInfo,
          myGenerator
        );
        outputNode.addReference(postponedReference);
      } else if (!GeneratorUtil.isTemplateLanguageElement(templateChildNode)) {
        templateChildNodes.add(templateChildNode);
      }
    }

    // process children
    generationTracer.pushTemplateNode(templateNode);
    generationTracer.pushOutputNode(outputNode);
    try {
      for (INodeAdapter templateChildNode : templateChildNodes) {
        List<SNode> outputChildNodes = createOutputNodesForTemplateNode(null, templateChildNode.getNode(), inputNode, 0, false);
        if (outputChildNodes != null) {
          String role = templateChildNode.getRole_();
          for (SNode outputChildNode : outputChildNodes) {
            //          // check child
            //          if (!SModelUtil_new.isAcceptableTarget(outputNode, role, outputChildNode)) {
            //            myGenerator.showErrorMessage(outputChildNode, "unacceptable child node " + outputChildNode.getDebugText() + " for role '" + role + "'");
            //            myGenerator.showErrorMessage(templateChildNode.getNode(), " -- template node " + templateChildNode.getDebugText());
            //          }
            outputNode.addChild(role, outputChildNode);
          }
        }
      }
    } finally {
      generationTracer.popTemplateNode(templateNode);
    }
    return outputNodes;
  }

  private List<SNode> createOutputNodesForTemplateNodeWithMacro(NodeMacro nodeMacro, SNode templateNode, SNode inputNode, int nodeMacrosToSkip, boolean registerTopOutput, GenerationTracer generationTracer, int macroCount) throws DismissTopMappingRuleException {
    List<SNode> outputNodes = new ArrayList<SNode>();

    String mappingName_ = null;
    if (nodeMacro.getMappingId() != null) {
      mappingName_ = nodeMacro.getMappingId();
    }
    if (nodeMacro.getMappingLabel() != null) {
      mappingName_ = nodeMacro.getMappingLabel().getName();
    }

    if (nodeMacro instanceof LoopMacro) {
      // $LOOP$
      List<SNode> newInputNodes = MacroUtil.getNewInputNodes(inputNode, templateNode, nodeMacrosToSkip, myGenerator);
      for (SNode newInputNode : newInputNodes) {
        generationTracer.pushInputNode(newInputNode);
        boolean inputChanged = (newInputNode != inputNode);
        if (inputChanged) {
          pushInputHistory(inputNode, mappingName_);
        }
        List<SNode> _outputNodes = createOutputNodesForTemplateNode(mappingName_, templateNode, newInputNode, nodeMacrosToSkip + 1, inputChanged);
        if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        if (inputChanged) {
          popInputHistory();
        } else if (registerTopOutput) {
          myGenerator.addTopOutputNodesByInputNode(inputNode, _outputNodes);
        }
      }
      return outputNodes;

    } else if (nodeMacro instanceof CopySrcNodeMacro || nodeMacro instanceof CopySrcListMacro) {
      // $COPY-SRC$ / $COPY-SRCL$
      List<SNode> newInputNodes = MacroUtil.getNewInputNodes(inputNode, templateNode, nodeMacrosToSkip, myGenerator);
      for (SNode newInputNode : newInputNodes) {
        generationTracer.pushInputNode(newInputNode);
        List<SNode> _outputNodes = copyNodeFromInputNode(mappingName_, templateNode, newInputNode);
        if (_outputNodes != null) outputNodes.addAll(_outputNodes);
      }
      return outputNodes;

    } else if (nodeMacro instanceof IfMacro) {
      // $IF$
      generationTracer.pushInputNode(inputNode);
      List<SNode> _outputNodes = null;
      if (MacroUtil.checkConditionForIfMacro(inputNode, (IfMacro) nodeMacro, myGenerator)) {
        _outputNodes = createOutputNodesForTemplateNode(mappingName_, templateNode, inputNode, nodeMacrosToSkip + 1, false);
      } else {
        // alternative consequence
        RuleConsequence altConsequence = ((IfMacro) nodeMacro).getAlternativeConsequence();
        if (altConsequence != null) {
          Pair<SNode, String> nodeAndMappingName = GeneratorUtil.getTemplateNodeFromRuleConsequence(altConsequence, inputNode, nodeMacro.getNode(), myGenerator);
          if (nodeAndMappingName == null) {
            myGenerator.showErrorMessage(inputNode, null, nodeMacro.getNode(), "error processing $IF$/alternative");
            return null;
          }
          SNode altTemplateNode = nodeAndMappingName.o1;
          if (nodeAndMappingName.o2 != null) {
            mappingName_ = nodeAndMappingName.o2;
          }
          generationTracer.pushRuleConsequence(altConsequence.getNode());
          _outputNodes = createOutputNodesForExternalTemplateNode(mappingName_, altTemplateNode, inputNode, false);
        }
      }
      if (_outputNodes != null) outputNodes.addAll(_outputNodes);
      if (registerTopOutput) {
        myGenerator.addTopOutputNodesByInputNode(inputNode, _outputNodes);
      }
      return outputNodes;

    } else if (nodeMacro instanceof MapSrcNodeMacro || nodeMacro instanceof MapSrcListMacro) {
      // $MAP-SRC$ or $MAP-SRCL$
      MapSrcMacro_MapperFunction macro_mapperFunction;
      String mapperId; // old
      if (nodeMacro instanceof MapSrcNodeMacro) {
        macro_mapperFunction = ((MapSrcNodeMacro) nodeMacro).getMapperFunction();
        mapperId = ((MapSrcNodeMacro) nodeMacro).getSourceNodeMapperId();
      } else {
        macro_mapperFunction = ((MapSrcListMacro) nodeMacro).getMapperFunction();
        mapperId = ((MapSrcListMacro) nodeMacro).getSourceNodeMapperId();
      }

      List<SNode> newInputNodes = MacroUtil.getNewInputNodes(inputNode, templateNode, nodeMacrosToSkip, myGenerator);
      for (SNode newInputNode : newInputNodes) {
        generationTracer.pushInputNode(newInputNode);
        if (mapperId != null || macro_mapperFunction != null) {
          SNode childToReplaceLater = SModelUtil_new.instantiateConceptDeclaration(templateNode.getConceptFqName(), myOutputModel, myGenerator.getScope(), false);
          generationTracer.pushOutputNodeToReplaceLater(childToReplaceLater);
          outputNodes.add(childToReplaceLater);
          // execute the 'mapper' function later
          myGenerator.getDelayedChanges().addExecuteMapSrcNodeMacroChange(nodeMacro, childToReplaceLater, newInputNode, myGenerator);
        } else {
          boolean inputChanged = (newInputNode != inputNode);
          if (inputChanged) {
            pushInputHistory(inputNode, mappingName_);
          }
          List<SNode> _outputNodes = createOutputNodesForTemplateNode(mappingName_, templateNode, newInputNode, nodeMacrosToSkip + 1, inputChanged);
          if (_outputNodes != null) outputNodes.addAll(_outputNodes);
          if (inputChanged) {
            popInputHistory();
          } else if (registerTopOutput) {
            myGenerator.addTopOutputNodesByInputNode(inputNode, _outputNodes);
          }
        }
      }
      return outputNodes;

    } else if (nodeMacro instanceof SwitchMacro) {
      // $SWITCH$
      TemplateSwitch templateSwitch = ((SwitchMacro) nodeMacro).getTemplateSwitch();
      List<SNode> newInputNodes = MacroUtil.getNewInputNodes(inputNode, templateNode, macroCount - 1, myGenerator);
      for (SNode newInputNode : newInputNodes) {
        generationTracer.pushInputNode(newInputNode);
        RuleConsequence consequenceForCase = (RuleConsequence) myGenerator.getConsequenceForSwitchCase(newInputNode, templateSwitch);
        SNode templateNodeForCase = null;
        if (consequenceForCase != null) {
          generationTracer.pushRuleConsequence(consequenceForCase.getNode());
          Pair<SNode, String> nodeAndMappingName = GeneratorUtil.getTemplateNodeFromRuleConsequence(consequenceForCase, newInputNode, nodeMacro.getNode(), myGenerator);
          if (nodeAndMappingName == null) {
            myGenerator.showErrorMessage(newInputNode, nodeMacro.getNode(), consequenceForCase.getNode(), "error processing $SWITCH$");
            return null;
          }
          templateNodeForCase = nodeAndMappingName.o1;
          if (nodeAndMappingName.o2 != null) {
            mappingName_ = nodeAndMappingName.o2;
          }
        } else {
          // for back compatibility
          generationTracer.pushRule(templateSwitch.getNode());
          TemplateDeclaration templateForSwitchCase = myGenerator.getTemplateForSwitchCase_deprecated(newInputNode, templateSwitch);
          if (templateForSwitchCase != null) {
            TemplateFragment fragment = GeneratorUtil.getFragmentFromTemplate(templateForSwitchCase, newInputNode, nodeMacro.getNode(), myGenerator);
            if (fragment != null) {
              templateNodeForCase = fragment.getParent().getNode();
              if (fragment.getName() != null) {
                mappingName_ = fragment.getName();
              }
              if (fragment.getLabelDeclaration() != null) {
                mappingName_ = fragment.getLabelDeclaration().getName();
              }
            }
          }
        }

        boolean inputChanged = (newInputNode != inputNode);
        if (inputChanged) {
          pushInputHistory(inputNode, mappingName_);
        }
        List<SNode> _outputNodes;
        if (templateNodeForCase != null) {
          _outputNodes = createOutputNodesForExternalTemplateNode(mappingName_, templateNodeForCase, newInputNode, inputChanged);
        } else {
          // no switch-case found for the inputNode - continue with templateNode under the $switch$
          _outputNodes = createOutputNodesForTemplateNode(mappingName_, templateNode, newInputNode, nodeMacrosToSkip + 1, inputChanged);
        }

        if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        if (inputChanged) {
          popInputHistory();
        } else if (registerTopOutput) {
          myGenerator.addTopOutputNodesByInputNode(inputNode, _outputNodes);
        }
      } // for (SNode newInputNode : newInputNodes)
      return outputNodes;

    } else if (nodeMacro instanceof IncludeMacro) {
      // $INCLUDE$
      IncludeMacro includeMacro = (IncludeMacro) nodeMacro;
      List<SNode> newInputNodes = MacroUtil.getNewInputNodes(inputNode, templateNode, macroCount - 1, myGenerator);
      for (SNode newInputNode : newInputNodes) {
        generationTracer.pushInputNode(newInputNode);
        TemplateDeclaration includeTemplate = includeMacro.getIncludeTemplate();
        if (includeTemplate == null) {
          myGenerator.showErrorMessage(newInputNode, null, nodeMacro.getNode(), "error processing $INCLIDE$ : no 'include template'");
          return null;
        }
        TemplateFragment fragment = GeneratorUtil.getFragmentFromTemplate(includeTemplate, newInputNode, nodeMacro.getNode(), myGenerator);
        if (fragment == null) {
          myGenerator.showErrorMessage(newInputNode, null, nodeMacro.getNode(), "error processing $INCLIDE$");
          return null;
        }
        SNode templateForInclude = fragment.getParent().getNode();
        if (fragment.getName() != null) {
          mappingName_ = fragment.getName();
        }
        if (fragment.getLabelDeclaration() != null) {
          mappingName_ = fragment.getLabelDeclaration().getName();
        }
        boolean inputChanged = (newInputNode != inputNode);
        if (inputChanged) {
          pushInputHistory(inputNode, mappingName_);
        }
        generationTracer.pushRule(nodeMacro.getNode());
        List<SNode> _outputNodes = createOutputNodesForExternalTemplateNode(mappingName_, templateForInclude, newInputNode, inputChanged);
        if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        if (inputChanged) {
          popInputHistory();
        } else if (registerTopOutput) {
          myGenerator.addTopOutputNodesByInputNode(inputNode, _outputNodes);
        }
      } // for (SNode newInputNode : newInputNodes)
      return outputNodes;

    } else {
      // $$
      List<SNode> newInputNodes = MacroUtil.getNewInputNodes(inputNode, templateNode, nodeMacrosToSkip, myGenerator);
      for (SNode newInputNode : newInputNodes) {
        generationTracer.pushInputNode(newInputNode);
        boolean inputChanged = (newInputNode != inputNode);
        if (inputChanged) {
          pushInputHistory(inputNode, mappingName_);
        }
        List<SNode> _outputNodes = createOutputNodesForTemplateNode(mappingName_, templateNode, newInputNode, nodeMacrosToSkip + 1, inputChanged);
        if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        if (inputChanged) {
          popInputHistory();
        } else if (registerTopOutput) {
          myGenerator.addTopOutputNodesByInputNode(inputNode, outputNodes);
        }
      }
      return outputNodes;
    }
  }

  private List<SNode> copyNodeFromInputNode(String mappingName, SNode templateNode, SNode inputNode) {
    List<SNode> outputNodes = tryToReduce(inputNode);
    if (outputNodes != null) {
      if (outputNodes.size() == 1) {
        SNode outputNode = outputNodes.get(0);
        { // register copied node
          myGenerator.addOutputNodeByInputNodeAndMappingName(inputNode, mappingName, outputNode);
          // output node should be accessible via 'findCopiedNode'
          myGenerator.addCopiedOutputNodeForInputNode(inputNode, outputNode);
        }
      }
      return outputNodes;
    }

    // no reduction found - do node copying
    SNode outputNode = SModelUtil_new.instantiateConceptDeclaration(inputNode.getConceptFqName(), myOutputModel, myGenerator.getScope(), false);
    if (outputNode == null) {
      myGenerator.showErrorMessage(inputNode, templateNode, "'copyNodeFromInputNode()' cannot create output node");
      return null;
    }

    myGenerator.addOutputNodeByInputAndTemplateNode(inputNode, templateNode, outputNode);
    myGenerator.addOutputNodeByInputNodeAndMappingName(inputNode, mappingName, outputNode);
    // output node should be accessible via 'findCopiedNode'
    myGenerator.addCopiedOutputNodeForInputNode(inputNode, outputNode);

    outputNode.putProperties(inputNode);

    SModel inputModel = myGenerator.getSourceModel();
    for (SReference inputReference : inputNode.getReferences()) {
      SNode inputTargetNode = inputReference.getTargetNode();
      if (inputTargetNode == null) {
        myGenerator.showErrorMessage(inputNode, templateNode, "'copyNodeFromInputNode()' referent '" + inputReference.getRole() + "' is null in template model");
        continue;
      }
      if (inputTargetNode.getModel().equals(inputModel)) {
        ReferenceInfo_CopiedInputNode refInfo = new ReferenceInfo_CopiedInputNode(
          inputReference.getRole(),
          outputNode,
          inputReference.getSourceNode(),
          inputReference.getTargetNode());
        PostponedReference reference = new PostponedReference(
          refInfo,
          myGenerator
        );
        outputNode.addReference(reference);
      } else {
        outputNode.setReferent(inputReference.getRole(), inputTargetNode);
      }
    }

    for (SNode inputChildNode : inputNode.getChildren()) {
      String childRole = inputChildNode.getRole_();
      assert childRole != null;
      List<SNode> outputChildNodes = copyNodeFromInputNode(null, inputChildNode, inputChildNode);
      if (outputChildNodes != null) {
        for (SNode outputChildNode : outputChildNodes) {
//          // check child
//          if (!SModelUtil_new.isAcceptableTarget(outputNode, childRole, outputChildNode)) {
//            myGenerator.showErrorMessage(outputChildNode, "unacceptable child node " + outputChildNode.getDebugText() + " for role '" + childRole + "'");
//            myGenerator.showErrorMessage(inputChildNode, " -- input node " + inputChildNode.getDebugText());
//          }
          outputNode.addChild(childRole, outputChildNode);
        }
      }
    }

    outputNodes = new ArrayList<SNode>(1);
    outputNodes.add(outputNode);
    return outputNodes;
  }

  private List<SNode> tryToReduce(SNode inputNode) {
    INodeAdapter reductionRule;
    boolean wasChanged = myGenerator.isChanged();
    Object marker = myGenerator.getGeneratorSessionContext().getGenerationTracer().getMarker();
    try {
      reductionRule = myGenerator.getRuleManager().findReductionRule(inputNode);
      if (reductionRule != null) {
        return GeneratorUtil.applyReductionRule(inputNode, reductionRule, myGenerator);
      }
    } catch (DismissTopMappingRuleException ex) {
      // it's ok, just continue
      myGenerator.setChanged(wasChanged);
      myGenerator.getGeneratorSessionContext().getGenerationTracer().dropTrace(marker);
    } finally {
      myGenerator.getGeneratorSessionContext().getGenerationTracer().clearMarker(marker);
    }
    return null;
  }

  private List<SNode> createOutputNodesForExternalTemplateNode(String mappingName,
                                                               SNode templateNode,
                                                               SNode inputNode,
                                                               boolean registerTopOutput) throws DismissTopMappingRuleException {
    TemplateProcessor templateProcessor = new TemplateProcessor(myGenerator);
    // todo: generator push/pop template processor
    return templateProcessor.createOutputNodesForTemplateNode(mappingName, templateNode, inputNode, 0, registerTopOutput);
  }


  private void pushInputHistory(SNode oldInputNode, String mappingName) {
    myInputHistory.add(new Pair<SNode, String>(oldInputNode, mappingName));
  }

  private void popInputHistory() {
    myInputHistory.remove(myInputHistory.size() - 1);
  }
}
