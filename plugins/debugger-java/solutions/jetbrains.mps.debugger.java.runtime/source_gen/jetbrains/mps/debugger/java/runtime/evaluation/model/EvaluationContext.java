package jetbrains.mps.debugger.java.runtime.evaluation.model;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.JavaUiState;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

/*package*/ abstract class EvaluationContext {
  protected JavaUiState myUiState;

  public EvaluationContext(JavaUiState state) {
    myUiState = state;
  }

  @NotNull
  public List<String> getClassPath() {
    return ListSequence.fromList(new ArrayList<String>());
  }

  @Nullable
  public abstract SNode getLocationNode();

  public JavaUiState getUiState() {
    return myUiState;
  }

  public void setUiState(JavaUiState uiState) {
    myUiState = uiState;
  }

  @NotNull
  public abstract Map<String, VariableDescription> getVariables(_FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType);

  @Nullable
  public abstract SNode getStaticContextType(_FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType);

  @Nullable
  public abstract SNode getThisClassifierType(_FunctionTypes._return_P1_E0<? extends SNode, ? super String> createClassifierType);

  public abstract boolean isVariableVisible(String variableName, SNode variableType);

  public abstract boolean isThisTypeValid(SNode thisType);

  public abstract boolean isStaticContextTypeValid(SNode staticContextType);
}
