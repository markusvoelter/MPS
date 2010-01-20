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
    this.myMethod = method;
    this.myReturnType = TypeUtil.fromType(Type.getReturnType(method.desc));
    if (method.signature != null) {
      this.myTypeVariables = ((List<ASMTypeVariable>) ((List) Collections.unmodifiableList(TypeUtil.getFormalTypeParameters(method.signature))));
    } else {
      this.myTypeVariables = ((List<ASMTypeVariable>) ((List) Collections.emptyList()));
    }
    if (method.signature != null) {
      this.myGenericReturnType = TypeUtil.getReturnType(method.signature);
    } else {
      this.myGenericReturnType = this.myReturnType;
    }
    Type[] argumentTypes = Type.getArgumentTypes(method.desc);
    this.myParameterTypes = (argumentTypes.length > 0 ?
      new ArrayList<ASMType>(argumentTypes.length) :
      ((List<ASMType>) ((List) Collections.emptyList()))
    );
    for (Type t : argumentTypes) {
      this.myParameterTypes.add(TypeUtil.fromType(t));
    }
    if (method.signature != null) {
      this.myGenericParameterTypes = TypeUtil.getParameterTypes(method.signature);
    } else {
      this.myGenericParameterTypes = this.myParameterTypes;
    }
    if (this.isVarArg()) {
      int lastIndex = this.myGenericParameterTypes.size() - 1;
      ASMType lastParamType = this.myGenericParameterTypes.get(lastIndex);
      if (lastParamType instanceof ASMArrayType) {
        this.myGenericParameterTypes.set(lastIndex, new ASMVarArgType(((ASMArrayType) lastParamType).getElementType()));
      }
      if (this.myGenericParameterTypes != this.myParameterTypes) {
        lastIndex = this.myParameterTypes.size() - 1;
        lastParamType = this.myParameterTypes.get(lastIndex);
        if (lastParamType instanceof ASMArrayType) {
          this.myParameterTypes.set(lastIndex, new ASMVarArgType(((ASMArrayType) lastParamType).getElementType()));
        }
      }
    }
    this.myParameterAnnotations = new ArrayList<List<ASMAnnotation>>(this.myParameterTypes.size());
    for (int i = 0; i < this.myParameterTypes.size(); i++) {
      List<ASMAnnotation> annotations = null;
      if (this.myMethod.visibleParameterAnnotations != null && this.myMethod.visibleParameterAnnotations[i] != null) {
        for (AnnotationNode an : (List<AnnotationNode>) this.myMethod.visibleParameterAnnotations[i]) {
          if (annotations == null) {
            annotations = new ArrayList<ASMAnnotation>();
          }
          annotations.add(new ASMAnnotation(an));
        }
      }
      if (this.myMethod.invisibleParameterAnnotations != null && this.myMethod.invisibleParameterAnnotations[i] != null) {
        for (AnnotationNode an : (List<AnnotationNode>) this.myMethod.invisibleParameterAnnotations[i]) {
          if (annotations == null) {
            annotations = new ArrayList<ASMAnnotation>();
          }
          annotations.add(new ASMAnnotation(an));
        }
      }
      this.myParameterAnnotations.add((annotations == null ?
        ((List<ASMAnnotation>) ((List) Collections.emptyList())) :
        annotations
      ));
    }
    List<ASMType> exceptions = new ArrayList<ASMType>(0);
    if (method.signature != null) {
      exceptions = TypeUtil.getExceptionTypes(method.signature);
    }
    if (!(exceptions.isEmpty())) {
      this.myExceptions = exceptions;
    } else {
      this.myExceptions = new ArrayList<ASMType>(this.myMethod.exceptions.size());
      for (String s : (List<String>) this.myMethod.exceptions) {
        this.myExceptions.add(new ASMClassType(s.replace('/', '.')));
      }
    }
    if (this.myMethod.visibleAnnotations != null || this.myMethod.invisibleAnnotations != null) {
      int size = ((this.myMethod.visibleAnnotations != null ?
        this.myMethod.visibleAnnotations.size() :
        0
      )) + ((this.myMethod.invisibleAnnotations != null ?
        this.myMethod.invisibleAnnotations.size() :
        0
      ));
      this.myAnnotations = new ArrayList<ASMAnnotation>(size);
      if (this.myMethod.visibleAnnotations != null) {
        for (AnnotationNode an : (List<AnnotationNode>) this.myMethod.visibleAnnotations) {
          ASMAnnotation aa = new ASMAnnotation(an);
          this.myAnnotations.add(aa);
        }
      }
      if (this.myMethod.invisibleAnnotations != null) {
        for (AnnotationNode an : (List<AnnotationNode>) this.myMethod.invisibleAnnotations) {
          ASMAnnotation aa = new ASMAnnotation(an);
          this.myAnnotations.add(aa);
        }
      }
    }
    if (!(this.myParameterTypes.isEmpty())) {
      this.myParameterNames = new ArrayList<String>(this.myParameterTypes.size());
      for (int i = 0; i < this.myParameterTypes.size(); i++) {
        this.myParameterNames.add("p" + i);
      }
      if (method.localVariables != null && this.myParameterTypes.size() < method.localVariables.size()) {
        int offset = (!(this.isStatic()) ?
          1 :
          0
        );
        for (Object lv : method.localVariables) {
          LocalVariableNode node = ((LocalVariableNode) lv);
          int index = node.index - offset;
          if (index >= 0 && index < this.myParameterTypes.size()) {
            this.myParameterNames.set(index, node.name);
          }
        }
      }
    }
    if (method.annotationDefault != null) {
      this.myAnnotationDefault = ASMAnnotation.processValue(method.annotationDefault);
    }
  }

  public Object getAnnotationDefault() {
    return this.myAnnotationDefault;
  }

  public String getName() {
    return this.myMethod.name;
  }

  public boolean isVarArg() {
    return (Opcodes.ACC_VARARGS & this.myMethod.access) != 0;
  }

  public boolean isPrivate() {
    return (Opcodes.ACC_PRIVATE & this.myMethod.access) != 0;
  }

  public boolean isPublic() {
    return (Opcodes.ACC_PUBLIC & this.myMethod.access) != 0;
  }

  public boolean isProtected() {
    return (Opcodes.ACC_PROTECTED & this.myMethod.access) != 0;
  }

  public boolean isPackageProtected() {
    return !(this.isPublic()) && !(this.isPrivate()) && !(this.isProtected());
  }

  public boolean isStatic() {
    return (Opcodes.ACC_STATIC & this.myMethod.access) != 0;
  }

  public boolean isDeprecated() {
    return (Opcodes.ACC_DEPRECATED & this.myMethod.access) != 0;
  }

  public boolean isFinal() {
    return (Opcodes.ACC_FINAL & this.myMethod.access) != 0;
  }

  public boolean isAbstract() {
    return (Opcodes.ACC_ABSTRACT & this.myMethod.access) != 0;
  }

  public boolean isBridge() {
    return (Opcodes.ACC_BRIDGE & this.myMethod.access) != 0;
  }

  public boolean isConstructor() {
    return this.myMethod.name.equals("<init>");
  }

  public boolean isCompilerGenerated() {
    return this.myMethod.name.startsWith("access$") || this.myMethod.name.equals("<clinit>");
  }

  public List<ASMTypeVariable> getTypeParameters() {
    return this.myTypeVariables;
  }

  public ASMType getReturnType() {
    return this.myReturnType;
  }

  public ASMType getGenericReturnType() {
    return this.myGenericReturnType;
  }

  public List<ASMAnnotation> getAnnotations() {
    return (this.myAnnotations == null ?
      ((List<ASMAnnotation>) ((List) Collections.emptyList())) :
      Collections.unmodifiableList(this.myAnnotations)
    );
  }

  public List<ASMType> getParameterTypes() {
    return Collections.unmodifiableList(this.myParameterTypes);
  }

  public List<ASMType> getGenericParameterTypes() {
    return Collections.unmodifiableList(this.myGenericParameterTypes);
  }

  public List<String> getParameterNames() {
    return ((this.myParameterNames == null ?
      ((List<String>) ((List) Collections.emptyList())) :
      Collections.unmodifiableList(this.myParameterNames)
    ));
  }

  public List<List<ASMAnnotation>> getParameterAnnotations() {
    return Collections.unmodifiableList(this.myParameterAnnotations);
  }

  public List<ASMType> getExceptionTypes() {
    return Collections.unmodifiableList(this.myExceptions);
  }
}
