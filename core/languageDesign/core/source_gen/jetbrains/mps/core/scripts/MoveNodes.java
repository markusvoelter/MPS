package jetbrains.mps.core.scripts;

/*Generated by MPS */

import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.TreeBuilder;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.refactoring.framework.*;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

import java.util.*;

public class MoveNodes extends AbstractLoggableRefactoring {
  public static final String target = "target";
  public static final String role = "role";

  private Set<String> myTransientParameters = new HashSet<String>();

  public MoveNodes() {
    this.myTransientParameters.add("target");
    this.myTransientParameters.add("role");
  }

  public static String getKeyStroke_static() {
    return " F6";
  }

  public static Class getClass_static() {
    return MoveNodes.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration) SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.core.structure.BaseConcept")) {
      return true;
    } else {
      return false;
    }
  }


  public String getUserFriendlyName() {
    return "Move Nodes";
  }

  public Set<String> getTransientParameters() {
    return new HashSet<String>(this.myTransientParameters);
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.core.structure.BaseConcept";
  }

  public Class getOverridenRefactoringClass() {
    return null;
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    if (actionContext.getNodes().isEmpty()) {
      return false;
    }
    if (((Object) refactoringContext.getParameter("target")) instanceof SNode) {
      SNode targetNode = ((SNode) ((Object) refactoringContext.getParameter("target")));
      SNode concept = SNodeOperations.getConceptDeclaration(targetNode);
      ConceptAndSuperConceptsScope superConceptsScope = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration) SNodeOperations.getAdapter(concept)));
      List<LinkDeclaration> linkDeclarations = superConceptsScope.getLinkDeclarationsExcludingOverridden();
      Iterable<SNode> childLinkDeclarations = ListSequence.fromList(linkDeclarations).where(new IWhereFilter<LinkDeclaration>() {

        public boolean accept(LinkDeclaration it) {
          return SPropertyOperations.hasValue(((SNode) it.getNode()), "metaClass", "aggregation", "reference");
        }

      }).select(new ISelector<LinkDeclaration, SNode>() {

        public SNode select(LinkDeclaration it) {
          return (SNode) it.getNode();
        }

      });
      Iterable<String> childLinksRoles = Sequence.fromIterable(childLinkDeclarations).select(new ISelector<SNode, String>() {

        public String select(SNode it) {
          return SModelUtil_new.getGenuineLinkRole(((LinkDeclaration) SNodeOperations.getAdapter(it)));
        }

      });
      for (SNode node : actionContext.getNodes()) {
        String childRole = node.getRole_();
        if (!(Sequence.fromIterable(childLinksRoles).contains(childRole))) {
          return false;
        }
        for (SNode linkDeclaration : childLinkDeclarations) {
          if (SPropertyOperations.getString(linkDeclaration, "role").equals(childRole)) {
            if (!(SConceptOperations.isSuperConceptOf(SLinkOperations.getTarget(linkDeclaration, "target", false), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(node))))) {
              return false;
            }
          }
        }
      }
      return true;
    }
    if (((Object) refactoringContext.getParameter("target")) instanceof SModelDescriptor) {
      for (SNode node : actionContext.getNodes()) {
        if (!(SPropertyOperations.getBoolean(SNodeOperations.getConceptDeclaration(node), "rootable"))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public boolean isApplicableToModel(SModelDescriptor modelDescriptor) {
    return true;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return false;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SearchQuery searchQuery = new SearchQuery(actionContext.getNode(), GlobalScope.getInstance());
      NodeAndDescendantsUsages_Finder finder = new NodeAndDescendantsUsages_Finder();
      IResultProvider resultProvider = TreeBuilder.forFinder(finder);
      SearchResults searchResults = resultProvider.getResults(searchQuery, actionContext.createProgressIndicator());
      return searchResults;
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>) actionContext.getNodes();
      SModel targetModel = null;
      List<SNode> movedNodes = null;
      if (((Object) refactoringContext.getParameter("target")) instanceof SModelDescriptor) {
        targetModel = ((SModelDescriptor) ((Object) refactoringContext.getParameter("target"))).getSModel();
        movedNodes = refactoringContext.moveNodesToModel(nodes, targetModel);
      }
      if (((Object) refactoringContext.getParameter("target")) instanceof SNode) {
        movedNodes = refactoringContext.moveNodesToNode(nodes, ListSequence.fromList(nodes).getElement(0).getRole_(), (SNode) ((Object) refactoringContext.getParameter("target")));
        targetModel = ((SNode) ((Object) refactoringContext.getParameter("target"))).getModel();
      }
      if (targetModel != null) {
        IModule module = targetModel.getModelDescriptor().getModule();
        final IOperationContext operationContext = new ModuleContext(module, actionContext.getOperationContext().getMPSProject());
        if (operationContext != null) {
          final List<SNode> movedNodes1 = movedNodes;
          ApplicationManager.getApplication().invokeLater(new Runnable() {

            public void run() {
              // we can't open node outside of EDT
              operationContext.getComponent(MPSEditorOpener.class).openNode(ListSequence.fromList(movedNodes1).first());
            }

          });
        }
      }
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new HashMap<IModule, List<SModel>>();
  }

  public List<SModel> getModelsToUpdate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new ArrayList<SModel>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public IChooseComponent<Object> target_componentCreator(ActionContext actionContext) {
    return new ChooseNodeOrModelComponent("choose target", actionContext, null, true, true);
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      boolean result = false;
      List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      {
        IChooseComponent<Object> chooseComponent;
        chooseComponent = this.target_componentCreator(actionContext);
        chooseComponent.setPropertyName("target");
        components.add(chooseComponent);
      }
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }

}
