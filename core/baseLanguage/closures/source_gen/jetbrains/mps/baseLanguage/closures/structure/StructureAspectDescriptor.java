package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import java.util.Collections;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.baseLanguage.closures.structure.AbstractFunctionType", "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement", "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", "jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression", "jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionContainer", "jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionDeclaration", "jetbrains.mps.baseLanguage.closures.structure.ControlClosureLiteral", "jetbrains.mps.baseLanguage.closures.structure.FunctionMethodDeclaration", "jetbrains.mps.baseLanguage.closures.structure.FunctionType", "jetbrains.mps.baseLanguage.closures.structure.InvokeExpression", "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionExpression", "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation", "jetbrains.mps.baseLanguage.closures.structure.PairOfInts", "jetbrains.mps.baseLanguage.closures.structure.StringPropertyHolder", "jetbrains.mps.baseLanguage.closures.structure.UnboundClosureParameterDeclaration", "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral", "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType", "jetbrains.mps.baseLanguage.closures.structure.YieldAllStatement", "jetbrains.mps.baseLanguage.closures.structure.YieldStatement"};

  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.AbstractFunctionType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 1:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 2:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IStatementListContainer", "jetbrains.mps.baseLanguage.structure.IContainsStatementList", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.baseLanguage.structure.IFinalWrapper", "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IContainsStatementList", "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", "jetbrains.mps.baseLanguage.structure.IFinalWrapper", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.baseLanguage.structure.IStatementListContainer"});
      case 3:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 4:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionContainer", new String[]{"jetbrains.mps.baseLanguage.structure.Classifier"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Classifier"});
      case 5:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.ControlAbstractionDeclaration", new String[]{"jetbrains.mps.baseLanguage.structure.GenericDeclaration", "jetbrains.mps.baseLanguage.structure.ClassifierMember", "jetbrains.mps.lang.core.structure.IResolveInfo", "jetbrains.mps.baseLanguage.structure.HasAnnotation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ClassifierMember", "jetbrains.mps.baseLanguage.structure.GenericDeclaration", "jetbrains.mps.baseLanguage.structure.HasAnnotation", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 6:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.ControlClosureLiteral", new String[]{"jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral"}, new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral"}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IContainsStatementList", "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", "jetbrains.mps.baseLanguage.structure.IFinalWrapper", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.baseLanguage.structure.IStatementListContainer"});
      case 7:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.FunctionMethodDeclaration", new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"});
      case 8:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.FunctionType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 9:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.InvokeExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 10:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.lang.core.structure.IDeprecatable"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.lang.core.structure.IDeprecatable"});
      case 11:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.IOperation", "jetbrains.mps.lang.core.structure.BaseConcept"});
      case 12:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.PairOfInts", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 13:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.StringPropertyHolder", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 14:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.UnboundClosureParameterDeclaration", new String[]{"jetbrains.mps.baseLanguage.structure.ParameterDeclaration"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ParameterDeclaration"});
      case 15:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.UnrestrictedClosureLiteral", new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"}, new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IContainsStatementList", "jetbrains.mps.baseLanguage.structure.IControlFlowInterrupter", "jetbrains.mps.baseLanguage.structure.IFinalWrapper", "jetbrains.mps.baseLanguage.structure.IMethodLike", "jetbrains.mps.baseLanguage.structure.IStatementListContainer"});
      case 16:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType", new String[]{"jetbrains.mps.baseLanguage.closures.structure.FunctionType"}, new String[]{"jetbrains.mps.baseLanguage.closures.structure.FunctionType"}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 17:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.YieldAllStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 18:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.closures.structure.YieldStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      default:
        return null;
    }
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private Set<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String[] parents, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, ancestorsInLanguage, ancestorsNotInLanguage);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static Set<String> getAncestors(String conceptFqName, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      Set<String> result = new HashSet(ancestorsInLanguage.length + 1);

      result.add(conceptFqName);
      for (String ancestor : ancestorsInLanguage) {
        result.add(ancestor);
      }

      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : ancestorsNotInLanguage) {
        if (!(result.contains(parent))) {
          result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
        }
      }

      return Collections.unmodifiableSet(result);
    }
  }
}
