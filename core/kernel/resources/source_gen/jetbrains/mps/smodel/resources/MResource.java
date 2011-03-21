package jetbrains.mps.smodel.resources;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;

public class MResource extends MultiTuple._2<IModule, Iterable<SModelDescriptor>> implements IResource, IMResource {
  public MResource() {
    super();
  }

  public MResource(IModule module, Iterable<SModelDescriptor> models) {
    super(module, models);
  }

  public IModule module(IModule value) {
    return super._0(value);
  }

  public Iterable<SModelDescriptor> models(Iterable<SModelDescriptor> value) {
    return super._1(value);
  }

  public IModule module() {
    return super._0();
  }

  public Iterable<SModelDescriptor> models() {
    return super._1();
  }

  @SuppressWarnings(value = "unchecked")
  public MResource assignFrom(Tuples._2<IModule, Iterable<SModelDescriptor>> from) {
    return (MResource) super.assign(from);
  }
}
