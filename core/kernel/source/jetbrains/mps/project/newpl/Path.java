package jetbrains.mps.project.newpl;

public class Path implements Comparable {
  private String myPath;
  private String myMPSFolder;

  public Path() {
  }

  public Path(String path) {
    myPath = path;
  }

  public String getPath() {
    return myPath;
  }

  public void setPath(String path) {
    myPath = path;
  }

  public String getMPSFolder() {
    return myMPSFolder;
  }

  public void setMPSFolder(String MPSFolder) {
    myMPSFolder = MPSFolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Path path = (Path) o;

    if (myPath != null ? !myPath.equals(path.myPath) : path.myPath != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = myPath != null ? myPath.hashCode() : 0;
    result = 31 * result + (myMPSFolder != null ? myMPSFolder.hashCode() : 0);
    return result;
  }

  public int compareTo(Object o) {
    assert o instanceof Path;

    return myPath.compareTo(((Path)o).myPath);
  }
}
