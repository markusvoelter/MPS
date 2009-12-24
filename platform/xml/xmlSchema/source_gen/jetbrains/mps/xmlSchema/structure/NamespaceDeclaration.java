package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NamespaceDeclaration extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.NamespaceDeclaration";
  public static final String PREFIX = "prefix";
  public static final String URI = "uri";

  public NamespaceDeclaration(SNode node) {
    super(node);
  }

  public String getPrefix() {
    return this.getProperty(NamespaceDeclaration.PREFIX);
  }

  public void setPrefix(String value) {
    this.setProperty(NamespaceDeclaration.PREFIX, value);
  }

  public String getUri() {
    return this.getProperty(NamespaceDeclaration.URI);
  }

  public void setUri(String value) {
    this.setProperty(NamespaceDeclaration.URI, value);
  }

  public static NamespaceDeclaration newInstance(SModel sm, boolean init) {
    return (NamespaceDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.NamespaceDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NamespaceDeclaration newInstance(SModel sm) {
    return NamespaceDeclaration.newInstance(sm, false);
  }
}
