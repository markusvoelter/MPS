package jetbrains.mps.xmlUnitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class XMLStringLiteral extends Expression {
  public static final String concept = "jetbrains.mps.xmlUnitTest.structure.XMLStringLiteral";
  public static final String XML = "xml";

  public XMLStringLiteral(SNode node) {
    super(node);
  }

  public XMLLiteral getXml() {
    return (XMLLiteral) this.getChild(XMLLiteral.class, XMLStringLiteral.XML);
  }

  public void setXml(XMLLiteral node) {
    super.setChild(XMLStringLiteral.XML, node);
  }

  public static XMLStringLiteral newInstance(SModel sm, boolean init) {
    return (XMLStringLiteral) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlUnitTest.structure.XMLStringLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static XMLStringLiteral newInstance(SModel sm) {
    return XMLStringLiteral.newInstance(sm, false);
  }
}
