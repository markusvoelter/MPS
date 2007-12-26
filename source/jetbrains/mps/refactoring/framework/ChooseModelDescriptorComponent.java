package jetbrains.mps.refactoring.framework;

import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.util.Condition;

import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 26.12.2007
 * Time: 17:49:18
 * To change this template use File | Settings | File Templates.
 */
public class ChooseModelDescriptorComponent extends JPanel implements IChooseComponent<SModelDescriptor> {
  private ChooseNodeOrModelComponent myChooseNodeOrModelComponent;

  public ChooseModelDescriptorComponent(String caption, String propertyName, ActionContext actionContext) {
    myChooseNodeOrModelComponent = new ChooseNodeOrModelComponent(caption, propertyName, actionContext, null, true, false);
    add(myChooseNodeOrModelComponent, BorderLayout.CENTER);
  }

  public SModelDescriptor submit() throws InvalidInputValueException {
    return (SModelDescriptor) myChooseNodeOrModelComponent.submit();
  }

  public String getPropertyName() {
    return myChooseNodeOrModelComponent.getPropertyName();
  }

  public void setInitialValue(SModelDescriptor initialValue) {
    myChooseNodeOrModelComponent.setInitialValue(initialValue);
  }

  public void setCondition(Condition<SModelDescriptor> condition) {
    myChooseNodeOrModelComponent.setCondition((Condition) condition);
  }
}
