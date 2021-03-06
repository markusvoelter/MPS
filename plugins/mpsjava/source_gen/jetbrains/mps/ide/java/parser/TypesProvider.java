package jetbrains.mps.ide.java.parser;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import org.eclipse.jdt.internal.compiler.lookup.TypeBinding;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;
import org.eclipse.jdt.internal.compiler.lookup.BaseTypeBinding;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.eclipse.jdt.internal.compiler.lookup.ArrayBinding;
import org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding;
import org.eclipse.jdt.internal.compiler.lookup.WildcardBinding;
import org.eclipse.jdt.internal.compiler.ast.Wildcard;
import org.eclipse.jdt.internal.compiler.lookup.ParameterizedTypeBinding;
import org.eclipse.jdt.internal.compiler.lookup.RawTypeBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding;
import org.eclipse.jdt.internal.compiler.lookup.MissingTypeBinding;
import org.eclipse.jdt.internal.compiler.lookup.ProblemReferenceBinding;
import jetbrains.mps.smodel.SReference;
import org.eclipse.jdt.internal.compiler.lookup.BinaryTypeBinding;
import org.eclipse.jdt.internal.compiler.lookup.TypeVariableBinding;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.StaticReference;
import org.eclipse.jdt.internal.compiler.lookup.MethodBinding;
import org.eclipse.jdt.internal.compiler.lookup.ParameterizedMethodBinding;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.util.NodeNameUtil;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.smodel.LanguageID;
import org.eclipse.jdt.internal.compiler.lookup.FieldBinding;
import org.eclipse.jdt.internal.compiler.lookup.ParameterizedFieldBinding;
import org.eclipse.jdt.internal.compiler.lookup.Binding;
import java.util.Map;
import java.util.HashSet;

public class TypesProvider {
  private static final Logger LOG = Logger.getLogger(TypesProvider.class);

  /*package*/ ReferentsCreator myReferentsCreator;

  public TypesProvider(ReferentsCreator referentsCreator) {
    myReferentsCreator = referentsCreator;
  }

  public SNode createType(TypeBinding binding) {
    return createType(binding, false);
  }

