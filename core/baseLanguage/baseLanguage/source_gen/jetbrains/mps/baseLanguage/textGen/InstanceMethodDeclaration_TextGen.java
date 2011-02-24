package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.textGen.behavior.TraceableConcept_Behavior;
import jetbrains.mps.lang.textGen.behavior.ScopeConcept_Behavior;

public class InstanceMethodDeclaration_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    TraceInfoGenerationUtil.createPositionInfo(this, node);
    TraceInfoGenerationUtil.createScopeInfo(this, node);
    if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment"))) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment"))), this.getSNode());
    }
    this.appendNewLine();
    BaseLanguageTextGen.annotations(node, this);
    BaseLanguageTextGen.visibilityWithIndent(SLinkOperations.getTarget(node, "visibility", true), this);
    if (SPropertyOperations.getBoolean(node, "isFinal")) {
      this.append("final ");
    }
    if (SPropertyOperations.getBoolean(node, "isAbstract") && !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.Interface"))) {
      this.append("abstract ");
    }
    if (SPropertyOperations.getBoolean(node, "isSynchronized")) {
      this.append("synchronized ");
    }
    GenericDeclarationTextGen2.typeDeclarations(node, this);
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeVariableDeclaration", true)).isNotEmpty()) {
      this.append(" ");
    }
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "returnType", true), this.getSNode());
    this.append(" ");
    this.append(SPropertyOperations.getString(node, "name"));
    this.append("(");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append(")");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isNotEmpty()) {
      this.append(" throws ");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "throwsItem", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).last()) {
            this.append(", ");
          }
        }
      }
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.Interface") || SPropertyOperations.getBoolean(node, "isAbstract")) {
      this.append(";");
      if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.Interface"))) {
        this.appendNewLine();
      }
    } else {
      this.append(" {");
      this.increaseDepth();
      if ((SLinkOperations.getTarget(node, "body", true) != null)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "body", true), this.getSNode());
      } else {
        this.appendNewLine();
        this.appendWithIndent("throw new RuntimeException(\"NOT IMPLEMENTED\");");
      }
      this.decreaseDepth();
      this.appendNewLine();
      this.appendWithIndent("}");
      this.appendNewLine();
    }
    TraceInfoGenerationUtil.fillPositionInfo(this, node, TraceableConcept_Behavior.call_getTraceableProperty_3822000666564591088(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.TraceableConcept")));
    TraceInfoGenerationUtil.fillScopeInfo(this, node, ScopeConcept_Behavior.call_getScopeVariables_3822000666564591100(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.ScopeConcept")));
  }
}
