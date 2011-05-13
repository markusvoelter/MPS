package jetbrains.mps.stubs.util;

/*Generated by MPS */

import jetbrains.mps.project.StubPath;
import jetbrains.mps.smodel.descriptor.source.RegularModelDataSource;
import jetbrains.mps.smodel.descriptor.source.StubModelDataSource;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.stubs.StubLocation;

import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelStereotype;

public class StubModelDescriptors {
  private String stubStereotype;
  private IModelRootManager mrm;
  private StubLocation stubLoc;

  public StubModelDescriptors(String stereotype, IModelRootManager mrm, StubLocation loc) {
    this.stubStereotype = stereotype;
    this.mrm = mrm;
    this.stubLoc = loc;
  }

  public Set<BaseStubModelDescriptor> getDescriptors(_FunctionTypes._return_P1_E0<? extends PathItem, ? super String> getPathItem) {
    Set<BaseStubModelDescriptor> result = SetSequence.fromSet(new HashSet<BaseStubModelDescriptor>());
    collectDescriptors(stubLoc, getPathItem, result);
    return result;
  }

  private void collectDescriptors(StubLocation loc, _FunctionTypes._return_P1_E0<? extends PathItem, ? super String> getPathItem, Set<BaseStubModelDescriptor> result) {
/*
    String pkg = loc.getPrefix();
    PathItem pi = getPathItem.invoke(loc.getPath());
    for (String subpkg : ListSequence.fromList(pi.subpackages(pkg))) {
      if (ListSequence.fromList(pi.resources(subpkg)).isNotEmpty()) {
        SModelReference smref = smodelRefWithId(subpkg);
        SModelDescriptor descById = SModelRepository.getInstance().getModelDescriptor(smref);
        if (descById != null) {
          assert descById.getModule() == loc.getModule();
          SetSequence.fromSet(result).addElement(((BaseStubModelDescriptor) descById));
        } else {
          BaseStubModelDescriptor desc = new BaseStubModelDescriptor(mrm, smref, true, new StubModelDataSource(new ArrayList<StubPath>()));
          SModelRepository.getInstance().registerModelDescriptor(desc, loc.getModule());
          SetSequence.fromSet(result).addElement(desc);
        }
      }
      collectDescriptors(new StubLocation(stubLoc.getPath(), subpkg, loc.getModuleRef()), getPathItem, result);
    }
*/
  }

  public SModelReference smodelRefWithId(String pkg) {
    SModelFqName fqname = new SModelFqName(stubLoc.getModuleRef().getModuleFqName(), pkg, stubStereotype);
    SModelId modelId = SModelId.foreign(stubStereotype, stubLoc.getModuleRef().getModuleId().toString(), pkg);
    return new SModelReference(fqname, modelId);
  }

  public SModelReference smodelRefWithFqName(String pkg) {
    return SModelReference.fromString(pkg + "@" + stubStereotype);
  }

  public SModelReference javaStubRef(String pkg) {
    ModuleReference mr = this.stubLoc.getModule().getModuleFor(pkg, "java");
    String mfq = "MPS.Classpath";
    String muid = "37a3367b-1fb2-44d8-aa6b-18075e74e003";
    if (mr != null) {
      mfq = mr.getModuleFqName();
      muid = mr.getModuleId().toString();
    }
    String stereo = SModelStereotype.getStubStereotypeForId("java");
    SModelFqName fqname = new SModelFqName(mfq, pkg, stereo);
    SModelId modelId = SModelId.foreign(stereo, muid, pkg);
    return new SModelReference(fqname, modelId);
  }
}
