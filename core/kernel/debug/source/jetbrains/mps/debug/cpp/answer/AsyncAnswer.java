package jetbrains.mps.debug.cpp.answer;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 27.04.2010
 * Time: 22:30:58
 * To change this template use File | Settings | File Templates.
 */
public class AsyncAnswer extends StructuralAnswer {

  public static final char TOKEN_EXEC = '*';
  public static final char TOKEN_NOTIFY = '=';
  public static final char TOKEN_STATUS = '+';
  public static final String CLS_STOPPED = "stopped";

  public AsyncAnswer(char tokenChar, String asyncClass, RecordValue recordValue) {
    super(tokenChar, asyncClass, recordValue);
  }

  public boolean isExec() {
    return myTokenChar == TOKEN_EXEC;
  }

  public boolean isNotify() {
    return myTokenChar == TOKEN_NOTIFY;
  }

  public boolean isStatus() {
    return myTokenChar == TOKEN_STATUS;
  }

  public boolean isStopped() {
    return CLS_STOPPED.equals(myAnswerClass);
  }
}
