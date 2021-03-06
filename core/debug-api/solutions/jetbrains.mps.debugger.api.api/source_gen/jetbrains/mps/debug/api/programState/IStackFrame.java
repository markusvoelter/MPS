package jetbrains.mps.debug.api.programState;

/*Generated by MPS */

import java.util.Map;
import java.util.List;

public interface IStackFrame {
  public ILocation getLocation();
  public IThread getThread();
  public Map<IWatchable, IValue> getWatchableValues();
  public IValue getValue(IWatchable watchable);
  public List<IWatchable> getVisibleWatchables();
}
