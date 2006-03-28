package jetbrains.mps.reloading;

import jetbrains.mps.util.CollectionUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author Kostik
 */
public class JarFileClassPathItem implements IClassPathItem {
  private ZipFile myZipFile;
  private String myPrefix;
  private File myFile;

  private Map<String, Set<String>> myClasses = new HashMap<String, Set<String>>();
  private Map<String, Set<String>> mySubpackages = new HashMap<String, Set<String>>();
  private Map<String, ZipEntry> myEntries = new HashMap<String, ZipEntry>();

  public JarFileClassPathItem(String path) {
    this(new File(path));
  }

  public JarFileClassPathItem(File jarFile) {
    try {
      myFile = jarFile;
      myPrefix = "jar:" + jarFile.toURL() + "!/";
      myZipFile = new ZipFile(jarFile);
    } catch (IOException e) {
      e.printStackTrace();
    }

    buildCaches();
  }

  public File getFile() {
    return myFile;
  }

  public byte[] getClass(String name) {
    ZipEntry entry = myEntries.get(name);
    if (entry == null) return null;
    try {
      InputStream inp = myZipFile.getInputStream(entry);

      byte[] result = new byte[(int) entry.getSize()];
      int current = 0;

      while (true) {
        int b = inp.read();
        if (b == -1) break;
        result[current++] = (byte) b;
      }

      if (current != result.length) {
        throw new RuntimeException("this can't happen");
      }

      inp.close();
      return result;
    } catch (IOException e) {
      return null;
    }
  }

  private long getClassTimestamp(String name) {
    String path = name.replace('.', '/') + ".class";
    ZipEntry entry = myZipFile.getEntry(path);
    return entry.getTime();
  }

  public URL getResource(String name) {
    try {
      if (myZipFile.getEntry(myPrefix) == null) return null;
      return new URL(myPrefix + name);
    } catch (MalformedURLException e) {
      return null;
    }
  }

  public Set<String> getAvailableClasses(String namespace) {
    return new HashSet<String>(getClassesSetFor(namespace));
  }

  public Set<String> getSubpackages(String namespace) {
    return new HashSet<String>(getSubpackagesSetFor(namespace));
  }

  public long getClassesTimestamp(String namespace) {
    long timestamp = 0;
    for (String cls : getAvailableClasses(namespace)) {
      timestamp = Math.max(timestamp, getClassTimestamp(namespace + "." + cls));
    }
    return timestamp;
  }

  private Set<String> getClassesSetFor(String pack) {
    if (!myClasses.containsKey(pack)) {
      myClasses.put(pack, new HashSet<String>());
    }
    return myClasses.get(pack);
  }

  private Set<String> getSubpackagesSetFor(String pack) {
    if (!mySubpackages.containsKey(pack)) {
      mySubpackages.put(pack, new HashSet<String>());
    }
    return mySubpackages.get(pack);
  }

  private void buildCaches() {
    Iterable<? extends ZipEntry> entries = CollectionUtil.enumerationAsIterable(myZipFile.entries());

    for (ZipEntry entry : entries) {
      if (entry.isDirectory()) {
        String name = entry.getName();
        if (name.endsWith("/")) {
          name = name.substring(0, name.length() - 1);
        }

        String pack =  name.replace('/', '.');
        buildPackageCaches(pack);
      } else {
        String name = entry.getName();
        int packEnd = name.lastIndexOf('/');
        String pack = packEnd > 0 ? name.substring(0, packEnd).replace('/', '.') : name;
        buildPackageCaches(pack);

        String className = name.substring(packEnd + 1, name.length() - ".class".length());
        getClassesSetFor(pack).add(className);

        if (pack.length() > 0) {
          myEntries.put(pack + "." + className, entry);
        } else {
          myEntries.put(className, entry);
        }

      }
    }
  }

  private void buildPackageCaches(String namespace) {
    String parent = getParentPackage(namespace);
    if (parent.equals(namespace)) return;
    getSubpackagesSetFor(parent).add(namespace);
    buildPackageCaches(parent);
  }

  private String getParentPackage(String pack) {
    int lastDot = pack.lastIndexOf(".");
    if (lastDot == -1) return "";
    return pack.substring(0, lastDot);
  }

  public static void main(String[] args) {
    JarFileClassPathItem item = new JarFileClassPathItem(new File("lib/junit.jar"));

    System.err.println(item.getSubpackages("junit"));
  }
}
