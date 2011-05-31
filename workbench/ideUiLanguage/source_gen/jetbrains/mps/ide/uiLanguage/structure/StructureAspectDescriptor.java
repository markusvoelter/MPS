package jetbrains.mps.ide.uiLanguage.structure;

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
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.ide.uiLanguage.structure.DialogDimensions", "jetbrains.mps.ide.uiLanguage.structure.DialogExpression", "jetbrains.mps.ide.uiLanguage.structure.DisposeDialogExpression", "jetbrains.mps.ide.uiLanguage.structure.DisposeDialogStatement", "jetbrains.mps.ide.uiLanguage.structure.IDEDialog", "jetbrains.mps.ide.uiLanguage.structure.IDEDialogButton", "jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression", "jetbrains.mps.ide.uiLanguage.structure.ReportErrorStatement"};

  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.DialogDimensions", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.DialogExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 2:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.DisposeDialogExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 3:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.DisposeDialogStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 4:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.IDEDialog", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.uiLanguage.structure.IComponentInstance"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.uiLanguage.structure.IComponentInstance"});
      case 5:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.IDEDialogButton", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 6:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 7:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ide.uiLanguage.structure.ReportErrorStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
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
