package jetbrains.mps.workbench.dialogs.project.components.parts.creators;

/*Generated by MPS */

import com.intellij.openapi.util.Computable;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.TreeFileChooser;
import jetbrains.mps.vfs.IFile;

public class ModulePathChooser implements Computable<Path> {
  private final String myExtension;
  private final IBindedDialog myOwner;

  public ModulePathChooser(String extension, IBindedDialog owner) {
    myExtension = extension;
    myOwner = owner;
  }

  public Path compute() {
    TreeFileChooser chooser = new TreeFileChooser();
    chooser.setExtensionFileFilter(myExtension);
    IFile file = chooser.showDialog(myOwner.getMainComponent());
    if (file == null) {
      return null;
    }
    return new Path(file.getPath());
  }
}
