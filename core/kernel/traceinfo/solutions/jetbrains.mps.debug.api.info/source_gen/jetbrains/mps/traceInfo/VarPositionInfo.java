package jetbrains.mps.traceInfo;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jdom.Element;
import org.jdom.DataConversionException;
import org.jdom.Attribute;

public class VarPositionInfo extends PositionInfo {
  private static String VAR_NAME = "varName";

  private String myVarName;

  public VarPositionInfo() {
  }

  public VarPositionInfo(@NotNull Element element) throws DataConversionException {
    super(element);
    myVarName = check_ygc27_a0b0b(element.getAttribute(VarPositionInfo.VAR_NAME));
  }

  @Override
  public void saveTo(Element element) {
    super.saveTo(element);
    element.setAttribute(VarPositionInfo.VAR_NAME, myVarName);
  }

  public String getVarName() {
    return myVarName;
  }

  public void setVarName(String varName) {
    myVarName = varName;
  }

  @Override
  public int compareTo(PositionInfo p) {
    int result = super.compareTo(p);
    if (result != 0) {
      return result;
    }
    assert p instanceof VarPositionInfo;
    VarPositionInfo vpi = (VarPositionInfo) p;
    return myVarName.compareTo(vpi.myVarName);
  }

  private static String check_ygc27_a0b0b(Attribute checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getValue();
    }
    return null;
  }
}
