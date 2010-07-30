package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class XMLSAXHandler_resultObject extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject";

  public XMLSAXHandler_resultObject(SNode node) {
    super(node);
  }

  public static XMLSAXHandler_resultObject newInstance(SModel sm, boolean init) {
    return (XMLSAXHandler_resultObject) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static XMLSAXHandler_resultObject newInstance(SModel sm) {
    return XMLSAXHandler_resultObject.newInstance(sm, false);
  }
}
