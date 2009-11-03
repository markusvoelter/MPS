package jetbrains.mpslite.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModel;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.List;
import jetbrains.mpslite.behavior.ConceptContainer_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mpslite.behavior.IMPSLiteConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mpslite.behavior.AbstractConceptReference_Behavior;
import jetbrains.mpslite.behavior.GenerationUtils;
import jetbrains.mpslite.behavior.VariableConcept_Behavior;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelRepository;

public class QueriesGenerated {
  public static void mappingScript_CodeBlock_1238589718396(final IOperationContext operationContext, final MappingScriptContext _context) {
    Language language = Language.getLanguageFor(_context.getOriginalInputModel().getModelDescriptor());
    if (language == null) {
      return;
    }
    SModel structureModel = language.getStructureModelDescriptor().getSModel();
    Map<SNode, SNode> conceptsToTargets = MapSequence.fromMap(new HashMap<SNode, SNode>());
    Map<SNode, SNode> additionalConceptsToTargets = MapSequence.fromMap(new HashMap<SNode, SNode>());
    Map<SNode, SNode> partsToLinkDeclarations = MapSequence.fromMap(new HashMap<SNode, SNode>());
    SNode conceptContainer = ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), "jetbrains.mpslite.structure.ConceptContainer")).first();
    List<SNode> allConcepts = ConceptContainer_Behavior.call_getAllConcepts_1239801518275(conceptContainer);
    for (SNode conceptDeclaration : allConcepts) {
      SNode concept = SConceptOperations.createNewNode("jetbrains.mps.lang.structure.structure.ConceptDeclaration", null);
      SPropertyOperations.set(concept, "name", SPropertyOperations.getString(conceptDeclaration, "name"));
      SPropertyOperations.set(concept, "rootable", "" + IMPSLiteConcept_Behavior.call_isRootable_1239714833738(conceptDeclaration));
      if (IMPSLiteConcept_Behavior.call_isAbstract_1239715026284(conceptDeclaration)) {
        SNode booleanConceptProperty = SLinkOperations.addNewChild(concept, "conceptProperty", "jetbrains.mps.lang.structure.structure.BooleanConceptProperty");
        SNode conceptProperty_Abstract = SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), "conceptPropertyDeclaration", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return "abstract".equals(SPropertyOperations.getString(it, "name"));
          }
        }).first(), "jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration");
        SLinkOperations.setTarget(booleanConceptProperty, "conceptPropertyDeclaration", conceptProperty_Abstract, false);
      }
      MapSequence.fromMap(conceptsToTargets).put(conceptDeclaration, concept);
    }
    // additional concepts 
    for (SNode conceptDeclaration : allConcepts) {
      SNode concept = IMPSLiteConcept_Behavior.call_createAdditionalConcept_1239817368042(conceptDeclaration, conceptsToTargets, partsToLinkDeclarations);
      if (concept != null) {
        MapSequence.fromMap(additionalConceptsToTargets).put(conceptDeclaration, concept);
      }
    }
    // extends 
    for (SNode conceptDeclaration : allConcepts) {
      SLinkOperations.setTarget(((SNode)MapSequence.fromMap(conceptsToTargets).get(conceptDeclaration)), "extends", ((SNode)AbstractConceptReference_Behavior.call_getConcept_1238594571574(SLinkOperations.getTarget(conceptDeclaration, "extends", true), conceptsToTargets)), false);
    }
    // inner concept structure 
    for (SNode conceptDeclaration : allConcepts) {
      IMPSLiteConcept_Behavior.call_fillConcept_1239891562930(conceptDeclaration, ((SNode)MapSequence.fromMap(conceptsToTargets).get(conceptDeclaration)), conceptsToTargets, partsToLinkDeclarations);
    }
    // editor 
    SModel editorModel = language.getEditorModelDescriptor().getSModel();
    SModel actionsModel = language.getActionsModelDescriptor().getSModel();
    Map<SNode, SNode> conceptsToEditors = MapSequence.fromMap(new HashMap<SNode, SNode>());
    for (SNode conceptDeclaration : allConcepts) {
      SNode editor = IMPSLiteConcept_Behavior.call_createEditor_1239890004879(conceptDeclaration, conceptsToTargets, partsToLinkDeclarations);
      if (editor == null) {
        continue;
      }
      SNode mpsConcept = MapSequence.fromMap(conceptsToTargets).get(conceptDeclaration);
      SLinkOperations.setTarget(editor, "conceptDeclaration", mpsConcept, false);
      MapSequence.fromMap(conceptsToEditors).put(mpsConcept, editor);
    }
    for (SNode additionalConcept : MapSequence.fromMap(additionalConceptsToTargets).keySet()) {
      SNode editor = IMPSLiteConcept_Behavior.call_createAdditionalEditor_1239891670850(additionalConcept, conceptsToTargets, partsToLinkDeclarations);
      if (editor == null) {
        continue;
      }
      SNode mpsConcept = MapSequence.fromMap(additionalConceptsToTargets).get(additionalConcept);
      SLinkOperations.setTarget(editor, "conceptDeclaration", mpsConcept, false);
      MapSequence.fromMap(conceptsToEditors).put(mpsConcept, editor);
    }
    SNode actions = SConceptOperations.createNewNode("jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions", null);
    SPropertyOperations.set(actions, "name", "_BinaryOperations_SideTransform");
    for (SNode binaryOperationConcept : ConceptContainer_Behavior.call_getBinaryOperationConcepts_1239806149720(conceptContainer)) {
      GenerationUtils.fillBinarySideTransformActions(binaryOperationConcept, actions, conceptsToTargets, partsToLinkDeclarations);
    }
    // constraints(scopes) 
    Map<SNode, SNode> conceptsToConstraints = MapSequence.fromMap(new HashMap<SNode, SNode>());
    for (SNode variableConcept : ConceptContainer_Behavior.call_getVariableConcepts_1239806150736(conceptContainer)) {
      SNode conceptConstraint = SConceptOperations.createNewNode("jetbrains.mps.lang.constraints.structure.ConceptConstraints", null);
      SLinkOperations.setTarget(conceptConstraint, "concept", MapSequence.fromMap(additionalConceptsToTargets).get(variableConcept), false);
      SNode varScope = VariableConcept_Behavior.call_createVariableScope_1239942296621(variableConcept, conceptsToTargets, partsToLinkDeclarations);
      SLinkOperations.addChild(conceptConstraint, "referent", varScope);
      MapSequence.fromMap(conceptsToConstraints).put(variableConcept, conceptConstraint);
    }
    SModel constraintsModel = language.getConstraintsModelDescriptor().getSModel();
    //  
    // setting roots and deleting input roots 
    structureModel.setLoading(true);
    for (SNode root : ListSequence.fromListWithValues(new ArrayList<SNode>(), SModelOperations.getRoots(structureModel, null))) {
      structureModel.removeRoot(root);
    }
    for (SNode conceptDeclaration : allConcepts) {
      SNode concept = MapSequence.fromMap(conceptsToTargets).get(conceptDeclaration);
      SModelOperations.addRootNode(structureModel, concept);
    }
    for (SNode conceptDeclaration : MapSequence.fromMap(additionalConceptsToTargets).keySet()) {
      SNode concept = MapSequence.fromMap(additionalConceptsToTargets).get(conceptDeclaration);
      SModelOperations.addRootNode(structureModel, concept);
    }
    structureModel.setLoading(false);
    editorModel.setLoading(true);
    for (SNode root : ListSequence.fromListWithValues(new ArrayList<SNode>(), SModelOperations.getRoots(editorModel, null))) {
      editorModel.removeRoot(root);
    }
    for (SNode conceptDeclaration : allConcepts) {
      SNode editorDeclaration = MapSequence.fromMap(conceptsToEditors).get(MapSequence.fromMap(conceptsToTargets).get(conceptDeclaration));
      SModelOperations.addRootNode(editorModel, editorDeclaration);
    }
    for (SNode conceptDeclaration : MapSequence.fromMap(additionalConceptsToTargets).keySet()) {
      SNode editorDeclaration = MapSequence.fromMap(conceptsToEditors).get(MapSequence.fromMap(additionalConceptsToTargets).get(conceptDeclaration));
      SModelOperations.addRootNode(editorModel, editorDeclaration);
    }
    editorModel.setLoading(false);
    actionsModel.setLoading(true);
    for (SNode root : ListSequence.fromListWithValues(new ArrayList<SNode>(), SModelOperations.getRoots(actionsModel, null))) {
      actionsModel.removeRoot(root);
    }
    SModelOperations.addRootNode(actionsModel, actions);
    actionsModel.setLoading(false);
    constraintsModel.setLoading(true);
    for (SNode root : ListSequence.fromListWithValues(new ArrayList<SNode>(), SModelOperations.getRoots(constraintsModel, null))) {
      constraintsModel.removeRoot(root);
    }
    for (SNode conceptDeclaration : allConcepts) {
      SNode conceptConstraints = MapSequence.fromMap(conceptsToConstraints).get(conceptDeclaration);
      SModelOperations.addRootNode(constraintsModel, conceptConstraints);
    }
    constraintsModel.setLoading(false);
    SModelRepository.getInstance().markChanged(structureModel);
    SModelRepository.getInstance().markChanged(editorModel);
    SModelRepository.getInstance().markChanged(actionsModel);
    SModelRepository.getInstance().markChanged(constraintsModel);
    SNodeOperations.deleteNode(conceptContainer);
  }
}