  private void setComponentType(SNode vector, SNode component) {
    if (SNodeOperations.isInstanceOf(vector, "jetbrains.mps.baseLanguage.structure.ArrayType")) {
      SLinkOperations.setTarget(SNodeOperations.cast(vector, "jetbrains.mps.baseLanguage.structure.ArrayType"), "componentType", component, true);
    }
    if (SNodeOperations.isInstanceOf(vector, "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
      SLinkOperations.setTarget(SNodeOperations.cast(vector, "jetbrains.mps.baseLanguage.structure.VariableArityType"), "componentType", component, true);
    }
  }

  public SNode createType(TypeBinding binding, boolean varArg) {
    SModel model = myReferentsCreator.myCurrentModel;
    if (binding instanceof BaseTypeBinding) {
      if (binding == TypeBinding.BOOLEAN) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.BooleanType", null);
      }
      if (binding == TypeBinding.BYTE) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ByteType", null);
      }
      if (binding == TypeBinding.CHAR) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.CharType", null);
      }
      if (binding == TypeBinding.DOUBLE) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.DoubleType", null);
      }
      if (binding == TypeBinding.FLOAT) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.FloatType", null);
      }
      if (binding == TypeBinding.INT) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.IntegerType", null);
      }
      if (binding == TypeBinding.LONG) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.LongType", null);
      }
      if (binding == TypeBinding.SHORT) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ShortType", null);
      }
      if (binding == TypeBinding.VOID) {
        return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.VoidType", null);
      }
      throw new JavaConverterException("Unknown base type : " + binding);
    }
    if (binding instanceof ArrayBinding) {
      ArrayBinding arrayBinding = (ArrayBinding) binding;
      TypeBinding componentTypeBinding = arrayBinding.leafComponentType;
      int dimensions = arrayBinding.dimensions;
      SNode outerType = (varArg ?
        SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.VariableArityType", null) :
        SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ArrayType", null)
      );
      SNode smallestVectorType = outerType;
      while (dimensions > 1) {
        SNode newArrayType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ArrayType", null);
        setComponentType(smallestVectorType, newArrayType);
        smallestVectorType = newArrayType;
        dimensions--;
      }
      setComponentType(smallestVectorType, createType(componentTypeBinding));
      return outerType;
    }
    if (binding instanceof ReferenceBinding) {
      if (binding instanceof WildcardBinding) {
        WildcardBinding wildcardBinding = (WildcardBinding) binding;
        if (wildcardBinding.isUnboundWildcard()) {
          return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.WildCardType", null);
        } else {
          if (wildcardBinding.boundKind == Wildcard.EXTENDS) {
            SNode upperBoundType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.UpperBoundType", null);
            SLinkOperations.setTarget(upperBoundType, "bound", createType(wildcardBinding.bound), true);
            return upperBoundType;
          } else {
            SNode lowerBoundType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.LowerBoundType", null);
            SLinkOperations.setTarget(lowerBoundType, "bound", createType(wildcardBinding.bound), true);
            return lowerBoundType;
          }
        }
      }
      if (binding instanceof ParameterizedTypeBinding) {
        ParameterizedTypeBinding parameterizedTypeBinding = (ParameterizedTypeBinding) binding;
        ReferenceBinding originalType = parameterizedTypeBinding.genericType();
        SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        result.addReference(createClassifierReference(originalType, "classifier", result));
        if (!((parameterizedTypeBinding instanceof RawTypeBinding))) {
          TypeBinding[] typeBindings = parameterizedTypeBinding.arguments;
          if (typeBindings != null) {
            for (TypeBinding typeBinding : typeBindings) {
              ListSequence.fromList(SLinkOperations.getTargets(result, "parameter", true)).addElement(createType(typeBinding));
            }
          }
        }
        return result;
      }
      if (binding instanceof SourceTypeBinding) {
        SNode classifierType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        SLinkOperations.setTarget(classifierType, "classifier", SNodeOperations.cast(myReferentsCreator.myBindingMap.get(binding), "jetbrains.mps.baseLanguage.structure.Classifier"), false);
        SNodeOperations.getReference(classifierType, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", "classifier")).setResolveInfo(new String(binding.sourceName()));
        return classifierType;
      }
      if (binding instanceof MissingTypeBinding || binding instanceof ProblemReferenceBinding) {
        SNode classifierType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        SReference reference = createErrorClassifierReference("classifier", (ReferenceBinding) binding, classifierType);
        classifierType.addReference(reference);
        return classifierType;
      }
      if (binding instanceof BinaryTypeBinding) {
        SNode classifierType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        BinaryTypeBinding binaryTypeBinding = (BinaryTypeBinding) binding;
        SReference reference = createClassifierReference(binaryTypeBinding, "classifier", classifierType);
        classifierType.addReference(reference);
        return classifierType;
      }
    }
    if (binding instanceof TypeVariableBinding) {
      TypeVariableBinding typeVariableBinding = (TypeVariableBinding) binding;
      SNode tvr = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", null);
      SNode declaringGeneric = myReferentsCreator.myBindingMap.get(typeVariableBinding.declaringElement);
      if (SNodeOperations.isInstanceOf(declaringGeneric, "jetbrains.mps.baseLanguage.structure.GenericDeclaration")) {
        SLinkOperations.setTarget(tvr, "typeVariableDeclaration", ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(declaringGeneric, "jetbrains.mps.baseLanguage.structure.GenericDeclaration"), "typeVariableDeclaration", true)).getElement(typeVariableBinding.rank), false);

      } else {
        throw new JavaConverterException("Declaring element for a type var is not a GenericDeclaration");
      }
      return tvr;
    }
    return null;
  }

  private SNodeId.Foreign getClassifierNodeId(BinaryTypeBinding binaryTypeBinding) {
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + NameUtil.shortNameFromLongName(TypesProvider.getClassifierIdPrefix(binaryTypeBinding)));
  }

  public SReference createErrorReference(String role, String resolveInfo, SNode sourceNode) {
    return new StaticReference(role, sourceNode, SNodeOperations.getModel(sourceNode).getSModelReference(), null, resolveInfo);
  }

  public SReference createErrorClassifierReference(String role, TypeBinding binding, SNode sourceNode) {
    if (binding instanceof ReferenceBinding) {
      ReferenceBinding referenceBinding = (ReferenceBinding) binding;
      char[][] chars = referenceBinding.compoundName;
      char[] name = chars[chars.length - 1];
      return createErrorReference(role, new String(name), sourceNode);
    } else {
      return null;
    }
  }

  public SReference createMethodReference(MethodBinding binding, String role, SNode sourceNode) {
    if (binding == null) {
      return null;
    }
    if (binding instanceof ParameterizedMethodBinding) {
      binding = ((ParameterizedMethodBinding) binding).original();
    }
    SNode target = myReferentsCreator.myBindingMap.get(binding);
    if ((target != null)) {
      return SReference.create(role, sourceNode, target, new String(binding.selector));
    }
    if (binding.declaringClass instanceof BinaryTypeBinding) {
      BinaryTypeBinding binaryTypeBinding = (BinaryTypeBinding) binding.declaringClass;
      SNodeId nodeId = createMethodId(binding, binaryTypeBinding);
      SModelReference modelReference = modelReferenceFromBinaryClassBinding(binaryTypeBinding);
      SNodePointer pointer = getRegularMPSNodePointerFromForeignId(modelReference, nodeId, FeatureKind.METHOD);
      return SReference.create(role, sourceNode, pointer, new String((binding.isConstructor() ?
        binaryTypeBinding.sourceName :
        binding.selector
      )));
    }
    if (binding.declaringClass instanceof ParameterizedTypeBinding) {
      ParameterizedTypeBinding parameterizedTypeBinding = (ParameterizedTypeBinding) binding.declaringClass;
      if (parameterizedTypeBinding.genericType() instanceof BinaryTypeBinding) {
        BinaryTypeBinding binaryTypeBinding = (BinaryTypeBinding) parameterizedTypeBinding.genericType();
        SNodeId nodeId = createMethodId(binding, binaryTypeBinding);
        SModelReference modelReference = modelReferenceFromBinaryClassBinding(binaryTypeBinding);
        SNodePointer pointer = getRegularMPSNodePointerFromForeignId(modelReference, nodeId, FeatureKind.METHOD);
        return SReference.create(role, sourceNode, pointer, new String((binding.isConstructor() ?
          binaryTypeBinding.sourceName :
          binding.selector
        )));
      }
    }
    LOG.error("can't create a reference to a method in a class of type " + binding.declaringClass.getClass());
    return null;
  }

  private SModelReference modelReferenceFromBinaryClassBinding(BinaryTypeBinding binaryTypeBinding) {
    String classFQName = TypesProvider.getClassifierIdPrefix(binaryTypeBinding);
    String packageName = NodeNameUtil.getNamespace(classFQName);
    SModelReference modelReference = StubHelper.uidForPackageInStubs(packageName, LanguageID.JAVA, null, true);
    return modelReference;
  }

  private SNodePointer getRegularMPSNodePointerFromForeignId(SModelReference modelReference, SNodeId nodeId, FeatureKind targetKind) {
    return new SNodePointer(modelReference, nodeId);
  }

  private SNodeId createMethodId(MethodBinding method, BinaryTypeBinding classBinding) {
    StringBuilder sb = new StringBuilder();
    sb.append(NameUtil.shortNameFromLongName(TypesProvider.getClassifierIdPrefix(classBinding)));
    sb.append('.');
    if (method.isConstructor()) {
      sb.append("<init>");
    } else {
      sb.append(method.selector);
    }
    sb.append('(');
    TypesProvider.appendList(sb, method.parameters, method);
    sb.append(')');
    if (!(method.isConstructor()) && !(classBinding.isAnnotationType())) {
      sb.append(':');
      sb.append(TypesProvider.asString(method.returnType));
    }
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + sb.toString());
  }

  private SNodeId createFieldId(FieldBinding field, BinaryTypeBinding classBinding) {
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + NameUtil.shortNameFromLongName(TypesProvider.getClassifierIdPrefix(classBinding)) + "." + new String(field.name));
  }

  public SReference createClassifierReference(ReferenceBinding aClass, String role, SNode sourceNode) {
    if (aClass instanceof ProblemReferenceBinding && aClass.closestMatch() instanceof ReferenceBinding) {
      aClass = (ReferenceBinding) aClass.closestMatch();
    }
    SNodePointer classifierPointer = createClassifierPointer(aClass);
    return SReference.create(role, sourceNode, classifierPointer, ((aClass.sourceName == null ?
      "" :
      new String(aClass.sourceName)
    )));
  }

  public SNodePointer createClassifierPointer(ReferenceBinding aClass) {
    if (aClass instanceof BinaryTypeBinding) {
      SModelReference modelReference = modelReferenceFromBinaryClassBinding((BinaryTypeBinding) aClass);
      SNodeId nodeId = getClassifierNodeId((BinaryTypeBinding) aClass);
      return getRegularMPSNodePointerFromForeignId(modelReference, nodeId, FeatureKind.CLASS);
    }
    if (aClass instanceof SourceTypeBinding) {
      SNode adapter = myReferentsCreator.myBindingMap.get(aClass);
      if ((adapter != null)) {
        return new SNodePointer(adapter);
      }
    }
    if (aClass instanceof ParameterizedTypeBinding) {
      ParameterizedTypeBinding parameterizedTypeBinding = (ParameterizedTypeBinding) aClass;
      return createClassifierPointer(parameterizedTypeBinding.genericType());
    }
    throw new JavaConverterException("no classifier for class " + ((aClass.sourceName == null ?
      "" :
      new String(aClass.sourceName)
    )));
  }

  public SReference createFieldReference(FieldBinding binding, String role, SNode sourceNode) {
    if (binding instanceof ParameterizedFieldBinding) {
      ParameterizedFieldBinding parameterizedFieldBinding = (ParameterizedFieldBinding) binding;
      return createFieldReference(parameterizedFieldBinding.originalField, role, sourceNode);
    }
    SNode target = myReferentsCreator.myBindingMap.get(binding);
    if ((target != null)) {
      return SReference.create(role, sourceNode, target, new String(binding.name));
    }
    if (binding.declaringClass instanceof BinaryTypeBinding) {
      BinaryTypeBinding binaryTypeBinding = (BinaryTypeBinding) binding.declaringClass;
      SNodeId nodeId = createFieldId(binding, binaryTypeBinding);
      SModelReference modelReference = modelReferenceFromBinaryClassBinding(binaryTypeBinding);
      SNodePointer pointer = getRegularMPSNodePointerFromForeignId(modelReference, nodeId, FeatureKind.FIELD);
      return SReference.create(role, sourceNode, pointer, new String(binding.name));
    }
    return createErrorReference(role, new String(binding.name), sourceNode);
  }

  public SNode getRaw(Binding binding) {
    return myReferentsCreator.myBindingMap.get(binding);
  }

  public void replaceUnsafe(SNode oldAdapter, SNode newAdapter) {
    if ((oldAdapter == null)) {
      return;
    }
    Map<Binding, SNode> map = myReferentsCreator.myBindingMap;
    for (Binding binding : new HashSet<Binding>(map.keySet())) {
      SNode result = map.get(binding);
      if ((result != null) && result == oldAdapter) {
        map.put(binding, newAdapter);
      }
    }
  }

  public static String classFqNameFromCompoundName(char[][] compoundName) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < compoundName.length; i++) {
      char[] namePart = compoundName[i];
      builder.append(namePart);
      if (i < compoundName.length - 1) {
        builder.append('.');
      }
    }
    return builder.toString();
  }

  private static String getClassifierIdPrefix(BinaryTypeBinding binaryTypeBinding) {
    return TypesProvider.classFqNameFromCompoundName(binaryTypeBinding.compoundName);
  }

  private static String asString(TypeBinding type) {
    return TypesProvider.asString(type, null);
  }

  private static String asString(TypeBinding type, MethodBinding context) {
    if (type instanceof ParameterizedTypeBinding) {
      StringBuilder sb = new StringBuilder();
      sb.append(TypesProvider.asString(((ParameterizedTypeBinding) type).genericType()));
      return sb.toString();
    }
    if (type instanceof BinaryTypeBinding) {
      return TypesProvider.getClassifierIdPrefix(((BinaryTypeBinding) type));
    }
    if (type instanceof SourceTypeBinding) {
      return TypesProvider.classFqNameFromCompoundName(((SourceTypeBinding) type).compoundName);
    }
    if (type instanceof ArrayBinding) {
      if (context != null && context.isVarargs() && context.parameters[context.parameters.length - 1] == type) {
        return TypesProvider.asString(((ArrayBinding) type).elementsType()) + "...";
      } else {
        return TypesProvider.asString(((ArrayBinding) type).elementsType()) + "[]";
      }
    }
    if (type instanceof BaseTypeBinding) {
      return new String(((BaseTypeBinding) type).simpleName);
    }
    if (type instanceof TypeVariableBinding) {
      TypeVariableBinding typeVariableBinding = (TypeVariableBinding) type;
      ReferenceBinding superclass = typeVariableBinding.superclass;
      if (JavaCompiler.classNameFromCompoundName(superclass.compoundName).equals("java.lang.Object") && typeVariableBinding.superInterfaces != null && typeVariableBinding.superInterfaces.length > 0) {
        return TypesProvider.asString(typeVariableBinding.superInterfaces[0]);
      }
      return TypesProvider.asString(superclass);
    }
    if (type instanceof WildcardBinding && ((WildcardBinding) type).boundKind == Wildcard.EXTENDS) {
      return TypesProvider.asString(((WildcardBinding) type).bound);
    }
    if (type instanceof WildcardBinding && ((WildcardBinding) type).boundKind == Wildcard.SUPER) {
      return TypesProvider.asString(((WildcardBinding) type).bound);
    }
    if (type.isUnboundWildcard()) {
      return "java.lang.Object";
    }
    throw new RuntimeException("unexpected type: " + type);
  }

  private static void appendList(StringBuilder sb, TypeBinding[] types, MethodBinding context) {
    for (int i = 0; i < types.length; i++) {
      TypeBinding typeBinding = types[i];
      sb.append(TypesProvider.asString(typeBinding, context));
      if (i < types.length - 1) {
        sb.append(',');
      }
    }
  }
}
