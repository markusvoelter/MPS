package jetbrains.mps.xml.deprecated.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.xml.deprecated.structure.Attribute", "jetbrains.mps.xml.deprecated.structure.Document", "jetbrains.mps.xml.deprecated.structure.DocumentTypeDeclaration", "jetbrains.mps.xml.deprecated.structure.Element", "jetbrains.mps.xml.deprecated.structure.ElementPart", "jetbrains.mps.xml.deprecated.structure.ExternalId", "jetbrains.mps.xml.deprecated.structure.PublicId", "jetbrains.mps.xml.deprecated.structure.Text"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.Attribute", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"value"}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.Document", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"extension"}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.DocumentTypeDeclaration", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.Element", "jetbrains.mps.xml.deprecated.structure.ElementPart", false, new String[]{"jetbrains.mps.xml.deprecated.structure.ElementPart"}, new String[]{"collapse"}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.ElementPart", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.ExternalId", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.PublicId", "jetbrains.mps.xml.deprecated.structure.ExternalId", false, new String[]{"jetbrains.mps.xml.deprecated.structure.ExternalId"}, new String[]{"publicID", "systemID"}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.xml.deprecated.structure.Text", "jetbrains.mps.xml.deprecated.structure.ElementPart", false, new String[]{"jetbrains.mps.xml.deprecated.structure.ElementPart"}, new String[]{"text"}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
