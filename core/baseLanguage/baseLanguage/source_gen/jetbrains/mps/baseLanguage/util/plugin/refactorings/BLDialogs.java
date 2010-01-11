package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BLDialogs {
  public static SNode showStaticContainerChooser(IOperationContext context, SModelDescriptor contextModel) {
    BaseChooseNodeDialog dialog = new BaseChooseNodeDialog(context.getMainFrame(), context, contextModel, "Chouse class") {
      protected boolean isAcceptable(SNode node) {
        return SNodeOperations.isInstanceOf(((SNode) node), "jetbrains.mps.baseLanguage.structure.ClassConcept") || SNodeOperations.isInstanceOf(((SNode) node), "jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods");
      }
    };
    dialog.showDialog();
    return dialog.getResult();
  }

  public static SNode showClassChooser(IOperationContext context, SModelDescriptor contextModel) {
    BaseChooseNodeDialog dialog = new BaseChooseNodeDialog(context.getMainFrame(), context, contextModel, "Chouse class") {
      protected boolean isAcceptable(SNode node) {
        return SNodeOperations.isInstanceOf(((SNode) node), "jetbrains.mps.baseLanguage.structure.ClassConcept");
      }
    };
    dialog.showDialog();
    return dialog.getResult();
  }
}
