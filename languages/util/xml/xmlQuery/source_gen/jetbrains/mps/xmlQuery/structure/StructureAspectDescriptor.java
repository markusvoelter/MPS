package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.xmlQuery.structure.AccessArbitraryAttributeOperation", "jetbrains.mps.xmlQuery.structure.AccessArbitraryChildrenOperation", "jetbrains.mps.xmlQuery.structure.AccessAttributeOperation", "jetbrains.mps.xmlQuery.structure.AccessChildrenOperation", "jetbrains.mps.xmlQuery.structure.AccessTextOperation", "jetbrains.mps.xmlQuery.structure.AttributeBuilder", "jetbrains.mps.xmlQuery.structure.ElementBuilder", "jetbrains.mps.xmlQuery.structure.TextBuilder", "jetbrains.mps.xmlQuery.structure.XMLElementCreator", "jetbrains.mps.xmlQuery.structure.XMLElementOperation", "jetbrains.mps.xmlQuery.structure.XMLElementType", "jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler", "jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value", "jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference", "jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule", "jetbrains.mps.xmlQuery.structure.XMLSAXBreakStatement", "jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler", "jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject", "jetbrains.mps.xmlQuery.structure.XMLSAXChildRule", "jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration", "jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference", "jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction", "jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject", "jetbrains.mps.xmlQuery.structure.XMLSAXLocatorExpression", "jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator", "jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule", "jetbrains.mps.xmlQuery.structure.XMLSAXNodeValidator", "jetbrains.mps.xmlQuery.structure.XMLSAXParser", "jetbrains.mps.xmlQuery.structure.XMLSAXTextHandler", "jetbrains.mps.xmlQuery.structure.XMLSAXTextHandler_value", "jetbrains.mps.xmlQuery.structure.XMLSAXTextRule"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.AccessArbitraryAttributeOperation", "jetbrains.mps.xmlQuery.structure.XMLElementOperation", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLElementOperation"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.AccessArbitraryChildrenOperation", "jetbrains.mps.xmlQuery.structure.XMLElementOperation", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLElementOperation"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.AccessAttributeOperation", "jetbrains.mps.xmlQuery.structure.XMLElementOperation", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLElementOperation"}, new String[]{}, new String[]{"attributeDeclaration"});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.AccessChildrenOperation", "jetbrains.mps.xmlQuery.structure.XMLElementOperation", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLElementOperation"}, new String[]{}, new String[]{"elementDeclaration"});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.AccessTextOperation", "jetbrains.mps.xmlQuery.structure.XMLElementOperation", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLElementOperation"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.AttributeBuilder", "jetbrains.mps.baseLanguage.builders.structure.Builder", false, new String[]{"jetbrains.mps.baseLanguage.builders.structure.Builder"}, new String[]{}, new String[]{"attributeDeclaration"});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.ElementBuilder", "jetbrains.mps.baseLanguage.builders.structure.Builder", false, new String[]{"jetbrains.mps.baseLanguage.builders.structure.Builder"}, new String[]{}, new String[]{"elementDeclaration"});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.TextBuilder", "jetbrains.mps.baseLanguage.builders.structure.Builder", false, new String[]{"jetbrains.mps.baseLanguage.builders.structure.Builder"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLElementCreator", "jetbrains.mps.baseLanguage.structure.AbstractCreator", false, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractCreator"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLElementOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLElementType", "jetbrains.mps.baseLanguage.structure.Type", false, new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"schema", "complexType"});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler", "jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"attribute"});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"isRequired"}, new String[]{});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXBreakStatement", "jetbrains.mps.baseLanguage.structure.Statement", false, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{});
      case 16:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler", "jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction"}, new String[]{}, new String[]{});
      case 17:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 18:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXChildRule", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{"tagName", "overrideTag"}, new String[]{"rule"});
      case 19:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 20:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"declaration"});
      case 21:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 22:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 23:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXLocatorExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      case 24:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 25:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"tagName", "isCompact"}, new String[]{});
      case 26:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXNodeValidator", "jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction"}, new String[]{}, new String[]{});
      case 27:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXParser", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"root"});
      case 28:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXTextHandler", "jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction", false, new String[]{"jetbrains.mps.xmlQuery.structure.XMLSAXHandlerFunction"}, new String[]{}, new String[]{});
      case 29:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXTextHandler_value", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 30:
        return new CompiledConceptDescriptor("jetbrains.mps.xmlQuery.structure.XMLSAXTextRule", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
