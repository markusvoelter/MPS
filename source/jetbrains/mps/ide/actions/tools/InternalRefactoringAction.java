package jetbrains.mps.ide.actions.tools;

import jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration;
import jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList;
import jetbrains.mps.bootstrap.editorLanguage.EditorCellModel;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.action.MPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.Condition;

import java.util.*;

/**
 * serves as template: just loads all models from MPSFileModelDescriptor and "process" them.
 */
public class InternalRefactoringAction extends MPSAction {
  public static boolean SHOW = false;

  private static final Logger LOG = Logger.getLogger(InternalRefactoringAction.class);

  public InternalRefactoringAction() {
    super("... cell action : enable/disable ...");
  }

  public void execute(ActionContext context) {
    System.out.println(" -- load models -- ");
    List<SModel> models = loadAllModels();

    System.out.println(" -- process models (" + models.size() + ") -- ");
    for (SModel model : models) {
      System.out.println("process model: " + model.getUID().toString());
      processModel(model);
    }
  }


  /**
   * load all that has MPSFileModelDescriptor
   */
  private List<SModel> loadAllModels() {
    // load all models
    List<SModel> models = new LinkedList<SModel>();
    boolean wasLoaded = true;
    while (wasLoaded) {
      wasLoaded = false;
      List<SModelDescriptor> modelDescriptors = new LinkedList<SModelDescriptor>(GlobalScope.getInstance().getModelDescriptors());
      for (SModelDescriptor descriptor : modelDescriptors) {
        if (!(descriptor instanceof MPSFileModelDescriptor)) continue;
        if (!descriptor.isInitialized()) {
          wasLoaded = true;
          System.out.println("load model: " + descriptor.getModelUID().toString());
        }
        SModel model = descriptor.getSModel();
        if (!models.contains(model)) {
          models.add(model);
        }
      }
    }
    return models;
  }

  /**
   * perform "refactoring"
   */
  private void processModel(SModel model) {
    _checkUsageOfSomeDeprecatedFeatures(model);
    _clearSomeUnresolvedReferences(model);
  }

  private void _checkUsageOfSomeDeprecatedFeatures(SModel model) {
    SModelUtil.allNodes(model, new Condition<SNode>() {
      public boolean met(SNode object) {
        // SURROUND WITH ..
//        if (object instanceof CellActionSetDeclaration) {
//          CellActionSetDeclaration cellActionSet = (CellActionSetDeclaration) object;
//          Iterator<CellActionModel> iterator = cellActionSet.actionDeclarations();
//          for (SNode actionModel : cellActionSet) {
//            if (actionModel instanceof ActionModel_SurroundNodeWith) {
//              System.out.println("(!)SURROUND WITH ...: " + actionModel.getDebugText() + " in " + SModelUtil.getRootParent(actionModel));
//            }
//          }
//        }

//        if (object instanceof CellModel_RefNode) {
//          CellModel_RefNode cellModel = (CellModel_RefNode) object;
//          if (cellModel.getErrorActionSet() != null) {
//            System.out.println("(!)ErrorActionSet:" + cellModel.getDebugText() + " in " + SModelUtil.getRootParent(cellModel));
//          }
//        }
//        if (object instanceof CellModel_RefCell) {
//          CellModel_RefCell cellModel = (CellModel_RefCell) object;
//          if (cellModel.getNullActionSet() != null) {
//            System.out.println("(!)NullActionSet:" + cellModel.getDebugText() + " in " + SModelUtil.getRootParent(cellModel));
//          }
//        }

        // DISABLE action
//        if (object instanceof CellActionModel) {
//          CellActionModel action = (CellActionModel) object;
//          if (action.getDisabled()) {
//            System.out.println("(!)action DIASBLED: " + action.getDebugText() + " in " + SModelUtil.getRootParent(action));
//          }
//        }
        return false;
      }
    });
  }

  private void _clearSomeUnresolvedReferences(SModel model) {
    SModelUtil.allNodes(model, new Condition<SNode>() {
      public boolean met(SNode object) {
        if (object instanceof EditorCellModel) {
          EditorCellModel cellModel = (EditorCellModel) object;
          if (cellModel.getActionSet() == null) {
            cellModel.setActionSet(null);
          }

//          if (object instanceof CellModel_RefNode) {
//            CellModel_RefNode cellModel_refNode = (CellModel_RefNode) object;
//            if (cellModel_refNode.getErrorActionSet() == null) {
//              cellModel_refNode.setErrorActionSet(null);
//            }
//          }
//          if (object instanceof CellModel_RefCell) {
//            CellModel_RefCell cellModel_refCell = (CellModel_RefCell) object;
//            if (cellModel_refCell.getNullActionSet() == null) {
//              cellModel_refCell.setNullActionSet(null);
//            }
//          }

          if (object instanceof CellModel_RefNodeList) {
            CellModel_RefNodeList cellModel_refNodeList = (CellModel_RefNodeList) object;
            if (cellModel_refNodeList.getElementActionSet() == null) {
              cellModel_refNodeList.setElementActionSet(null);
            }
          }

        } else if (object instanceof CellActionSetDeclaration) {
          CellActionSetDeclaration cellActionSet = (CellActionSetDeclaration) object;
          if (cellActionSet.getSpecializes() == null) {
            cellActionSet.setSpecializes(null);
          }
        }
        return false;
      }
    });
  }
}
