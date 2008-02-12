package jetbrains.mps.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.closures.generator.baseLanguage.template.helper.FunctionTypeUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class ClassifierTypeUtil {

  public static SNode getTypeCoercedToClassifierType(SNode type) {
    SNode ct = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType") ?
      type :
      TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true)
    );
    if((ct != null)) {
      List<SNode> params = SLinkOperations.getTargets(ct, "parameter", true);
      if(params != null && params.size() > 0) {
        SNode res = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        SLinkOperations.setTarget(res, "classifier", SLinkOperations.getTarget(ct, "classifier", false), false);
        for(SNode p : params) {
          SLinkOperations.addChild(res, "parameter", SNodeOperations.copyNode(ClassifierTypeUtil.getTypeCoercedToClassifierType(p)));
        }
        return res;
      }
      return ct;
    }
    return type;
  }

  public static SNode getClassifierType(SNode ft) {
    String rtSig = "FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_2().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if(rtSig.equals(SPropertyOperations.getString(ice, "name"))) {
        SNode ct = new QuotationClass_1().createNode(ice);
        if((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true)), true));
        }
        for(SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt), false));
        }
        return ct;
      }
    }
    return null;
  }

  public static boolean isFunctionTypeClassifier(SNode classifier) {
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_3().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if(ice == classifier) {
        return true;
      }
    }
    return false;
  }

  public static boolean isFunctionTypeClassifierReturningValue(SNode classifier) {
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_4().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if(ice == classifier) {
        String cname = SPropertyOperations.getString(classifier, "name");
        int ldi = cname.lastIndexOf(".");
        cname = (ldi >= 0 ?
          cname.substring(ldi + 1) :
          cname
        );
        return !(cname.startsWith("_void"));
      }
    }
    return false;
  }

  private static SNode copyTypeRecursively(SNode type, boolean covariant) {
    if(SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(copy, "classifier", SLinkOperations.getTarget(type, "classifier", false), false);
      boolean covariantParam = ClassifierTypeUtil.isFunctionTypeClassifierReturningValue(SLinkOperations.getTarget(type, "classifier", false));
      for(SNode pt : SLinkOperations.getTargets(type, "parameter", true)) {
        SLinkOperations.addChild(copy, "parameter", (ClassifierTypeUtil.isFunctionTypeClassifier(SLinkOperations.getTarget(type, "classifier", false)) ?
          ClassifierTypeUtil.copyTypeRecursively(pt, covariantParam) :
          ClassifierTypeUtil.copyTypeRecursively(pt)
        ));
        covariantParam = false;
      }
      return (covariant || ClassifierTypeUtil.isFunctionTypeClassifier(SLinkOperations.getTarget(type, "classifier", false)) ?
        new QuotationClass_5().createNode(copy) :
        new QuotationClass_6().createNode(copy)
      );
    } else
    {
      return (covariant ?
        new QuotationClass_7().createNode(SNodeOperations.copyNode(type)) :
        new QuotationClass_8().createNode(SNodeOperations.copyNode(type))
      );
    }
  }

  public static SNode copyTypeRecursively(SNode type) {
    type = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.UpperBoundType") ?
      SLinkOperations.getTarget(type, "bound", true) :
      type
    );
    type = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.LowerBoundType") ?
      SLinkOperations.getTarget(type, "bound", true) :
      type
    );
    if(SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(copy, "classifier", SLinkOperations.getTarget(type, "classifier", false), false);
      for(SNode pt : SLinkOperations.getTargets(type, "parameter", true)) {
        SLinkOperations.addChild(copy, "parameter", ClassifierTypeUtil.copyTypeRecursively(pt));
      }
      return copy;
    } else
    {
      return SNodeOperations.copyNode(type);
    }
  }

}
