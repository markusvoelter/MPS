package jetbrains.mps.make.script;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;

public interface IJob {
  public IResult execute(Iterable<IResource> input, IJobMonitor mon, IParametersPool pool);
}
