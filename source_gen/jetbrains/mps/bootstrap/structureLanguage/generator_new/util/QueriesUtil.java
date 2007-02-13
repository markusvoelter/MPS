package jetbrains.mps.bootstrap.structureLanguage.generator_new.util;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.PropertySupport;
import jetbrains.mps.bootstrap.structureLanguage.structure.PrimitiveDataTypeDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class QueriesUtil {

  public static boolean propertyDataType_isString(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if(SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.bootstrap.structureLanguage.structure.PrimitiveDataTypeDeclaration")) {
      return PropertySupport.isString(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(dataType)));
    }
    if(SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.bootstrap.structureLanguage.structure.ConstrainedDataTypeDeclaration")) {
      return true;
    }
    return false;
  }
  public static boolean propertyDataType_isBoolean(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if(SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.bootstrap.structureLanguage.structure.PrimitiveDataTypeDeclaration")) {
      return PropertySupport.isBoolean(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(dataType)));
    }
    return false;
  }
  public static boolean propertyDataType_isInteger(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if(SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.bootstrap.structureLanguage.structure.PrimitiveDataTypeDeclaration")) {
      return PropertySupport.isInteger(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(dataType)));
    }
    return false;
  }
  public static boolean propertyDataType_isEnum(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if(SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration")) {
      return true;
    }
    return false;
  }
  public static boolean isRefLink_card_1_nospec(SNode link) {
    if(SPropertyOperations.hasValue(link, "metaClass", null, null)) {
      if(SPropertyOperations.hasValue(link, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1", "0..1")) {
        return SLinkOperations.getTarget(link, "specializedLink", false) == null;
      }
    }
    return false;
  }
  public static boolean isRefLink_card_1_spec(SNode link) {
    if(SLinkOperations.getTarget(link, "specializedLink", false) != null) {
      SNode genuineLink = (SNode)SModelUtil_new.getGenuineLinkDeclaration(((LinkDeclaration)SNodeOperations.getAdapter(link))).getNode();
      if(SPropertyOperations.hasValue(genuineLink, "metaClass", null, null)) {
        if(SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1")) {
          return true;
        }
      }
    }
    return false;
  }
  public static boolean isAggLink_card_1_nospec(SNode link) {
    if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
      if(SPropertyOperations.hasValue(link, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1", "0..1")) {
        return SLinkOperations.getTarget(link, "specializedLink", false) == null;
      }
    }
    return false;
  }
  public static boolean isAggLink_card_n_nospec(SNode link) {
    if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
      if(SPropertyOperations.hasValue(link, "sourceCardinality", "0..n", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1..n", "0..1")) {
        return SLinkOperations.getTarget(link, "specializedLink", false) == null;
      }
    }
    return false;
  }
  public static boolean isAggLink_card_1_spec(SNode link) {
    if(SLinkOperations.getTarget(link, "specializedLink", false) != null) {
      SNode genuineLink = (SNode)SModelUtil_new.getGenuineLinkDeclaration(((LinkDeclaration)SNodeOperations.getAdapter(link))).getNode();
      if(SPropertyOperations.hasValue(genuineLink, "metaClass", "aggregation", null)) {
        if(SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1")) {
          return true;
        }
      }
    }
    return false;
  }
  public static List<SNode> conceptAndItsInterfaces(SNode concept) {
    List<SNode> result = ListOperations.createList(new SNode[]{concept});
    List<SNode> implemented = (List)SModelUtil_new.getDirectlyImplementedInterfacesAsList(((ConceptDeclaration)SNodeOperations.getAdapter(concept)));
    ListOperations.addAllElements(result, implemented);
    return result;
  }
  public static boolean AL_isNodeStereotypeAndSingular(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "node", "node") && QueriesUtil.AL_isSingular(al);
  }
  public static boolean AL_isNodeStereotypeAndPlural(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "node", "node") && QueriesUtil.AL_isPlural(al);
  }
  public static boolean AL_isPropertyStereotypeAndSingular(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "property", "node") && QueriesUtil.AL_isSingular(al);
  }
  public static boolean AL_isPropertyStereotypeAndPlural(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "property", "node") && QueriesUtil.AL_isPlural(al);
  }
  public static boolean AL_isLinkStereotypeAndSingular(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "link", "node") && QueriesUtil.AL_isSingular(al);
  }
  public static boolean AL_isLinkStereotypeAndPlural(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "link", "node") && QueriesUtil.AL_isPlural(al);
  }
  public static boolean AL_isSingular(SNode al) {
    boolean b1 = SPropertyOperations.hasValue(al, "sourceCardinality", "0..1", "0..1");
    boolean b2 = SPropertyOperations.hasValue(al, "sourceCardinality", "1", "0..1");
    return b1 || b2;
  }
  public static boolean AL_isPlural(SNode al) {
    boolean b1 = SPropertyOperations.hasValue(al, "sourceCardinality", "0..n", "0..1");
    boolean b2 = SPropertyOperations.hasValue(al, "sourceCardinality", "1..n", "0..1");
    return b1 || b2;
  }
}
