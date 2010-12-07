package jetbrains.mps.ypath.behavior;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.ypath.design.IGenericParameterizedFeatureDesign;
import jetbrains.mps.ypath.design.IGenericFeatureDesign;
import jetbrains.mps.ypath.design.IParameterizedFeatureDesign;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ypath.design.IFeatureDesign;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.JavaNameUtil;
import jetbrains.mps.ypath.plugin.DesignPartLoader;

public class FeatureUtil {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.ypath");

  public static SNode getterExpression(SNode feature, SNode srcExpr, Object param, ITemplateGenerator generator) {
    IGenericParameterizedFeatureDesign gfd = (IGenericParameterizedFeatureDesign) getFeatureDesign(feature);
    if (gfd != null) {
      try {
        SNode expr = gfd.getterExpression(srcExpr, param, generator);
        return expr;
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
    return null;
  }

  public static SNode getterExpression(SNode feature, SNode srcExpr, ITemplateGenerator generator) {
    IGenericFeatureDesign gfd = (IGenericFeatureDesign) getFeatureDesign(feature);
    if (gfd != null) {
      try {
        SNode expr = gfd.getterExpression(srcExpr, generator);
        return expr;
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
    return null;
  }

  public static boolean isSingleTargetCardinality(SNode feature, Object param) {
    IGenericParameterizedFeatureDesign gfd = (IGenericParameterizedFeatureDesign) getFeatureDesign(feature);
    if (gfd != null) {
      try {
        return gfd.isSingleTargetCardinality(param);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
    return true;
  }

  public static SNode getTargetType(SNode feature, SNode nodeType, Object param) {
    IParameterizedFeatureDesign fd = (IParameterizedFeatureDesign) getFeatureDesign(feature);
    if (fd != null) {
      try {
        return fd.getTargetType(param, nodeType);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
    return null;
  }

  public static List<SNode> getParameterObjects(SNode feature, SNode nodeType) {
    final IParameterizedFeatureDesign fd = (IParameterizedFeatureDesign) getFeatureDesign(feature);
    if (fd != null) {
      Iterable<Object> params = fd.getParameters(nodeType);
      if (Sequence.fromIterable(params).isNotEmpty()) {
        return Sequence.fromIterable(params).<SNode>select(new ISelector<Object, SNode>() {
          public SNode select(Object it) {
            SNode param = SConceptOperations.createNewNode("jetbrains.mps.ypath.structure.ParameterWrapper", null);
            if (it instanceof SNode) {
              SLinkOperations.setTarget(param, "paramRef", (SNode) it, false);
            } else
            if (it instanceof String) {
              SPropertyOperations.set(param, "paramValue", (String) it);
            }
            SPropertyOperations.set(param, "name", fd.parameterToString(it));
            return param;
          }
        }).toListSequence();
      }
    }
    return ListSequence.fromList(new ArrayList<SNode>());
  }

  public static IFeatureDesign getFeatureDesign(SNode feature) {
    return getFeatureDesign(feature, "Design");
  }

  public static IFeatureDesign getFeatureDesign(SNode feature, String suffix) {
    String treepathAspectName = SPropertyOperations.getString(SNodeOperations.getAncestor(feature, "jetbrains.mps.ypath.structure.TreePathAspect", false, false), "name") + "_" + suffix;
    String featureName = suffix + "_" + IFeature_Behavior.call_getFullName_1213877499608(SNodeOperations.cast(feature, "jetbrains.mps.ypath.structure.IFeature"));
    String fqClassName = JavaNameUtil.fqClassName(feature, treepathAspectName + "$" + featureName);
    IFeatureDesign featureDesign = DesignPartLoader.getInstance().getFeatureDesign(fqClassName, SNodeOperations.getModel(feature));
    if (featureDesign == null) {
      LOG.error("Cannot load feature design: " + fqClassName);
    }
    return featureDesign;
  }
}
