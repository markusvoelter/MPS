package jetbrains.mps.ide.newSolutionDialog;

/*Generated by MPS */

import jetbrains.mps.ide.BaseDialog;
import java.awt.Frame;
import jetbrains.mps.ide.DialogDimensionsSettings;
import javax.swing.JComponent;

public class NewSolutionDialog extends BaseDialog {

  public NewSolutionDialogContentPane myContentPane;

  public  NewSolutionDialog(Frame frame) {
    super(frame, "NewSolutionDialog");
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 100, 640, 480);
  }

  public JComponent getMainComponent() {
    if(this.myContentPane == null) {
      this.myContentPane = new NewSolutionDialogContentPane();
    }
    return this.myContentPane;
  }

  public boolean stretchMainComponent() {
    return false;
  }

  public String getSolutionName() {
    return this.myContentPane.getSolutionName();
  }

  public String getSolutionPath() {
    return this.myContentPane.getSolutionPath();
  }

  public void setSolutionName(String newValue) {
    this.myContentPane.setSolutionName(newValue);
  }

  public void setSolutionPath(String newValue) {
    this.myContentPane.setSolutionPath(newValue);
  }

  @BaseDialog.Button(name = "OK", position = 0, defaultButton = true)
  public void buttonMethod() {
    myContentPane.onOk();
  }

  @BaseDialog.Button(name = "Cancel", position = 1, defaultButton = false)
  public void buttonMethod1() {
    myContentPane.onCancel();
  }

}
