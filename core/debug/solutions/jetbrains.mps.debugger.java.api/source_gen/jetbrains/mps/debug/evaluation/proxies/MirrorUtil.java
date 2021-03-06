package jetbrains.mps.debug.evaluation.proxies;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.sun.jdi.Value;
import com.sun.jdi.ThreadReference;
import java.util.List;
import jetbrains.mps.util.annotation.ToRemove;

public abstract class MirrorUtil {
  protected static MirrorUtil INSTANCE;
  protected static final Object LOCK = new Object();

  public MirrorUtil() {
  }

  @NotNull
  public abstract IValueProxy getValueProxy(@Nullable Value value, @NotNull ThreadReference threadReference);

  @NotNull
  public abstract List<Value> getValues(ThreadReference threadReference, Object... args);

  @NotNull
  public abstract Object getJavaValue(@NotNull Value jdiValue);

  @NotNull
  public abstract IValueProxy getValueProxyFromJava(@Nullable Object javaValue, ThreadReference threadReference);

  public abstract void init();

  public abstract void dispose();

  public static MirrorUtil getInstance() {
    synchronized (LOCK) {
      return INSTANCE;
    }
  }

  @NotNull
  @Deprecated
  @ToRemove(version = 2.1)
  public static IValueProxy getValueProxyFromJavaValue(@Nullable Object javaValue, ThreadReference threadReference) {
    return MirrorUtil.getInstance().getValueProxyFromJava(javaValue, threadReference);
  }
}
