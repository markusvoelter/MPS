package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Add_NullableAnnotationToParameter_QuickFix extends QuickFix_Runtime {
  public Add_NullableAnnotationToParameter_QuickFix() {
  }

  public String getDescription() {
    return "Add @Nullable annotation to parameter";
  }

  public void execute(SNode node) {
    SNode instance = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.AnnotationInstance", null);
    SLinkOperations.setTarget(instance, "annotation", SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~Nullable"), false);
    ListSequence.fromList(SLinkOperations.getTargets(((SNode) Add_NullableAnnotationToParameter_QuickFix.this.getField("parameter")[0]), "annotation", true)).addElement(instance);
  }
}
