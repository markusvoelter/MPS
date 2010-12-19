package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_FieldIsNeverUsedOrAssigned_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_FieldIsNeverUsedOrAssigned_NonTypesystemRule() {
  }

  public void applyRule(final SNode field, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility"))) {
      return;
    }
    if (SNodeOperations.isInstanceOf(field, "jetbrains.mps.baseLanguage.classifiers.structure.IMember")) {
      final SNode member = SNodeOperations.cast(field, "jetbrains.mps.baseLanguage.classifiers.structure.IMember");
      List<SNode> memberOperations = SNodeOperations.getDescendants(SNodeOperations.getParent(field), "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation", false, new String[]{});
      Iterable<SNode> references = ListSequence.fromList(memberOperations).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, "member", false) == member;
        }
      });
      if (Sequence.fromIterable(references).isEmpty()) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(field, "Field is never used", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7970711249077251955", intentionProvider, errorTarget);
        }
      } else {
        if (SLinkOperations.getTarget(field, "initializer", true) != null) {
          return;
        }
        for (SNode ref : references) {
          if (CheckingUtil.isAssigned(ref)) {
            return;
          }
        }
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(field, "Field is never assigned", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7970711249077252119", intentionProvider, errorTarget);
        }
      }
    } else {
      List<SNode> localFieldRefs = SNodeOperations.getDescendants(SNodeOperations.getParent(field), "jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", false, new String[]{});
      List<SNode> fieldRefOperations = SNodeOperations.getDescendants(SNodeOperations.getParent(field), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", false, new String[]{});
      Iterable<SNode> localFieldReferences = ListSequence.fromList(localFieldRefs).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, "variableDeclaration", false) == field;
        }
      });
      Iterable<SNode> fieldReferenceOperations = ListSequence.fromList(fieldRefOperations).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, "fieldDeclaration", false) == field;
        }
      });
      if (Sequence.fromIterable(localFieldReferences).isEmpty() && Sequence.fromIterable(fieldReferenceOperations).isEmpty()) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(field, "Private field " + SPropertyOperations.getString(field, "name") + " is never used", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7970711249077252023", intentionProvider, errorTarget);
        }
      } else {
        if (SLinkOperations.getTarget(field, "initializer", true) != null) {
          return;
        }
        for (SNode ref : localFieldReferences) {
          if (CheckingUtil.isAssigned(ref)) {
            return;
          }
        }
        for (SNode ref : fieldReferenceOperations) {
          if (CheckingUtil.isAssigned(ref)) {
            return;
          }
        }
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(field, "Private field " + SPropertyOperations.getString(field, "name") + " is never assigned", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "7970711249077252061", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
