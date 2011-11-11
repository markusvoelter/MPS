package jetbrains.mps.debug.evaluation.proxies;

/*Generated by MPS */

import org.jetbrains.annotations.Nullable;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;
import org.jetbrains.annotations.NotNull;
import com.sun.jdi.StringReference;
import com.sun.jdi.PrimitiveValue;
import com.sun.jdi.BooleanValue;
import com.sun.jdi.ShortValue;
import com.sun.jdi.ByteValue;
import com.sun.jdi.CharValue;
import com.sun.jdi.DoubleValue;
import com.sun.jdi.FloatValue;
import com.sun.jdi.IntegerValue;
import com.sun.jdi.LongValue;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.Field;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.VoidValue;
import com.sun.jdi.ArrayReference;
import java.util.List;
import java.util.ArrayList;

public class MirrorUtilImpl extends MirrorUtil {
  public MirrorUtilImpl() {
  }

  @Nullable
  public Value getJDIValueFromRaw(@Nullable Object value, VirtualMachine vm) {
    if (value == null) {
      return null;
    }
    if (value instanceof Integer) {
      return vm.mirrorOf(((Integer) value).intValue());
    } else
    if (value instanceof Byte) {
      return vm.mirrorOf(((Byte) value).byteValue());
    } else
    if (value instanceof Boolean) {
      return vm.mirrorOf(((Boolean) value).booleanValue());
    } else
    if (value instanceof Short) {
      return vm.mirrorOf(((Short) value).shortValue());
    } else
    if (value instanceof Float) {
      return vm.mirrorOf(((Float) value).floatValue());
    } else
    if (value instanceof Long) {
      return vm.mirrorOf(((Long) value).longValue());
    } else
    if (value instanceof Double) {
      return vm.mirrorOf(((Double) value).doubleValue());
    } else
    if (value instanceof Character) {
      return vm.mirrorOf(((Character) value).charValue());
    } else
    if (value instanceof String) {
      return vm.mirrorOf((String) value);
    } else {
      throw new UnsupportedOperationException();
    }
  }

  @NotNull
  public Object getJavaValue(@NotNull Value jdiValue) {
    if (jdiValue instanceof StringReference) {
      return ((StringReference) jdiValue).value();
    }
    if (jdiValue instanceof PrimitiveValue) {
      PrimitiveValue primitiveValue = (PrimitiveValue) jdiValue;
      if (primitiveValue instanceof BooleanValue) {
        return primitiveValue.booleanValue();
      }
      if (primitiveValue instanceof ShortValue) {
        return primitiveValue.shortValue();
      }
      if (primitiveValue instanceof ByteValue) {
        return primitiveValue.byteValue();
      }
      if (primitiveValue instanceof CharValue) {
        return primitiveValue.charValue();
      }
      if (primitiveValue instanceof DoubleValue) {
        return primitiveValue.doubleValue();
      }
      if (primitiveValue instanceof FloatValue) {
        return primitiveValue.floatValue();
      }
      if (primitiveValue instanceof IntegerValue) {
        return primitiveValue.intValue();
      }
      if (primitiveValue instanceof LongValue) {
        return primitiveValue.longValue();
      }
    } else
    if (jdiValue instanceof ObjectReference) {
      String typename = ((ObjectReference) jdiValue).referenceType().name();
      if (typename.equals(Boolean.class.getName()) || typename.equals(Short.class.getName()) || typename.equals(Byte.class.getName()) || typename.equals(Character.class.getName()) || typename.equals(Double.class.getName()) || typename.equals(Float.class.getName()) || typename.equals(Integer.class.getName()) || typename.equals(Long.class.getName())) {
        Field f = ((ObjectReference) jdiValue).referenceType().fieldByName("value");
        Value result = ((ObjectReference) jdiValue).getValue(f);
        return getJavaValue(result);
      }
    }
    throw new UnsupportedOperationException();
  }

  @NotNull
  public IValueProxy getValueProxyFromJavaValue(@Nullable Object javaValue, ThreadReference threadReference) {
    Value v = getJDIValueFromRaw(javaValue, threadReference.virtualMachine());
    return getValueProxy(v, threadReference);
  }

  @NotNull
  public IValueProxy getValueProxy(@Nullable Value value, @NotNull ThreadReference threadReference) {
    if (value == null) {
      return new NullValueProxy();
    }
    if (value instanceof VoidValue) {
      return new VoidValueProxy(value, threadReference);
    }
    if (value instanceof ArrayReference) {
      return new ArrayValueProxy((ArrayReference) value, threadReference);
    } else
    if (value instanceof ObjectReference) {
      return new ObjectValueProxy((ObjectReference) value, threadReference);
    } else
    if (value instanceof PrimitiveValue) {
      return new PrimitiveValueProxy((PrimitiveValue) value, threadReference);
    } else {
      throw new UnsupportedOperationException();
    }
  }

  @NotNull
  public List<Value> getValues(ThreadReference threadReference, Object... args) {
    List<Value> argValues = new ArrayList<Value>();
    for (Object arg : args) {
      Value v;
      if (arg instanceof ValueProxy) {
        v = ((IValueProxy) arg).getJDIValue();
      } else {
        v = getJDIValueFromRaw(arg, threadReference.virtualMachine());
      }
      argValues.add(v);
    }
    return argValues;
  }

  public void dispose() {
    INSTANCE = null;
  }

  public void init() {
    INSTANCE = this;
  }
}
