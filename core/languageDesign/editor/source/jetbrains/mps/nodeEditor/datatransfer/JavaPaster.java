package jetbrains.mps.nodeEditor.datatransfer;

import com.intellij.ide.CopyPasteManagerEx;
import jetbrains.mps.datatransfer.PasteEnv;
import jetbrains.mps.javaParser.ConversionFailedException;
import jetbrains.mps.javaParser.FeatureKind;
import jetbrains.mps.javaParser.JavaCompiler;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.datatransfer.NodePaster.NodeAndRole;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;

import javax.swing.JOptionPane;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Date: 17.07.2010
 * Time: 17:15:10
 * To change this template use File | Settings | File Templates.
 */
public class JavaPaster {
  private static Logger LOG = Logger.getLogger(JavaPaster.class);

  public void pasteJava(SNode anchor, IOperationContext operationContext, FeatureKind featureKind) {
    String javaCode = getStringFromClipboard();
    if (javaCode == null) return;
    pasteJavaAsNode(anchor, anchor.getModel(), javaCode, operationContext, featureKind);
  }

  public void pasteJavaAsClass(SModel model, IOperationContext operationContext) {
    String javaCode = getStringFromClipboard();
    if (javaCode == null) return;
    pasteJavaAsNode(null, model, javaCode, operationContext, FeatureKind.CLASS);
  }

  public String getStringFromClipboard() {
    Transferable contents = null;
    for (Transferable trf: CopyPasteManagerEx.getInstanceEx().getAllContents()) {
      if (trf != null && trf.isDataFlavorSupported(DataFlavor.stringFlavor)) {
        contents = trf;
        break;
      }
    }

    if (contents == null) return null;
    if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
      try {
        Object data = contents.getTransferData(DataFlavor.stringFlavor);
        if (data instanceof String) {
          return (String) data;
        }
      } catch (UnsupportedFlavorException ex) {
        return null;
      } catch (IOException ex) {
        LOG.error(ex);
      }
    }
    return null;
  }

  public void pasteJavaAsNode(SNode anchor, SModel model, String javaCode, IOperationContext operationContext, FeatureKind featureKind) {
    IModule module = model.getModelDescriptor().getModule();
    JavaCompiler javaCompiler = new JavaCompiler(operationContext, module, null, false, model);
    try {
      List<SNode> nodes = javaCompiler.compileIsolated(javaCode, featureKind);
      if (nodes.isEmpty()) {
        JOptionPane.showMessageDialog(null, "nothing to paste as Java", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
      }
      NodePaster nodePaster = new NodePaster(nodes);
      if (featureKind != FeatureKind.CLASS) {
        NodeAndRole nodeAndRole = nodePaster.getActualAnchorNode(anchor, anchor.getRole_());
        if (nodeAndRole == null) return;
        nodePaster.paste(nodeAndRole.myNode, PasteEnv.NODE_EDITOR);
      } else {
        nodePaster.pasteAsRoots(model);
      }
    } catch (ConversionFailedException ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }


  }
}
