package jetbrains.mps.build.ant;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import java.io.File;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.JDOMException;
import java.io.IOException;
import org.jdom.Element;
import jetbrains.mps.project.structure.project.ProjectDescriptor;
import jetbrains.mps.project.persistence.ProjectDescriptorPersistence;

public class FileMPSProject extends Project {
  private File mprfile;

  public FileMPSProject(File mprfile) {
    this.mprfile = mprfile;
    load();
  }

  private void load() {
    Document document = null;
    try {
      document = JDOMUtil.loadDocument(mprfile);
    } catch (JDOMException ex) {
    } catch (IOException ex) {
    }
    Element projectElement = null;
    if (document != null) {
      Element root = document.getRootElement();
      if ("project".equals(root.getName())) {
        for (Object ch : root.getChildren("component")) {
          if (ch instanceof Element && "MPSProject".equals(((Element) ch).getAttributeValue("name"))) {
            projectElement = (Element) ch;
            break;
          }
        }
      }
    }
    ProjectDescriptor descriptor = new ProjectDescriptor();
    if (projectElement != null) {
      ProjectDescriptorPersistence.loadProjectDescriptorFromElement(descriptor, mprfile, projectElement);
      init(mprfile, descriptor);
    } else {
      init(null, descriptor);
    }
  }

  public String getName() {
    return mprfile.getName();
  }

  @Deprecated
  public <T> T getComponent(Class<T> cls) {
    return null;
  }
}
