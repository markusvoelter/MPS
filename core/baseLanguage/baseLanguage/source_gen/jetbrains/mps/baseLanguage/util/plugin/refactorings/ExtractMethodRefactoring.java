package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.IStaticContainerProcessor;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.behavior.IExtractMethodRefactoringProcessor;
import jetbrains.mps.baseLanguage.behavior.Statement_Behavior;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.IParameter_Behavior;
import jetbrains.mps.baseLanguage.behavior.VariableDeclaration_Behavior;
import jetbrains.mps.baseLanguage.behavior.IStaticContainerForMethods_Behavior;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public abstract class ExtractMethodRefactoring {
  protected ExtractMethodRefactoringParameters myParameters;
  protected ExtractMethodRefactoringAnalyzer myAnalyzer;
  private IStaticContainerProcessor myStaticContainer;
  protected List<MethodMatch> myMatches;

  public ExtractMethodRefactoring(ExtractMethodRefactoringParameters parameters) {
    this.myParameters = parameters;
    this.myAnalyzer = parameters.getAnalyzer();
  }

  @NotNull
  public SNode doRefactor() {
    SNode body = createMethodBody();
    List<SNode> params = new ArrayList<SNode>();
    Map<SNode, SNode> inputToParams = this.createInputParameters(body, params);
    Map<SNode, SNode> inputMapping = this.createInputVaryablesMapping(inputToParams, this.myParameters.getNodesToRefactor());
    this.myMatches = new MethodDuplicatesFinder(this.myParameters.getNodesToRefactor(), inputMapping, params, this.getOutputReferences()).findDuplicates(SNodeOperations.getAncestor(ListSequence.fromList(this.myParameters.getNodesToRefactor()).first(), "jetbrains.mps.baseLanguage.structure.Classifier", false, false));
    this.replaceInputVariablesByParameters(SLinkOperations.getTargets(body, "statement", true), inputToParams);
    SNode newMethod = this.createNewMethod(SNodeOperations.copyNode(this.getMethodType()), params, body);

    this.addMethod(newMethod);
    MethodMatch exactMatch = this.createMatch(this.myParameters.getNodesToRefactor(), inputMapping, params);
    this.replaceMatch(exactMatch, newMethod);
    MethodOptimizer.optimize(body);
    return newMethod;
  }

  protected abstract SNode createMethodBody();

  public abstract void replaceMatch(MethodMatch match, SNode methodDeclaration);

  public DuplicatesProcessor<MethodMatch> getDuplicatesProcessor() {
    return null;
  }

  protected MethodMatch createMatch(List<SNode> nodes, Map<SNode, SNode> inputMapping, List<SNode> parametersOrder) {
    MethodMatch match = new MethodMatch(parametersOrder);
    for (SNode node : ListSequence.fromList(nodes)) {
      match.putNode(node);
    }
    for (SNode node : SetSequence.fromSet(MapSequence.fromMap(inputMapping).keySet())) {
      match.putMapping(node, MapSequence.fromMap(inputMapping).get(node));
    }
    return match;
  }

  protected SNode createNewMethod(SNode returnType, List<SNode> params, SNode body) {
    SNode myMethod;
    if (this.myStaticContainer != null) {
      myMethod = this.myStaticContainer.createNewMethod();
    } else {
      IExtractMethodRefactoringProcessor processor = this.myAnalyzer.getExtractMethodReafactoringProcessor();
      processor.setStatic(this.myParameters.isStatic());
      myMethod = processor.createNewMethod();
    }
    this.fillBaseMethodDeclaration(myMethod, returnType, params, body);
    this.createNewDeclarations(myMethod);
    this.correctThrowsList(myMethod);
    return myMethod;
  }

  private void correctThrowsList(SNode method) {
    List<SNode> throwables = new ArrayList<SNode>();
    for (SNode statement : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true))) {
      ListSequence.fromList(throwables).addSequence(SetSequence.fromSet(Statement_Behavior.call_uncaughtThrowables_5412515780383108857(statement, false)));
    }
    ListSequence.fromList(SLinkOperations.getTargets(method, "throwsItem", true)).addSequence(ListSequence.fromList(throwables).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return new ExtractMethodRefactoring.QuotationClass_jq3ovj_a0a0a0a0a2a6().createNode(it);
      }
    }));
  }

  protected void createNewDeclarations(SNode method) {
    Map<SNode, List<SNode>> mapping = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    for (SNode reference : ListSequence.fromList(SNodeOperations.getDescendantsWhereConceptInList(method, new String[]{"jetbrains.mps.baseLanguage.structure.LocalVariableReference", "jetbrains.mps.baseLanguage.structure.ParameterReference"}, false, new String[]{}))) {
      SNode declaration = SLinkOperations.getTarget(reference, "variableDeclaration", false);
      if (!(ListSequence.fromList(SNodeOperations.getAncestors(declaration, null, false)).contains(method))) {
        if (!(SetSequence.fromSet(MapSequence.fromMap(mapping).keySet()).contains(declaration))) {
          MapSequence.fromMap(mapping).put(declaration, new ArrayList<SNode>());
        }
        ListSequence.fromList(MapSequence.fromMap(mapping).get(declaration)).addElement(reference);
      }
    }
    for (SNode declaration : SetSequence.fromSet(MapSequence.fromMap(mapping).keySet())) {
      SNode newDeclaration = new ExtractMethodRefactoring.QuotationClass_jq3ovj_a0a0a2a7().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(declaration, "type", true)), SPropertyOperations.getString(declaration, "name"));
      SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).first(), new ExtractMethodRefactoring.QuotationClass_jq3ovj_a0a0b0c0h().createNode(newDeclaration));
      for (SNode reference : ListSequence.fromList(MapSequence.fromMap(mapping).get(declaration))) {
        SNodeOperations.replaceWithAnother(reference, new ExtractMethodRefactoring.QuotationClass_jq3ovj_a0a0a0c0c0h().createNode(newDeclaration));
      }
    }
  }

  protected SNode fillBaseMethodDeclaration(SNode declaration, SNode returnType, List<SNode> params, SNode body) {
    if (SNodeOperations.isInstanceOf(declaration, "jetbrains.mps.baseLanguage.structure.IVisible")) {
      SNode visibleDeclaration = SNodeOperations.cast(declaration, "jetbrains.mps.baseLanguage.structure.IVisible");
      SLinkOperations.setTarget(visibleDeclaration, "visibility", this.myParameters.getVisibilityLevel().getNode(), true);
    }
    SNode methodDeclaration = declaration;
    SLinkOperations.setTarget(methodDeclaration, "returnType", SNodeOperations.copyNode(returnType), true);
    SPropertyOperations.set(methodDeclaration, "name", this.myParameters.getName());
    ListSequence.fromList(SLinkOperations.getTargets(methodDeclaration, "parameter", true)).addSequence(ListSequence.fromList(params));
    SLinkOperations.setTarget(methodDeclaration, "body", body, true);
    return methodDeclaration;
  }

  protected void addMethod(SNode node) {
    if (this.myStaticContainer == null) {
      IExtractMethodRefactoringProcessor processor = this.myAnalyzer.getExtractMethodReafactoringProcessor();
      processor.addMethod(node);
    } else {
      this.myStaticContainer.addMethod(node);
    }
  }

  protected Map<SNode, SNode> createInputParameters(SNode body, List<SNode> parameters) {
    Map<SNode, SNode> result = MapSequence.fromMap(new HashMap<SNode, SNode>());
    for (MethodParameter methodParameter : ListSequence.fromList(this.myParameters.getParameters())) {
      if (methodParameter.isSelected()) {
        SNode parameter = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null);
        SLinkOperations.setTarget(parameter, "type", SNodeOperations.copyNode(methodParameter.getType()), true);
        SPropertyOperations.set(parameter, "name", methodParameter.getName());
        if (methodParameter.isFinal()) {
          SPropertyOperations.set(parameter, "isFinal", "" + true);
        }
        ListSequence.fromList(parameters).addElement(parameter);
        MapSequence.fromMap(result).put(methodParameter.getDeclaration(), parameter);
      }
    }
    return result;
  }

  public void replaceInputVariablesByParameters(List<SNode> nodes, Map<SNode, SNode> mapping) {
    Map<SNode, SNode> anotherMap = this.createInputVaryablesMapping(mapping, nodes);
    for (SNode node : SetSequence.fromSet(MapSequence.fromMap(anotherMap).keySet())) {
      SNodeOperations.replaceWithAnother(node, new ExtractMethodRefactoring.QuotationClass_jq3ovj_a0a0a0b0l().createNode(MapSequence.fromMap(anotherMap).get(node)));
    }
  }

  public Map<SNode, SNode> createInputVaryablesMapping(Map<SNode, SNode> variableDeclarationToParameter, List<SNode> nodes) {
    Map<SNode, SNode> mapping = MapSequence.fromMap(new HashMap<SNode, SNode>());
    for (SNode node : ListSequence.fromList(nodes)) {
      for (SNode reference : ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{}))) {
        if (MoveRefactoringUtils.isReference(reference)) {
          SNode target = Sequence.fromIterable(SNodeOperations.getReferences(reference)).first().getTargetNode();
          if (MapSequence.fromMap(variableDeclarationToParameter).containsKey(target)) {
            MapSequence.fromMap(mapping).put(reference, MapSequence.fromMap(variableDeclarationToParameter).get(target));
          }
        }
      }
      for (SNode parameter : ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.IParameter", false, new String[]{}))) {
        SNode declaration = IParameter_Behavior.call_getDeclaration_1225282371351(parameter);
        if (MapSequence.fromMap(variableDeclarationToParameter).containsKey(declaration)) {
          MapSequence.fromMap(mapping).put(parameter, MapSequence.fromMap(variableDeclarationToParameter).get(declaration));
        }
      }
    }
    return mapping;
  }

  protected SNode createReference(SNode variable) {
    return VariableDeclaration_Behavior.call_createReference_1213877517482(variable);
  }

  protected List<SNode> createCallParameters() {
    List<SNode> result = new ArrayList<SNode>();
    for (MethodParameter parameter : ListSequence.fromList(this.myParameters.getParameters())) {
      if (parameter.isSelected()) {
        ListSequence.fromList(result).addElement(parameter.getReference());
      }
    }
    return result;
  }

  protected SNode createMethodCall(SNode methodDeclaration, List<SNode> parameters) {
    if (this.myStaticContainer == null) {
      IExtractMethodRefactoringProcessor processor = this.myAnalyzer.getExtractMethodReafactoringProcessor();
      return processor.createMethodCall(methodDeclaration, parameters);
    } else {
      return this.myStaticContainer.createMethodCall(methodDeclaration, parameters);
    }
  }

  public SNode createMethodCall(MethodMatch match, SNode methodDeclaration) {
    return this.createMethodCall(methodDeclaration, match.getCallParameters());
  }

  public void setStaticContainer(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      this.myStaticContainer = new ClassStaticContainerProcessor(node);
    } else if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods")) {
      SNode staticContainer = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods");
      this.myStaticContainer = IStaticContainerForMethods_Behavior.call_getStaticContainerProcessor_1222174378300(staticContainer, node);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public Set<SNode> getOutputReferences() {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    List<SNode> outputVariables = myParameters.getAnalyzer().getOutputVariables();
    for (SNode node : ListSequence.fromList(myParameters.getNodesToRefactor())) {
      for (SNode varReference : ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.VariableReference", false, new String[]{}))) {
        if (ListSequence.fromList(outputVariables).contains(SLinkOperations.getTarget(varReference, "variableDeclaration", false))) {
          SetSequence.fromSet(result).addElement(varReference);
        }
      }
    }
    return result;
  }

  public List<MethodMatch> getMatches() {
    return this.myMatches;
  }

  public ExtractMethodRefactoringAnalyzer getAnalyzer() {
    return myParameters.getAnalyzer();
  }

  public abstract SNode getMethodType();

  public int canBeStatic() {
    if (!(this.myAnalyzer.canBeStatic())) {
      return 0;
    } else {
      if (!(this.myAnalyzer.shouldBeStatic())) {
        return 1;
      } else {
        return 2;
      }
    }
  }

  public boolean getStatic() {
    if (this.myAnalyzer.canBeStatic() && this.myAnalyzer.shouldBeStatic()) {
      return true;
    } else {
      return false;
    }
  }

  public static class QuotationClass_jq3ovj_a0a0a0a0a2a6 {
    public QuotationClass_jq3ovj_a0a0a0a0a2a6() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_jq3ovj_a0a0a2a7 {
    public QuotationClass_jq3ovj_a0a0a2a7() {
    }

    public SNode createNode(Object parameter_5, Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setProperty("name", (String) parameter_6);
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("type", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_jq3ovj_a0a0b0c0h {
    public QuotationClass_jq3ovj_a0a0b0c0h() {
    }

    public SNode createNode(Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_6;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("localVariableDeclaration", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_jq3ovj_a0a0a0c0c0h {
    public QuotationClass_jq3ovj_a0a0a0c0c0h() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_jq3ovj_a0a0a0b0l {
    public QuotationClass_jq3ovj_a0a0a0b0l() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
