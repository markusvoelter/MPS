<?xml version="1.0" encoding="UTF-8"?>
<model namespace="jetbrains.mps.baseLanguage.sandbox">
  <maxReferenceID value="1" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <import referenceID="1" name="lang" namespace="java" />
  <node type="jetbrains.mps.baseLanguage.Interface" id="1115766127296">
    <property name="name" value="IBaseInterface" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766147547">
      <property name="name" value="baseInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766147565" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766151082" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.Interface" id="1115766166286">
    <property name="name" value="AnInterface" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766214538">
      <property name="name" value="baseInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766214540" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766218166" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766241542">
      <property name="name" value="anInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766241544" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766243764" />
    </node>
    <node role="extendedInterface" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115766202021">
      <link role="classifier" targetNodeId="1115766127296" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115766267843">
    <property name="name" value="BaseClass" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766285313">
      <property name="name" value="baseInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766285315" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766288301" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766295021">
      <property name="name" value="anInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766295023" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766297524" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766326104">
      <property name="name" value="baseClassMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766326106" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766328169" />
    </node>
    <node role="implementedInterface" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115766274125">
      <link role="classifier" targetNodeId="1115766166286" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115766310400">
    <property name="name" value="AClass" />
    <link role="extendedClass" targetNodeId="1115766267843" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766338748">
      <property name="name" value="aClassMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766338750" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766340908" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115766355096">
    <property name="name" value="TESTMethodCalls" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115766367394">
      <property name="name" value="mmm" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766367412">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115766387882">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115766387883">
            <property name="name" value="c1" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115766387884">
              <link role="classifier" targetNodeId="1115766310400" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115766395168">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115766399358">
            <link role="baseMethodDeclaration" targetNodeId="1115766338748" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115766395169">
              <link role="variableDeclaration" targetNodeId="1115766387883" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766375256" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1119992601482">
    <property name="name" value="TEst" />
  </node>
</model>

