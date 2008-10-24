package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SNodeOperation extends BaseConcept implements IOperation {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.SNodeOperation";
public    static final String CPR_Applicable_to_model = "applicable_to_model";
public    static final String CPR_Applicable_to_node = "applicable_to_node";
public    static final String CPR_Applicable_to_simple_property = "applicable_to_simple_property";
public    static final String CPR_Applicable_to_enum_property = "applicable_to_enum_property";
public    static final String CPR_Applicable_to_concept_property = "applicable_to_concept_property";
public    static final String CPR_Applicable_to_link = "applicable_to_link";
public    static final String CPR_Applicable_to_linkList = "applicable_to_linkList";
public    static final String CPR_Applicable_to_concept = "applicable_to_concept";
public    static final String CLNK_ApplicableParameter = "applicableParameter";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";
public    static final String PARAMETER = "parameter";

  public SNodeOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SNodeOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SNodeOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SNodeOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SNodeOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SNodeOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SNodeOperation.VIRTUAL_PACKAGE, value);
  }

  public int getParametersCount() {
    return this.getChildCount(SNodeOperation.PARAMETER);
  }

  public Iterator<AbstractOperationParameter> parameters() {
    return this.children(SNodeOperation.PARAMETER);
  }

  public List<AbstractOperationParameter> getParameters() {
    return this.getChildren(SNodeOperation.PARAMETER);
  }

  public void addParameter(AbstractOperationParameter node) {
    this.addChild(SNodeOperation.PARAMETER, node);
  }

  public void insertParameter(AbstractOperationParameter prev, AbstractOperationParameter node) {
    this.insertChild(prev, SNodeOperation.PARAMETER, node);
  }


  public static SNodeOperation newInstance(SModel sm, boolean init) {
    return (SNodeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SNodeOperation newInstance(SModel sm) {
    return SNodeOperation.newInstance(sm, false);
  }

}
