package jetbrains.mps.vcs;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SModel;
import org.jdom.Document;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import java.io.ByteArrayOutputStream;
import jetbrains.mps.util.JDOMUtil;
import java.io.IOException;
import com.intellij.openapi.vfs.VirtualFile;
import java.io.OutputStream;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import java.io.File;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.UnzipUtil;
import java.io.FilenameFilter;
import java.io.FileInputStream;
import org.xml.sax.InputSource;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import jetbrains.mps.smodel.SModelReference;
import com.intellij.openapi.util.Ref;
import jetbrains.mps.vcs.diff.ui.ModelDiffTool;

public class ModelUtils {
  private static final Logger LOG = Logger.getLogger(ModelUtils.class);

  public ModelUtils() {
  }

  public static byte[] modelToBytes(final SModel result) {
    Document document = ModelAccess.instance().runReadAction(new Computable<Document>() {
      public Document compute() {
        return ModelPersistence.saveModel(result, result.getPersistenceVersion());
      }
    });
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      JDOMUtil.writeDocument(document, baos);
      return baos.toByteArray();
    } catch (IOException e) {
      LOG.error(e);
    }
    return new byte[0];
  }

  public static void replaceWithNewModelFromBytes(final VirtualFile modelFile, final byte[] bytesToReplaceWith) {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        OutputStream outputStream = null;
        try {
          outputStream = modelFile.getOutputStream(this);
          outputStream.write(bytesToReplaceWith);
        } catch (IOException e) {
          ModelUtils.LOG.error(e);
        } finally {
          if (outputStream != null) {
            try {
              outputStream.close();
            } catch (IOException e) {
            }
          }
        }
        ModelUtils.replaceModelWithBytes(modelFile, bytesToReplaceWith);
        modelFile.refresh(true, false);
      }
    });
  }

  public static void replaceModelWithBytes(VirtualFile modelFile, byte[] bytesToReplaceWith) {
    final EditableSModelDescriptor modelDescriptor = SModelRepository.getInstance().findModel(VirtualFileUtils.toIFile(modelFile));
    if (modelDescriptor == null) {
      return;
    }
    try {
      SModel model = ModelUtils.readModel(bytesToReplaceWith, modelFile.getPath());
      modelDescriptor.replaceModel(model);
    } catch (IOException e) {
      LOG.error(e);
    }
  }

  public static SModel[] loadZippedModels(File zipfile, Version[] versions) throws IOException {
    return ModelUtils.loadZippedModels(zipfile, versions, true);
  }

  public static SModel[] loadZippedModels(File zipfile, Version[] versions, boolean useZipName) throws IOException {
    File tmpdir = FileUtil.createTmpDir();
    UnzipUtil.unzip(zipfile, tmpdir);
    String zipfilename = zipfile.getName();
    String name = zipfilename.substring(0, zipfilename.length() - "zip".length());
    String prefix = tmpdir + File.separator + name;
    SModel[] models = new SModel[versions.length];
    int index = 0;
    for (final Version v : versions) {
      File file;
      if (useZipName) {
        file = new File(prefix + v.getSuffix());
      } else {
        File[] files = tmpdir.listFiles(new FilenameFilter() {
          public boolean accept(File dir, String name) {
            return name.endsWith(v.getSuffix());
          }
        });
        LOG.assertLog((files != null) && (files.length == 1));
        file = files[0];
      }
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      FileInputStream fis = new FileInputStream(file);
      while (true) {
        int i = fis.read();
        if (i == -1) {
          break;
        }
        baos.write(i);
      }
      models[index] = ModelUtils.readModel(baos.toByteArray(), file.getAbsolutePath());
      index++;
    }
    FileUtil.delete(tmpdir);
    return models;
  }

  public static SModel readModel(final byte[] bytes, String path) throws IOException {
    return ModelUtils.readModel((bytes.length == 0 ?
      null :
      new ModelUtils.InputSourceFactory() {
        public InputSource create() throws IOException {
          return new InputSource(new ByteArrayInputStream(bytes));
        }
      }
    ), path);
  }

  public static SModel readModel(final String content, String path) throws IOException {
    return ModelUtils.readModel((content.isEmpty() ?
      null :
      new ModelUtils.InputSourceFactory() {
        public InputSource create() throws IOException {
          return new InputSource(new StringReader(content));
        }
      }
    ), path);
  }

  public static SModel readModel(final String path) throws IOException {
    return ModelUtils.readModel(new ModelUtils.InputSourceFactory() {
      public InputSource create() throws IOException {
        return new InputSource(new FileInputStream(path));
      }
    }, path);
  }

  private static SModel readModel(final ModelUtils.InputSourceFactory inputSourceFactory, String path) throws IOException {
    int index = path.lastIndexOf("/");
    String shortName = path;
    if (index != -1) {
      shortName = path.substring(index + 1);
    }
    index = shortName.lastIndexOf("\\");
    if (index != -1) {
      shortName = shortName.substring(index + 1);
    }
    final String modelName = ModelPersistence.extractModelName(shortName);
    final String modelStereotype = ModelPersistence.extractModelStereotype(shortName);
    try {
      if (inputSourceFactory == null) {
        return new SModel(SModelReference.fromString(modelName + "@" + modelStereotype));
      }
      final Ref<IOException> ex = new Ref<IOException>();
      SModel model = ModelAccess.instance().runReadAction(new Computable<SModel>() {
        public SModel compute() {
          try {
            return ModelPersistence.readModel(ModelPersistence.getPersistenceVersion(inputSourceFactory.create()), inputSourceFactory.create(), modelName, modelStereotype);
          } catch (IOException e) {
            ex.set(e);
            return null;
          }
        }
      });
      if (model == null) {
        throw ex.get();
      } else {
        return model;
      }
    } catch (Exception t) {
      throw new ModelDiffTool.ReadException(t);
    }
  }

  public static File[] findZipFileNameForModelFile(final String modelFilePath) {
    File parentFile = new File(modelFilePath).getParentFile();
    return parentFile.listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
        String fullName = dir.getPath() + File.separator + name;
        return fullName.contains(modelFilePath) && fullName.endsWith(".zip");
      }
    });
  }

  private static interface InputSourceFactory {
    public InputSource create() throws IOException;
  }
}
