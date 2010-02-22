package jetbrains.mps.debug;

/*Generated by MPS */

import org.jdom.Element;
import org.jdom.DataConversionException;
import org.apache.commons.lang.ObjectUtils;

public class PositionInfo implements Comparable<PositionInfo> {
  private static String FILE_NAME = "fileName";
  private static String START_LINE = "startLine";
  private static String START_POSITION = "startPosition";
  private static String END_LINE = "endLine";
  private static String END_POSITION = "endPosition";
  private static String NODE_ID = "nodeId";

  private String myFileName;
  private String myNodeId;
  private int myStartLine;
  private int myStartPosition;
  private int myEndLine;
  private int myEndPosition;

  public PositionInfo() {
  }

  public PositionInfo(Element element) throws DataConversionException {
    this.myNodeId = element.getAttribute(NODE_ID).getValue();
    this.myFileName = element.getAttribute(FILE_NAME).getValue();
    this.myStartLine = element.getAttribute(START_LINE).getIntValue();
    this.myStartPosition = element.getAttribute(START_POSITION).getIntValue();
    this.myEndLine = element.getAttribute(END_LINE).getIntValue();
    this.myEndPosition = element.getAttribute(END_POSITION).getIntValue();
  }

  public String getFileName() {
    return this.myFileName;
  }

  public String getNodeId() {
    return this.myNodeId;
  }

  public int getStartLine() {
    return this.myStartLine;
  }

  public int getStartPosition() {
    return this.myStartPosition;
  }

  public int getEndLine() {
    return this.myEndLine;
  }

  public int getEndPosition() {
    return this.myEndPosition;
  }

  public void setFileName(String fileName) {
    this.myFileName = fileName;
  }

  public void setNodeId(String nodeIf) {
    this.myNodeId = nodeIf;
  }

  public void setStartLine(int startLine) {
    this.myStartLine = startLine;
  }

  public void setStartPosition(int startPosition) {
    this.myStartPosition = startPosition;
  }

  public void setEndLine(int endLine) {
    this.myEndLine = endLine;
  }

  public void setEndPosition(int endPosition) {
    this.myEndPosition = endPosition;
  }

  public String getFileAndLine() {
    return this.myFileName + ":" + (this.myStartLine + 1);
  }

  public int getLineDistance() {
    return this.myEndLine - this.myStartLine;
  }

  public void saveTo(Element element) {
    element.setAttribute(NODE_ID, this.myNodeId);
    element.setAttribute(FILE_NAME, this.myFileName);
    element.setAttribute(START_LINE, Integer.toString(this.myStartLine));
    element.setAttribute(START_POSITION, Integer.toString(this.myStartPosition));
    element.setAttribute(END_LINE, Integer.toString(this.myEndLine));
    element.setAttribute(END_POSITION, Integer.toString(this.myEndPosition));
  }

  public String toString() {
    return this.myFileName + "(" + this.myStartLine + ":" + this.myStartPosition + " " + this.myEndLine + ":" + this.myEndPosition + ")";
  }

  public int compareTo(PositionInfo p) {
    if (ObjectUtils.equals(this.getLineDistance(), p.getLineDistance())) {
      if (ObjectUtils.equals(this.myStartLine, p.myStartLine)) {
        return this.myStartPosition - p.myStartPosition;
      } else {
        return this.myStartLine - p.myStartLine;
      }
    } else {
      return this.getLineDistance() - p.getLineDistance();
    }
  }

  public void fillFrom(PositionInfo position) {
    this.myNodeId = position.myNodeId;
    this.myFileName = position.myFileName;
    this.myStartLine = position.myStartLine;
    this.myStartPosition = position.myStartPosition;
    this.myEndLine = position.myEndLine;
    this.myEndPosition = position.myEndPosition;
  }
}
