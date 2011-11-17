package jetbrains.mps.ide.depanalyzer;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.project.IModule;
import java.awt.Color;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.projectPane.ProjectPane;
import com.intellij.openapi.project.Project;

public class DependencyTreeNode extends MPSTreeNode {
  private IModule myModule;
  private Color myColor;
  private String myRole;

  public DependencyTreeNode(IModule module, String role, IOperationContext operationContext) {
    super(module, operationContext);
    myModule = module;
    myRole = role;
    setIcon(IconManager.getIconFor(myModule));
    setNodeIdentifier(role + module.getModuleFqName());
    setText("<html>" + "<i>" + role + "</i>" + module.getModuleFqName() + "</html>");
  }

  public DependencyTreeNode(IModule module, String role, IOperationContext operationContext, Color color) {
    this(module, role, operationContext);
    myColor = color;
  }

  public IModule getModule() {
    return myModule;
  }

  public void doubleClick() {
    ProjectPane.getInstance(check_akkfj9_a0a0a1(((DependencyPathTree) getTree()), this)).selectModule(myModule, false);
  }

  public void doUpdatePresentation() {
    super.doUpdatePresentation();
    if (myColor != null) {
      setColor(myColor);
    }
  }

  public String getRole() {
    return myRole;
  }

  private static Project check_akkfj9_a0a0a1(DependencyPathTree checkedDotOperand, DependencyTreeNode checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getProject();
    }
    return null;
  }
}
