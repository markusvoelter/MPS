package jetbrains.mps.bootstrap.sharedConcepts.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class NodePresentationOptions_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if(value == null) {
      return true;
    }
    Iterator<NodePresentationOptions> constants = NodePresentationOptions.getConstants().iterator();
    while(constants.hasNext()) {
      NodePresentationOptions constant = constants.next();
      if(value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }
  public String toInternalValue(String value) {
    if(value == null) {
      return null;
    }
    Iterator<NodePresentationOptions> constants = NodePresentationOptions.getConstants().iterator();
    while(constants.hasNext()) {
      NodePresentationOptions constant = constants.next();
      if(value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }
  public String fromInternalValue(String value) {
    NodePresentationOptions constant = NodePresentationOptions.parseValue(value);
    if(constant != null) {
      return constant.getName();
    }
    return null;
  }
}
