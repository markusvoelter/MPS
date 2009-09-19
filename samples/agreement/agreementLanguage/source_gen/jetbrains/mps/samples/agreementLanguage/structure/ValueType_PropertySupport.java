package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ValueType_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<ValueType> constants = ListSequence.fromList(ValueType.getConstants()).iterator();
    while (constants.hasNext()) {
      ValueType constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<ValueType> constants = ListSequence.fromList(ValueType.getConstants()).iterator();
    while (constants.hasNext()) {
      ValueType constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    ValueType constant = ValueType.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}
