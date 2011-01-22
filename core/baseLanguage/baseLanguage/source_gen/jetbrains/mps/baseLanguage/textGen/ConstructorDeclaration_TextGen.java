package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.textGen.TraceableNodeTextGen;
import jetbrains.mps.textGen.ScopeNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.textGen.behavior.TraceableConcept_Behavior;
import java.util.List;
import jetbrains.mps.lang.textGen.behavior.ScopeConcept_Behavior;

public class ConstructorDeclaration_TextGen extends SNodeTextGen implements TraceableNodeTextGen, ScopeNodeTextGen {
  public void doGenerateText(SNode node) {
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true), this.getSNode());
    }
    SNode declaringClass = SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    this.appendNewLine();
    BaseLanguageTextGen.annotations(node, this);
    if (!(SNodeOperations.isInstanceOf(declaringClass, "jetbrains.mps.baseLanguage.structure.EnumClass"))) {
      BaseLanguageTextGen.visibilityWithIndent(SLinkOperations.getTarget(node, "visibility", true), this);
    } else {
      this.indentBuffer();
    }
    GenericDeclarationTextGen2.typeDeclarations(node, this);
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeVariableDeclaration", true)).isNotEmpty()) {
      this.append(" ");
    }
    assert declaringClass != null;
    this.append(SPropertyOperations.getString(declaringClass, "name"));
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
    this.append(" {");
    this.increaseDepth();
    if ((SLinkOperations.getTarget(node, "body", true) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "body", true), this.getSNode());
    }
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
  }

  public String getTraceableProperty(SNode node) {
    return TraceableConcept_Behavior.call_getTraceableProperty_3822000666564591088(node);
  }

  public List<SNode> getScopeVariables(SNode node) {
    return ScopeConcept_Behavior.call_getScopeVariables_3822000666564591100(node);
  }
}
