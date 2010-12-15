package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaStackFrame;
import com.sun.jdi.StackFrame;
import com.sun.jdi.Location;
import jetbrains.mps.generator.traceInfo.TraceInfoUtil;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.project.AbstractModule;
import java.util.Collections;
import java.util.Map;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import java.util.List;
import com.sun.jdi.LocalVariable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.InvalidStackFrameException;
import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.Type;
import com.sun.jdi.PrimitiveType;
import com.sun.jdi.BooleanType;
import com.sun.jdi.ByteType;
import com.sun.jdi.ShortType;
import com.sun.jdi.LongType;
import com.sun.jdi.IntegerType;
import com.sun.jdi.DoubleType;
import com.sun.jdi.FloatType;
import com.sun.jdi.CharType;
import com.sun.jdi.ArrayType;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class StackFrameContext extends EvaluationContext {
  private static Logger LOG = Logger.getLogger(StackFrameContext.class);

  public StackFrameContext(JavaUiState uiState) {
    myUiState = uiState;
  }

  protected IModule getLocationModule() {
    return getLocationModel().getModelDescriptor().getModule();
  }

  private SModel getLocationModel() {
    return SNodeOperations.getModel(getLocationNode());
  }

  @Nullable
  public SNode getLocationNode() {
    JavaStackFrame javaStackFrame = myUiState.getStackFrame();
    SNode locationNode = null;
    if (javaStackFrame != null) {
      StackFrame stackFrame = javaStackFrame.getStackFrame();
      if (stackFrame != null) {
        try {
          Location location = stackFrame.location();
          locationNode = TraceInfoUtil.getNode(location.declaringType().name(), location.sourceName(), location.lineNumber());
        } catch (Throwable t) {
          StackFrameContext.LOG.error(t);
        }
      }
    }
    return locationNode;
  }

  @NotNull
  public IClassPathItem getClassPathItem() {
    IModule locationModule = getLocationModule();
    return AbstractModule.getDependenciesClasspath(Collections.singleton(locationModule), true);
  }

  public JavaUiState getUiState() {
    return myUiState;
  }

  public void setUiState(JavaUiState uiState) {
    myUiState = uiState;
  }

  @NotNull
  public Map<String, SNode> getVariables(_FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType) {
    Map<String, SNode> result = MapSequence.fromMap(new LinkedHashMap<String, SNode>(16, (float) 0.75, false));

    JavaStackFrame javaStackFrame = myUiState.getStackFrame();
    if (javaStackFrame != null) {
      StackFrame stackFrame = javaStackFrame.getStackFrame();
      if (stackFrame != null) {
        try {
          List<LocalVariable> variables = stackFrame.visibleVariables();
          for (LocalVariable variable : ListSequence.fromList(variables)) {
            String name = variable.name();
            try {
              SNode type = getMpsTypeFromJdiType(variable.type(), createClassifierType);
              if (type == null) {
                StackFrameContext.LOG.warning("Could not deduce type for a variable " + name);
              } else {
                MapSequence.fromMap(result).put(name, type);
              }
            } catch (ClassNotLoadedException cne) {
              StackFrameContext.LOG.warning("Exception when creating variable " + name, cne);
            }
          }
        } catch (InvalidStackFrameException e) {
          StackFrameContext.LOG.warning("InvalidStackFrameException", e);
        } catch (AbsentInformationException e) {
          StackFrameContext.LOG.error(e);
        }

      }
    }
    return result;
  }

  @Nullable
  public SNode getStaticContextType(_FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType) {
    JavaStackFrame frame = myUiState.getStackFrame();
    if (frame != null) {
      Location location = frame.getLocation().getLocation();
      try {
        final String unitType = TraceInfoUtil.getUnitName(location.declaringType().name(), location.sourceName(), location.lineNumber());
        if (unitType == null) {
          return null;
        }
        return createClassifierType.invoke(unitType);
      } catch (AbsentInformationException e) {
        StackFrameContext.LOG.error(e);
      }
    }
    return null;
  }

  @Nullable
  public SNode getThisClassifierType(_FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType) {
    ObjectReference thisObject = myUiState.getThisObject();
    if (thisObject == null) {
      return null;
    }

    return getStaticContextType(createClassifierType);
  }

  @Nullable
  private SNode getMpsTypeFromJdiType(Type type, _FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType) throws ClassNotLoadedException {
    // TODO generics 
    if (type instanceof PrimitiveType) {
      if (type instanceof BooleanType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0a0b0j().createNode();
      }
      if (type instanceof ByteType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0b0b0j().createNode();
      }
      if (type instanceof ShortType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0c0b0j().createNode();
      }
      if (type instanceof LongType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0d0b0j().createNode();
      }
      if (type instanceof IntegerType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0e0b0j().createNode();
      }
      if (type instanceof DoubleType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0f0b0j().createNode();
      }
      if (type instanceof FloatType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0g0b0j().createNode();
      }
      if (type instanceof CharType) {
        return new StackFrameContext.QuotationClass_4zsmpx_a0a0h0b0j().createNode();
      }
    } else if (type instanceof ArrayType) {
      return new StackFrameContext.QuotationClass_4zsmpx_a0a0a1a9().createNode(getMpsTypeFromJdiType(((ArrayType) type).componentType(), createClassifierType));
    }
    return createClassifierType.invoke(type.name());
  }

  public static class QuotationClass_4zsmpx_a0a0a0b0j {
    public QuotationClass_4zsmpx_a0a0a0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0b0b0j {
    public QuotationClass_4zsmpx_a0a0b0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ByteType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0c0b0j {
    public QuotationClass_4zsmpx_a0a0c0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ShortType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0d0b0j {
    public QuotationClass_4zsmpx_a0a0d0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LongType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0e0b0j {
    public QuotationClass_4zsmpx_a0a0e0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0f0b0j {
    public QuotationClass_4zsmpx_a0a0f0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DoubleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0g0b0j {
    public QuotationClass_4zsmpx_a0a0g0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FloatType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0h0b0j {
    public QuotationClass_4zsmpx_a0a0h0b0j() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CharType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_4zsmpx_a0a0a1a9 {
    public QuotationClass_4zsmpx_a0a0a1a9() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("componentType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
