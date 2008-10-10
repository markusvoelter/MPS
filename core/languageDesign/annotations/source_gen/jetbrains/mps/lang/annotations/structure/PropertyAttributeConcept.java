package jetbrains.mps.lang.annotations.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyAttributeConcept extends AttributeConcept {
  public static final String concept = "jetbrains.mps.lang.annotations.structure.PropertyAttributeConcept";
  public static String PROPERTY_NAME = "propertyName";

  public PropertyAttributeConcept(SNode node) {
    super(node);
  }

  public String getPropertyName() {
    return this.getProperty(PropertyAttributeConcept.PROPERTY_NAME);
  }

  public void setPropertyName(String value) {
    this.setProperty(PropertyAttributeConcept.PROPERTY_NAME, value);
  }


  public static PropertyAttributeConcept newInstance(SModel sm, boolean init) {
    return (PropertyAttributeConcept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.annotations.structure.PropertyAttributeConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyAttributeConcept newInstance(SModel sm) {
    return PropertyAttributeConcept.newInstance(sm, false);
  }

}
