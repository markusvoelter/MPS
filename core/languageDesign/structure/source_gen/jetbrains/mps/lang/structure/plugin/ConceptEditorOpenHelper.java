package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.IConceptAspect_Behavior;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.generator.structure.RootTemplateAnnotation_AnnotationLink;
import jetbrains.mps.lang.generator.structure.RootTemplateAnnotation;

public class ConceptEditorOpenHelper {
  public static SNode getBaseNode(SNode node, IOperationContext context) {
    SNode baseNode = null;
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      return node;
    }
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.IConceptAspect")) {
      baseNode = IConceptAspect_Behavior.call_getBaseConcept_2621449412040133768(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.IConceptAspect"));
    }
    if (baseNode == null) {
      baseNode = getBaseNode(context, node);
    }
    if (baseNode == null) {
      return null;
    }
    // We should be sure that node and base node are inside the same module.  
    // Otherwise, tabbed editor for base node will be opened, but there will be no tab for "node" 
    // So, the user will not be able to open node by a double-click 
    SModelDescriptor baseModelDesIcriptor = baseNode.getModel().getModelDescriptor();
    SModelDescriptor mainModelDescriptor = SNodeOperations.getModel(node).getModelDescriptor();
    if (mainModelDescriptor == null) {
      return null;
    }
    IModule baseModule = baseModelDesIcriptor.getModule();
    IModule mainModule = mainModelDescriptor.getModule();
    if (mainModule instanceof Generator) {
      mainModule = ((Generator) mainModule).getSourceLanguage();
    }
    if (baseModule != mainModule) {
      return null;
    }
    if (!(canOpen(context, baseNode))) {
      return null;
    }
    return baseNode;
  }

  private static SNode getBaseNode(IOperationContext context, SNode node) {
    if (node == null) {
      return null;
    }
    AbstractConceptDeclaration baseNode = findBaseNodeMultiTab(node);
    if (baseNode == null || SModelUtil_new.getDeclaringLanguage(baseNode, context.getScope()) == null || (Language.getModelAspect(node.getModel().getModelDescriptor()) == null && !(SModelStereotype.isGeneratorModel(node.getModel())))) {
      return null;
    }
    return baseNode.getNode();
  }

  private static boolean canOpen(IOperationContext context, SNode node) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
      return false;
    }
    if (SModelUtil.getDeclaringLanguage(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), context.getScope()) == null) {
      return false;
    }
    if (Language.getModelAspect(SNodeOperations.getModel(node).getModelDescriptor()) == null) {
      return false;
    }
    return true;
  }

  private static AbstractConceptDeclaration findBaseNodeMultiTab(SNode node) {
    AbstractConceptDeclaration baseNode = null;
    if (node.isRoot() && node.getAdapter() instanceof BaseConcept) {
      BaseConcept bc = ((BaseConcept) node.getAdapter());
      if (RootTemplateAnnotation_AnnotationLink.getRootTemplateAnnotation(bc) != null) {
        RootTemplateAnnotation annotation = RootTemplateAnnotation_AnnotationLink.getRootTemplateAnnotation(bc);
        if (annotation != null && annotation.getApplicableConcept() != null) {
          baseNode = annotation.getApplicableConcept();
        }
      }
    }
    if (baseNode == null) {
      return null;
    }
    IModule baseNodeModule = baseNode.getModel().getModelDescriptor().getModule();
    IModule nodeModule = node.getModel().getModelDescriptor().getModule();
    if (nodeModule instanceof Generator) {
      nodeModule = ((Generator) nodeModule).getSourceLanguage();
    }
    if (baseNodeModule != nodeModule) {
      return null;
    }
    return baseNode;
  }
}
