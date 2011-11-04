package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.view.UsagesView;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.INodeRepresentator;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.ide.findusages.model.CategoryKind;
import java.util.Collections;
import javax.swing.Icon;
import jetbrains.mps.ide.findusages.view.treeholder.tree.TextOptions;
import jetbrains.mps.ide.projectPane.Icons;
import org.jetbrains.annotations.NotNull;
import org.jdom.Element;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;

public class ReferencesView extends UsagesView {
  private DependenciesComponent myComponent;

  public ReferencesView(Project project, DependenciesComponent component) {
    super(project, new ViewOptions(false, false, false, false, false, false));
    setCustomNodeRepresentator(new ReferencesView.MyNodeRepresentator());
    myComponent = component;
  }

  public void close() {
    myComponent.close();
  }

  public class MyNodeRepresentator implements INodeRepresentator<SNode> {
    public MyNodeRepresentator() {
    }

    public List<CategoryKind> getCategoryKinds() {
      return Collections.emptyList();
    }

    public Icon getCategoryIcon(String string) {
      return null;
    }

    public String getCategoryText(TextOptions options, String string, boolean b) {
      return "References";
    }

    public Icon getResultsIcon() {
      return Icons.DEFAULT_ICON;
    }

    public String getResultsText(TextOptions options) {
      return "Usages of the right tree scope selection in the left tree scope selection";
    }

    @NotNull
    public String getPresentation(SNode node) {
      return node.getPresentation();
    }

    public void read(Element element, jetbrains.mps.project.Project project) throws CantLoadSomethingException {
    }

    public void write(Element element, jetbrains.mps.project.Project project) throws CantSaveSomethingException {
    }
  }
}
