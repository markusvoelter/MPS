<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.helgins.sandbox.sb2">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.bootstrap.helgins.test" />
  <language namespace="jetbrains.mps.patterns" />
  <language namespace="jetbrains.mps.baseLanguage.blTypes" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="2" modelUID="java.lang@java_stub" />
  <import index="3" modelUID="jetbrains.mps.baseLanguage.helgins" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.blTypes.structure" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="6" modelUID="java.util@java_stub" />
  <node type="jetbrains.mps.bootstrap.helgins.SubtypingRule" id="1175148572517">
    <property name="name" value="subtyping_a" />
    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175148572518">
      <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175148685492">
        <node role="expression" type="jetbrains.mps.bootstrap.helgins.Quotation" id="1175148742306">
          <node role="quotedNode" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175148777136">
            <link role="classifier" extResolveInfo="2.[Classifier]Integer" />
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1175148637851">
      <property name="name" value="intType" />
      <link role="concept" targetNodeId="1.1070534370425" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.helgins.SupertypingRule" id="1175163257420">
    <property name="name" value="supertyping_b" />
    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175163257421">
      <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175163274752">
        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175163379960">
          <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.Quotation" id="1175163297083">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.blTypes.PrimitiveTypeRef" id="1175163376959">
              <link role="descriptor" targetNodeId="3.1165580533660" />
            </node>
          </node>
          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1175163385805">
            <link role="link" targetNodeId="4.1159268661479" />
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1175163265361">
      <property name="name" value="clt" />
      <link role="concept" targetNodeId="1.1107535904670" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1176737033002">
    <property name="name" value="TestTypes" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1176737033003">
      <property name="name" value="foo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1176737033004" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176737033005">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1176894450034">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1176894450035">
            <property name="name" value="d" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176894450036">
              <link role="classifier" targetNodeId="1176894368712" resolveInfo="D" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176895123073">
                <link role="classifier" extResolveInfo="2.[Classifier]Integer" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1176894453241">
              <link role="baseMethodDeclaration" targetNodeId="1176894440670" resolveInfo="D" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176895128680">
                <link role="classifier" extResolveInfo="2.[Classifier]Integer" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176894461586">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176894466294">
            <link role="baseMethodDeclaration" targetNodeId="1176894339711" resolveInfo="foobar" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176894463916">
              <link role="variableDeclaration" targetNodeId="1176894450035" resolveInfo="d" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1177061604281">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1177061604346">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1177061606048">
              <property name="value" value="3" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1177061604282">
              <property name="value" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1177061609388">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1177061609405">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1177061612147">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1177061615256">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1177061617236">
                  <property name="value" value="1" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1177061613576" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1177061609389">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1176894317802">
    <property name="name" value="C" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1176894339711">
      <property name="name" value="foobar" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.TypeVariableReference" id="1176894356058">
        <link role="typeVariableDeclaration" targetNodeId="1176894334335" resolveInfo="T" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894339713" />
    </node>
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.TypeVariableDeclaration" id="1176894334335">
      <property name="name" value="T" />
    </node>
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.TypeVariableDeclaration" id="1176894336914">
      <property name="name" value="S" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1176894368712">
    <property name="name" value="D" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1176894440670">
      <node role="returnType" type="jetbrains.mps.baseLanguage.Type" id="1176894440671" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894440672" />
    </node>
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.TypeVariableDeclaration" id="1176894372776">
      <property name="name" value="E" />
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176894385304">
      <link role="classifier" targetNodeId="1176894317802" resolveInfo="C" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.TypeVariableReference" id="1176894422432">
        <link role="typeVariableDeclaration" targetNodeId="1176894372776" resolveInfo="E" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176894425136">
        <link role="classifier" extResolveInfo="2.[Classifier]String" />
      </node>
    </node>
  </node>
</model>

