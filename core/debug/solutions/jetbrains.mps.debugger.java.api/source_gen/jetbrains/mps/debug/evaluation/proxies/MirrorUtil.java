package jetbrains.mps.debug.evaluation.proxies;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.sun.jdi.Value;
import com.sun.jdi.ThreadReference;
import java.util.List;

public abstract class MirrorUtil {
  protected static MirrorUtil INSTANCE;

  public MirrorUtil() {
  }

  @NotNull
  public abstract IValueProxy getValueProxy(@Nullable Value value, @NotNull ThreadReference threadReference);

  @NotNull
  public abstract List<Value> getValues(ThreadReference threadReference, Object... args);

  @NotNull
  public abstract Object getJavaValue(@NotNull Value jdiValue);

  public abstract void init();

  public abstract void dispose();

  public static MirrorUtil getInstance() {
    return INSTANCE;
  }
}
