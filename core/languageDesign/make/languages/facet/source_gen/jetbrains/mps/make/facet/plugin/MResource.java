package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.SModelDescriptor;

public class MResource implements IResource {
  private Iterable<SModelDescriptor> models;

  public MResource(Iterable<SModelDescriptor> models) {
    this.models = models;
  }

  public Iterable<SModelDescriptor> models() {
    return models;
  }
}
