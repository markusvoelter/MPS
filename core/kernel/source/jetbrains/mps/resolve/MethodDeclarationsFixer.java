/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.resolve;

import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.search.IsInstanceCondition;
import jetbrains.mps.smodel.event.*;
import jetbrains.mps.baseLanguage.structure.*;
import jetbrains.mps.baseLanguage.search.MethodResolveUtil;
import jetbrains.mps.baseLanguage.behavior.IMethodCall_Behavior;
import jetbrains.mps.nodeEditor.EditorCheckerAdapter;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.TypeRecalculatedListener;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

import java.util.*;

import com.intellij.openapi.util.Pair;
import com.intellij.openapi.command.CommandProcessor;


public class MethodDeclarationsFixer extends EditorCheckerAdapter {
  private static boolean DISABLED = false;

  private Set<SNode> myCheckedMethodCalls = new HashSet<SNode>();
  private Map<SNode, Set<SNode>> myMethodDeclsToCheckedMethodCalls = new HashMap<SNode, Set<SNode>>();
  private Map<Pair<String, String>, Set<SNode>> myMethodConceptsAndNamesToCheckedMethodCalls =
    new HashMap<Pair<String, String>, Set<SNode>>();
  private Map<SNode, SNode> myParametersToCheckedMethodCalls = new HashMap<SNode, SNode>();
  private Map<SNode, SNode> myMethodCallsToSetDecls = new HashMap<SNode, SNode>();

  private Set<SNode> myCurrentExpressionsWithChangedTypes = new HashSet<SNode>();

  private final Object myRecalculatedTypesLock = new Object();

  private TypeRecalculatedListener myTypeRecalculatedListener = new TypeRecalculatedListener() {
    public void typeWillBeRecalculatedForTerm(SNode term) {
      synchronized (myRecalculatedTypesLock) {
        myCurrentExpressionsWithChangedTypes.add(term);
      }
    }
  };

  public void init() {
    TypeChecker.getInstance().addTypeRecalculatedListener(myTypeRecalculatedListener);
  }

  public void dispose() {
    TypeChecker.getInstance().removeTypeRecalculatedListener(myTypeRecalculatedListener);
  }

