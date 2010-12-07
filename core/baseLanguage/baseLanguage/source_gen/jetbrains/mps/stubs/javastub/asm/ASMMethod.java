package jetbrains.mps.stubs.javastub.asm;

/*Generated by MPS */

import org.objectweb.asm.tree.MethodNode;
import java.util.List;
import org.objectweb.asm.Type;
import java.util.Collections;
import java.util.ArrayList;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.Opcodes;

public class ASMMethod {
  private MethodNode myMethod;
  private ASMType myReturnType;
  private ASMType myGenericReturnType;
  private List<ASMTypeVariable> myTypeVariables;
  private List<ASMType> myParameterTypes;
  private List<ASMType> myGenericParameterTypes;
  private List<String> myParameterNames;
  private List<List<ASMAnnotation>> myParameterAnnotations;
  private List<ASMType> myExceptions;
  private List<ASMAnnotation> myAnnotations;
  private Object myAnnotationDefault;

  /*package*/ ASMMethod(MethodNode method) {
    myMethod = method;
    myReturnType = TypeUtil.fromType(Type.getReturnType(method.desc));
    if (method.signature != null) {
      myTypeVariables = ((List<ASMTypeVariable>) ((List) Collections.unmodifiableList(TypeUtil.getFormalTypeParameters(method.signature))));
    } else {
      myTypeVariables = ((List<ASMTypeVariable>) ((List) Collections.emptyList()));
    }
    if (method.signature != null) {
      myGenericReturnType = TypeUtil.getReturnType(method.signature);
    } else {
      myGenericReturnType = myReturnType;
    }
    Type[] argumentTypes = Type.getArgumentTypes(method.desc);
    myParameterTypes = (argumentTypes.length > 0 ?
      new ArrayList<ASMType>(argumentTypes.length) :
      ((List<ASMType>) ((List) Collections.emptyList()))
    );
    for (Type t : argumentTypes) {
      myParameterTypes.add(TypeUtil.fromType(t));
    }
    if (method.signature != null) {
      myGenericParameterTypes = TypeUtil.getParameterTypes(method.signature);
    } else {
      myGenericParameterTypes = myParameterTypes;
    }
    if (isVarArg()) {
      int lastIndex = myGenericParameterTypes.size() - 1;
      ASMType lastParamType = myGenericParameterTypes.get(lastIndex);
      if (lastParamType instanceof ASMArrayType) {
        myGenericParameterTypes.set(lastIndex, new ASMVarArgType(((ASMArrayType) lastParamType).getElementType()));
      }
      if (myGenericParameterTypes != myParameterTypes) {
        lastIndex = myParameterTypes.size() - 1;
        lastParamType = myParameterTypes.get(lastIndex);
        if (lastParamType instanceof ASMArrayType) {
          myParameterTypes.set(lastIndex, new ASMVarArgType(((ASMArrayType) lastParamType).getElementType()));
        }
      }
    }
    myParameterAnnotations = new ArrayList<List<ASMAnnotation>>(myParameterTypes.size());
    for (int i = 0; i < myParameterTypes.size(); i++) {
      List<ASMAnnotation> annotations = null;
      if (myMethod.visibleParameterAnnotations != null && myMethod.visibleParameterAnnotations[i] != null) {
        for (AnnotationNode an : (List<AnnotationNode>) myMethod.visibleParameterAnnotations[i]) {
          if (annotations == null) {
            annotations = new ArrayList<ASMAnnotation>();
          }
          annotations.add(new ASMAnnotation(an));
        }
      }
      if (myMethod.invisibleParameterAnnotations != null && myMethod.invisibleParameterAnnotations[i] != null) {
        for (AnnotationNode an : (List<AnnotationNode>) myMethod.invisibleParameterAnnotations[i]) {
          if (annotations == null) {
            annotations = new ArrayList<ASMAnnotation>();
          }
          annotations.add(new ASMAnnotation(an));
        }
      }
      myParameterAnnotations.add((annotations == null ?
        ((List<ASMAnnotation>) ((List) Collections.emptyList())) :
        annotations
      ));
    }
    List<ASMType> exceptions = new ArrayList<ASMType>(0);
    if (method.signature != null) {
      exceptions = TypeUtil.getExceptionTypes(method.signature);
    }
    if (!(exceptions.isEmpty())) {
      myExceptions = exceptions;
    } else {
      myExceptions = new ArrayList<ASMType>(myMethod.exceptions.size());
      for (String s : (List<String>) myMethod.exceptions) {
        myExceptions.add(new ASMClassType(s.replace('/', '.')));
      }
    }
    if (myMethod.visibleAnnotations != null || myMethod.invisibleAnnotations != null) {
      int size = ((myMethod.visibleAnnotations != null ?
        myMethod.visibleAnnotations.size() :
        0
      )) + ((myMethod.invisibleAnnotations != null ?
        myMethod.invisibleAnnotations.size() :
        0
      ));
      myAnnotations = new ArrayList<ASMAnnotation>(size);
      if (myMethod.visibleAnnotations != null) {
        for (AnnotationNode an : (List<AnnotationNode>) myMethod.visibleAnnotations) {
          ASMAnnotation aa = new ASMAnnotation(an);
          myAnnotations.add(aa);
        }
      }
      if (myMethod.invisibleAnnotations != null) {
        for (AnnotationNode an : (List<AnnotationNode>) myMethod.invisibleAnnotations) {
          ASMAnnotation aa = new ASMAnnotation(an);
          myAnnotations.add(aa);
        }
      }
    }
    if (!(myParameterTypes.isEmpty())) {
      myParameterNames = new ArrayList<String>(myParameterTypes.size());
      for (int i = 0; i < myParameterTypes.size(); i++) {
        myParameterNames.add("p" + i);
      }
      if (method.localVariables != null && myParameterTypes.size() < method.localVariables.size()) {
        int offset = (!(isStatic()) ?
          1 :
          0
        );
        for (Object lv : method.localVariables) {
          LocalVariableNode node = ((LocalVariableNode) lv);
          int index = node.index - offset;
          if (index >= 0 && index < myParameterTypes.size()) {
            myParameterNames.set(index, node.name);
          }
        }
      }
    }
    if (method.annotationDefault != null) {
      myAnnotationDefault = ASMAnnotation.processValue(method.annotationDefault);
    }
  }

