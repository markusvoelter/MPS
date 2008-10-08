package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.scripts.MoveNodes;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.HierarchicalChooseNodeComponent;
import jetbrains.mps.refactoring.framework.ConceptAncestorsProvider;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class MoveLinkUp extends AbstractLoggableRefactoring {
  public static final String targetConcept = "targetConcept";

  private Set<String> myTransientParameters = new HashSet<String>();

  public MoveLinkUp() {
    this.myTransientParameters.add("targetConcept");
  }

  public String getUserFriendlyName() {
    return "Move Link Up";
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
    return "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.getClass_static();
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    {
      SNode node = refactoringContext.getSelectedNode();
      if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration"))) {
        return false;
      }
      SNode concept = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
      if (concept == null) {
        return false;
      }
      return ((SNode)refactoringContext.getParameter("targetConcept")) != concept && SConceptOperations.isSuperConceptOf(((SNode)refactoringContext.getParameter("targetConcept")), NameUtil.nodeFQName(concept));
    }
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

  public SearchResults getAffectedNodes(RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(RefactoringContext refactoringContext) {
    {
      SNode linkDeclaration = (SNode)refactoringContext.getSelectedNode();
      refactoringContext.moveNodeToNode(linkDeclaration, linkDeclaration.getRole_(), ((SNode)refactoringContext.getParameter("targetConcept")));
      refactoringContext.changeFeatureName(linkDeclaration, SNodeOperations.getModel(((SNode)refactoringContext.getParameter("targetConcept"))) + "." + SPropertyOperations.getString(((SNode)refactoringContext.getParameter("targetConcept")), "name"), SPropertyOperations.getString(linkDeclaration, "role"));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      SModel model = refactoringContext.getSelectedNode().getModel();
      SModel targetModel = SNodeOperations.getModel(((SNode)refactoringContext.getParameter("targetConcept")));
      Language language = Language.getLanguageFor(model.getModelDescriptor());
      Language targetLanguage = Language.getLanguageFor(targetModel.getModelDescriptor());
      if (language != null) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(language.getAspectModelDescriptors()))).select(new ISelector <SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }

        }).toListSequence();
        result.put(language, aspectList);
      }
      if (targetLanguage != null && targetLanguage != language) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(targetLanguage.getAspectModelDescriptors()))).select(new ISelector <SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }

        }).toListSequence();
        result.put(targetLanguage, aspectList);
      }
      return result;
    }
  }

  public List<SModel> getModelsToUpdate(RefactoringContext refactoringContext) {
    return new ArrayList<SModel>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public List<SNode> getNodesToOpen(RefactoringContext refactoringContext) {
    return new ArrayList<SNode>();
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public IChooseComponent<SNode> targetConcept_componentCreator(RefactoringContext refactoringContext) {
    SNode node = refactoringContext.getSelectedNode();
    SNode abstractConceptDeclaration = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
    return new HierarchicalChooseNodeComponent(refactoringContext.getCurrentOperationContext(), new ConceptAncestorsProvider(), abstractConceptDeclaration);
  }

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      boolean result = false;
      final List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          {
            IChooseComponent<SNode> chooseComponent;
            chooseComponent = MoveLinkUp.this.targetConcept_componentCreator(refactoringContext);
            chooseComponent.setPropertyName("targetConcept");
            chooseComponent.setCaption("chooseTargetConcept");
            chooseComponent.initComponent();
            components.add(chooseComponent);
          }
        }

      });
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }


  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return MoveLinkUp.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration")) {
      return true;
    } else
    {
      return MoveNodes.isApplicableWRTConcept_static(node);
    }
  }

}
