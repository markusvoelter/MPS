<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.sandbox.genTest">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.baseLanguageInternal" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="java.lang@java_stub" />
  <import index="2" modelUID="java.io@java_stub" />
  <import index="3" modelUID="java.lang.reflect@java_stub" />
  <import index="4" modelUID="java.util@java_stub" />
  <node type="jetbrains.mps.baseLanguage.Annotation" id="1188216745729">
    <property name="name" value="SomeAnnotation" />
    <node role="method" type="jetbrains.mps.baseLanguage.AnnotationMethodDeclaration" id="1188216750434">
      <property name="name" value="parameter" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.IntegerType" id="1188216784832" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188216750436" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188216750437" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188216745730" />
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1188217315627">
    <property name="name" value="SampleClass" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1188217848948">
      <property name="name" value="staticvoidmethod" />
      <node role="annotation" type="jetbrains.mps.baseLanguage.AnnotationInstance" id="1188217853514">
        <link role="annotation" targetNodeId="1188216745729" resolveInfo="SomeAnnotation" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1188217848949" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188217848950" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188217848951" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1188217840286">
      <property name="name" value="voidmethod" />
      <node role="annotation" type="jetbrains.mps.baseLanguage.AnnotationInstance" id="1188217845931">
        <link role="annotation" targetNodeId="1188216745729" resolveInfo="SomeAnnotation" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1188217840287" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188217840288" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188217840289" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1188217800633">
      <node role="annotation" type="jetbrains.mps.baseLanguage.AnnotationInstance" id="1188217804199">
        <link role="annotation" targetNodeId="1188216745729" resolveInfo="SomeAnnotation" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1188217800634" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188217800635" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188217800636" />
    </node>
    <node role="annotation" type="jetbrains.mps.baseLanguage.AnnotationInstance" id="1188217320316">
      <link role="annotation" targetNodeId="1188216745729" resolveInfo="SomeAnnotation" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188217315628" />
  </node>
</model>

