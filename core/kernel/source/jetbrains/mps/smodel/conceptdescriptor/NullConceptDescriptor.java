package jetbrains.mps.smodel.conceptdescriptor;

import jetbrains.mps.smodel.SNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NullConceptDescriptor implements ConceptDescriptor {
  public static ConceptDescriptor INSTANCE = new NullConceptDescriptor();

  private static Map<Class, Object> ourDefaultValue = new HashMap<Class, Object>();

  static {
    ourDefaultValue.put(Byte.class, (byte) 0);
    ourDefaultValue.put(Short.class, (short) 0);
    ourDefaultValue.put(Integer.class, (int) 0);
    ourDefaultValue.put(Long.class, (long) 0);
    ourDefaultValue.put(Float.class, (float) 0);
    ourDefaultValue.put(Double.class, (double) 0);
    ourDefaultValue.put(Boolean.class, false);
    ourDefaultValue.put(Void.class, null);
  }

  private NullConceptDescriptor() {
  }

  @Override
  public Set<String> getParentsNames() {
    // todo: throw runtime error?
    return null;
  }

  @Override
  public boolean isAssignableTo(String toConceptFqName) {
    // todo: throw runtime error?
    return false;
  }

  @Override
  public Set<String> getAncestorsNames() {
    // todo: throw runtime error?
    return null;
  }

  @Override
  public void initNode(SNode node) {
  }

  @Override
  public <T> T invoke(Class<T> returnType, SNode node, String methodName, Class[] parametersTypes, Object... parameters) {
    if (ourDefaultValue.containsKey(returnType)) {
      return (T) ourDefaultValue.get(returnType);
    } else {
      return null;
    }
  }

  @Override
  public <T> T invokeSuper(Class<T> returnType, SNode node, String callerConceptFqName, String methodName, Class[] parametersTypes, Object... parameters) {
    if (ourDefaultValue.containsKey(returnType)) {
      return (T) ourDefaultValue.get(returnType);
    } else {
      return null;
    }
  }
}
