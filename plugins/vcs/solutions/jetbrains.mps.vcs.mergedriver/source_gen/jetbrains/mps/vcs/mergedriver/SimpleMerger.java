package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import jetbrains.mps.util.ReadUtil;
import jetbrains.mps.util.FileUtil;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Arrays;

/*package*/ class SimpleMerger extends AbstractFileMerger {
  private static byte[] LINE_SEPARATOR = System.getProperty("line.separator").getBytes();

  /*package*/ SimpleMerger() {
  }

  protected int mergeFiles(File baseFile, File localFile, File latestFile) {
    FileInputStream baseIS = null;
    FileInputStream localIS = null;
    FileInputStream latestIS = null;
    OutputStream out = null;
    try {
      baseIS = new FileInputStream(baseFile);
      localIS = new FileInputStream(localFile);
      latestIS = new FileInputStream(latestFile);

      byte[] baseContent = ReadUtil.read(baseIS);
      byte[] localContent = ReadUtil.read(localIS);
      byte[] latestContent = ReadUtil.read(latestIS);
      FileUtil.closeFileSafe(localIS);

      out = getResultStream(localFile);

      String baseAsString = contentAsString(baseContent);
      String localAsString = contentAsString(localContent);
      String latestAsString = contentAsString(latestContent);

      if (baseAsString.equals(localAsString)) {
        out.write(latestContent);
        return MERGED;
      }
      if (baseAsString.equals(latestAsString) || localAsString.equals(latestAsString)) {
        out.write(localContent);
        return MERGED;
      }
      // Make possible to load model id correctly when model is in conflicting state 
      out.write(extractHeader(localContent));

      out.write(myConflictStart);
      out.write(LINE_SEPARATOR);

      // current 
      out.write(localContent);
      out.write(mySeparator);
      out.write(LINE_SEPARATOR);

      // base 
      out.write(baseContent);
      out.write(mySeparator);
      out.write(LINE_SEPARATOR);

      // other 
      out.write(latestContent);
      out.write(myConflictEnd);
      out.write(LINE_SEPARATOR);

      return CONFLICTS;
    } catch (IOException e) {
      e.printStackTrace();
      return FATAL_ERROR;
    } finally {
      FileUtil.closeFileSafe(baseIS);
      FileUtil.closeFileSafe(localIS);
      FileUtil.closeFileSafe(latestIS);
      FileUtil.closeFileSafe(out);
    }
  }

  private static String contentAsString(byte[] bytes) {
    return new String(bytes, FileUtil.DEFAULT_CHARSET).replace("\r\n", "\n");
  }

  private static byte[] extractHeader(byte[] xmlContent) {
    String header = new String(xmlContent, 0, 1024, FileUtil.DEFAULT_CHARSET);

    // Pattern for finds text like _<persistence version="7"_ (without underscores) 
    Matcher matcher = Pattern.compile("<" + ModelPersistence.PERSISTENCE + "\\s+" + ModelPersistence.PERSISTENCE_VERSION + "=\"\\d+\"").matcher(header);
    if (matcher.find()) {
      int end = matcher.end();
      // Try to find _</persistence>_ or _/>_ (without underscores 
      for (String possibleEnd : ListSequence.fromList(Arrays.asList("</" + ModelPersistence.PERSISTENCE + ">", "/>"))) {
        int indexOf = header.indexOf(possibleEnd, end + 1);
        if (indexOf != -1) {
          header = header.substring(0, indexOf + possibleEnd.length()) + System.getProperty("line.separator");
          return header.getBytes(FileUtil.DEFAULT_CHARSET);
        }
      }
    }
    return new byte[0];
  }
}
