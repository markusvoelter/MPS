<?xml version="1.0" encoding="UTF-8"?>
<model name="constraintLanguageSandbox.model">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <maxImportIndex value="2" />
  <import index="1" modelUID="jetbrains.mps.smodel.constraints@java_stub" version="-1" />
  <import index="2" modelUID="java.util@java_stub" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1203331622062">
    <property name="name" value="ABC" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1203331624283">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203331624284" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1203331624285" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203331624286">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203331654521">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203331654522">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203331654523">
              <link role="classifier" targetNodeId="2.~List" resolveInfo="List" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1203331656681">
              <link role="baseMethodDeclaration" targetNodeId="2.~ArrayList.&lt;init&gt;(int)" resolveInfo="ArrayList" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203331660260">
                <property name="value" value="23" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1203331622063" />
  </node>
</model>

