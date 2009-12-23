package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class GenerateGettersAndSetters_Intention extends GenerateIntention implements Intention {
  public GenerateGettersAndSetters_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Getters and Setters";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    List<SNode> fields = SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "field", true);
    if (ListSequence.fromList(fields).isEmpty()) {
      return false;
    }
    boolean allGettersImplemented = true;
    for (SNode fieldDeclaration : fields) {
      boolean hasCurrentFieldGetter = false;
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(fieldDeclaration);
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return getterName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).isEmpty();
        }
      })) {
        hasCurrentFieldGetter = true;
      }
      if (!(hasCurrentFieldGetter)) {
        allGettersImplemented = false;
        break;
      }
    }
    if (!(allGettersImplemented)) {
      return true;
    } else {
      boolean hasAllSetters = true;
      for (SNode field : fields) {
        final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field);
        boolean hasCurrentFieldSetter = false;
        if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return setterName.equals(SPropertyOperations.getString(it, "name")) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
          }
        })) {
          hasCurrentFieldSetter = true;
        }
        if (!(hasCurrentFieldSetter)) {
          hasAllSetters = false;
          break;
        }
      }
      return !(hasAllSetters);
    }
  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    final SNode thisExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
    SNode lastAdded = null;
    for (final SNode field : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedFields"))) {
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field);
      final Wrappers._boolean getterIsAbsent = new Wrappers._boolean(true);
      ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          if (getterName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).isEmpty()) {
            getterIsAbsent.value = false;
          }
        }
      });
      if (!(getterIsAbsent.value)) {
        continue;
      }
      lastAdded = SLinkOperations.addChild(classConcept, "method", new _Quotations.QuotationClass_20().createNode(SLinkOperations.getTarget(field, "type", true), thisExpression, field, getterName));

      final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field);
      final Wrappers._boolean setterIsAbsent = new Wrappers._boolean(true);
      ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).visitAll(new IVisitor<SNode>() {
        public void visit(SNode method) {
          if (setterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1) {
            setterIsAbsent.value = false;
          }
        }
      });
      if (!(setterIsAbsent.value)) {
        continue;
      }
      lastAdded = SLinkOperations.addChild(classConcept, "method", new _Quotations.QuotationClass_21().createNode(thisExpression, field, SLinkOperations.getTarget(field, "type", true), SPropertyOperations.getString(field, "name"), setterName));
    }
    if (lastAdded != null) {
      editorContext.select(lastAdded);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, editorContext.getOperationContext().getMainFrame(), node);
    selectFieldsDialog.showDialog();
    intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
    return selectFieldsDialog.getAnswer();
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
