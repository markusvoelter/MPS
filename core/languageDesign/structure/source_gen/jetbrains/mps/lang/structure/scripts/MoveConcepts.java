package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.scripts.MoveNodes;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.Language;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.behavior.structure.ConceptBehavior;
import jetbrains.mps.lang.constraints.structure.ConceptConstraints;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseModelDescriptorComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.util.Condition;

public class MoveConcepts extends AbstractLoggableRefactoring {
  public static final String targetModel = "targetModel";
  public static final String sourceModel = "sourceModel";

  private Set<String> myTransientParameters = new HashSet<String>();

  public MoveConcepts() {
    this.myTransientParameters.add("targetModel");
    this.myTransientParameters.add("sourceModel");
  }

  public String getUserFriendlyName() {
    return "Move Concepts";
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
    return "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.getClass_static();
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = refactoringContext.getSelectedNodes();
      if (ListSequence.fromList(nodes).isEmpty()) {
        return false;
      }
      for(SNode node : nodes) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
          return false;
        }
      }
      return true;
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
    return FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>)refactoringContext.getSelectedNodes();
      SModel model = refactoringContext.getSelectedNode().getModel();
      refactoringContext.setParameter("sourceModel", model.getModelDescriptor());
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
      List<SNode> editors = new ArrayList<SNode>();
      List<SNode> behaviors = new ArrayList<SNode>();
      List<SNode> constraints = new ArrayList<SNode>();
      // collecting editors:
      SModelDescriptor editorModelDescriptor = sourceLanguage.getEditorModelDescriptor();
      if (editorModelDescriptor != null) {
        for(SNode node : nodes) {
          if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) {
            ConceptEditorDeclaration conceptEditorDeclaration = SModelUtil_new.findEditorDeclaration(editorModelDescriptor.getSModel(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(node)));
            if (conceptEditorDeclaration != null) {
              SNode editor = (SNode)conceptEditorDeclaration.getNode();
              ListSequence.fromList(editors).addElement(editor);
            }
          }
        }
      }
      // collecting behaviors:
      SModelDescriptor behaviorModelDescriptor = sourceLanguage.getBehaviorModelDescriptor();
      if (behaviorModelDescriptor != null) {
        for(SNode node : nodes) {
          ConceptBehavior conceptBehavior = SModelUtil_new.findBehaviorDeclaration(behaviorModelDescriptor.getSModel(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(node)));
          if (conceptBehavior != null) {
            SNode behavior = (SNode)conceptBehavior.getNode();
            ListSequence.fromList(behaviors).addElement(behavior);
          }
        }
      }
      // collecting constraints:
      SModelDescriptor constraintsModelDescriptor = sourceLanguage.getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        for(SNode node : nodes) {
          ConceptConstraints conceptConstraints = SModelUtil_new.findConstraintsDeclaration(constraintsModelDescriptor.getSModel(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(node)));
          if (conceptConstraints != null) {
            SNode conceptConstraintsNodes = (SNode)conceptConstraints.getNode();
            ListSequence.fromList(constraints).addElement(conceptConstraintsNodes);
          }
        }
      }
      // refactoring itself
      refactoringContext.moveNodesToModel(nodes, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModel());
      for(SNode node : nodes) {
        refactoringContext.changeFeatureName(node, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModelFqName().toString() + "." + SPropertyOperations.getString(node, "name"), SPropertyOperations.getString(node, "name"));
      }
      if (ListSequence.fromList(editors).isNotEmpty()) {
        SModelDescriptor targetEditorModelDescriptor = targetLanguage.getEditorModelDescriptor();
        if (targetEditorModelDescriptor == null) {
          targetEditorModelDescriptor = LanguageAspect.EDITOR.createNew(targetLanguage);
        }
        SModel editorModel = targetEditorModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(editors, editorModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(editorModel);
      }
      if (ListSequence.fromList(behaviors).isNotEmpty()) {
        SModelDescriptor targetBehaviorModelDescriptor = targetLanguage.getBehaviorModelDescriptor();
        if (targetBehaviorModelDescriptor == null) {
          targetBehaviorModelDescriptor = LanguageAspect.BEHAVIOR.createNew(targetLanguage);
        }
        SModel behaviorModel = targetBehaviorModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(behaviors, behaviorModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(behaviorModel);
      }
      if (ListSequence.fromList(constraints).isNotEmpty()) {
        SModelDescriptor targetConstraintsModelDescriptor = targetLanguage.getConstraintsModelDescriptor();
        if (targetConstraintsModelDescriptor == null) {
          targetConstraintsModelDescriptor = LanguageAspect.CONSTRAINTS.createNew(targetLanguage);
        }
        SModel constraintsModel = targetConstraintsModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(constraints, constraintsModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(constraintsModel);
      }
      // todo: move other concept-related aspect stuff
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
      if (sourceLanguage != null) {
        List<SModel> aspectList = ListSequence.fromList(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(sourceLanguage.getAspectModelDescriptors()))).select(new ISelector <SModelDescriptor, SModel>() {

          public SModel select(SModelDescriptor it) {
            return it.getSModel();
          }

        }).toListSequence();
        result.put(sourceLanguage, aspectList);
      }
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
      if (targetLanguage != null) {
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

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      boolean result = false;
      final List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          {
            IChooseComponent<SModelDescriptor> chooseComponent;
            chooseComponent = new ChooseModelDescriptorComponent(refactoringContext.getCurrentOperationContext());
            chooseComponent.setCondition(new MoveConcepts.My_targetModel_Condition(refactoringContext));
            chooseComponent.setPropertyName("targetModel");
            chooseComponent.setCaption("choose target model");
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
    return MoveConcepts.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      return true;
    } else
    {
      return MoveNodes.isApplicableWRTConcept_static(node);
    }
  }

  public static class My_targetModel_Condition implements Condition<SModelDescriptor> {

    private RefactoringContext myRefactoringContext;

    public My_targetModel_Condition(RefactoringContext refactoringContext) {
      this.myRefactoringContext = refactoringContext;
    }

    public boolean met(SModelDescriptor argument) {
      return this.met_internal(argument, this.myRefactoringContext);
    }

    public boolean met_internal(SModelDescriptor argument, RefactoringContext refactoringContext) {
      return Language.getModelAspect(argument) == LanguageAspect.STRUCTURE;
    }

}

}
