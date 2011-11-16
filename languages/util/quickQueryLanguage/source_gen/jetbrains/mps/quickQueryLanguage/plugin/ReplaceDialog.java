package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import jetbrains.mps.ide.findusages.view.optionseditor.components.ScopeEditor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.kernel.model.TemporaryModelOwner;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.compiler.IClassesData;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.List;
import jetbrains.mps.smodel.BootstrapLanguages;
import java.awt.Dimension;
import javax.swing.JComponent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.kernel.model.SModelUtil;
import java.util.Collections;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.Project;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.holders.NodeHolder;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;

public class ReplaceDialog extends BaseDialog {
  private EmbeddableEditor myEditor;
  private ScopeEditor myScope;
  private IOperationContext myContext;
  private SNode myNode;
  private JPanel myPanel = new JPanel(new BorderLayout());
  private TemporaryModelOwner myModelOwner = new TemporaryModelOwner();

  public ReplaceDialog(final IOperationContext context, final Language language) {
    super(ProjectHelper.toMainFrame(context.getProject()), "Modify Instances by condition");
    this.myContext = context;
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        ReplaceDialog.this.myNode = SConceptOperations.createNewNode("jetbrains.mps.quickQueryLanguage.structure.ReplaceModelQuery", null);
        ReplaceDialog.this.myEditor = new EmbeddableEditor(context, myModelOwner, myNode) {
          @Override
          protected void processClassesData(IClassesData cd) {
            doProcessClassesData(cd);
          }
        };
        ReplaceDialog.this.myScope = new ScopeEditor(new ScopeOptions());
        ReplaceDialog.this.myPanel.add(ReplaceDialog.this.myScope.getComponent(), BorderLayout.SOUTH);
      }
    });
    this.myEditor.addLanguageStructureModel(language);
    final Wrappers._T<List<Language>> languageList = new Wrappers._T<List<Language>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        languageList.value = language.getAllExtendedLanguages();
      }
    });
    for (Language extendedLanguage : languageList.value) {
      this.myEditor.addLanguageStructureModel(extendedLanguage);
    }
    this.myEditor.addLanguageStructureModel(BootstrapLanguages.collectionsLanguage());
    this.myPanel.add(this.myEditor.getComponenet(), BorderLayout.CENTER);
    this.setSize(new Dimension(500, 500));
    this.setModal(false);
  }

  protected JComponent getMainComponent() {
    return this.myPanel;
  }

  public void setConceptDeclaration(final SNode declaration) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SLinkOperations.setTarget(ReplaceDialog.this.myNode, "conceptDeclaration", SNodeOperations.cast(declaration, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), false);
      }
    });
  }

  @BaseDialog.Button(position = 0, name = "Modify", mnemonic = 'M', defaultButton = true)
  public void buttonReplace() {
    final Wrappers._T<Language> language = new Wrappers._T<Language>();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        language.value = SModelUtil.getDeclaringLanguage(SNodeOperations.getConceptDeclaration(ReplaceDialog.this.myNode));
      }
    });
    // <node> 
    myEditor.make(Collections.singleton(language.value.getClassPathItem()));
  }

  private void doProcessClassesData(IClassesData cd) {
    if (cd == null) {
      return;
    }
    final Wrappers._T<SModel> model = new Wrappers._T<SModel>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        model.value = SNodeOperations.getModel(myNode);
      }
    });

    String fqName = model.value.getModelDescriptor().getLongName() + "." + QueryExecutor.GENERATED_QUERY_NAME;
    ClassLoader loader = cd.getClassLoader(QueryExecutor.class.getClassLoader());
    final Wrappers._T<Query> query = new Wrappers._T<Query>(null);
    try {
      query.value = (Query) Class.forName(fqName, true, loader).newInstance();
    } catch (ClassNotFoundException ignore) {
    } catch (IllegalAccessException ignore) {

    } catch (InstantiationException ignore) {
    }
    if (query.value == null) {
      return;
    }
    final IScope scope = this.myScope.getOptions().getScope(this.myContext, model.value.getModelDescriptor());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ReplaceDialog.this.execute(ReplaceDialog.this.myContext.getProject(), query.value, SNodeOperations.cast(myNode, "jetbrains.mps.quickQueryLanguage.structure.BaseQuery"), scope);
      }
    });
    this.dispose();
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C', defaultButton = false)
  public void buttonCancel() {
    this.dispose();
  }

  public void execute(Project project, Query query, final SNode queryNode, final IScope scope) {
    final Wrappers._T<SearchQuery> searchQuery = new Wrappers._T<SearchQuery>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (SLinkOperations.getTarget(queryNode, "conceptDeclaration", false) != null) {
          searchQuery.value = new SearchQuery(new NodeHolder(SLinkOperations.getTarget(queryNode, "conceptDeclaration", false)), scope);
        } else {
          searchQuery.value = new SearchQuery(scope);
        }
      }
    });
    ProjectHelper.toIdeaProject(project).getComponent(ProjectPluginManager.class).getTool(RunReplacement_Tool.class).addTab(searchQuery.value, query);
  }

  @Override
  public void dispose() {
    super.dispose();
    ModelAccess.instance().runWriteInEDT(new Runnable() {
      public void run() {
        myEditor.disposeEditor();
        myModelOwner.unregisterModelOwner();
      }
    });
  }
}
