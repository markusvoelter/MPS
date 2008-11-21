package jetbrains.mps.ide.projectPane.fileSystem.actions.providers;

import com.intellij.ide.CopyProvider;
import com.intellij.ide.CutProvider;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.vfs.VirtualFile;

import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;

public class FilePaneCopyProvider implements CopyProvider, CutProvider {
  public void performCopy(DataContext dataContext) {
    perform(dataContext, false);
  }

  public void performCut(DataContext dataContext) {
    perform(dataContext, true);  
  }

  private void perform(DataContext dataContext, boolean cut) {
    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
    cb.setContents(new VirtualFileTransferable(getData(dataContext, cut)), null);
  }

  private CopyPasteFilesData getData(DataContext dataContext, boolean cut) {
    VirtualFile[] files = PlatformDataKeys.VIRTUAL_FILE_ARRAY.getData(dataContext);
    if (files != null) return new CopyPasteFilesData(files, cut);
    VirtualFile file = PlatformDataKeys.VIRTUAL_FILE.getData(dataContext);
    if (file != null) return new CopyPasteFilesData(new VirtualFile[]{file}, cut);
    return null;
  }

  public boolean isCopyEnabled(DataContext dataContext) {
    return isEnabled(dataContext, false);
  }

  public boolean isCutEnabled(DataContext dataContext) {
    return isEnabled(dataContext, true);
  }

  private boolean isEnabled(DataContext dataContext, boolean cut) {
    return getData(dataContext, cut) != null;
  }
}
