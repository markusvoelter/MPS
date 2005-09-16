package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Aug 25, 2005
 * Time: 5:20:32 PM
 * To change this template use File | Settings | File Templates.
 */
class SModelsSubtree{
  static void create(MPSTreeNode rootTreeNode, IOperationContext operationContext) {
    List<MPSTreeNode> list = new LinkedList<MPSTreeNode>();
    list.add(new ModelsGroupTreeNode("<.>", operationContext)); // default

    Map<String, List<SModelDescriptor>> stereotypes = new HashMap<String, List<SModelDescriptor>>();
    for (SModelDescriptor modelDescriptor : SortUtil.sortModels(operationContext.getModule().getOwnModelDescriptors())) {
      String stereotype = modelDescriptor.getStereotype();
      if (stereotype == null || stereotype.length() == 0) {
        list.get(0).add(new SModelTreeNode(modelDescriptor, null, operationContext));
      } else {
        List<SModelDescriptor> modelDescriptors = stereotypes.get(stereotype);
        if (modelDescriptors == null) {
          modelDescriptors = new LinkedList<SModelDescriptor>();
          stereotypes.put(stereotype, modelDescriptors);
        }
        modelDescriptors.add(modelDescriptor);
      }
    }

    // create "root" for each stereotype
    for (String stereotype : stereotypes.keySet()) {
      List<SModelDescriptor> modelDescriptors = stereotypes.get(stereotype);
      TextTreeNode stereotypedModelsNode = new ModelsGroupTreeNode("<" + stereotype + ">", operationContext);
      list.add(stereotypedModelsNode);
      for (SModelDescriptor modelDescriptor : modelDescriptors) {
        stereotypedModelsNode.add(new SModelTreeNode(modelDescriptor, null, operationContext));
      }
    }

    for (MPSTreeNode treeNode : list) {
      rootTreeNode.add(treeNode);
    }
  }

  private static class ModelsGroupTreeNode extends TextTreeNode {
    public ModelsGroupTreeNode(String text, IOperationContext context) {
      super(text, context);
    }
    public Icon getIcon(boolean expanded) {
      return Icons.PROJECT_MODELS_ICON;
    }
  }
}
