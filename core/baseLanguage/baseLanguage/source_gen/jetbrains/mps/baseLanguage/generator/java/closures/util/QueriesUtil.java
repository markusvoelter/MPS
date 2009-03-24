package jetbrains.mps.baseLanguage.generator.java.closures.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.generator.java.closures.util._Quotations;

public class QueriesUtil {

  public static SNode createClassType_forClosure_enclosingClass(SNode inputClosure, ITemplateGenerator generator) {
    SNode enclosingClass = SNodeOperations.getAncestor(inputClosure, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (enclosingClass == null) {
      //       closure is not in class
      enclosingClass = getJavaLangObject();
    }
    SModel outputModel = generator.getOutputModel();
    SNode outputClassType = SModelOperations.createNewNode(outputModel, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(outputClassType, "classifier", enclosingClass, false);
    for(SNode typeVar : ListSequence.fromList(SLinkOperations.getTargets(enclosingClass, "typeVariableDeclaration", true))) {
      SNode typeVarRef = SLinkOperations.addNewChild(outputClassType, "parameter", "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
      SLinkOperations.setTarget(typeVarRef, "typeVariableDeclaration", typeVar, false);
    }
    return outputClassType;
  }

  public static List<SNode> getTypeVars_from_Closure_enclosingClass(SNode inputClosure, IScope scope) {
    SNode enclosingClass = SNodeOperations.getAncestor(inputClosure, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (enclosingClass == null) {
      //       closure is not in class
      enclosingClass = getJavaLangObject();
    }
    return SLinkOperations.getTargets(enclosingClass, "typeVariableDeclaration", true);
  }

  public static SNode create_enclosingClassObject(SNode nodeInsideClosure) {
    // 
    //     must be invoked in $COPY-SRC$ because use ref on class in 'input model'
    // 
    SNode enclosingClass = SNodeOperations.getAncestor(nodeInsideClosure, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (enclosingClass == null) {
      return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NullLiteral", null);
    }
    SNode enclosingMethodOrClosure = SNodeOperations.getAncestorWhereConceptInList(nodeInsideClosure, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration","jetbrains.mps.baseLanguage.structure.Closure"}, false, false);
    //     --- in closure
    if (SNodeOperations.isInstanceOf(enclosingMethodOrClosure, "jetbrains.mps.baseLanguage.structure.Closure")) {
      SNode fieldRef = new _Quotations.QuotationClass_0().createNode();
      SNode typeOfField = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(typeOfField, "classifier", enclosingClass, false);
      SLinkOperations.setTarget(fieldRef, "fieldType", typeOfField, true);
      return fieldRef;
    }
    //     --- in instance method
    if (SNodeOperations.isInstanceOf(enclosingMethodOrClosure, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") || SNodeOperations.isInstanceOf(enclosingMethodOrClosure, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration")) {
      SNode thisExpr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
      SLinkOperations.setTarget(thisExpr, "classConcept", enclosingClass, false);
      return thisExpr;
    }
    //     --- none of above
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NullLiteral", null);
  }

  private static SNode getJavaLangObject() {
    return SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false);
  }

}
