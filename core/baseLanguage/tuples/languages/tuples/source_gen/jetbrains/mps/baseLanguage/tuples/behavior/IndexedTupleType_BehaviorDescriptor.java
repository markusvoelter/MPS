package jetbrains.mps.baseLanguage.tuples.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Type_BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;

public class IndexedTupleType_BehaviorDescriptor extends Type_BehaviorDescriptor {
  public IndexedTupleType_BehaviorDescriptor() {
  }

  public List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    return IndexedTupleType_Behavior.virtual_getVariableSuffixes_1213877337304(thisNode);
  }

  public String virtual_getPresentation_1213877396640(SNode thisNode) {
    return IndexedTupleType_Behavior.virtual_getPresentation_1213877396640(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleType";
  }
}
