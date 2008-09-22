package jetbrains.mps.logging;

import jetbrains.mps.util.PathManager;
import org.apache.log4j.RollingFileAppender;

import java.io.File;

/**
 * @author Kostik
 */
public class MPSFileAppender extends RollingFileAppender {

  public MPSFileAppender() {
    File logDir = new File(PathManager.getHomePath(), "log");

    File logFile = new File(logDir, "mps.log");

    setFile(logFile.getAbsolutePath());
  }
}
