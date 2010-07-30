package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class XMLSAXAttributeHandler_value extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value";

  public XMLSAXAttributeHandler_value(SNode node) {
    super(node);
  }

  public static XMLSAXAttributeHandler_value newInstance(SModel sm, boolean init) {
    return (XMLSAXAttributeHandler_value) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static XMLSAXAttributeHandler_value newInstance(SModel sm) {
    return XMLSAXAttributeHandler_value.newInstance(sm, false);
  }
}
