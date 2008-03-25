package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class Option_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<Option> constants = Option.getConstants().iterator();
    while(constants.hasNext()) {
      Option constant = constants.next();
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
    Iterator<Option> constants = Option.getConstants().iterator();
    while(constants.hasNext()) {
      Option constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    Option constant = Option.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return null;
  }

}
