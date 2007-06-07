package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptProperty;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptPropertyDeclaration;

public class StringConceptProperty extends ConceptProperty {
  public static String VALUE = "value";

  public  StringConceptProperty(SNode node) {
    super(node);
  }

  public static StringConceptProperty newInstance(SModel sm, boolean init) {
    return (StringConceptProperty)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static StringConceptProperty newInstance(SModel sm) {
    return StringConceptProperty.newInstance(sm, false);
  }

  public String getValue() {
    return this.getProperty(StringConceptProperty.VALUE);
  }
  public void setValue(String value) {
    this.setProperty(StringConceptProperty.VALUE, value);
  }
  public StringConceptPropertyDeclaration getStringConceptPropertyDeclaration() {
    return (StringConceptPropertyDeclaration)this.getConceptPropertyDeclaration();
  }
  public void setStringConceptPropertyDeclaration(StringConceptPropertyDeclaration node) {
    this.setConceptPropertyDeclaration(node);
  }
}
