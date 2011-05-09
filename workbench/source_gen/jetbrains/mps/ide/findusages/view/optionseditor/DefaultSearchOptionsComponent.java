package jetbrains.mps.ide.findusages.view.optionseditor;

/*Generated by MPS */

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.PersistentStateComponent;
import jetbrains.mps.ide.make.StartupModuleMaker;
import org.jdom.Element;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.findusages.view.optionseditor.options.FindersOptions;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ViewOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

@State(name = "DefaultSearchOptionsComponent", storages = {@Storage(id = "other", file = "$WORKSPACE_FILE$")
})
public class DefaultSearchOptionsComponent implements ProjectComponent, PersistentStateComponent<Element> {
  private static final String DEFAULT_SEARCH_OPTIONS = "default_search_options";

  private FindUsagesOptions myDefaultSearchOptions = createDefaultOptions();
  private Project myProject;

  public DefaultSearchOptionsComponent(Project project, StartupModuleMaker maker) {
    myProject = project;
  }

  private FindUsagesOptions createDefaultOptions() {
    final FindUsagesOptions result = new FindUsagesOptions();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        FindersOptions findersOptions = new FindersOptions(((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c8959028e(jetbrains.mps.lang.structure.findUsages)", "1197636141662"), "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), "call_getGeneratedClassLongName_1213877240120", new Class[]{SNode.class})), ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c8959028e(jetbrains.mps.lang.structure.findUsages)", "1197632773078"), "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), "call_getGeneratedClassLongName_1213877240120", new Class[]{SNode.class})));
        result.setOption(findersOptions);
      }
    });
    ViewOptions viewOptions = new ViewOptions(true, false);
    result.setOption(viewOptions);
    ScopeOptions scopeOptions = new ScopeOptions(ScopeOptions.PROJECT_SCOPE, ScopeOptions.DEFAULT_VALUE, ScopeOptions.DEFAULT_VALUE);
    result.setOption(scopeOptions);
    return result;
  }

  public FindUsagesOptions getDefaultSearchOptions() {
    return myDefaultSearchOptions;
  }

  public void setDefaultSearchOptions(FindUsagesOptions defaultSearchOptions) {
    myDefaultSearchOptions = defaultSearchOptions;
  }

  public Element getState() {
    Element defaultFindOptionsXML = new Element(DEFAULT_SEARCH_OPTIONS);
    try {
      myDefaultSearchOptions.write(defaultFindOptionsXML, myProject);
    } catch (CantSaveSomethingException e) {
      throw new RuntimeException("this exception shouldn't be thrown");
    }
    return defaultFindOptionsXML;
  }

  public void loadState(Element state) {
    try {
      myDefaultSearchOptions.read(state, myProject);
    } catch (CantLoadSomethingException e) {
      myDefaultSearchOptions = new FindUsagesOptions(new FindersOptions(), new ScopeOptions(), new ViewOptions());
    }
  }

  public void projectOpened() {
  }

  public void projectClosed() {
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return DefaultSearchOptionsComponent.class.getSimpleName();
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }
}
