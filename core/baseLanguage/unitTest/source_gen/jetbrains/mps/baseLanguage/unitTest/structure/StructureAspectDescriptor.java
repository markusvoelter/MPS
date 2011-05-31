package jetbrains.mps.baseLanguage.unitTest.structure;

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
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals", "jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse", "jetbrains.mps.baseLanguage.unitTest.structure.AssertInNotNull", "jetbrains.mps.baseLanguage.unitTest.structure.AssertIsNull", "jetbrains.mps.baseLanguage.unitTest.structure.AssertSame", "jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows", "jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue", "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase", "jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert", "jetbrains.mps.baseLanguage.unitTest.structure.Fail", "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.baseLanguage.unitTest.structure.ITestable", "jetbrains.mps.baseLanguage.unitTest.structure.Message", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder", "jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", "jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList"};

  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals", new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 1:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 2:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertInNotNull", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 3:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertIsNull", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 4:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertSame", new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 5:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 6:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 7:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.BTestCase", new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept", "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", "jetbrains.mps.baseLanguage.unitTest.structure.ITestable"}, new String[]{"jetbrains.mps.baseLanguage.structure.ClassConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 8:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 9:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.Fail", new String[]{"jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder"}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 10:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.ITestCase", new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestable", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestable"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"});
      case 11:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestable"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestable"}, new String[]{});
      case 12:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.ITestable", new String[]{}, new String[]{}, new String[]{});
      case 13:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.Message", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 14:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder", new String[]{}, new String[]{}, new String[]{});
      case 15:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"}, new String[]{"jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod", "jetbrains.mps.baseLanguage.unitTest.structure.ITestable"}, new String[]{"jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"});
      case 16:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
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
