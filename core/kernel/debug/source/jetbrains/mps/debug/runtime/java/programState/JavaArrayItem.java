package jetbrains.mps.debug.runtime.java.programState;

import com.sun.jdi.ArrayReference;
import jetbrains.mps.debug.api.programState.IValue;
import jetbrains.mps.debug.api.programState.IWatchable;
import jetbrains.mps.smodel.SNode;

import javax.swing.Icon;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 13.04.2010
 * Time: 18:39:04
 * To change this template use File | Settings | File Templates.
 */
public class JavaArrayItem implements IWatchable {
  public static final String CATEGORY_ARRAY_ITEM = "category_arrayItem";

  private final ArrayReference myArray;
  private final int myIndex;

  public JavaArrayItem(ArrayReference arrayReference, int index) {
    myArray = arrayReference;
    myIndex = index;
  }

  @Override
  public String getCategory() {
    return CATEGORY_ARRAY_ITEM;
  }

  public ArrayReference getArray() {
    return myArray;
  }

  @Override
  public String getName() {
    return "[" + myIndex + "]";
  }

  @Override
  public IValue getValue() {
    return new JavaValue(myArray.getValue(myIndex));
  }

  @Override
  public Icon getPresentationIcon() {
    return getValue().getPresentationIcon();
  }

  @Override
  public SNode getNode() {
    return null;
  }
}
