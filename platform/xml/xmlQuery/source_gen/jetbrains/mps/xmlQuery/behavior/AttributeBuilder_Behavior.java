package jetbrains.mps.xmlQuery.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.xmlQuery.constraints.SchemaUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class AttributeBuilder_Behavior {
  private static Class[] PARAMETERS_7225751495667376241 = {SNode.class};
  private static Class[] PARAMETERS_7225751495667376245 = {SNode.class, SNode.class};
  private static Class[] PARAMETERS_608266221866981658 = {SNode.class, SNode.class, SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getResultType_7057666463730718251(SNode thisNode) {
    return SchemaUtil.getAttributeType(SLinkOperations.getTarget(thisNode, "attributeDeclaration", false));
  }

  public static SNode virtual_getCreatorExpression_7057666463730727863(SNode thisNode, SNode parentRef) {
    return SLinkOperations.getTarget(thisNode, "value", true);
  }

  public static SNode virtual_getAttachStatementChild_4797501453850305563(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return new AttributeBuilder_Behavior.QuotationClass_emlk0p_a0a0d().createNode(parentRef, SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "attributeDeclaration", false), "attributeName"), childRef);
  }

  public static SNode call_getResultType_7225751495667376241(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.AttributeBuilder"), "virtual_getResultType_7057666463730718251", PARAMETERS_7225751495667376241);
  }

  public static SNode call_getCreatorExpression_7225751495667376245(SNode thisNode, SNode parentRef) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.AttributeBuilder"), "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_7225751495667376245, parentRef);
  }

  public static SNode call_getAttachStatementChild_608266221866981658(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.AttributeBuilder"), "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_608266221866981658, parentBuilder, parentRef, childRef);
  }

  public static SNode callSuper_getResultType_7225751495667376241(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.AttributeBuilder"), callerConceptFqName, "virtual_getResultType_7057666463730718251", PARAMETERS_7225751495667376241);
  }

  public static SNode callSuper_getCreatorExpression_7225751495667376245(SNode thisNode, String callerConceptFqName, SNode parentRef) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.AttributeBuilder"), callerConceptFqName, "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_7225751495667376245, parentRef);
  }

  public static SNode callSuper_getAttachStatementChild_608266221866981658(SNode thisNode, String callerConceptFqName, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.AttributeBuilder"), callerConceptFqName, "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_608266221866981658, parentBuilder, parentRef, childRef);
  }

  public static class QuotationClass_emlk0p_a0a0d {
    public QuotationClass_emlk0p_a0a0d() {
    }

    public SNode createNode(Object parameter_18, Object parameter_19, Object parameter_20) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      SNode quotedNode_9 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_10 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_11 = quotedNode_2;
          {
            quotedNode_3 = (SNode) parameter_18;
            SNode quotedNode1_12;
            if (_parameterValues_129834374.contains(quotedNode_3)) {
              quotedNode1_12 = HUtil.copyIfNecessary(quotedNode_3);
            } else {
              _parameterValues_129834374.add(quotedNode_3);
              quotedNode1_12 = quotedNode_3;
            }
            if (quotedNode1_12 != null) {
              quotedNode_2.addChild("operand", HUtil.copyIfNecessary(quotedNode1_12));
            }
          }
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_13 = quotedNode_4;
            quotedNode1_13.addReference(SReference.create("baseMethodDeclaration", quotedNode1_13, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.jdom(MPS.Classpath/org.jdom@java_stub)"), SNodeId.fromString("~Element.setAttribute(java.lang.String,java.lang.String):org.jdom.Element")));
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_14 = quotedNode_6;
              quotedNode1_14.setProperty("value", (String) parameter_19);
              quotedNode_4.addChild("actualArgument", quotedNode1_14);
            }
            {
              quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_15 = quotedNode_7;
              {
                quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_16 = quotedNode_8;
                quotedNode1_16.setProperty("value", "");
                quotedNode_7.addChild("leftExpression", quotedNode1_16);
              }
              {
                quotedNode_9 = (SNode) parameter_20;
                SNode quotedNode1_17;
                if (_parameterValues_129834374.contains(quotedNode_9)) {
                  quotedNode1_17 = HUtil.copyIfNecessary(quotedNode_9);
                } else {
                  _parameterValues_129834374.add(quotedNode_9);
                  quotedNode1_17 = quotedNode_9;
                }
                if (quotedNode1_17 != null) {
                  quotedNode_7.addChild("rightExpression", HUtil.copyIfNecessary(quotedNode1_17));
                }
              }
              quotedNode_4.addChild("actualArgument", quotedNode1_15);
            }
            quotedNode_2.addChild("operation", quotedNode1_13);
          }
          quotedNode_1.addChild("expression", quotedNode1_11);
        }
        result = quotedNode1_10;
      }
      return result;
    }
  }
}
