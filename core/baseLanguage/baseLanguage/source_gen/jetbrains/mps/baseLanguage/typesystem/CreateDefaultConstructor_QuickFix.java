package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class CreateDefaultConstructor_QuickFix extends QuickFix_Runtime {
  public CreateDefaultConstructor_QuickFix() {
  }

  public String getDescription(SNode node) {
    return "Create Default Constructor";
  }

  public void execute(SNode node) {
    SNode constructor = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ConstructorDeclaration", null);
    SLinkOperations.setNewChild(constructor, "returnType", "jetbrains.mps.baseLanguage.structure.VoidType");
    SLinkOperations.setNewChild(constructor, "body", "jetbrains.mps.baseLanguage.structure.StatementList");
    SLinkOperations.setNewChild(constructor, "visibility", "jetbrains.mps.baseLanguage.structure.PublicVisibility");
    ListSequence.fromList(SLinkOperations.getTargets(((SNode) CreateDefaultConstructor_QuickFix.this.getField("classConcept")[0]), "constructor", true)).addElement(constructor);
  }
}
