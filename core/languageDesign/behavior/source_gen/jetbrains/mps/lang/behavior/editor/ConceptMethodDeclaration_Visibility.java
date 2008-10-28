package jetbrains.mps.lang.behavior.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ConceptMethodDeclaration_Visibility extends AbstractCellMenuComponent {

  public ConceptMethodDeclaration_Visibility() {
    super(new SubstituteInfoPart[]{new ConceptMethodDeclaration_Visibility.ConceptMethodDeclaration_generic_cellMenu1(),new ConceptMethodDeclaration_Visibility.ConceptMethodDeclaration_generic_cellMenu2()});
  }
  public static class ConceptMethodDeclaration_generic_cellMenu1 extends AbstractCellMenuPart_Generic_Item {

    public ConceptMethodDeclaration_generic_cellMenu1() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "isPrivate", "" + (true));
    }

    public String getMatchingText() {
      return "private";
    }

}
  public static class ConceptMethodDeclaration_generic_cellMenu2 extends AbstractCellMenuPart_Generic_Item {

    public ConceptMethodDeclaration_generic_cellMenu2() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "isPrivate", "" + (false));
    }

    public String getMatchingText() {
      return "public";
    }

}

}
