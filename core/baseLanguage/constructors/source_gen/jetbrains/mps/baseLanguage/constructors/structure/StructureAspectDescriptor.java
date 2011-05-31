package jetbrains.mps.baseLanguage.constructors.structure;

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
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause", "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorContainer", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference", "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorUsage", "jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause", "jetbrains.mps.baseLanguage.constructors.structure.ListCustomParameter", "jetbrains.mps.baseLanguage.constructors.structure.ListParameterReference"};

  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause", new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause"}, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 2:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructor", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 3:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorContainer", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 4:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 5:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 6:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorUsage", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 7:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ListArgumentsClause", new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause"}, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.ArgumentClause"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 8:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ListCustomParameter", new String[]{"jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter"}, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameter"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 9:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.constructors.structure.ListParameterReference", new String[]{"jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference"}, new String[]{"jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorParameterReference"}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
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
