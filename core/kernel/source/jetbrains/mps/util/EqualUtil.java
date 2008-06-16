package jetbrains.mps.util;

public class EqualUtil {
  public static boolean equals(Object o1, Object o2) {
    if(o1 == o2) return true;
    if(o1 == null || o2 == null) return false;
    return o1.equals(o2);
  }

  public static boolean equalsIgnoreCase(String s1, String s2) {
    if (s1 == s2) return true;
    if(s1 == null || s2 == null) return false;
    return s1.equalsIgnoreCase(s2);
  }

  public static int hashCode(Object o) {
    if (o == null) return 0; else return o.hashCode();
  }
}                                      
