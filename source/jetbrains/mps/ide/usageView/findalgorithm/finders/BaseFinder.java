package jetbrains.mps.ide.usageView.findalgorithm.finders;

import jetbrains.mps.components.IExternalizableComponent;
import jetbrains.mps.ide.usageView.model.result.SearchResults;
import jetbrains.mps.ide.usageView.model.searchquery.SearchQuery;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jdom.Element;

public abstract class BaseFinder implements IExternalizableComponent {
  public BaseFinder() {

  }

  public void read(Element element, MPSProject project) {

  }

  public void write(Element element, MPSProject project) {

  }

  public abstract String getDescription();

  public boolean isApplicable(SNode node) {
    return true;
  }

  public abstract SearchResults find(SearchQuery query);
}
