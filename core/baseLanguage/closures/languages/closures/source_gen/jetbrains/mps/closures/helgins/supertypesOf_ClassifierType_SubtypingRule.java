package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.Collections;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_ClassifierType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  supertypesOf_ClassifierType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ct) {
    List<SNode> supertypes = Collections.emptyList();
    SNode classifier = SLinkOperations.getTarget(ct, "classifier", false);
    if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
      if(methods != null && methods.size() == 1) {
        SNode md = methods.get(0);
        List<SNode> paramTypes = new ArrayList<SNode>();
        for(SNode p : SLinkOperations.getTargets(md, "parameter", true)) {
          paramTypes.add(SLinkOperations.getTarget(p, "type", true));
        }
        SNode resType = SLinkOperations.getTarget(md, "returnType", true);
        supertypes = Collections.singletonList(new QuotationClass_4().createNode(paramTypes, resType));
      }
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

}
