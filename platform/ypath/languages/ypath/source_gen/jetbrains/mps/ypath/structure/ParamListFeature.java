package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Type;

public class ParamListFeature extends ListFeature implements IParamFeature {
  public static final String concept = "jetbrains.mps.ypath.structure.ParamListFeature";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String WRITABLE = "writable";
  public static String DEFAULT = "default";
  public static String PARAMETER_TYPE = "parameterType";
  public static String PARAMETER_QUERY_FUNCTION = "parameterQueryFunction";
  public static String TARGET_TYPE_FUNCTION = "targetTypeFunction";
  public static String TO_STRING_FUNCTION = "toStringFunction";
  public static String CARDINAL = "cardinal";

  public  ParamListFeature(SNode node) {
    super(node);
  }

  public static ParamListFeature newInstance(SModel sm, boolean init) {
    return (ParamListFeature)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.ParamListFeature", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParamListFeature newInstance(SModel sm) {
    return ParamListFeature.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(ParamListFeature.NAME);
  }

  public void setName(String value) {
    this.setProperty(ParamListFeature.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ParamListFeature.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ParamListFeature.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ParamListFeature.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ParamListFeature.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ParamListFeature.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ParamListFeature.VIRTUAL_PACKAGE, value);
  }

  public boolean getWritable() {
    return this.getBooleanProperty(ParamListFeature.WRITABLE);
  }

  public void setWritable(boolean value) {
    this.setBooleanProperty(ParamListFeature.WRITABLE, value);
  }

  public boolean getDefault() {
    return this.getBooleanProperty(ParamListFeature.DEFAULT);
  }

  public void setDefault(boolean value) {
    this.setBooleanProperty(ParamListFeature.DEFAULT, value);
  }

  public Type getParameterType() {
    return (Type)this.getChild(ParamListFeature.PARAMETER_TYPE);
  }

  public void setParameterType(Type node) {
    super.setChild(ParamListFeature.PARAMETER_TYPE, node);
  }

  public ParameterQueryFun getParameterQueryFunction() {
    return (ParameterQueryFun)this.getChild(ParamListFeature.PARAMETER_QUERY_FUNCTION);
  }

  public void setParameterQueryFunction(ParameterQueryFun node) {
    super.setChild(ParamListFeature.PARAMETER_QUERY_FUNCTION, node);
  }

  public TargetTypeFun getTargetTypeFunction() {
    return (TargetTypeFun)this.getChild(ParamListFeature.TARGET_TYPE_FUNCTION);
  }

  public void setTargetTypeFunction(TargetTypeFun node) {
    super.setChild(ParamListFeature.TARGET_TYPE_FUNCTION, node);
  }

  public ToStringFun getToStringFunction() {
    return (ToStringFun)this.getChild(ParamListFeature.TO_STRING_FUNCTION);
  }

  public void setToStringFunction(ToStringFun node) {
    super.setChild(ParamListFeature.TO_STRING_FUNCTION, node);
  }

  public GFCardinalParamFun getCardinal() {
    return (GFCardinalParamFun)this.getChild(ParamListFeature.CARDINAL);
  }

  public void setCardinal(GFCardinalParamFun node) {
    super.setChild(ParamListFeature.CARDINAL, node);
  }

  public ParamFeatureGetFun getParamGetFunction() {
    return (ParamFeatureGetFun)this.getGetFunction();
  }

  public void setParamGetFunction(ParamFeatureGetFun node) {
    this.setGetFunction(node);
  }

  public ParamFeatureSizeFun getParamSizeFunction() {
    return (ParamFeatureSizeFun)this.getSizeFunction();
  }

  public void setParamSizeFunction(ParamFeatureSizeFun node) {
    this.setSizeFunction(node);
  }

  public ParamFeatureSetFun getParamSetFunction() {
    return (ParamFeatureSetFun)this.getSetFunction();
  }

  public void setParamSetFunction(ParamFeatureSetFun node) {
    this.setSetFunction(node);
  }

  public ParamFeatureInsertFun getParamInsertFunction() {
    return (ParamFeatureInsertFun)this.getInsertFunction();
  }

  public void setParamInsertFunction(ParamFeatureInsertFun node) {
    this.setInsertFunction(node);
  }

  public ParamFeatureDeleteFun getParamDeleteFunction() {
    return (ParamFeatureDeleteFun)this.getDeleteFunction();
  }

  public void setParamDeleteFunction(ParamFeatureDeleteFun node) {
    this.setDeleteFunction(node);
  }

}
