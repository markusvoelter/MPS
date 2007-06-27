<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mpslite.nanoj">
  <language namespace="jetbrains.mpslite" />
  <maxImportIndex value="2" />
  <import index="1" modelUID="jetbrains.mpslite.common" />
  <import index="2" modelUID="jetbrains.mpslite.nanoj" />
  <node type="jetbrains.mpslite.NodeTypeDeclarations" id="1182956263706">
    <property name="name" value="Classes" />
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956307043">
      <property name="name" value="ClassConcept" />
      <property name="root" value="true" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956311857">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956315483">
          <property name="text" value="class" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.PropertyDeclarationPart" id="1182956319063">
          <property name="name" value="name" />
          <link role="type" targetNodeId="1.1182511871037" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956324987">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182956333618">
        <node role="linePart" type="jetbrains.mpslite.IndentLinePart" id="1182956340150" />
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182956342684">
          <property name="name" value="method" />
          <property name="vertical" value="true" />
          <property name="many" value="true" />
          <link role="type" targetNodeId="1182956481679" resolveInfo="InstanceMethod" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182956326614">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956329412">
          <property name="text" value="}" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.NodeTypeDeclarations" id="1182956458075">
    <property name="name" value="Methods" />
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956481186">
      <property name="name" value="BaseMethod" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956481187">
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182956481188">
          <property name="name" value="type" />
          <link role="type" targetNodeId="1182956598488" resolveInfo="Type" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.PropertyDeclarationPart" id="1182956481189">
          <property name="name" value="name" />
          <link role="type" targetNodeId="1.1182511871037" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956481190">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956481191">
          <property name="text" value=")" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956481192">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182956509074">
        <node role="linePart" type="jetbrains.mpslite.IndentLinePart" id="1182956510903" />
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182956513296">
          <property name="name" value="body" />
          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182956481193">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956481194">
          <property name="text" value="}" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956481679">
      <property name="name" value="InstanceMethod" />
      <link role="extends" targetNodeId="1182956481186" resolveInfo="BaseMethod" />
    </node>
  </node>
  <node type="jetbrains.mpslite.NodeTypeDeclarations" id="1182956491665">
    <property name="name" value="Common" />
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956498103">
      <property name="name" value="StatementList" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182966257787">
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182966258725">
          <property name="name" value="statement" />
          <property name="vertical" value="true" />
          <property name="many" value="true" />
          <link role="type" targetNodeId="1182966087965" resolveInfo="Statement" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.NodeTypeDeclarations" id="1182956596487">
    <property name="name" value="Types" />
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956598488">
      <property name="name" value="Type" />
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182958613287">
      <property name="name" value="ClassifierType" />
      <link role="extends" targetNodeId="1182956598488" resolveInfo="Type" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182958668915">
        <node role="linePart" type="jetbrains.mpslite.ReferenceDeclarationPart" id="1182958670869">
          <property name="name" value="classifier" />
          <link role="type" targetNodeId="1182956307043" resolveInfo="Classifier" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182958625632">
      <property name="name" value="PrimitiveType" />
      <link role="extends" targetNodeId="1182956598488" resolveInfo="Type" />
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956613900">
      <property name="name" value="VoidType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956616822">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956619449">
          <property name="text" value="void" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956624544">
      <property name="name" value="ByteType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956628514">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956632532">
          <property name="text" value="byte" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956634986">
      <property name="name" value="CharType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956640737">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956641957">
          <property name="text" value="char" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956670944">
      <property name="name" value="ShortType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956675555">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956677446">
          <property name="text" value="short" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956600677">
      <property name="name" value="IntType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956609725">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956612164">
          <property name="text" value="int" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956620950">
      <property name="name" value="LongType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956662005">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956663209">
          <property name="text" value="long" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956682010">
      <property name="name" value="FloatType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956689105">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956692871">
          <property name="text" value="float" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182956695013">
      <property name="name" value="DoubleType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182956700483">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182956701812">
          <property name="text" value="double" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.NodeTypeDeclarations" id="1182966085292">
    <property name="name" value="Statements" />
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182966087965">
      <property name="name" value="Statement" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182966298619">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966304949">
          <property name="text" value="&lt;statement&gt;" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182966322282">
      <property name="name" value="IfStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182966328955">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966331425">
          <property name="text" value="if" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966333770">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182966335616">
          <property name="name" value="condition" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966342212">
          <property name="text" value=")" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966344526">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182966346091">
        <node role="linePart" type="jetbrains.mpslite.IndentLinePart" id="1182966348420" />
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182966352031">
          <property name="name" value="body" />
          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182966359283">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966361706">
          <property name="text" value="}" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182966366176">
      <property name="name" value="WhileStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182966372115">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966376070">
          <property name="text" value="while" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966377775">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182966379199">
          <property name="name" value="condition" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966384998">
          <property name="text" value=")" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966386968">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182966388126">
        <node role="linePart" type="jetbrains.mpslite.IndentLinePart" id="1182966389470" />
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182966391160">
          <property name="name" value="body" />
          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.Line" id="1182966396459">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966398241">
          <property name="text" value="}" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.NodeTypeDeclarations" id="1182966282304">
    <property name="name" value="Expressions" />
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182966285571">
      <property name="name" value="Expression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182966309170">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182966313203">
          <property name="text" value="&lt;expression&gt;" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969317058">
      <property name="name" value="BinaryExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969322965">
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182969324810">
          <property name="name" value="left" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969329593">
          <property name="text" value="sign" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182969330673">
          <property name="name" value="right" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969334533">
      <property name="name" value="PlusExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969339644">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969444601">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969449400">
          <property name="text" value="+" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969451480">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969456013">
      <property name="name" value="MinusExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969456014">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969456015">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969456016">
          <property name="text" value="*" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969456017">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969465559">
      <property name="name" value="MulExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969465560">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969465561">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969465562">
          <property name="text" value="*" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969465563">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969470407">
      <property name="name" value="DivExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969470408">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969470409">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969470410">
          <property name="text" value="/" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969470411">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969474844">
      <property name="name" value="AssignmentExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969474845">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969474846">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969474847">
          <property name="text" value="=" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969474848">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969485238">
      <property name="name" value="EqualsExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969485239">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969485240">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969485241">
          <property name="text" value="==" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969485242">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969490290">
      <property name="name" value="NotEqualsExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969490291">
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969490292">
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969490293">
          <property name="text" value="!=" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ChildReferencePart" id="1182969490294">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969716964">
      <property name="name" value="InstanceMethodCallExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969726512">
        <node role="linePart" type="jetbrains.mpslite.ChildDeclarationPart" id="1182969745144">
          <property name="name" value="instance" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969748912">
          <property name="text" value="." />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ReferenceDeclarationPart" id="1182969728654">
          <property name="name" value="method" />
          <link role="type" targetNodeId="1182956481679" resolveInfo="InstanceMethod" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969735000">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969738502">
          <property name="text" value=")" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969841552">
      <property name="name" value="NumberExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969848709">
        <node role="linePart" type="jetbrains.mpslite.PropertyDeclarationPart" id="1182969849632">
          <property name="name" value="number" />
          <link role="type" targetNodeId="1.1182511916107" />
        </node>
      </node>
    </node>
    <node role="nodeTypeDeclaration" type="jetbrains.mpslite.NodeTypeDeclaration" id="1182969854711">
      <property name="name" value="StringLiteralExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.Line" id="1182969870900">
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969872714">
          <property name="text" value="&quot;" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.PropertyDeclarationPart" id="1182969874779">
          <property name="name" value="text" />
          <link role="type" targetNodeId="1.1182511871037" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.ConstantLinePart" id="1182969878640">
          <property name="text" value="&quot;" />
        </node>
      </node>
    </node>
  </node>
</model>

