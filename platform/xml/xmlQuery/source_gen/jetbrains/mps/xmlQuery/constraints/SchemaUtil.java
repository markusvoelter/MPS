package jetbrains.mps.xmlQuery.constraints;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class SchemaUtil {
  public static List<SNode> getAvailableAttributes(SNode complexType) {
    if ((complexType == null)) {
      return new ArrayList<SNode>();
    }

    return getAvailableAttributes(SLinkOperations.getTargets(SLinkOperations.getTarget(complexType, "typeExpressionList", true), "typeExpression", true));
  }

  public static List<SNode> getAvailableAttributes(SNode typeExpression, boolean ignored) {
    if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.ComplexContent")) {
      SNode contentItem = SLinkOperations.getTarget(SNodeOperations.cast(typeExpression, "jetbrains.mps.xmlSchema.structure.ComplexContent"), "contentItem", true);
      assert SNodeOperations.isInstanceOf(contentItem, "jetbrains.mps.xmlSchema.structure.Extension");
      SNode extension = SNodeOperations.cast(contentItem, "jetbrains.mps.xmlSchema.structure.Extension");
      SLinkOperations.getTarget(extension, "complexTypeReference", true);

      return getAvailableAttributes(SLinkOperations.getTargets(SLinkOperations.getTarget(extension, "typeExpressionList", true), "typeExpression", true));
    } else if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeDeclaration")) {
      List<SNode> attributes = new ArrayList<SNode>();
      ListSequence.fromList(attributes).addElement(SNodeOperations.cast(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeDeclaration"));
      return attributes;
    } else if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeGroupReference")) {
      return getAvailableAttributes(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeGroupReference"), "attributeGroup", false), "attributeExpression", true));
    } else if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.GroupExpression")) {
      return new ArrayList<SNode>();
    } else {
      System.out.println("WARNING!!! New type expression: " + SNodeOperations.getConceptDeclaration(typeExpression));
      return new ArrayList<SNode>();
    }
  }

  public static List<SNode> getAvailableAttributes(List<SNode> typeExpressions) {
    List<SNode> attributes = new ArrayList<SNode>();
    for (SNode typeExpression : ListSequence.fromList(typeExpressions)) {
      ListSequence.fromList(attributes).addSequence(ListSequence.fromList(getAvailableAttributes(typeExpression, true)));
    }
    return attributes;
  }

  public static List<SNode> getAvailableChildren(SNode complexType) {
    List<SNode> children = new ArrayList<SNode>();
    ListSequence.fromList(children).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(complexType, "jetbrains.mps.xmlSchema.structure.ElementReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "elementDeclaration", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "elementDeclaration", false);
      }
    }));
    return children;
  }

  public static String complexTypePresentation(SNode complexType) {
    String typeName = SPropertyOperations.getString(complexType, "typeName");
    if (StringUtils.isEmpty(typeName)) {
      return SPropertyOperations.getString(SNodeOperations.getAncestor(complexType, "jetbrains.mps.xmlSchema.structure.ElementWithContent", false, false), "elementName");
    } else {
      return "[" + typeName + "]";
    }
  }

  public static SNode constructXMLElementType(SNode complexType) {
    SNode type = SConceptOperations.createNewNode("jetbrains.mps.xmlQuery.structure.XMLElementType", null);
    if (complexType != null) {
      SLinkOperations.setTarget(type, "schema", SNodeOperations.getAncestor(complexType, "jetbrains.mps.xmlSchema.structure.Schema", false, false), false);
      SLinkOperations.setTarget(type, "complexType", complexType, false);
    }
    return type;
  }

  public static SNode getAttributeType(SNode attributeDeclaration) {
    SNode attributeSchemaType = SLinkOperations.getTarget(attributeDeclaration, "type", true);
    if ((attributeSchemaType == null) || SNodeOperations.isInstanceOf(attributeSchemaType, "jetbrains.mps.xmlSchema.structure.StringSchemaType")) {
      return new _Quotations.QuotationClass_0().createNode();
    } else if (SNodeOperations.isInstanceOf(attributeSchemaType, "jetbrains.mps.xmlSchema.structure.BooleanSchemaType")) {
      return new _Quotations.QuotationClass_1().createNode();
    } else if (SNodeOperations.isInstanceOf(attributeSchemaType, "jetbrains.mps.xmlSchema.structure.IntegerSchemaType")) {
      return new _Quotations.QuotationClass_2().createNode();
    }
    return new _Quotations.QuotationClass_3().createNode();
  }
}
