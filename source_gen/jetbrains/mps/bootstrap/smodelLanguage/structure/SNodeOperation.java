package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class SNodeOperation extends BaseConcept {
  public static String CPR_Applicable_to_model = "applicable_to_model";
  public static String CPR_Applicable_to_node = "applicable_to_node";
  public static String CPR_Applicable_to_simple_property = "applicable_to_simple_property";
  public static String CPR_Applicable_to_enum_property = "applicable_to_enum_property";
  public static String CPR_Applicable_to_concept_property = "applicable_to_concept_property";
  public static String CPR_Applicable_to_link = "applicable_to_link";
  public static String CPR_Applicable_to_linkList = "applicable_to_linkList";
  public static String CLNK_ApplicableParameter = "applicableParameter";
  public static String PARAMETER = "parameter";

  public  SNodeOperation(SNode node) {
    super(node);
  }

  public static SNodeOperation newInstance(SModel sm) {
    return (SNodeOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.SNodeOperation", sm, GlobalScope.getInstance()).getAdaptor();
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
}
