package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ModelCheckerUtils {
  public static List<SModelDescriptor> getModelDescriptors(SModelDescriptor modelDescriptor) {
    List<SModelDescriptor> modelDescrpitors = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    ListSequence.fromList(modelDescrpitors).addElement(modelDescriptor);
    return modelDescrpitors;
  }

  public static List<SModelDescriptor> getModelDescriptors(IModule module) {
    List<SModelDescriptor> modelDescrpitors = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    for (SModelDescriptor modelDescriptor : ListSequence.fromList(module.getOwnModelDescriptors())) {
      if (SModelStereotype.isUserModel(modelDescriptor)) {
        ListSequence.fromList(modelDescrpitors).addElement(modelDescriptor);
      }
      if (ModelCheckerSettings.getInstance().isCheckStubs() && SModelStereotype.isStubModelStereotype(modelDescriptor.getStereotype())) {
        ListSequence.fromList(modelDescrpitors).addElement(modelDescriptor);
      }
    }
    if (module instanceof Language) {
      Language language = (Language) module;
      for (Generator generator : ListSequence.fromList(language.getGenerators())) {
        ListSequence.fromList(modelDescrpitors).addSequence(ListSequence.fromList(getModelDescriptors(generator)));
      }
    }
    return modelDescrpitors;
  }

  public static List<SModelDescriptor> getModelDescriptors(List<IModule> modules) {
    List<SModelDescriptor> modelDescrpitors = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    for (IModule module : ListSequence.fromList(modules)) {
      ListSequence.fromList(modelDescrpitors).addSequence(ListSequence.fromList(getModelDescriptors(module)));
    }
    return modelDescrpitors;
  }

  public static List<SModelDescriptor> getModelDescriptors(MPSProject mpsProject) {
    return getModelDescriptors(mpsProject.getModules());
  }

  public static int getIssueCountForSeverity(SearchResults<ModelCheckerIssue> issues, String severity) {
    if (severity == null) {
      return 0;
    }
    int issueCount = 0;
    for (SearchResult<ModelCheckerIssue> issue : ListSequence.fromList(issues.getSearchResults())) {
      if (severity.equals(issue.getCategories().get(0).o2)) {
        issueCount++;
      }
    }
    return issueCount;
  }

  public static boolean isDeclaredLink(SNode linkDeclaration, boolean child) {
    return ((linkDeclaration != null) && child ?
      SPropertyOperations.hasValue(linkDeclaration, "metaClass", "aggregation", "reference") :
      SPropertyOperations.hasValue(linkDeclaration, "metaClass", "reference", "reference")
    );
  }
}