  public Object getAnnotationDefault() {
    return myAnnotationDefault;
  }

  public String getName() {
    return myMethod.name;
  }

  public boolean isVarArg() {
    return (Opcodes.ACC_VARARGS & myMethod.access) != 0;
  }

  public boolean isPrivate() {
    return (Opcodes.ACC_PRIVATE & myMethod.access) != 0;
  }

  public boolean isPublic() {
    return (Opcodes.ACC_PUBLIC & myMethod.access) != 0;
  }

  public boolean isProtected() {
    return (Opcodes.ACC_PROTECTED & myMethod.access) != 0;
  }

  public boolean isPackageProtected() {
    return !(isPublic()) && !(isPrivate()) && !(isProtected());
  }

  public boolean isStatic() {
    return (Opcodes.ACC_STATIC & myMethod.access) != 0;
  }

  public boolean isDeprecated() {
    return (Opcodes.ACC_DEPRECATED & myMethod.access) != 0;
  }

  public boolean isFinal() {
    return (Opcodes.ACC_FINAL & myMethod.access) != 0;
  }

  public boolean isAbstract() {
    return (Opcodes.ACC_ABSTRACT & myMethod.access) != 0;
  }

  public boolean isBridge() {
    return (Opcodes.ACC_BRIDGE & myMethod.access) != 0;
  }

  public boolean isConstructor() {
    return myMethod.name.equals("<init>");
  }

  public boolean isCompilerGenerated() {
    return myMethod.name.startsWith("access$") || myMethod.name.equals("<clinit>");
  }

  public List<ASMTypeVariable> getTypeParameters() {
    return myTypeVariables;
  }

  public ASMType getReturnType() {
    return myReturnType;
  }

  public ASMType getGenericReturnType() {
    return myGenericReturnType;
  }

  public List<ASMAnnotation> getAnnotations() {
    return (myAnnotations == null ?
      ((List<ASMAnnotation>) ((List) Collections.emptyList())) :
      Collections.unmodifiableList(myAnnotations)
    );
  }

  public List<ASMType> getParameterTypes() {
    return Collections.unmodifiableList(myParameterTypes);
  }

  public List<ASMType> getGenericParameterTypes() {
    return Collections.unmodifiableList(myGenericParameterTypes);
  }

  public List<String> getParameterNames() {
    return ((myParameterNames == null ?
      ((List<String>) ((List) Collections.emptyList())) :
      Collections.unmodifiableList(myParameterNames)
    ));
  }

  public List<List<ASMAnnotation>> getParameterAnnotations() {
    return Collections.unmodifiableList(myParameterAnnotations);
  }

  public List<ASMType> getExceptionTypes() {
    return Collections.unmodifiableList(myExceptions);
  }
}
