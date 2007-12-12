<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mpslite.nanoj">
  <persistence version="1" />
  <language namespace="jetbrains.mpslite" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.ypath" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.transformation.TLBase" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="jetbrains.mpslite.common" version="-1" />
  <import index="2" modelUID="jetbrains.mpslite.nanoj" version="-1" />
  <import index="3" modelUID="java.lang@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1182956263706">
    <property name="name" value="Classes" />
    <property name="showStructure" value="true" />
    <property name="showTypes" value="true" />
    <property name="showBehavior" value="true" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956307043">
      <property name="name" value="ClassConcept" />
      <property name="root" value="true" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956311857">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956315483">
          <property name="text" value="class" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyDeclarationPart" id="1182956319063">
          <property name="name" value="name" />
          <link role="type" targetNodeId="1.1197382692601" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.OptionalPart" id="1197391745943">
          <node role="part" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197391771134">
            <property name="text" value="extends" />
          </node>
          <node role="part" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1197391748054">
            <property name="name" value="extends" />
            <link role="type" targetNodeId="1197391708272" resolveInfo="ClassReference" />
          </node>
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956324987">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956333618">
        <node role="linePart" type="jetbrains.mpslite.structure.IndentLinePart" id="1182956340150" />
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182956342684">
          <property name="name" value="method" />
          <property name="vertical" value="true" />
          <property name="many" value="true" />
          <link role="type" targetNodeId="1182956481679" resolveInfo="InstanceMethod" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956326614">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956329412">
          <property name="text" value="}" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197283725727">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197283725728" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371431362">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371431363">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371431364" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1197391708272">
      <property name="name" value="ClassReference" />
      <property name="role" value="true" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1197391714518">
        <node role="linePart" type="jetbrains.mpslite.structure.ReferenceDeclarationPart" id="1197391717894">
          <property name="name" value="classifier" />
          <link role="type" targetNodeId="1182956307043" resolveInfo="ClassConcept" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197391708273">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197391708274" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197391708275">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197391708276">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197391708277" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1182956458075">
    <property name="name" value="Methods" />
    <property name="showStructure" value="true" />
    <property name="showTypes" value="true" />
    <property name="showBehavior" value="true" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956481186">
      <property name="name" value="BaseMethod" />
      <property name="abstract" value="true" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956481187">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182956481188">
          <property name="name" value="type" />
          <link role="type" targetNodeId="1182956598488" resolveInfo="Type" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyDeclarationPart" id="1182956481189">
          <property name="name" value="name" />
          <link role="type" targetNodeId="1.1197382692601" resolveInfo="id" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956481190">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1183118666129">
          <property name="separator" value="," />
          <property name="name" value="parameter" />
          <property name="many" value="true" />
          <link role="type" targetNodeId="1183027852869" resolveInfo="ParameterDeclaration" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956481191">
          <property name="text" value=")" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956481192">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956509074">
        <node role="linePart" type="jetbrains.mpslite.structure.IndentLinePart" id="1182956510903" />
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182956513296">
          <property name="name" value="body" />
          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956481193">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956481194">
          <property name="text" value="}" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284585689">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284585690" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371236940">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371236941">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371236942">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197372607295">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1197372613429">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197372615057">
                  <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197372616215">
                    <link role="concept" targetNodeId="1182956613900" resolveInfo="VoidType" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197372608766">
                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197372610206">
                    <link role="childDeclaration" targetNodeId="1182956481188" resolveInfo="type" />
                  </node>
                  <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197372607296" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956481679">
      <property name="name" value="InstanceMethod" />
      <property name="role" value="true" />
      <link role="extends" targetNodeId="1182956481186" resolveInfo="BaseMethod" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284586707">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284586708" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371238724">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371238725">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371238726" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1182956491665">
    <property name="name" value="Common" />
    <property name="showStructure" value="true" />
    <property name="showTypes" value="true" />
    <property name="showBehavior" value="true" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956498103">
      <property name="name" value="StatementList" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966257787">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182966258725">
          <property name="name" value="statement" />
          <property name="vertical" value="true" />
          <property name="many" value="true" />
          <link role="type" targetNodeId="1182966087965" resolveInfo="Statement" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284577218">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284577219" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371425219">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371425220">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371425221" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1182956596487">
    <property name="name" value="Types" />
    <property name="showStructure" value="true" />
    <property name="showTypes" value="true" />
    <property name="showBehavior" value="false" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956598488">
      <property name="name" value="Type" />
      <property name="role" value="true" />
      <property name="abstract" value="true" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284246273">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284246274" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371490623">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371490624">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371490625" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182958613287">
      <property name="name" value="ClassifierType" />
      <link role="extends" targetNodeId="1182956598488" resolveInfo="Type" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182958668915">
        <node role="linePart" type="jetbrains.mpslite.structure.ReferenceDeclarationPart" id="1182958670869">
          <property name="name" value="classifier" />
          <link role="type" targetNodeId="1182956307043" resolveInfo="Classifier" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284606632">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284606633" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371494641">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371494642">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371494643" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182958625632">
      <property name="name" value="PrimitiveType" />
      <property name="abstract" value="true" />
      <link role="extends" targetNodeId="1182956598488" resolveInfo="Type" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284608150">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284608151" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371496176">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371496177">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371496178" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956613900">
      <property name="name" value="VoidType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956616822">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956619449">
          <property name="text" value="void" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284612543">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284612544" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371498288">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371498289">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371498290" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956624544">
      <property name="name" value="ByteType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956628514">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956632532">
          <property name="text" value="byte" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284613607">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284613608" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371500088">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371500089">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371500090" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956634986">
      <property name="name" value="CharType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956640737">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956641957">
          <property name="text" value="char" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284614641">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284614642" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371501669">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371501670">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371501671" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956670944">
      <property name="name" value="ShortType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956675555">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956677446">
          <property name="text" value="short" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284615721">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284615722" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371503469">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371503470">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371503471" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956600677">
      <property name="name" value="IntType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956609725">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956612164">
          <property name="text" value="int" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284616770">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284616771" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371505253">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371505254">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371505255" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956620950">
      <property name="name" value="LongType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956662005">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956663209">
          <property name="text" value="long" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284617819">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284617820" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371507475">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371507476">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371507477" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956682010">
      <property name="name" value="FloatType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956689105">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956692871">
          <property name="text" value="float" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284618852">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284618853" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371509478">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371509479">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371509480" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182956695013">
      <property name="name" value="DoubleType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182956700483">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182956701812">
          <property name="text" value="double" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284619854">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284619855" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371513325">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371513326">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371513327" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1197288761671">
      <property name="name" value="BooleanType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197288761672">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197288761673" />
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1197293676454">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197293678816">
          <property name="text" value="boolean" />
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371515046">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371515047">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371515048" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1197294756250">
      <property name="name" value="StringType" />
      <link role="extends" targetNodeId="1182958625632" resolveInfo="PrimitiveType" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197294756251">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197294756252" />
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1197294762690">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197294764098">
          <property name="text" value="string" />
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371516846">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371516847">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371516848" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1182966085292">
    <property name="name" value="Statements" />
    <property name="showTypes" value="true" />
    <property name="showStructure" value="true" />
    <property name="showBehavior" value="true" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182966087965">
      <property name="name" value="Statement" />
      <property name="abstract" value="true" />
      <property name="role" value="true" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966298619" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284589568">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284589569" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371466339">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371466340">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371466341" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182966322282">
      <property name="name" value="IfStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966328955">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966331425">
          <property name="text" value="if" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966333770">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182966335616">
          <property name="name" value="condition" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966342212">
          <property name="text" value=")" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966344526">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966346091">
        <node role="linePart" type="jetbrains.mpslite.structure.IndentLinePart" id="1182966348420" />
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182966352031">
          <property name="name" value="body" />
          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966359283">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966361706">
          <property name="text" value="}" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284591039">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284591040">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197288742243">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197288775195">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197288776588" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197288772363">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197288773694">
                  <link role="childDeclaration" targetNodeId="1182966335616" resolveInfo="condition" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197288771299" />
              </node>
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197288746183">
              <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197288751201">
                <link role="concept" targetNodeId="1197288761671" resolveInfo="BooleanType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371468155">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371468156">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371468157" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182966366176">
      <property name="name" value="WhileStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966372115">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966376070">
          <property name="text" value="while" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966377775">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182966379199">
          <property name="name" value="condition" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966384998">
          <property name="text" value=")" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966386968">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966388126">
        <node role="linePart" type="jetbrains.mpslite.structure.IndentLinePart" id="1182966389470" />
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182966391160">
          <property name="name" value="body" />
          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182966396459">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182966398241">
          <property name="text" value="}" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197292984626">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197292984627">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197293334822">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197293342721">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197293343536" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197293338638">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197293341704">
                  <link role="childDeclaration" targetNodeId="1182966379199" resolveInfo="condition" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197293337247" />
              </node>
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197293346381">
              <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197293347430">
                <link role="concept" targetNodeId="1197288761671" resolveInfo="BooleanType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371477595">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371477596">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371477597" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183027955959">
      <property name="name" value="LocalVariableDeclarationStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183027963491">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1183027964867">
          <property name="name" value="declaration" />
          <link role="type" targetNodeId="1183027574668" resolveInfo="LocalVariableDeclaration" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1183028618610">
          <property name="text" value=";" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284593481">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284593482" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371479317">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371479318">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371479319" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183120785728">
      <property name="name" value="ExpressionStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183120799273">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1183120799993">
          <property name="name" value="expr" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1183120811052">
          <property name="text" value=";" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284594514">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284594515" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371481007">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371481008">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371481009" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1197299734405">
      <property name="name" value="ReturnStatement" />
      <link role="extends" targetNodeId="1182966087965" resolveInfo="Statement" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197299734406">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197299734407">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197299764618">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197299764619">
              <property name="name" value="method" />
              <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197299764620">
                <link role="concept" targetNodeId="1182956481186" resolveInfo="BaseMethod" />
              </node>
              <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299772561">
                <node role="operation" type="jetbrains.mpslite.structure.AncestorOperation" id="1197299773892">
                  <link role="type" targetNodeId="1182956481186" resolveInfo="BaseMethod" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197299771685" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197299778972">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197299778973">
              <node role="statement" type="jetbrains.mpslite.structure.AddInequationStatement" id="1197299789594">
                <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299811092">
                  <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197299812016" />
                  <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299809525">
                    <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197299810216">
                      <link role="childDeclaration" targetNodeId="1197299746334" resolveInfo="expression" />
                    </node>
                    <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197299808399" />
                  </node>
                </node>
                <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299795192">
                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197299798663">
                    <link role="childDeclaration" targetNodeId="1182956481188" resolveInfo="type" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197299794128">
                    <link role="variableDeclaration" targetNodeId="1197299764619" resolveInfo="method" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1197299781227">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197299782308" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197299780101">
                <link role="variableDeclaration" targetNodeId="1197299764619" resolveInfo="method" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1197299741455">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197299742925">
          <property name="text" value="return" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1197299746334">
          <property name="name" value="expression" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197299752476">
          <property name="text" value=";" />
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197371483698">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197371483699">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197371483700" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1182966282304">
    <property name="name" value="Expressions" />
    <property name="showStructure" value="true" />
    <property name="showBehavior" value="true" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182966285571">
      <property name="name" value="Expression" />
      <property name="abstract" value="true" />
      <property name="role" value="true" />
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284326262">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284326263" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389304655">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389304656">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389304657" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969317058">
      <property name="name" value="BinaryExpression" />
      <property name="abstract" value="true" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969322965">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182969324810">
          <property name="name" value="left" />
          <property name="rightTransformable" value="true" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969329593">
          <property name="text" value="sign" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182969330673">
          <property name="name" value="right" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284547500">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284547501">
          <node role="statement" type="jetbrains.mpslite.structure.AddInequationStatement" id="1197296967482">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197296979449">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197296980342" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197296977742">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197296978557">
                  <link role="childDeclaration" targetNodeId="1182969324810" resolveInfo="left" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197296977084" />
              </node>
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197296974455">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197296975396" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197296973470" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mpslite.structure.AddInequationStatement" id="1197296982141">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197296985884">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197296986902" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197296983958">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197296984820">
                  <link role="childDeclaration" targetNodeId="1182969330673" resolveInfo="right" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197296983144" />
              </node>
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197296988795">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197296989798" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197296987982" />
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389305689">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389305690">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389305691" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969334533">
      <property name="name" value="PlusExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969339644">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969444601">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969449400">
          <property name="text" value="+" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969451480">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284549049">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284549050" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389306739">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389306740">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389306741" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969456013">
      <property name="name" value="MinusExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969456014">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969456015">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969456016">
          <property name="text" value="-" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969456017">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284550302">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284550303" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389308461">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389308462">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389308463" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969465559">
      <property name="name" value="MulExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969465560">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969465561">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969465562">
          <property name="text" value="*" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969465563">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284551444">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284551445" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389309651">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389309652">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389309653" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969470407">
      <property name="name" value="DivExpression" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969470408">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969470409">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969470410">
          <property name="text" value="/" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969470411">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284553056">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284553057" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389310888">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389310889">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389310890" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969474844">
      <property name="name" value="AssignmentExpression" />
      <property name="overrideTypes" value="true" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969474845">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969474846">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969474847">
          <property name="text" value="=" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969474848">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284554058">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284554059">
          <node role="statement" type="jetbrains.mpslite.structure.AddInequationStatement" id="1197295752278">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197295964986">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197295965724" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197295948742">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197295963345">
                  <link role="childDeclaration" targetNodeId="1182969330673" resolveInfo="right" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197295946804" />
              </node>
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197295967756">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197295968478" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197295956387">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197295958297">
                  <link role="childDeclaration" targetNodeId="1182969324810" resolveInfo="left" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197295953839" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389312204">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389312205">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389312206" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969485238">
      <property name="name" value="EqualsExpression" />
      <property name="overrideTypes" value="true" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969485239">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969485240">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969485241">
          <property name="text" value="==" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969485242">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284555654">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284555655">
          <node role="statement" type="jetbrains.mpslite.structure.AddComparableConstraintStatement" id="1197298687586">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298692141">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197298693034" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298690527">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197298691296">
                  <link role="childDeclaration" targetNodeId="1182969324810" resolveInfo="left" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197298689573" />
              </node>
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298696634">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197298697309" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298694693">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197298695758">
                  <link role="childDeclaration" targetNodeId="1182969330673" resolveInfo="right" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197298694036" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197295055568">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197295064372">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197295065125" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197295063605" />
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197295075990">
              <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197295078962">
                <link role="concept" targetNodeId="1197288761671" resolveInfo="BooleanType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389313348">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389313349">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389313350" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969490290">
      <property name="name" value="NotEqualsExpression" />
      <property name="overrideTypes" value="true" />
      <link role="extends" targetNodeId="1182969317058" resolveInfo="BinaryExpression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969490291">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969490292">
          <property name="rightTransformable" value="true" />
          <link role="declaration" targetNodeId="1182969324810" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969490293">
          <property name="text" value="!=" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1182969490294">
          <link role="declaration" targetNodeId="1182969330673" resolveInfo="right" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284557281">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284557282">
          <node role="statement" type="jetbrains.mpslite.structure.AddComparableConstraintStatement" id="1197298700343">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298700344">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197298700345" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298700346">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197298700347">
                  <link role="childDeclaration" targetNodeId="1182969324810" resolveInfo="left" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197298700348" />
              </node>
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298700349">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197298700350" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197298700351">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197298700352">
                  <link role="childDeclaration" targetNodeId="1182969330673" resolveInfo="right" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197298700353" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197295084074">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197295084075">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197295084076" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197295084077" />
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197295084078">
              <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197295084079">
                <link role="concept" targetNodeId="1197288761671" resolveInfo="BooleanType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389314632">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389314633">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389314634" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183460721462">
      <property name="name" value="ParensExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183460731478">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1183460733479">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1183460735684">
          <property name="name" value="expr" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1183460745296">
          <property name="text" value=")" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284558658">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284558659">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197294701345">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294706599">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294710244" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294705520" />
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294715640">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294716690" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294713558">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197294714546">
                  <link role="childDeclaration" targetNodeId="1183460735684" resolveInfo="expr" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294711745" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389315916">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389315917">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389315918" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969716964">
      <property name="name" value="InstanceMethodCallExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969726512">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1182969745144">
          <property name="name" value="instance" />
          <property name="rightTransformable" value="true" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969748912">
          <property name="text" value="." />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ReferenceDeclarationPart" id="1182969728654">
          <property name="name" value="method" />
          <link role="type" targetNodeId="1182956481679" resolveInfo="InstanceMethod" />
          <node role="scope" type="jetbrains.mpslite.structure.Scope_ConceptFunction" id="1197300873674">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197300873675">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197300884904">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197300884905">
                  <property name="name" value="result" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1197300884906">
                    <node role="elementType" type="jetbrains.mpslite.structure.NodeType" id="1197300887674">
                      <link role="concept" targetNodeId="1182956481679" resolveInfo="InstanceMethod" />
                    </node>
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197300892755">
                    <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1197300892756">
                      <node role="elementType" type="jetbrains.mpslite.structure.NodeType" id="1197300892757">
                        <link role="concept" targetNodeId="1182956481679" resolveInfo="InstanceMethod" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197300877239">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1197300879337">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197300880433" />
                  <node role="leftExpression" type="jetbrains.mpslite.structure.ReferenceNode_ConceptFunctionParameter" id="1197300878086" />
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197300877241">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197300895586">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197300896166">
                      <link role="variableDeclaration" targetNodeId="1197300884905" resolveInfo="result" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197300999273">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197300999274">
                  <property name="name" value="nodeType" />
                  <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197300999275" />
                  <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301360246">
                    <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197301362749" />
                    <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301009308">
                      <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197301009309">
                        <link role="childDeclaration" targetNodeId="1182969745144" resolveInfo="instance" />
                      </node>
                      <node role="expression" type="jetbrains.mpslite.structure.ReferenceNode_ConceptFunctionParameter" id="1197301009310" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197301046611">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197301046612">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197301069137">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197301069138">
                      <property name="name" value="ct" />
                      <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197301069139">
                        <link role="concept" targetNodeId="1182958613287" resolveInfo="ClassifierType" />
                      </node>
                      <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301091330">
                        <node role="operation" type="jetbrains.mpslite.structure.CastOperation" id="1197301092209">
                          <link role="castTo" targetNodeId="1182958613287" resolveInfo="ClassifierType" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301089736">
                          <link role="variableDeclaration" targetNodeId="1197300999274" resolveInfo="nodeType" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197301119137">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197301119138">
                      <property name="name" value="cls" />
                      <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197301119139">
                        <link role="concept" targetNodeId="1182956307043" resolveInfo="ClassConcept" />
                      </node>
                      <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301126954">
                        <node role="operation" type="jetbrains.mpslite.structure.ReferenceAccessOperation" id="1197301128410">
                          <link role="referenceDeclaration" targetNodeId="1182958670869" resolveInfo="classifier" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301126250">
                          <link role="variableDeclaration" targetNodeId="1197301069138" resolveInfo="ct" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1197301130646">
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1197301134197">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197301135247" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301132274">
                        <link role="variableDeclaration" targetNodeId="1197301119138" resolveInfo="cls" />
                      </node>
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197301130648">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197301138372">
                        <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197301139046">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301138373">
                            <link role="variableDeclaration" targetNodeId="1197300884905" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1197301140625">
                            <node role="argument" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301142909">
                              <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197301146365">
                                <link role="childDeclaration" targetNodeId="1182956342684" resolveInfo="method" />
                              </node>
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301142237">
                                <link role="variableDeclaration" targetNodeId="1197301119138" resolveInfo="cls" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197301148492">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1197301149072">
                          <node role="rValue" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197391839163">
                            <node role="operation" type="jetbrains.mpslite.structure.ReferenceAccessOperation" id="1197391840197">
                              <link role="referenceDeclaration" targetNodeId="1197391717894" resolveInfo="classifier" />
                            </node>
                            <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301158471">
                              <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197391836881">
                                <link role="childDeclaration" targetNodeId="1197391748054" resolveInfo="extends" />
                              </node>
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301151091">
                                <link role="variableDeclaration" targetNodeId="1197301119138" resolveInfo="cls" />
                              </node>
                            </node>
                          </node>
                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301148493">
                            <link role="variableDeclaration" targetNodeId="1197301119138" resolveInfo="cls" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197301049601">
                  <node role="operation" type="jetbrains.mpslite.structure.IsInstanceOfOperation" id="1197301050947">
                    <link role="concept" targetNodeId="1182958613287" resolveInfo="ClassifierType" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301047834">
                    <link role="variableDeclaration" targetNodeId="1197300999274" resolveInfo="nodeType" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197301111634">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197301112714">
                  <link role="variableDeclaration" targetNodeId="1197300884905" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969735000">
          <property name="text" value="(" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1197301960227">
          <property name="name" value="parameter" />
          <property name="separator" value="," />
          <property name="many" value="true" />
          <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969738502">
          <property name="text" value=")" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284559847">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284559848">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197302124656">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1197302133059">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197302142712">
                <node role="leftExpression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302140286">
                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197302141211">
                    <link role="childDeclaration" targetNodeId="1183118666129" resolveInfo="parameter" />
                  </node>
                  <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302138329">
                    <node role="operation" type="jetbrains.mpslite.structure.ReferenceAccessOperation" id="1197302139051">
                      <link role="referenceDeclaration" targetNodeId="1182969728654" resolveInfo="method" />
                    </node>
                    <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197302137406" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1197302143369" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197302130885">
                <node role="leftExpression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302129022">
                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197302130056">
                    <link role="childDeclaration" targetNodeId="1197301960227" resolveInfo="parameter" />
                  </node>
                  <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197302128349" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1197302132121" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197302124658">
              <node role="statement" type="jetbrains.mpslite.structure.ReportErrorStatement" id="1197302146527">
                <node role="nodeWithError" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197302149356" />
                <node role="errorMessage" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1197302151107">
                  <property name="value" value="Wrong parameters number" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197302164531" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197302373037">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197302373038">
              <property name="name" value="params" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1197302373039">
                <node role="elementType" type="jetbrains.mpslite.structure.NodeType" id="1197302375244">
                  <link role="concept" targetNodeId="1183027852869" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302384470">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197302385629">
                  <link role="childDeclaration" targetNodeId="1183118666129" resolveInfo="parameter" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302382934">
                  <node role="operation" type="jetbrains.mpslite.structure.ReferenceAccessOperation" id="1197302383766">
                    <link role="referenceDeclaration" targetNodeId="1182969728654" resolveInfo="method" />
                  </node>
                  <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197302382043" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197302387865">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197302387866">
              <property name="name" value="arguments" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1197302387867">
                <node role="elementType" type="jetbrains.mpslite.structure.NodeType" id="1197302389666">
                  <link role="concept" targetNodeId="1182966285571" resolveInfo="Expression" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302395201">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197302396219">
                  <link role="childDeclaration" targetNodeId="1197301960227" resolveInfo="parameter" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197302394231" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1197302400034">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197302400035">
              <node role="statement" type="jetbrains.mpslite.structure.AddInequationStatement" id="1197302419980">
                <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302454390">
                  <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197302456112" />
                  <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197302448589">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302447588">
                      <link role="variableDeclaration" targetNodeId="1197302387866" resolveInfo="arguments" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1197302449699">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302452233">
                        <link role="variableDeclaration" targetNodeId="1197302400037" resolveInfo="i" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197302434598">
                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197302444071">
                    <link role="childDeclaration" targetNodeId="1183027551224" resolveInfo="type" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197302427672">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302426687">
                      <link role="variableDeclaration" targetNodeId="1197302373038" resolveInfo="params" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1197302429001">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302431535">
                        <link role="variableDeclaration" targetNodeId="1197302400037" resolveInfo="i" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197302400037">
              <property name="name" value="i" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1197302401367" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1197302404119">
                <property name="value" value="0" />
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1197302406996">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197302408610">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302407890">
                  <link role="variableDeclaration" targetNodeId="1197302373038" resolveInfo="params" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1197302409267" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302405027">
                <link role="variableDeclaration" targetNodeId="1197302400037" resolveInfo="i" />
              </node>
            </node>
            <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1197302411035">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1197302415445">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1197302416042">
                  <property name="value" value="1" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302413647">
                  <link role="variableDeclaration" targetNodeId="1197302400037" resolveInfo="i" />
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197302410581">
                <link role="variableDeclaration" targetNodeId="1197302400037" resolveInfo="i" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389317232">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389317233">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389317234" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969841552">
      <property name="name" value="NumberExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969848709">
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyDeclarationPart" id="1182969849632">
          <property name="name" value="number" />
          <link role="type" targetNodeId="1.1182511916107" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284560959">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284560960">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197294726801">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294731539">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294732308" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294730351" />
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197294736528">
              <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197294738373">
                <link role="concept" targetNodeId="1182956600677" resolveInfo="IntType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389318438">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389318439">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389318440" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1182969854711">
      <property name="name" value="StringLiteralExpression" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1182969870900">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969872714">
          <property name="text" value="&quot;" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyDeclarationPart" id="1182969874779">
          <property name="name" value="text" />
          <link role="type" targetNodeId="1.1182511871037" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1182969878640">
          <property name="text" value="&quot;" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284562070">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284562071">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197294774083">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294778665">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294779684" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294777024" />
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197294782060">
              <node role="creator" type="jetbrains.mpslite.structure.NodeCreator" id="1197294783062">
                <link role="concept" targetNodeId="1197294756250" resolveInfo="StringType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389319706">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389319707">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389319708" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183028652393">
      <property name="name" value="LocalVariableReference" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183028662754">
        <node role="linePart" type="jetbrains.mpslite.structure.ReferenceDeclarationPart" id="1183028664818">
          <property name="name" value="variable" />
          <link role="type" targetNodeId="1183027574668" resolveInfo="LocalVariableDeclaration" />
          <node role="scope" type="jetbrains.mpslite.structure.Scope_ConceptFunction" id="1197042683280">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197042683281">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197043021884">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197043021885">
                  <property name="name" value="result" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1197043021886">
                    <node role="elementType" type="jetbrains.mpslite.structure.NodeType" id="1197043024106">
                      <link role="concept" targetNodeId="1183027574668" resolveInfo="LocalVariableDeclaration" />
                    </node>
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197043037514">
                    <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1197043037515">
                      <node role="elementType" type="jetbrains.mpslite.structure.NodeType" id="1197043037516">
                        <link role="concept" targetNodeId="1183027574668" resolveInfo="LocalVariableDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197042733340">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197042733341">
                  <property name="name" value="current" />
                  <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197042733342">
                    <link role="concept" targetNodeId="1182956498103" resolveInfo="StatementList" />
                  </node>
                  <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197043153019">
                    <node role="operation" type="jetbrains.mpslite.structure.AncestorOperation" id="1197043154116">
                      <property name="includeSelf" value="true" />
                      <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
                    </node>
                    <node role="expression" type="jetbrains.mpslite.structure.EnclosingNode_ConceptFunctionParameter" id="1197043151549" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1197043162398">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1197043164590">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197043165499" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197043163480">
                    <link role="variableDeclaration" targetNodeId="1197042733341" resolveInfo="current" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197043162400">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1197045445331">
                    <node role="iterable" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197045454479">
                      <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197045456404">
                        <link role="childDeclaration" targetNodeId="1182966258725" resolveInfo="statement" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045452806">
                        <link role="variableDeclaration" targetNodeId="1197042733341" resolveInfo="current" />
                      </node>
                    </node>
                    <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197045445333">
                      <property name="name" value="st" />
                      <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197045447586">
                        <link role="concept" targetNodeId="1182966087965" resolveInfo="Statement" />
                      </node>
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197045445335">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197045458592">
                        <node role="condition" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197045460456">
                          <node role="operation" type="jetbrains.mpslite.structure.IsInstanceOfOperation" id="1197045461209">
                            <link role="concept" targetNodeId="1183027955959" resolveInfo="LocalVariableDeclarationStatement" />
                          </node>
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045459783">
                            <link role="variableDeclaration" targetNodeId="1197045445333" resolveInfo="st" />
                          </node>
                        </node>
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197045458594">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197045618511">
                            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197045618512">
                              <property name="name" value="var" />
                              <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197045618513">
                                <link role="concept" targetNodeId="1183027955959" resolveInfo="LocalVariableDeclarationStatement" />
                              </node>
                              <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197045627048">
                                <node role="operation" type="jetbrains.mpslite.structure.CastOperation" id="1197045628566">
                                  <link role="castTo" targetNodeId="1183027955959" resolveInfo="LocalVariableDeclarationStatement" />
                                </node>
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045623172">
                                  <link role="variableDeclaration" targetNodeId="1197045445333" resolveInfo="st" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197045636803">
                            <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1197045637321">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045636804">
                                <link role="variableDeclaration" targetNodeId="1197043021885" resolveInfo="result" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1197045638744">
                                <node role="argument" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197045642466">
                                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197045645234">
                                    <link role="childDeclaration" targetNodeId="1183027964867" resolveInfo="declaration" />
                                  </node>
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045640746">
                                    <link role="variableDeclaration" targetNodeId="1197045618512" resolveInfo="var" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197045648612">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1197045649192">
                      <node role="rValue" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197045652930">
                        <node role="operation" type="jetbrains.mpslite.structure.AncestorOperation" id="1197045654043">
                          <link role="type" targetNodeId="1182956498103" resolveInfo="StatementList" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045650835">
                          <link role="variableDeclaration" targetNodeId="1197042733341" resolveInfo="current" />
                        </node>
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197045648613">
                        <link role="variableDeclaration" targetNodeId="1197042733341" resolveInfo="current" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197042992749">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197043040471">
                  <link role="variableDeclaration" targetNodeId="1197043021885" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284563369">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284563370">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197294521073">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294521074">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294521075" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294521076" />
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294521077">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294521078" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294521079">
                <node role="operation" type="jetbrains.mpslite.structure.ReferenceAccessOperation" id="1197294521080">
                  <link role="referenceDeclaration" targetNodeId="1183028664818" resolveInfo="variable" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294521081" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389321037">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389321038">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389321039" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183028672226">
      <property name="name" value="ParameterReference" />
      <link role="extends" targetNodeId="1182966285571" resolveInfo="Expression" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183028678773">
        <node role="linePart" type="jetbrains.mpslite.structure.ReferenceDeclarationPart" id="1183028680338">
          <property name="name" value="parameter" />
          <link role="type" targetNodeId="1183027852869" resolveInfo="ParameterDeclaration" />
          <node role="scope" type="jetbrains.mpslite.structure.Scope_ConceptFunction" id="1197040495000">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197040495001">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197040498799">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197040498800">
                  <property name="name" value="method" />
                  <node role="type" type="jetbrains.mpslite.structure.NodeType" id="1197040498801">
                    <link role="concept" targetNodeId="1182956481186" resolveInfo="BaseMethod" />
                  </node>
                  <node role="initializer" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197040526787">
                    <node role="operation" type="jetbrains.mpslite.structure.AncestorOperation" id="1197040527836">
                      <link role="type" targetNodeId="1182956481186" resolveInfo="BaseMethod" />
                    </node>
                    <node role="expression" type="jetbrains.mpslite.structure.EnclosingNode_ConceptFunctionParameter" id="1197041615326" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197040544025">
                <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197040545355">
                  <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197040546405">
                    <link role="childDeclaration" targetNodeId="1183118666129" resolveInfo="parameter" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197040544026">
                    <link role="variableDeclaration" targetNodeId="1197040498800" resolveInfo="method" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284564559">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284564560">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197294522238">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294522239">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294522240" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294522241" />
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294522242">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294522243" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294522244">
                <node role="operation" type="jetbrains.mpslite.structure.ReferenceAccessOperation" id="1197294525013">
                  <link role="referenceDeclaration" targetNodeId="1183028680338" resolveInfo="parameter" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294522246" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197389322244">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197389322245">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197389322246" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.ConceptDeclarations" id="1183027540955">
    <property name="name" value="Variables" />
    <property name="showBehavior" value="true" />
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183027543503">
      <property name="name" value="VariableDeclaration" />
      <property name="abstract" value="true" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183027547910">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1183027551224">
          <property name="name" value="type" />
          <link role="type" targetNodeId="1182956598488" resolveInfo="Type" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyDeclarationPart" id="1183027558523">
          <property name="name" value="name" />
          <link role="type" targetNodeId="1.1197382692601" resolveInfo="id" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.OptionalPart" id="1197380538412">
          <node role="part" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197380553994">
            <property name="text" value="=" />
          </node>
          <node role="part" type="jetbrains.mpslite.structure.ChildDeclarationPart" id="1197380538960">
            <property name="name" value="initializer" />
            <link role="type" targetNodeId="1182966285571" resolveInfo="Expression" />
          </node>
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284601017">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284601018">
          <node role="statement" type="jetbrains.mpslite.structure.AddEquationStatement" id="1197294385681">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294392075">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197294396673" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294391043" />
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197294398534">
              <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197294401225">
                <link role="childDeclaration" targetNodeId="1183027551224" resolveInfo="type" />
              </node>
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197294397862" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mpslite.structure.AddInequationStatement" id="1197299075189">
            <node role="left" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299260535">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197299261851" />
              <node role="expression" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299081990">
                <node role="operation" type="jetbrains.mpslite.structure.ChildAccessOperation" id="1197380542898">
                  <link role="childDeclaration" targetNodeId="1197380538960" resolveInfo="initializer" />
                </node>
                <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197299077880" />
              </node>
            </node>
            <node role="right" type="jetbrains.mpslite.structure.MPSLiteOperationExpression" id="1197299087995">
              <node role="operation" type="jetbrains.mpslite.structure.TypeOperation" id="1197299090545" />
              <node role="expression" type="jetbrains.mpslite.structure.ThisNodeExpression" id="1197299086791" />
            </node>
          </node>
        </node>
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197452448651">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197452448652">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197452448653" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183027574668">
      <property name="name" value="LocalVariableDeclaration" />
      <property name="role" value="true" />
      <link role="extends" targetNodeId="1183027543503" resolveInfo="VariableDeclaration" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183027580482">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1183027591343">
          <link role="declaration" targetNodeId="1183027551224" resolveInfo="type" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyReferencePart" id="1183027770091">
          <link role="declaration" targetNodeId="1183027558523" resolveInfo="name" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.OptionalPart" id="1197380408732">
          <node role="part" type="jetbrains.mpslite.structure.ConstantLinePart" id="1197380411014">
            <property name="text" value="=" />
          </node>
          <node role="part" type="jetbrains.mpslite.structure.ChildReferencePart" id="1197380413797">
            <link role="declaration" targetNodeId="1197380538960" resolveInfo="initializer" />
          </node>
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284602472">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284602473" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197452449591">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197452449592">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197452449593" />
        </node>
      </node>
    </node>
    <node role="conceptDeclaration" type="jetbrains.mpslite.structure.ConceptDeclaration" id="1183027852869">
      <property name="name" value="ParameterDeclaration" />
      <property name="role" value="true" />
      <link role="extends" targetNodeId="1183027543503" resolveInfo="VariableDeclaration" />
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1183027923778">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildReferencePart" id="1183027924129">
          <link role="declaration" targetNodeId="1183027551224" resolveInfo="type" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyReferencePart" id="1183027924130">
          <link role="declaration" targetNodeId="1183027558523" resolveInfo="name" />
        </node>
      </node>
      <node role="types" type="jetbrains.mpslite.structure.TypesBlock" id="1197284603677">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197284603678" />
      </node>
      <node role="behavior" type="jetbrains.mpslite.structure.Behavior" id="1197452450735">
        <node role="constructor" type="jetbrains.mpslite.structure.ConstructorBlock" id="1197452450736">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197452450737" />
        </node>
      </node>
    </node>
  </node>
</model>

