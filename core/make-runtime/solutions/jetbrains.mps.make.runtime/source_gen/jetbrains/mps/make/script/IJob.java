package jetbrains.mps.make.script;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.resources.IPropertiesAccessor;

public interface IJob {
  public IResult execute(Iterable<IResource> input, IJobMonitor mon, IPropertiesAccessor pa);
  public static class Stub implements IJob {
    public Stub() {
    }

    public IResult execute(Iterable<IResource> input, IJobMonitor mon, IPropertiesAccessor pa) {
      throw new UnsupportedOperationException();
    }
  }

}
