package jetbrains.mps.debug.customViewers.sandbox;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapperFactory;
import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapper;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaValue;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaObjectValue;
import java.util.List;
import jetbrains.mps.debug.runtime.java.programState.watchables.CustomJavaWatchable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class MyViewer_Factory extends ValueWrapperFactory {
  public MyViewer_Factory() {
  }

  public ValueWrapper createValueWrapper(JavaValue value) {
    return new MyViewer_Factory.MyViewer_Wrapper(value);
  }

  @Override
  public boolean canWrapValue(JavaValue value) {
    if (value instanceof JavaObjectValue) {
      JavaObjectValue ov = (JavaObjectValue) value;
      return "jetbrains.mps.internal.collections.runtime.ListSequence".equals(ov.getClassFqName());
    } else {
      return false;
    }
  }

  public static class MyViewer_Wrapper extends ValueWrapper {
    public MyViewer_Wrapper(JavaValue value) {
      super(value);
    }

    public List<CustomJavaWatchable> getSubvaluesImpl() {
      JavaObjectValue ov = (JavaObjectValue) myWrappedValue;
      List<CustomJavaWatchable> result = ListSequence.fromList(new ArrayList<CustomJavaWatchable>());
      ListSequence.fromList(result).addElement(new CollectionWatchables.MyWatchable_list(JavaObjectValue.tryToWrap(ov.getFieldValue("list")), "list"));
      return result;
    }
  }
}
