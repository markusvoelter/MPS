package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.core.scripts.MoveNodes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.HashMap;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseModelDescriptorComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;
import jetbrains.mps.util.Condition;
import jetbrains.mps.smodel.LanguageAspect;

public class MoveConcepts extends AbstractLoggableRefactoring {
  public static final String targetModel = "targetModel";
  public static final String sourceModel = "sourceModel";

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return MoveConcepts.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if(SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration")) {
      return true;
    } else
    {
      return MoveNodes.isApplicableWRTConcept_static(node);
    }
  }


  public String getUserFriendlyName() {
    return "Move Concepts";
  }

  public String getSourceId() {
    return "jetbrains.mps.bootstrap.structureLanguage.scripts#1198173570106";
  }

  public String getKeyStroke() {
    return MoveConcepts.getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return MoveConcepts.isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.getClass_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = actionContext.getNodes();
      if(SequenceOperations.isEmpty(nodes)) {
        return false;
      }
      for(SNode node : nodes) {
        if(!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration"))) {
          return false;
        }
      }
      return true;
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = (List<SNode>)actionContext.getNodes();
      SModel model = actionContext.getNode().getModel();
      refactoringContext.setParameter("sourceModel", model.getModelDescriptor());
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
      List<SNode> editors = new ArrayList<SNode>();
      List<SNode> behaviors = new ArrayList<SNode>();
      // collecting editors:
      SModelDescriptor editorModelDescriptor = sourceLanguage.getEditorModelDescriptor();
      if(editorModelDescriptor != null) {
        for(SNode node : nodes) {
          if(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration")) {
            SNode editor = (SNode)SModelUtil_new.findEditorDeclaration(editorModelDescriptor.getSModel(), ((ConceptDeclaration)SNodeOperations.getAdapter(node))).getNode();
            if((editor != null)) {
              ListOperations.addElement(editors, editor);
            }
          }
        }
      }
      // collecting behaviors:
      SModelDescriptor constraintsModelDescriptor = sourceLanguage.getConstraintsModelDescriptor();
      if(constraintsModelDescriptor != null) {
        for(SNode node : nodes) {
          SNode behavior = (SNode)SModelUtil_new.findBehaviorDeclaration(constraintsModelDescriptor.getSModel(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(node))).getNode();
          if((behavior != null)) {
            ListOperations.addElement(behaviors, behavior);
          }
        }
      }
      // refactoring itself
      refactoringContext.moveNodesToModel(nodes, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModel());
      for(SNode node : nodes) {
        refactoringContext.changeFeatureName(node, ((SModelDescriptor)refactoringContext.getParameter("targetModel")) + "." + SPropertyOperations.getString(node, "name"), SPropertyOperations.getString(node, "name"));
      }
      if(!(SequenceOperations.isEmpty(editors))) {
        SModelDescriptor targetEditorModelDescriptor = targetLanguage.getEditorModelDescriptor();
        if(targetEditorModelDescriptor == null) {
          targetEditorModelDescriptor = targetLanguage.createLanguageEditorModel();
        }
        SModel editorModel = targetEditorModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(editors, editorModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(editorModel);
      }
      if(!(SequenceOperations.isEmpty(behaviors))) {
        SModelDescriptor targetConstraintsModelDescriptor = targetLanguage.getConstraintsModelDescriptor();
        if(targetConstraintsModelDescriptor == null) {
          targetConstraintsModelDescriptor = targetLanguage.createLanguageBehaviorModel();
        }
        SModel constraintsModel = targetConstraintsModelDescriptor.getSModel();
        refactoringContext.moveNodesToModel(behaviors, constraintsModel);
        refactoringContext.computeCaches();
        refactoringContext.updateModelWithMaps(constraintsModel);
      }
      // todo: move other concept-related aspect stuff
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
      if(sourceLanguage != null) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(sourceLanguage.getAspectModelDescriptors())), new zSelector1(null, null)));
        result.put(sourceLanguage, aspectList);
      }
      Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
      if(targetLanguage != null) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(targetLanguage.getAspectModelDescriptors())), new zSelector2(null, null)));
        result.put(targetLanguage, aspectList);
      }
      return result;
    }
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    boolean result = false;
    List<IChooseComponent> components = new ArrayList<IChooseComponent>();
    {
      IChooseComponent<SModelDescriptor> chooseComponent;
      chooseComponent = new ChooseModelDescriptorComponent("choose target model", "targetModel", actionContext);
      chooseComponent.setCondition(new MoveConcepts.My_targetModel_Condition(actionContext));
      components.add(chooseComponent);
    }
    ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
    dialog.showDialog();
    result = dialog.getResult();
    return result;
  }

  public static class My_targetModel_Condition implements Condition<SModelDescriptor> {

    private ActionContext myActionContext;

    public  My_targetModel_Condition(ActionContext actionContext) {
      this.myActionContext = actionContext;
    }

    public boolean met(SModelDescriptor argument) {
      return this.met_internal(argument, this.myActionContext);
    }

    public boolean met_internal(SModelDescriptor argument, ActionContext actionContext) {
      return Language.getModelAspect(argument) == LanguageAspect.STRUCTURE;
    }

}

}