  public Set<EditorMessage> createMessages(SNode rootNode, IOperationContext operationContext, List<SModelEvent> events, boolean wasCheckedOnce) {

    if (DISABLED) {
      return new HashSet<EditorMessage>();
    }

    // for transient models, there could be no model descriptors
    if (rootNode.getModel().getModelDescriptor() == null) {
      return new HashSet<EditorMessage>(0);
    }

    // disable for transient models
    if (rootNode.getModel().isTransient()) {
      return new HashSet<EditorMessage>(0);
    }

    final Map<SNode, SNode> reResolvedTargets = new HashMap<SNode, SNode>();

    if (!wasCheckedOnce) {
      for (SNode methodCall : rootNode.getDescendants(new IsInstanceCondition(IMethodCall.concept))) {
        testAndFixMethodCall(methodCall, reResolvedTargets);
      }
    } else {

      Set<SNode> expressionsWithChangedTypes;
      synchronized (myRecalculatedTypesLock) {
        expressionsWithChangedTypes = new HashSet<SNode>(myCurrentExpressionsWithChangedTypes);
        myCurrentExpressionsWithChangedTypes.clear();
      }


      SModelEventVisitor visitor = new SModelEventVisitorAdapter() {

        public void visitChildEvent(SModelChildEvent event) {
          SNode child = event.getChild();
          if (event.isAdded()) {
            nodeAdded(child, reResolvedTargets);
          } else {
            nodeRemoved(child, event.getParent(), reResolvedTargets);
          }
        }

        public void visitReferenceEvent(SModelReferenceEvent event) {
          SReference reference = event.getReference();
          SNode sourceNode = reference.getSourceNode();
          if (SNodeOperations.isInstanceOf(sourceNode, IMethodCall.concept) &&
            IMethodCall.BASE_METHOD_DECLARATION.equals(reference.getRole())) {
            methodCallDeclarationChanged(sourceNode, reResolvedTargets);
          }
        }

        public void visitPropertyEvent(SModelPropertyEvent event) {
          SNode node = event.getNode();
          if (SNodeOperations.isInstanceOf(node, BaseMethodDeclaration.concept)) {
            if (BaseMethodDeclaration.NAME.equals(event.getPropertyName())) {
              methodDeclarationNameChanged(node, reResolvedTargets);
              methodDeclarationSignatureChanged(node, reResolvedTargets);
            }
          }
        }

        //todo
      };
      for (SModelEvent event : events) {
        if (event.getAffectedRoot() != rootNode) {
          continue;
        }
        event.accept(visitor);
      }
      for (SNode expressionWithChangedType : expressionsWithChangedTypes) {
        expressionTypeChanged(expressionWithChangedType, reResolvedTargets);
      }
    }

    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        if (reResolvedTargets.isEmpty()) return;

        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            CommandProcessor.getInstance().runUndoTransparentAction(new Runnable() {
              public void run() {
                for (SNode methodCall : reResolvedTargets.keySet()) {
                  SNode referent = reResolvedTargets.get(methodCall);
                  if (referent != null && !referent.shouldHaveBeenDisposed()) {
                    methodCall.setReferent(IMethodCall.BASE_METHOD_DECLARATION, referent);
                  }
                }
              }
            });
          }
        });
      }
    });

    return new HashSet<EditorMessage>();
  }

  public void clearCaches() {
    myCheckedMethodCalls.clear();
    myMethodDeclsToCheckedMethodCalls.clear();
    myMethodConceptsAndNamesToCheckedMethodCalls.clear();
    myParametersToCheckedMethodCalls.clear();
    myMethodCallsToSetDecls.clear();
  }

  public void testAndFixMethodCall(SNode methodCallNode, Map<SNode, SNode> reResolvedTargets) {
    IMethodCall methodCall = (IMethodCall) BaseAdapter.fromNode(methodCallNode);
    BaseMethodDeclaration baseMethodDeclaration = methodCall.getBaseMethodDeclaration();
    String methodName;
    if (baseMethodDeclaration == null) {
      if (methodCall instanceof AnonymousClass) {
        Classifier classifier = ((AnonymousClass) methodCall).getClassifier();
        if (classifier != null) {
          methodName = classifier.getName();
        } else {
          return;
        }
      } else {
        return;
      }
    } else {
      methodName = baseMethodDeclaration.getName();
    }
    List<Expression> actualArgs = methodCall.getActualArguments();

    List<? extends BaseMethodDeclaration> candidates = getCandidates(methodCall, methodName);
    if (candidates.isEmpty()) {
      return;
    }
    Map<TypeVariableDeclaration, Type> typeByTypeVar = getTypeByTypeVar(methodCall);

    jetbrains.mps.util.Pair<List<? extends BaseMethodDeclaration>,Boolean> parmCountPair = MethodResolveUtil.selectByParmCountReportNoGoodMethod(candidates, actualArgs);
    List<? extends BaseMethodDeclaration> methodDeclarationsGoodParams = parmCountPair.o1;
    BaseMethodDeclaration newTarget = null;
    boolean good;
    if (methodDeclarationsGoodParams.size() == 1) {
      newTarget = methodDeclarationsGoodParams.get(0);
      good = parmCountPair.o2;
    } else {
      jetbrains.mps.util.Pair<BaseMethodDeclaration, Boolean> parmTypesPair = MethodResolveUtil.chooseByParameterTypeReportNoGoodMethod(methodDeclarationsGoodParams, actualArgs, typeByTypeVar);
      newTarget = parmTypesPair.o1;
      good = parmTypesPair.o2;
    }
    if (newTarget != null) {
      if (baseMethodDeclaration == null || (good && newTarget.getNode() != baseMethodDeclaration.getNode())) {
        reResolvedTargets.put(methodCall.getNode(), newTarget.getNode());
      }
      myMethodCallsToSetDecls.put(methodCall.getNode(), newTarget.getNode());
      myCheckedMethodCalls.add(methodCallNode);
      for (Expression actualArgument : methodCall.getActualArguments()) {
        myParametersToCheckedMethodCalls.put(actualArgument.getNode(), methodCallNode);
      }

      SNode newTargetNode = newTarget.getNode();
      Set<SNode> nodeSet = myMethodDeclsToCheckedMethodCalls.get(newTargetNode);
      if (nodeSet == null) {
        nodeSet = new HashSet<SNode>();
        myMethodDeclsToCheckedMethodCalls.put(newTargetNode, nodeSet);
      }
      nodeSet.add(methodCallNode);

      Pair<String, String> key = new Pair<String, String>(newTarget.getConceptFQName(), methodName);
      Set<SNode> nodesByNameAndConcept = myMethodConceptsAndNamesToCheckedMethodCalls.get(
        key);
      if (nodesByNameAndConcept == null) {
        nodesByNameAndConcept = new HashSet<SNode>();
        myMethodConceptsAndNamesToCheckedMethodCalls.put(key, nodesByNameAndConcept);
      }
      nodesByNameAndConcept.add(methodCallNode);
    }
  }

  private Map<TypeVariableDeclaration, Type> getTypeByTypeVar(IMethodCall methodCall) {
    return IMethodCall_Behavior.call_getTypesByTypeVars_851115533308208851(methodCall.getNode());
  }

  public List<? extends BaseMethodDeclaration> getCandidates(IMethodCall methodCall, String methodName) {
    List<SNode> nodes = IMethodCall_Behavior.call_getAvailableMethodDeclarations_5776618742611315379(methodCall.getNode(), methodName);
    ArrayList<BaseMethodDeclaration> result = new ArrayList<BaseMethodDeclaration>();
    for (SNode node : nodes) {
      result.add((BaseMethodDeclaration) BaseAdapter.fromNode(node));
    }
    return result;
  }

  private void methodDeclarationNameChanged(SNode method, Map<SNode, SNode> resolveTargets) {
    Set<SNode> methodCalls = myMethodDeclsToCheckedMethodCalls.get(method);
    if (methodCalls != null) {
      for (SNode methodCall : methodCalls) {
        if (methodCall != null) {
          testAndFixMethodCall(methodCall, resolveTargets);
        }
      }
    }
  }

  private void methodDeclarationSignatureChanged(SNode method, Map<SNode, SNode> resolveTargets) {
    Set<SNode> methodCalls = myMethodConceptsAndNamesToCheckedMethodCalls.get(
      new Pair<String, String>(method.getConceptFqName(), method.getName()));
    if (methodCalls != null) {
      for (SNode methodCall : methodCalls) {
        if (methodCall != null) {
          testAndFixMethodCall(methodCall, resolveTargets);
        }
      }
    }
  }

  private void methodCallDeclarationChanged(SNode methodCall, Map<SNode, SNode> resolveTargets) {
    if (myCheckedMethodCalls.contains(methodCall) &&
      methodCall.getReferent(IMethodCall.BASE_METHOD_DECLARATION) == myMethodCallsToSetDecls.get(methodCall)) {
      return;
    }
    testAndFixMethodCall(methodCall, resolveTargets);
  }

  private void expressionTypeChanged(SNode expression, Map<SNode, SNode> resolveTargets) {
    SNode methodCall = myParametersToCheckedMethodCalls.get(expression);
    if (methodCall != null) {
      testAndFixMethodCall(methodCall, resolveTargets);
    }
  }

  private void nodeAdded(SNode child, Map<SNode, SNode> resolveTargets) {
    //added methods
    List<SNode> addedMethodCalls = SNodeOperations.getDescendants(child, IMethodCall.concept, true);
    for (SNode methodCall : addedMethodCalls) {
      testAndFixMethodCall(methodCall, resolveTargets);
    }

    //actual argument
    SNode parent = child.getParent();
    if (myCheckedMethodCalls.contains(parent)) {
      myParametersToCheckedMethodCalls.put(child, parent);
      testAndFixMethodCall(parent, resolveTargets);
    }

    //formal param
    SNode formalParam = SNodeOperations.getAncestor(child, ParameterDeclaration.concept, true, false);
    if (formalParam != null && formalParam.getParent() != null) {
      methodDeclarationSignatureChanged(formalParam.getParent(), resolveTargets);
    }
  }

  private void nodeRemoved(SNode child, SNode formerParent, Map<SNode, SNode> resolveTargets) {
    List<SNode> removedMethodCalls = SNodeOperations.getDescendants(child, IMethodCall.concept, true);
    for (SNode methodCall : removedMethodCalls) {
      //todo
    }

    //actual arg deleted
    if (myCheckedMethodCalls.contains(formerParent)) {
      //if arg deleted then fix method call
      //if deleted inside argument and arg type is changed it is processed elsewhere
      myParametersToCheckedMethodCalls.remove(child);
      testAndFixMethodCall(formerParent, resolveTargets);
    }

    //formal param
    if (SNodeOperations.isInstanceOf(child, ParameterDeclaration.concept)) {
      methodDeclarationSignatureChanged(formerParent, resolveTargets);
    } else {
      SNode formalParam = SNodeOperations.getAncestor(formerParent, ParameterDeclaration.concept, true, false);
      if (formalParam != null && formalParam.getParent() != null) {
        methodDeclarationSignatureChanged(formalParam.getParent(), resolveTargets);
      }
    }
  }
}
