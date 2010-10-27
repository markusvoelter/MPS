package jetbrains.mps.project.persistence;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import jetbrains.mps.util.MacrosFactory;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.Element;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.xmlQuery.runtime.AttributeUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.project.structure.model.ModelRootManager;
import jetbrains.mps.project.structure.modules.StubSolution;
import jetbrains.mps.project.ModuleId;
import java.io.File;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.project.structure.modules.GeneratorDescriptor;
import java.io.OutputStream;

public class LanguageDescriptorPersistence {
  protected static Log log = LogFactory.getLog(LanguageDescriptorPersistence.class);

  public static LanguageDescriptor loadLanguageDescriptor(final IFile file) {
    final Macros macros = MacrosFactory.languageDescriptor();
    LanguageDescriptor descriptor;

    try {
      Document document = JDOMUtil.loadDocument(file);
      final Element languageElement = ((Element) document.getRootElement());

      descriptor = new _FunctionTypes._return_P0_E0<LanguageDescriptor>() {
        public LanguageDescriptor invoke() {
          final LanguageDescriptor result_v3r4p8_a0a0d0d0a = new LanguageDescriptor();
          final String result_v3r4p8_a0a0a0d0d0a = languageElement.getAttributeValue("namespace");
          result_v3r4p8_a0a0d0d0a.setNamespace(result_v3r4p8_a0a0a0d0d0a);
          if (languageElement.getAttributeValue("uuid") != null) {
            final String result_v3r4p8_a0a1a0a0d0d0a = languageElement.getAttributeValue("uuid");
            result_v3r4p8_a0a0d0d0a.setUUID(result_v3r4p8_a0a1a0a0d0d0a);
          }
          final boolean result_v3r4p8_a2a0a0d0d0a = AttributeUtils.booleanWithDefault(languageElement.getAttributeValue("java-stubs-enabled"), false);
          result_v3r4p8_a0a0d0d0a.setEnableJavaStubs(result_v3r4p8_a2a0a0d0d0a);

          if (languageElement.getAttributeValue("generatorOutputPath") != null) {
            final String result_v3r4p8_a0a4a0a0d0d0a = macros.expandPath(languageElement.getAttributeValue("generatorOutputPath"), file);
            result_v3r4p8_a0a0d0d0a.setGenPath(result_v3r4p8_a0a4a0a0d0d0a);
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "models")).isNotEmpty()) {
            result_v3r4p8_a0a0d0d0a.getModelRoots().addAll(ModuleDescriptorPersistence.loadModelRoots(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "models")).first(), "modelRoot"), file, macros));
          } else {
            // old - for backwards compatibility 
            result_v3r4p8_a0a0d0d0a.getModelRoots().addAll(ModuleDescriptorPersistence.loadModelRoots(AttributeUtils.elementChildren(languageElement, "modelRoot"), file, macros));
          }

          ModuleDescriptorPersistence.loadDependencies(result_v3r4p8_a0a0d0d0a, languageElement);

          for (Element extendedLanguage : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "extendedLanguages")).first(), "extendedLanguage"))) {
            result_v3r4p8_a0a0d0d0a.getExtendedLanguages().add(ModuleReference.fromString(extendedLanguage.getText()));
          }

          Element autoImports = ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "accessoryModels")).first();
          if (autoImports == null) {
            // deprecated name 
            autoImports = ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "library")).first();
          }
          for (Element modelElement : ListSequence.fromList(AttributeUtils.elementChildren(autoImports, "model"))) {
            result_v3r4p8_a0a0d0d0a.getAccessoryModels().add(SModelReference.fromString(modelElement.getAttributeValue("modelUID")));
          }

          for (Element generatorElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "generators")).first(), "generator"))) {
            result_v3r4p8_a0a0d0d0a.getGenerators().add(GeneratorDescriptorPersistence.loadGeneratorDescriptor(generatorElement, file, macros));
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "classPath")).first(), "entry")).concat(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "runtimeClassPath")).first(), "entry")))) {
            // runtimeClassPath was left for compatibility 
            StubModelsEntry entry = new StubModelsEntry();
            entry.setIncludedInVCS(AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false));
            entry.setPath(macros.expandPath(entryElement.getAttributeValue("path"), file));
            entry.setManager(LanguageID.JAVA_MANAGER);
            result_v3r4p8_a0a0d0d0a.getStubModelEntries().add(entry);
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "stubModelEntries")).isNotEmpty()) {
            result_v3r4p8_a0a0d0d0a.getStubModelEntries().addAll(ModuleDescriptorPersistence.loadStubModelEntries(AttributeUtils.elementChildren(languageElement, "stubModelEntries"), file, macros));
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "languageRuntimeClassPath")).first(), "entry"))) {
            StubModelsEntry entry = new StubModelsEntry();
            entry.setIncludedInVCS(AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false));
            entry.setPath(macros.expandPath(entryElement.getAttributeValue("path"), file));
            entry.setManager(LanguageID.JAVA_MANAGER);
            result_v3r4p8_a0a0d0d0a.getRuntimeStubModels().add(entry);
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "runtimeStubModels")).isNotEmpty()) {
            for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "runtimeStubModels")).first(), "stubModelEntry"))) {
              final StubModelsEntry result_v3r4p8_a0a0a42a0a0d0d0a = new StubModelsEntry();
              final String result_v3r4p8_a0a0a0a42a0a0d0d0a = macros.expandPath(entryElement.getAttributeValue("path"), file);
              result_v3r4p8_a0a0a42a0a0d0d0a.setPath(result_v3r4p8_a0a0a0a42a0a0d0d0a);
              final ModelRootManager result_v3r4p8_a1a0a0a42a0a0d0d0a = new ModelRootManager();
              final String result_v3r4p8_a0a1a0a0a42a0a0d0d0a = AttributeUtils.stringWithDefault(ListSequence.fromList(AttributeUtils.elementChildren(entryElement, "manager")).first().getAttributeValue("moduleId"), "");
              result_v3r4p8_a1a0a0a42a0a0d0d0a.setModuleId(result_v3r4p8_a0a1a0a0a42a0a0d0d0a);
              final String result_v3r4p8_a1a1a0a0a42a0a0d0d0a = AttributeUtils.stringWithDefault(ListSequence.fromList(AttributeUtils.elementChildren(entryElement, "manager")).first().getAttributeValue("className"), "");
              result_v3r4p8_a1a0a0a42a0a0d0d0a.setClassName(result_v3r4p8_a1a1a0a0a42a0a0d0d0a);
              result_v3r4p8_a0a0a42a0a0d0d0a.setManager(result_v3r4p8_a1a0a0a42a0a0d0d0a);
              final boolean result_v3r4p8_a2a0a0a42a0a0d0d0a = AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false);
              result_v3r4p8_a0a0a42a0a0d0d0a.setIncludedInVCS(result_v3r4p8_a2a0a0a42a0a0d0d0a);
              result_v3r4p8_a0a0d0d0a.getRuntimeStubModels().add(result_v3r4p8_a0a0a42a0a0d0d0a);
            }
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "stubSolutions")).isNotEmpty()) {
            for (Element solutionElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "stubSolutions")).first(), "stubSolution"))) {
              final StubSolution result_v3r4p8_a0a0a62a0a0d0d0a = new StubSolution();
              final String result_v3r4p8_a0a0a0a62a0a0d0d0a = AttributeUtils.stringWithDefault(solutionElement.getAttributeValue("moduleName"), "");
              result_v3r4p8_a0a0a62a0a0d0d0a.setName(result_v3r4p8_a0a0a0a62a0a0d0d0a);
              final ModuleId result_v3r4p8_a1a0a0a62a0a0d0d0a = ModuleId.fromString(AttributeUtils.stringWithDefault(solutionElement.getAttributeValue("moduleId"), ""));
              result_v3r4p8_a0a0a62a0a0d0d0a.setId(result_v3r4p8_a1a0a0a62a0a0d0d0a);
              result_v3r4p8_a0a0d0d0a.getStubSolutions().add(result_v3r4p8_a0a0a62a0a0d0d0a);
            }
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "sourcePath")).first(), "source"))) {
            result_v3r4p8_a0a0d0d0a.getSourcePaths().add(macros.expandPath(entryElement.getAttributeValue("path"), file));
          }

          final boolean result_v3r4p8_a03a0a0d0d0a = AttributeUtils.booleanWithDefault(languageElement.getAttributeValue("compileInMPS"), false);
          result_v3r4p8_a0a0d0d0a.setCompileInMPS(result_v3r4p8_a03a0a0d0d0a);
          final boolean result_v3r4p8_a13a0a0d0d0a = AttributeUtils.booleanWithDefault(languageElement.getAttributeValue("doNotGenerateAdapters"), false);
          result_v3r4p8_a0a0d0d0a.setDoNotGenerateAdapters(result_v3r4p8_a13a0a0d0d0a);
          return result_v3r4p8_a0a0d0d0a;
        }
      }.invoke();
    } catch (Exception e) {
      throw new ModuleReadException(e);
    }

    ModuleDescriptorPersistence.setTimestamp(descriptor, file);
    return descriptor;
  }

  public static void saveLanguageDescriptor(File file, LanguageDescriptor descriptor) {
    saveLanguageDescriptor(FileSystem.getInstance().getFileByPath(file.getAbsolutePath()), descriptor);
  }

  public static void saveLanguageDescriptor(final IFile file, final LanguageDescriptor descriptor) {
    if (file.isReadOnly()) {
      if (log.isErrorEnabled()) {
        log.error("Cant't save " + file.getAbsolutePath());
      }
      return;
    }

    final Macros macros = MacrosFactory.languageDescriptor();
    Element languageElement = new _FunctionTypes._return_P0_E0<Element>() {
      public Element invoke() {
        final Element result_v3r4p8_a0a0d0c = new Element("language");
        final String result_v3r4p8_a0a0a0d0c = descriptor.getNamespace();
        result_v3r4p8_a0a0d0c.setAttribute("namespace", "" + result_v3r4p8_a0a0a0d0c);
        if (descriptor.getUUID() != null) {
          final String result_v3r4p8_a0a1a0a0d0c = descriptor.getUUID();
          result_v3r4p8_a0a0d0c.setAttribute("uuid", "" + result_v3r4p8_a0a1a0a0d0c);
        }
        if (descriptor.getGenPath() != null) {
          final String result_v3r4p8_a0a2a0a0d0c = macros.shrinkPath(descriptor.getGenPath(), file);
          result_v3r4p8_a0a0d0c.setAttribute("generatorOutputPath", "" + result_v3r4p8_a0a2a0a0d0c);
        }
        final boolean result_v3r4p8_a3a0a0d0c = descriptor.getEnableJavaStubs();
        result_v3r4p8_a0a0d0c.setAttribute("java-stubs-enabled", "" + result_v3r4p8_a3a0a0d0c);

        final Element result_v3r4p8_a5a0a0d0c = new Element("models");
        ModuleDescriptorPersistence.saveModelRoots(result_v3r4p8_a5a0a0d0c, descriptor.getModelRoots(), file, macros);
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a5a0a0d0c);

        final Element result_v3r4p8_a7a0a0d0c = new Element("accessoryModels");
        for (SModelReference model : ListSequence.fromList(descriptor.getAccessoryModels())) {
          final Element result_v3r4p8_a0a0a7a0a0d0c = new Element("model");
          final String result_v3r4p8_a0a0a0a7a0a0d0c = model.toString();
          result_v3r4p8_a0a0a7a0a0d0c.setAttribute("modelUID", "" + result_v3r4p8_a0a0a0a7a0a0d0c);
          result_v3r4p8_a7a0a0d0c.addContent(result_v3r4p8_a0a0a7a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a7a0a0d0c);

        final Element result_v3r4p8_a9a0a0d0c = new Element("generators");
        for (GeneratorDescriptor generatorDescriptor : ListSequence.fromList(descriptor.getGenerators())) {
          GeneratorDescriptorPersistence.saveGeneratorDescriptor(result_v3r4p8_a9a0a0d0c, generatorDescriptor, file, macros);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a9a0a0d0c);


        if (!(descriptor.getStubModelEntries().isEmpty())) {
          final Element result_v3r4p8_a0a21a0a0d0c = new Element("stubModelEntries");
          ModuleDescriptorPersistence.saveStubModelEntries(result_v3r4p8_a0a21a0a0d0c, descriptor.getStubModelEntries(), file, macros);
          result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a0a21a0a0d0c);
        }


        if (!(descriptor.getRuntimeStubModels().isEmpty())) {
          final Element result_v3r4p8_a0a51a0a0d0c = new Element("runtimeStubModels");
          for (StubModelsEntry entry : ListSequence.fromList(descriptor.getRuntimeStubModels())) {
            final Element result_v3r4p8_a0a0a0a51a0a0d0c = new Element("stubModelEntry");
            final String result_v3r4p8_a0a0a0a0a51a0a0d0c = macros.shrinkPath(entry.getPath(), file);
            result_v3r4p8_a0a0a0a51a0a0d0c.setAttribute("path", "" + result_v3r4p8_a0a0a0a0a51a0a0d0c);
            final boolean result_v3r4p8_a1a0a0a0a51a0a0d0c = entry.isIncludedInVCS();
            result_v3r4p8_a0a0a0a51a0a0d0c.setAttribute("include", "" + result_v3r4p8_a1a0a0a0a51a0a0d0c);
            final Element result_v3r4p8_a2a0a0a0a51a0a0d0c = new Element("manager");
            final String result_v3r4p8_a0a2a0a0a0a51a0a0d0c = entry.getManager().getModuleId();
            result_v3r4p8_a2a0a0a0a51a0a0d0c.setAttribute("moduleId", "" + result_v3r4p8_a0a2a0a0a0a51a0a0d0c);
            final String result_v3r4p8_a1a2a0a0a0a51a0a0d0c = entry.getManager().getClassName();
            result_v3r4p8_a2a0a0a0a51a0a0d0c.setAttribute("className", "" + result_v3r4p8_a1a2a0a0a0a51a0a0d0c);
            result_v3r4p8_a0a0a0a51a0a0d0c.addContent(result_v3r4p8_a2a0a0a0a51a0a0d0c);
            result_v3r4p8_a0a51a0a0d0c.addContent(result_v3r4p8_a0a0a0a51a0a0d0c);
          }
          result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a0a51a0a0d0c);
        }

        if (!(descriptor.getStubSolutions().isEmpty())) {
          final Element result_v3r4p8_a0a71a0a0d0c = new Element("stubSolutions");
          for (StubSolution entry : ListSequence.fromList(descriptor.getStubSolutions())) {
            final Element result_v3r4p8_a0a0a0a71a0a0d0c = new Element("stubSolution");
            final String result_v3r4p8_a0a0a0a0a71a0a0d0c = entry.getName();
            result_v3r4p8_a0a0a0a71a0a0d0c.setAttribute("moduleName", "" + result_v3r4p8_a0a0a0a0a71a0a0d0c);
            final String result_v3r4p8_a1a0a0a0a71a0a0d0c = entry.getId().toString();
            result_v3r4p8_a0a0a0a71a0a0d0c.setAttribute("moduleId", "" + result_v3r4p8_a1a0a0a0a71a0a0d0c);
            result_v3r4p8_a0a71a0a0d0c.addContent(result_v3r4p8_a0a0a0a71a0a0d0c);
          }
          result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a0a71a0a0d0c);
        }

        final Element result_v3r4p8_a91a0a0d0c = new Element("sourcePath");
        for (String p : ListSequence.fromList(descriptor.getSourcePaths())) {
          final Element result_v3r4p8_a0a0a91a0a0d0c = new Element("source");
          final String result_v3r4p8_a0a0a0a91a0a0d0c = macros.shrinkPath(p, file);
          result_v3r4p8_a0a0a91a0a0d0c.setAttribute("path", "" + result_v3r4p8_a0a0a0a91a0a0d0c);
          result_v3r4p8_a91a0a0d0c.addContent(result_v3r4p8_a0a0a91a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a91a0a0d0c);

        final boolean result_v3r4p8_a12a0a0d0c = descriptor.getCompileInMPS();
        result_v3r4p8_a0a0d0c.setAttribute("compileInMPS", "" + result_v3r4p8_a12a0a0d0c);
        final boolean result_v3r4p8_a22a0a0d0c = descriptor.isDoNotGenerateAdapters();
        result_v3r4p8_a0a0d0c.setAttribute("doNotGenerateAdapters", "" + result_v3r4p8_a22a0a0d0c);

        ModuleDescriptorPersistence.saveDependencies(result_v3r4p8_a0a0d0c, descriptor);

        final Element result_v3r4p8_a62a0a0d0c = new Element("extendedLanguages");
        for (ModuleReference ref : ListSequence.fromList(descriptor.getExtendedLanguages())) {
          final Element result_v3r4p8_a0a0a62a0a0d0c = new Element("extendedLanguage");
          final String result_v3r4p8_a0a0a0a62a0a0d0c = ref.toString();
          result_v3r4p8_a0a0a62a0a0d0c.setText(result_v3r4p8_a0a0a0a62a0a0d0c);
          result_v3r4p8_a62a0a0d0c.addContent(result_v3r4p8_a0a0a62a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a62a0a0d0c);
        return result_v3r4p8_a0a0d0c;
      }
    }.invoke();

    try {
      OutputStream os = file.openOutputStream();
      JDOMUtil.writeDocument(new Document(languageElement), os);
    } catch (Exception e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    ModuleDescriptorPersistence.setTimestamp(descriptor, file);
  }
}
