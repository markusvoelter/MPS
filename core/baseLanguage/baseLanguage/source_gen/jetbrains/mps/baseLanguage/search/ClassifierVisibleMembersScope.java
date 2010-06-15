package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import jetbrains.mps.smodel.search.AbstractSearchScope;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.util.Condition;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.search.IReferenceInfoResolver;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.structure.IMethodCall;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;

public class ClassifierVisibleMembersScope extends AbstractSearchScope {
  private final SNode myContextNode;
  private final ClassifierAndSuperClassifiersScope myClassifierScope;
  private SNode myClassifierType;

  @Deprecated
  public ClassifierVisibleMembersScope(@Nullable ClassifierType classifierType, @Nullable SNode contextNode, int constraint) {
    this(SNodeOperations.cast(check_y8c6cm_a0a0a(classifierType), "jetbrains.mps.baseLanguage.structure.ClassifierType"), contextNode, constraint);
  }

  public ClassifierVisibleMembersScope(@Nullable SNode classifierType, @Nullable SNode contextNode, int constraint) {
    this.myClassifierType = classifierType;
    this.myContextNode = contextNode;
    this.myClassifierScope = new ClassifierAndSuperClassifiersScope((classifierType != null ?
      ((Classifier) SNodeOperations.getAdapter(SLinkOperations.getTarget(classifierType, "classifier", false))) :
      null
    ), constraint);
  }

  @NotNull
  public List<SNode> getNodes(Condition<SNode> condition) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode member : this.getClassifierMembers()) {
      if (condition.met(member)) {
        ListSequence.fromList(result).addElement(member);
      }
    }
    return result;
  }

  public boolean isInScope(SNode node) {
    if (myContextNode == null || !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.IVisible"))) {
      return super.isInScope(node);
    }
    return VisibilityUtil.isVisible(myContextNode, SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IVisible"));
  }

  private List<SNode> getClassifierMembers() {
    List<SNode> members = this.getAllClassifierMembers();
    List<SNode> result = new ArrayList<SNode>();
    for (SNode memberNode : members) {
      SNode member = SNodeOperations.cast(memberNode, "jetbrains.mps.baseLanguage.structure.ClassifierMember");
      if (myContextNode == null || VisibilityUtil.isVisible(myContextNode, member)) {
        ListSequence.fromList(result).addElement(member);
      }
    }
    return result;
  }

  protected List<SNode> getAllClassifierMembers() {
    return this.myClassifierScope.getNodes(new Condition<SNode>() {
      public boolean met(SNode node) {
        return SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ClassifierMember");
      }
    });
  }

  public IReferenceInfoResolver getReferenceInfoResolver(SNode referenceNode, AbstractConceptDeclaration targetConcept) {
    if (this.myClassifierType != null) {
      if (SModelUtil_new.isAssignableConcept(targetConcept, StaticMethodDeclaration.concept)) {
        SNode classifier = SLinkOperations.getTarget(this.myClassifierType, "classifier", false);
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept") && SNodeOperations.isInstanceOf(referenceNode, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
          return new StaticMethodReferenceInfoResolver(this.myClassifierScope, (ClassConcept) ((Classifier) SNodeOperations.getAdapter(classifier)), ((IMethodCall) ((BaseConcept) SNodeOperations.getAdapter(referenceNode))).getActualArguments());
        }
      } else
      if (SModelUtil_new.isAssignableConcept(targetConcept, InstanceMethodDeclaration.concept)) {
        if (((BaseConcept) SNodeOperations.getAdapter(referenceNode)) instanceof IMethodCall) {
          return new InstanceMethodReferenceInfoResolver(this.myClassifierScope, ((ClassifierType) SNodeOperations.getAdapter(this.myClassifierType)), ((IMethodCall) ((BaseConcept) SNodeOperations.getAdapter(referenceNode))).getActualArguments());
        }
      }
    }
    return this.myClassifierScope.getReferenceInfoResolver(referenceNode, targetConcept);
  }

  private static SNode check_y8c6cm_a0a0a(ClassifierType p) {
    if (null == p) {
      return null;
    }
    return p.getNode();
  }
}
