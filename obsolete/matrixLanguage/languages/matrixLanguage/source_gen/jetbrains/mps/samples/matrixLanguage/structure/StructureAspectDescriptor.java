package jetbrains.mps.samples.matrixLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.samples.matrixLanguage.structure.DeterminantExpression", "jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement", "jetbrains.mps.samples.matrixLanguage.structure.MatrixAddExpression", "jetbrains.mps.samples.matrixLanguage.structure.MatrixDivExpression", "jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableDeclaration", "jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference", "jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableDeclaration", "jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableReference", "jetbrains.mps.samples.matrixLanguage.structure.MatrixLiteral", "jetbrains.mps.samples.matrixLanguage.structure.MatrixMultExpression", "jetbrains.mps.samples.matrixLanguage.structure.MatrixRow", "jetbrains.mps.samples.matrixLanguage.structure.MatrixSubExpression", "jetbrains.mps.samples.matrixLanguage.structure.MatrixType", "jetbrains.mps.samples.matrixLanguage.structure.TransposeExpression"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.DeterminantExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement", "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractLoopStatement"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixAddExpression", "jetbrains.mps.baseLanguage.structure.BinaryOperation", false, new String[]{"jetbrains.mps.baseLanguage.structure.BinaryOperation"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixDivExpression", "jetbrains.mps.baseLanguage.structure.BinaryOperation", false, new String[]{"jetbrains.mps.baseLanguage.structure.BinaryOperation"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableDeclaration", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableReference", "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false, new String[]{"jetbrains.mps.baseLanguage.structure.LocalVariableReference"}, new String[]{}, new String[]{"matrixElementDeclaration"});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableDeclaration", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixIndexVariableReference", "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false, new String[]{"jetbrains.mps.baseLanguage.structure.LocalVariableReference"}, new String[]{}, new String[]{"indexVariable"});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixLiteral", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixMultExpression", "jetbrains.mps.baseLanguage.structure.BinaryOperation", false, new String[]{"jetbrains.mps.baseLanguage.structure.BinaryOperation"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixRow", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixSubExpression", "jetbrains.mps.baseLanguage.structure.BinaryOperation", false, new String[]{"jetbrains.mps.baseLanguage.structure.BinaryOperation"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.MatrixType", "jetbrains.mps.baseLanguage.structure.Type", false, new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.samples.matrixLanguage.structure.TransposeExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
