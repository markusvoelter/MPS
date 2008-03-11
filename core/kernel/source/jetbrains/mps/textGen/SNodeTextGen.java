package jetbrains.mps.textGen;

import jetbrains.mps.ide.messages.IMessageHandler;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;

import java.io.File;

/**
 * Author: Sergey Dmitriev
 * Created Nov 13, 2003
 */
public abstract class SNodeTextGen<BA extends INodeAdapter> {

  private static final Logger LOGGER = Logger.getLogger(SNodeTextGen.class);

  private TextGenBuffer myBuffer;
  private IOperationContext myContext;

  public void setBuffer(TextGenBuffer buffer) {
    myBuffer = buffer;
  }

  protected final TextGenBuffer getBuffer() {
    return myBuffer;
  }

  public IOperationContext getContext() {
    return myContext;
  }

  public void setContext(IOperationContext context) {
    myContext = context;
  }

  protected abstract void doGenerateText(BA ba);

  protected final void appendNodeText(INodeAdapter ba) {
    try {
      TextGenManager.instance().appendNodeText(myContext, myBuffer, BaseAdapter.fromAdapter(ba));
    } catch (Exception e) {
      LOGGER.error(e);
      append("\n<<<" + e + ">>>");
    }
  }

  protected void increaseDepth() {
    myBuffer.increaseDepth();
  }

  protected void decreaseDepth() {
    myBuffer.decreaseDepth();
  }

  protected void append(String s) {
    myBuffer.append(s);
  }

  protected void appendNewLine() {
    append(System.getProperty("line.separator"));
  }

  protected void appendWithIndent(String s) {
    myBuffer.appendWithIndent(s);
  }

  protected void indentBuffer() {
    myBuffer.indentBuffer();
  }

  protected final Object getUserObject(Object key) {
    return myBuffer.getUserObject(key);
  }

  protected final void putUserObject(Object key, Object o) {
    myBuffer.putUserObject(key, o);
  }

  protected void foundError() {
    getBuffer().foundError();
  }


  /**
   * @param role - must be 'genuine role'
   *             todo: tmp
   */
  protected String getReferentResolveInfoOrName(String role, SNode sourceNode) {
    SReference reference = sourceNode.getReference(role);
    if (reference instanceof DynamicReference) {
      return reference.getResolveInfo();
    }
    SNode targetNode = reference.getTargetNode();
    if (targetNode == null) {
      foundError();
      return "???";
    }
    return targetNode.getName();
  }

}
