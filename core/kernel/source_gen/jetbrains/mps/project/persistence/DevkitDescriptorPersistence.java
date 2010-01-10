package jetbrains.mps.project.persistence;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.structure.modules.DevkitDescriptor;
import jetbrains.mps.vfs.IFile;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.Element;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.xmlQuery.runtime.AttributeUtils;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.util.Macros;
import java.io.OutputStream;

public class DevkitDescriptorPersistence {
  protected static Log log = LogFactory.getLog(DevkitDescriptorPersistence.class);

  public static DevkitDescriptor loadDevKitDescriptor(final IFile file) {
    try {
      Document document = JDOMUtil.loadDocument(file);
      final Element root = ((Element) document.getRootElement());
      DevkitDescriptor descriptor = new _FunctionTypes._return_P0_E0<DevkitDescriptor>() {
        public DevkitDescriptor invoke() {
          DevkitDescriptor result_1953_0 = new DevkitDescriptor();
          String result_1953_1 = root.getAttributeValue("name");
          result_1953_0.setNamespace(result_1953_1);
          String result_1953_2 = root.getAttributeValue("uuid");
          result_1953_0.setUUID(result_1953_2);

          ModuleDescriptorPersistence.loadDependencies(result_1953_0, root);

          for (Element exportedLang : ListSequence.fromList(AttributeUtils.elementChildren(root, "exported-language"))) {
            result_1953_0.getExportedLanguages().add(ModuleReference.fromString(exportedLang.getAttributeValue("name")));
          }

          for (Element xde : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "extendedDevKits")).first(), "extendedDevKit"))) {
            result_1953_0.getExtendedDevkits().add(ModuleReference.fromString(xde.getText()));
          }

          for (Element xse : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "exported-solutions")).first(), "exported-solution"))) {
            result_1953_0.getExportedSolutions().add(ModuleReference.fromString(xse.getText()));
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "classPath")).first(), "entry")).concat(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "runtimeClassPath")).first(), "entry")))) {
            // runtimeClassPath is left for compatibility 
            ClassPathEntry result_1953_3 = new ClassPathEntry();
            String result_1953_4 = Macros.devkitMacros().expandPath(entryElement.getAttributeValue("path"), file);
            result_1953_3.setPath(result_1953_4);
            boolean result_1953_5 = AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false);
            result_1953_3.setIncludedInVCS(result_1953_5);
            result_1953_0.getClassPaths().add(result_1953_3);
          }

          String result_1953_6 = root.getAttributeValue("pluginClass");
          result_1953_0.setPlugin(result_1953_6);
          return result_1953_0;
        }
      }.invoke();

      ModuleDescriptorPersistence.setTimestamp(descriptor, file, false);
      return descriptor;
    } catch (Exception e) {
      throw new ModuleReadException(e);
    }
  }

  public static void saveDevKitDescriptor(final DevkitDescriptor descriptor, final IFile file) {
    Element root = new _FunctionTypes._return_P0_E0<Element>() {
      public Element invoke() {
        Element result_1953_7 = new Element("dev-kit");
        String result_1953_8 = descriptor.getNamespace();
        result_1953_7.setAttribute("name", "" + result_1953_8);

        if (descriptor.getUUID() != null) {
          String result_1953_9 = descriptor.getUUID();
          result_1953_7.setAttribute("uuid", "" + result_1953_9);
        }

        ModuleDescriptorPersistence.saveDependencies(result_1953_7, descriptor);

        for (ModuleReference lang : ListSequence.fromList(descriptor.getExportedLanguages())) {
          Element result_1953_10 = new Element("exported-language");
          String result_1953_11 = lang.toString();
          result_1953_10.setAttribute("name", "" + result_1953_11);
          result_1953_7.addContent(result_1953_10);
        }

        if (!(descriptor.getExtendedDevkits().isEmpty())) {
          Element result_1953_12 = new Element("extendedDevKits");
          for (ModuleReference ref : ListSequence.fromList(descriptor.getExtendedDevkits())) {
            Element result_1953_13 = new Element("extendedDevKit");
            String result_1953_14 = ref.toString();
            result_1953_13.setText(result_1953_14);
            result_1953_12.addContent(result_1953_13);
          }
          result_1953_7.addContent(result_1953_12);
        }

        if (!(descriptor.getExportedSolutions().isEmpty())) {
          Element result_1953_15 = new Element("exported-solutions");
          for (ModuleReference ref : ListSequence.fromList(descriptor.getExtendedDevkits())) {
            Element result_1953_16 = new Element("exported-solution");
            String result_1953_17 = ref.toString();
            result_1953_16.setText(result_1953_17);
            result_1953_15.addContent(result_1953_16);
          }
          result_1953_7.addContent(result_1953_15);
        }

        Element result_1953_18 = new Element("classPath");
        for (ClassPathEntry entry : ListSequence.fromList(descriptor.getClassPaths())) {
          Element result_1953_19 = new Element("entry");
          String result_1953_20 = Macros.devkitMacros().shrinkPath(entry.getPath(), file);
          result_1953_19.setAttribute("path", "" + result_1953_20);
          boolean result_1953_21 = entry.isIncludedInVCS();
          result_1953_19.setAttribute("include", "" + result_1953_21);
          result_1953_18.addContent(result_1953_19);
        }
        result_1953_7.addContent(result_1953_18);

        if (descriptor.getPlugin() != null) {
          String result_1953_22 = descriptor.getPlugin();
          result_1953_7.setAttribute("pluginClass", "" + result_1953_22);
        }
        return result_1953_7;
      }
    }.invoke();

    try {
      OutputStream os = file.openOutputStream();
      JDOMUtil.writeDocument(new Document(root), os);
    } catch (Exception e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }

    ModuleDescriptorPersistence.setTimestamp(descriptor, file, true);
  }
}
