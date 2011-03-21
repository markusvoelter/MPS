package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import com.intellij.openapi.diff.DiffTool;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.diff.DiffRequest;
import com.intellij.openapi.diff.DiffContent;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.GlobalOperationContext;
import jetbrains.mps.project.ModuleContext;
import javax.swing.JFrame;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.ide.projectPane.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.diff.DiffManager;
import java.io.IOException;
import jetbrains.mps.vcs.VcsSettingsHolder;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.fileTypes.FileType;
import jetbrains.mps.fileTypes.MPSFileTypeFactory;
import com.intellij.openapi.diff.DocumentContent;
import com.intellij.openapi.diff.FileContent;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.vcs.ModelUtils;

public class ModelDiffTool implements DiffTool {
  private static final Logger LOG = Logger.getLogger(ModelDiffTool.class);

  public ModelDiffTool() {
  }

  public void show(final DiffRequest request) {
    DiffContent[] contents = request.getContents();
    try {
      final SModel oldModel = ModelDiffTool.readModel(contents[0], ModelDiffTool.getFilePath(request));
      final SModel newModel = ModelDiffTool.readModel(contents[1], ModelDiffTool.getFilePath(request));
      final BaseDialog d = ModelAccess.instance().runReadAction(new Computable<BaseDialog>() {
        public BaseDialog compute() {
          SModelDescriptor modelDescriptor = oldModel.getModelDescriptor();
          if (modelDescriptor == null) {
            modelDescriptor = newModel.getModelDescriptor();
            if (modelDescriptor == null) {
              modelDescriptor = SModelRepository.getInstance().getModelDescriptor(oldModel.getSModelFqName());
            }
          }
          IOperationContext context;
          if (modelDescriptor == null) {
            context = new GlobalOperationContext();
          } else {
            context = new ModuleContext(modelDescriptor.getModule(), request.getProject());
          }
          boolean modal = !(request.getHints().contains(DiffTool.HINT_SHOW_FRAME));
          JFrame frame = WindowManager.getInstance().getFrame(request.getProject());
          if (ModelDifferenceDialog.isNewDiffEnabled()) {
            return new ModelDifferenceDialog(request.getProject(), context, oldModel, newModel, request.getContentTitles());
          } else {
            final OldModelDifferenceDialog d = new OldModelDifferenceDialog(context, frame, oldModel, newModel, request.getWindowTitle(), modal, request.getContentTitles());
            d.addAction(new AnAction("View as Text", "View as Text", Icons.TEXT_ICON) {
              public void actionPerformed(AnActionEvent e) {
                DiffTool ideaDiffTool = DiffManager.getInstance().getIdeaDiffTool();
                if (ideaDiffTool.canShow(request)) {
                  d.dispose();
                  ideaDiffTool.show(request);
                }
              }
            });
            return d;
          }
        }
      });
      d.showDialog();
    } catch (ModelDiffTool.ReadException e) {
      LOG.warning("Can't read models. Using text based merge...", e);
      DiffTool ideaDiffTool = DiffManager.getInstance().getIdeaDiffTool();
      if (ideaDiffTool.canShow(request)) {
        ideaDiffTool.show(request);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public boolean canShow(DiffRequest request) {
    if (VcsSettingsHolder.instance().getSettings().isTextModeEnabled()) {
      return false;
    }
    DiffContent[] contents = request.getContents();
    return (contents.length == 2) && isModelFile(contents[0]) && isModelFile(contents[1]);
  }

  private boolean isModelFile(@NotNull DiffContent contents) {
    FileType type = contents.getContentType();
    if (type == null) {
      return true;
    }
    return type.equals(MPSFileTypeFactory.MODEL_FILE_TYPE);
  }

  public static String getFilePath(DiffRequest request) {
    for (DiffContent c : request.getContents()) {
      if (c.getFile() != null) {
        return c.getFile().getPath();
      }
    }
    return "";
  }

  public static SModel readModel(DiffContent content, String path) throws IOException {
    if (content instanceof DocumentContent || content instanceof FileContent) {
      SModelRepository modelRepository = SModelRepository.getInstance();
      final SModelDescriptor modelDescriptor = modelRepository.findModel(VirtualFileUtils.toIFile(content.getFile()));
      if (modelDescriptor != null) {
        return ModelAccess.instance().runReadAction(new Computable<SModel>() {
          public SModel compute() {
            return modelDescriptor.getSModel();
          }
        });
      }
    }
    return ModelUtils.readModel(content.getBytes(), path);
  }

  public static class ReadException extends IOException {
    public ReadException(Exception t) {
      super(t);
    }
  }
}
