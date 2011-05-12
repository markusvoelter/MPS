package jetbrains.mps.vcs.conflictable;

/*Generated by MPS */

import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vfs.IFile;

public class ConflictableModelAdapter extends Conflictable {
  private final DefaultSModelDescriptor myModel;
  private final boolean myIsConflictDetected;

  public ConflictableModelAdapter(EditableSModelDescriptor model, boolean isConflictDetected) {
    myModel = ((DefaultSModelDescriptor) model);
    myIsConflictDetected = isConflictDetected;
  }

  public boolean isConflictDetected() {
    return myIsConflictDetected;
  }

  public IFile getFile() {
    return myModel.getModelFile();
  }

  public void reloadFromDisk() {
    myModel.reloadFromDisk();
  }

  public boolean needReloading() {
    return myModel.needsReloading();
  }
}
