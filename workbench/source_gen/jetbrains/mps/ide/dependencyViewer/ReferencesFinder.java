package jetbrains.mps.ide.dependencyViewer;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SReference;
import java.util.HashMap;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ReferencesFinder {
  private Map<SModelDescriptor, List<SReference>> myModelsRefsCache = new HashMap<SModelDescriptor, List<SReference>>();

  public ReferencesFinder() {
  }

  public SearchResults getTargetSearchResults(List<SReference> references, ProgressMonitor monitor) {
    SearchResults results = new SearchResults();
    try {
      monitor.start("computing references' targets", ListSequence.fromList(references).count());
      for (SReference ref : references) {
        results.getSearchResults().add(new SearchResult(ref.getTargetNode(), "targets"));
        monitor.advance(1);
        if (monitor.isCanceled()) {
          return results;
        }
      }
    } finally {
      monitor.done();
    }
    return results;
  }

  public SearchResults getRefSearchResults(List<SReference> references, final Scope scope, ProgressMonitor monitor) {
    final SearchResults results = new SearchResults();
    try {
      monitor.start("filtering references", ListSequence.fromList(references).count());
      for (final SReference ref : references) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            if (scope.contains(ref.getTargetNode())) {
              results.getSearchResults().add(new SearchResult(ref.getSourceNode(), "references"));
            }
          }
        });
        if (monitor.isCanceled()) {
          return results;
        }
        monitor.advance(1);
      }
    } finally {
      monitor.done();
    }
    return results;
  }

  public List<SReference> getReferences(Scope scope, ProgressMonitor monitor) {
    List<SReference> result = ListSequence.fromList(new ArrayList<SReference>());
    try {
      monitor.start("searching references in " + scope.getPresentation(), scope.getNumRoots());
      for (SModelDescriptor element : scope.getModels()) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(getReferences(element, scope, monitor)));
        if (monitor.isCanceled()) {
          return result;
        }
      }
      for (IModule element : scope.getModules()) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(getReferences(element, scope, monitor)));
        if (monitor.isCanceled()) {
          return result;
        }
      }
      for (SNode root : scope.getRoots()) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(getReferences(root, scope)));
        if (monitor.isCanceled()) {
          return result;
        }
      }
    } finally {
      monitor.done();
    }
    return result;
  }

  private List<SReference> getReferences(IModule module, Scope scope, ProgressMonitor monitor) {
    List<SReference> result = ListSequence.fromList(new ArrayList<SReference>());
    for (SModelDescriptor element : module.getOwnModelDescriptors()) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(getReferences(element, scope, monitor)));
      if (monitor.isCanceled()) {
        return result;
      }
    }
    return result;
  }

  private List<SReference> getReferences(SModelDescriptor model, Scope scope, ProgressMonitor monitor) {
    List<SReference> result = myModelsRefsCache.get(model);
    monitor.step(model.getLongName());
    if (result != null) {
      return result;
    }
    result = ListSequence.fromList(new ArrayList<SReference>());
    for (SNode root : model.getSModel().roots()) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(getReferences(root, scope)));
      monitor.advance(1);
      if (monitor.isCanceled()) {
        return result;
      }
    }
    myModelsRefsCache.put(model, result);
    return result;
  }

  private List<SReference> getReferences(final SNode root, final Scope scope) {
    final List<SReference> result = ListSequence.fromList(new ArrayList<SReference>());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (SNode node : SNodeOperations.getDescendants(root, null, true, new String[]{})) {
          for (SReference ref : SNodeOperations.getReferences(node)) {
            SNode targetNode = ref.getTargetNode();
            boolean contains = scope.contains(targetNode);
            if (!(contains)) {
              ListSequence.fromList(result).addElement(ref);
            }
          }
        }
      }
    });
    return result;
  }
}
