package jetbrains.mps.editor.runtime;

/*Generated by MPS */

import javax.swing.text.StyledDocument;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.BadLocationException;

public class StyledTextPrinter {
  private StyledDocument myDocument = new DefaultStyledDocument();
  private SimpleAttributeSet myAttributeSet = new SimpleAttributeSet();

  public StyledTextPrinter() {
  }

  public void setBold(boolean flag) {
    StyleConstants.setBold(this.myAttributeSet, flag);
  }

  public void append(String text) {
    try {
      this.myDocument.insertString(this.myDocument.getLength(), text, this.myAttributeSet);
    } catch (BadLocationException badLocationException) {
      badLocationException.printStackTrace();
    }
  }

  public StyledDocument getDocument() {
    return this.myDocument;
  }
}
