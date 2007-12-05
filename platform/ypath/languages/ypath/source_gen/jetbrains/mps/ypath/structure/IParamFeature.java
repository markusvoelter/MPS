package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.baseLanguage.structure.Type;

public interface IParamFeature extends INodeAdapter {
  public static final String concept = "jetbrains.mps.ypath.structure.IParamFeature";
  public static String PARAMETER_TYPE = "parameterType";
  public static String PARAMETER_QUERY_FUNCTION = "parameterQueryFunction";
  public static String TARGET_TYPE_FUNCTION = "targetTypeFunction";
  public static String TO_STRING_FUNCTION = "toStringFunction";
  public static String CARDINAL = "cardinal";

  public Type getParameterType();

  public void setParameterType(Type node);

  public ParameterQueryFun getParameterQueryFunction();

  public void setParameterQueryFunction(ParameterQueryFun node);

  public TargetTypeFun getTargetTypeFunction();

  public void setTargetTypeFunction(TargetTypeFun node);

  public ToStringFun getToStringFunction();

  public void setToStringFunction(ToStringFun node);

  public GFCardinalParamFun getCardinal();

  public void setCardinal(GFCardinalParamFun node);

}
