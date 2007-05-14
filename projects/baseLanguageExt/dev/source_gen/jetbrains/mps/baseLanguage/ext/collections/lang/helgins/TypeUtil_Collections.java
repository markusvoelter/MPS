package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_35;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_36;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_37;

public class TypeUtil_Collections {

  public static SNode coerceTo_SequenceType(SNode type) {
    SNode sequenceType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType"), true);
    if(sequenceType != null) {
      return sequenceType;
    }
    if(type == null) {
      return null;
    }
    // ==========
    // TEMP FIX FOR DNQ 1
    if("jetbrains.teamsys.dnq.structure.PListType".equals(type.getConceptFqName())) {
      SNode classifierType = type.getChild("classifierType");
      return new QuotationClass_35().createNode(SNodeOperations.copyNode(classifierType));
    }
    // END TEMP FIX
    // ==========
    // ==========
    // TEMP FIX FOR DNQ
    // TODO: extract generics information
    if(type != null) {
      SModel model = TypeChecker.getInstance().getRuntimeTypesModel();
      GlobalScope scope = GlobalScope.getInstance();
      SNode entity = BaseAdapter.fromAdapter(SModelUtil_new.findNodeByFQName("com.jetbrains.teamsys.database.Entity", Classifier.class, scope));
      SNode entityType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(entityType, "classifier", entity, false);
      SNode javaIterable = BaseAdapter.fromAdapter(SModelUtil_new.findNodeByFQName("java.lang.Iterable", Classifier.class, scope));
      SNode javaIterableType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(javaIterableType, "classifier", javaIterable, false);
      SLinkOperations.addChild(javaIterableType, "parameter", entityType);
      if(TypeChecker.getInstance().getSubtypingManager().isSubtype(type, javaIterableType)) {
        return new QuotationClass_36().createNode(SNodeOperations.copyNode(entity));
      }
      // ==========
      SNode entityIterable = BaseAdapter.fromAdapter(SModelUtil_new.findNodeByFQName("com.jetbrains.teamsys.database.EntityIterable", Classifier.class, scope));
      SNode entityIterableType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(entityIterableType, "classifier", entityIterable, false);
      if(TypeChecker.getInstance().getSubtypingManager().isSubtype(type, entityIterableType)) {
        return new QuotationClass_37().createNode(SNodeOperations.copyNode(entity));
      }
    }
    // END FIX
    // ==========
    return null;
  }
}
