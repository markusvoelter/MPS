<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:2645cf7b-becf-4fd8-946c-a69d83379844(jetbrains.mps.workbench.dialogs.project.components.parts.diffrowtable)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <import index="t147" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="6l7b" modelUID="f:java_stub#javax.swing.table(javax.swing.table@java_stub)" version="-1" />
  <import index="yjwb" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="2uit" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="46vv" modelUID="f:java_stub#java.awt.event(java.awt.event@java_stub)" version="-1" />
  <import index="8v99" modelUID="f:java_stub#javax.swing.event(javax.swing.event@java_stub)" version="-1" />
  <import index="nmow" modelUID="f:java_stub#javax.swing.plaf.basic(javax.swing.plaf.basic@java_stub)" version="-1" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="aa0t" modelUID="r:2645cf7b-becf-4fd8-946c-a69d83379844(jetbrains.mps.workbench.dialogs.project.components.parts.diffrowtable)" version="-1" implicit="yes" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" implicit="yes" />
  <roots>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="1560298786499490568">
      <property name="name" nameId="yvnu.1169194664001:0" value="DiffRowTable" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="1560298786499496072">
      <property name="name" nameId="yvnu.1169194664001:0" value="BasicDiffRowTableUI" />
    </node>
  </roots>
  <root id="1560298786499490568">
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490569" />
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490570">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTable" />
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490571">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490572" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490573">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThisConstructorInvocation" typeId="yvor.1178893518978:3" id="1560298786499490574">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490598" resolveInfo="DiffRowTable" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490575" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490576" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490577" />
        </node>
      </node>
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490578">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490579" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490580">
        <property name="name" nameId="yvnu.1169194664001:0" value="dm" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490581">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableModel" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490582">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThisConstructorInvocation" typeId="yvor.1178893518978:3" id="1560298786499490583">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490598" resolveInfo="DiffRowTable" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490584">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490580" resolveInfo="dm" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490585" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490586" />
        </node>
      </node>
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490587">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490588" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490589">
        <property name="name" nameId="yvnu.1169194664001:0" value="dm" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490590">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableModel" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490591">
        <property name="name" nameId="yvnu.1169194664001:0" value="cm" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490592">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumnModel" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490593">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThisConstructorInvocation" typeId="yvor.1178893518978:3" id="1560298786499490594">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490598" resolveInfo="DiffRowTable" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490595">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490589" resolveInfo="dm" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490596">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490591" resolveInfo="cm" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490597" />
        </node>
      </node>
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490598">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490599" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490600">
        <property name="name" nameId="yvnu.1169194664001:0" value="dm" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490601">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableModel" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490602">
        <property name="name" nameId="yvnu.1169194664001:0" value="cm" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490603">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumnModel" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490604">
        <property name="name" nameId="yvnu.1169194664001:0" value="sm" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490605">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~ListSelectionModel" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490606">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="1560298786499490607">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%d&lt;init&gt;(javax%dswing%dtable%dTableModel,javax%dswing%dtable%dTableColumnModel,javax%dswing%dListSelectionModel)" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490608">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490600" resolveInfo="dm" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490609">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490602" resolveInfo="cm" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490610">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490604" resolveInfo="sm" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490611">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201763">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dsetUI(javax%dswing%dplaf%dTableUI)%cvoid" resolveInfo="setUI" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490615">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499490616">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496074" resolveInfo="BasicDiffRowTableUI" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490617">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490618" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490619">
        <property name="name" nameId="yvnu.1169194664001:0" value="numRows" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490620" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490621">
        <property name="name" nameId="yvnu.1169194664001:0" value="numColumns" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490622" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490623">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThisConstructorInvocation" typeId="yvor.1178893518978:3" id="1560298786499490624">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490578" resolveInfo="DiffRowTable" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490625">
            <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499490626">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~DefaultTableModel%d&lt;init&gt;(int,int)" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490627">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490619" resolveInfo="numRows" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490628">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490621" resolveInfo="numColumns" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490629">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490630" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490631">
        <property name="name" nameId="yvnu.1169194664001:0" value="rowData" />
        <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490632">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Vector" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490633">
        <property name="name" nameId="yvnu.1169194664001:0" value="columnNames" />
        <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490634">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Vector" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490635">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="1560298786499490636">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%d&lt;init&gt;(java%dutil%dVector,java%dutil%dVector)" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490637">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490631" resolveInfo="rowData" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490638">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490633" resolveInfo="columnNames" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490639">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201858">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dsetUI(javax%dswing%dplaf%dTableUI)%cvoid" resolveInfo="setUI" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490643">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499490644">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496074" resolveInfo="BasicDiffRowTableUI" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490645">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201602">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%daddComponentListener(java%dawt%devent%dComponentListener)%cvoid" resolveInfo="addComponentListener" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490649">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="1560298786499490650">
                <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="1560298786499490651">
                  <property name="name" nameId="yvnu.1169194664001:0" value="" />
                  <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ComponentAdapter" resolveInfo="ComponentAdapter" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="46vv.~ComponentAdapter%d&lt;init&gt;()" />
                  <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490652">
                    <property name="name" nameId="yvnu.1169194664001:0" value="componentResized" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490653" />
                    <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499490654" />
                    <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490655">
                      <property name="name" nameId="yvnu.1169194664001:0" value="e" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490656">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ComponentEvent" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491160">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491161">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491162">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1560298786499491163">
                            <link role="classConcept" roleId="yvor.1182955020723:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491164">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%drevalidate()%cvoid" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499490657">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490658" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490659">
        <property name="name" nameId="yvnu.1169194664001:0" value="rowData" />
        <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1560298786499490660">
          <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1560298786499490661">
            <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490662">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490663">
        <property name="name" nameId="yvnu.1169194664001:0" value="columnNames" />
        <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1560298786499490664">
          <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490665">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" />
          </node>
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490666">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="1560298786499490667">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%d&lt;init&gt;(java%dlang%dObject[][],java%dlang%dObject[])" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490668">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490659" resolveInfo="rowData" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490669">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490663" resolveInfo="columnNames" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490670">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201819">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dsetUI(javax%dswing%dplaf%dTableUI)%cvoid" resolveInfo="setUI" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490674">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499490675">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496074" resolveInfo="BasicDiffRowTableUI" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490676">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201795">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%daddComponentListener(java%dawt%devent%dComponentListener)%cvoid" resolveInfo="addComponentListener" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490680">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="1560298786499490681">
                <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="1560298786499490682">
                  <property name="name" nameId="yvnu.1169194664001:0" value="" />
                  <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ComponentAdapter" resolveInfo="ComponentAdapter" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="46vv.~ComponentAdapter%d&lt;init&gt;()" />
                  <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490683">
                    <property name="name" nameId="yvnu.1169194664001:0" value="componentResized" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490684" />
                    <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499490685" />
                    <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490686">
                      <property name="name" nameId="yvnu.1169194664001:0" value="e" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490687">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ComponentEvent" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491165">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491166">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491167">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1560298786499491168">
                            <link role="classConcept" roleId="yvor.1182955020723:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491169">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%drevalidate()%cvoid" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490688">
      <property name="name" nameId="yvnu.1169194664001:0" value="rowAtPoint" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490689" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490690" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490691">
        <property name="name" nameId="yvnu.1169194664001:0" value="point" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490692">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Point" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490693">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490694">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490695">
            <property name="name" nameId="yvnu.1169194664001:0" value="y" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490696" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490697">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490698">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Point%dy" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490699">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490691" resolveInfo="point" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490700">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490701">
            <property name="name" nameId="yvnu.1169194664001:0" value="rowSpacing" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490702" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490703">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490704">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dheight" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201699">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetIntercellSpacing()%cjava%dawt%dDimension" resolveInfo="getIntercellSpacing" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490708">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490709">
            <property name="name" nameId="yvnu.1169194664001:0" value="rowCount" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490710" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201883">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowCount()%cint" resolveInfo="getRowCount" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490714">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490715">
            <property name="name" nameId="yvnu.1169194664001:0" value="rowHeight" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490716" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490717">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499490718">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499490719">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490720">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490722" resolveInfo="row" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490721">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490709" resolveInfo="rowCount" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490722">
            <property name="name" nameId="yvnu.1169194664001:0" value="row" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490723" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490724">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499490725">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490726">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490722" resolveInfo="row" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490727">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490728">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499490729">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490730">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490715" resolveInfo="rowHeight" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499490731">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201614">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490735">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490722" resolveInfo="row" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490736">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490701" resolveInfo="rowSpacing" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499490737">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499490738">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490739">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490695" resolveInfo="y" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490740">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490715" resolveInfo="rowHeight" />
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490741">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499490742">
                  <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490743">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490722" resolveInfo="row" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499490744">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499490745">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490746">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490747">
      <property name="name" nameId="yvnu.1169194664001:0" value="getHeight" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490748" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490749" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490750">
        <property name="name" nameId="yvnu.1169194664001:0" value="obj" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490751">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490752">
        <property name="name" nameId="yvnu.1169194664001:0" value="colNum" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490753" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490754">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490755">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490756">
            <property name="name" nameId="yvnu.1169194664001:0" value="tcr" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490757">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableCellRenderer" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490758">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490759">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201869">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" resolveInfo="getColumnModel" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490763">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumn(int)%cjavax%dswing%dtable%dTableColumn" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490764">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490752" resolveInfo="colNum" />
                  </node>
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490765">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetCellRenderer()%cjavax%dswing%dtable%dTableCellRenderer" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499490766">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1560298786499490767">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490768">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490756" resolveInfo="tcr" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499490769" />
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490770">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490771">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490772">
                <property name="name" nameId="yvnu.1169194664001:0" value="rendererComponent" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490773">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Component" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490774">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490775">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490756" resolveInfo="tcr" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490776">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableCellRenderer%dgetTableCellRendererComponent(javax%dswing%dJTable,java%dlang%dObject,boolean,boolean,int,int)%cjava%dawt%dComponent" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1560298786499490777" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490778">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490750" resolveInfo="obj" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499490779">
                      <property name="value" nameId="yvor.1068580123138:3" value="true" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499490780">
                      <property name="value" nameId="yvor.1068580123138:3" value="true" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490781">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490782">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499490783">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499490784">
                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1560298786499490785">
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Math" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Math%dround(double)%clong" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490786">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490787">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490788">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490772" resolveInfo="rendererComponent" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490789">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetPreferredSize()%cjava%dawt%dDimension" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490790">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Dimension%dgetHeight()%cdouble" />
                    </node>
                  </node>
                </node>
                <node role="type" roleId="yvor.1070534934091:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499547223" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499490791">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201608">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490795" resolveInfo="getRowHeight" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490795">
      <property name="name" nameId="yvnu.1169194664001:0" value="getRowHeight" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490796" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490797" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490798">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499490799">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490800">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201708">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dgetFontMetrics(java%dawt%dFont)%cjava%dawt%dFontMetrics" resolveInfo="getFontMetrics" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201759">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetFont()%cjava%dawt%dFont" resolveInfo="getFont" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490807">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~FontMetrics%dgetHeight()%cint" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490808">
      <property name="name" nameId="yvnu.1169194664001:0" value="getRowHeight" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490809" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490810" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490811">
        <property name="name" nameId="yvnu.1169194664001:0" value="row" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490812" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490813">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490814">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490815">
            <property name="name" nameId="yvnu.1169194664001:0" value="tm" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490816">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableModel" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201833">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetModel()%cjavax%dswing%dtable%dTableModel" resolveInfo="getModel" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490820">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490821">
            <property name="name" nameId="yvnu.1169194664001:0" value="height" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490822" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490823">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201836">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dgetFontMetrics(java%dawt%dFont)%cjava%dawt%dFontMetrics" resolveInfo="getFontMetrics" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201570">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetFont()%cjava%dawt%dFont" resolveInfo="getFont" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490830">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~FontMetrics%dgetHeight()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499490831">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499490832">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490833">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490839" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490834">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201697">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" resolveInfo="getColumnModel" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490838">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumnCount()%cint" />
              </node>
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490839">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490840" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490841">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499490842">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490843">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490839" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490844">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="1560298786499490845">
              <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="1560298786499490846">
                <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490847" />
                <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490848">
                  <property name="name" nameId="yvnu.1169194664001:0" value="e" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490849">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Exception" />
                  </node>
                </node>
              </node>
              <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490850">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490851">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499490852">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490853">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490821" resolveInfo="height" />
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1560298786499490854">
                      <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Math" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Math%dmax(int,int)%cint" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490855">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490821" resolveInfo="height" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201604">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490747" resolveInfo="getHeight" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490859">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490860">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490815" resolveInfo="tm" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490861">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableModel%dgetValueAt(int,int)%cjava%dlang%dObject" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490862">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490811" resolveInfo="row" />
                            </node>
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490863">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490839" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490864">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490839" resolveInfo="i" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499490865">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490866">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490821" resolveInfo="height" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499490867">
      <property name="name" nameId="yvnu.1169194664001:0" value="getCellRect" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499490868" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490869">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490870">
        <property name="name" nameId="yvnu.1169194664001:0" value="row" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490871" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490872">
        <property name="name" nameId="yvnu.1169194664001:0" value="column" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490873" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499490874">
        <property name="name" nameId="yvnu.1169194664001:0" value="includeSpacing" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1560298786499490875" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490876">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490877">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490878">
            <property name="name" nameId="yvnu.1169194664001:0" value="cellFrame" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490879">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490880">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490881">
            <property name="name" nameId="yvnu.1169194664001:0" value="aColumn" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490882">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490883">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499490884">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490885">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499490886">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499490887">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%d&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490888">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499490889">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490890">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490891">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490892">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499490893">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201786">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490897">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490870" resolveInfo="row" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204912">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="t147.~JTable%drowMargin" resolveInfo="rowMargin" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490901">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499490902">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490903">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490904">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490905">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490906">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499490907">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499490908">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490909">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490911" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490910">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490870" resolveInfo="row" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490911">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490912" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490913">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499490914">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490915">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490911" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490916">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490917">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499490918">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490919">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490920">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490921">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499490922">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201682">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490926">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490911" resolveInfo="i" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204013">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="t147.~JTable%drowMargin" resolveInfo="rowMargin" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490930">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490931">
            <property name="name" nameId="yvnu.1169194664001:0" value="index" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490932" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499490933">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490934">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490935">
            <property name="name" nameId="yvnu.1169194664001:0" value="columnMargin" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499490936" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490937">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201701">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" resolveInfo="getColumnModel" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490941">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumnMargin()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490942">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490943">
            <property name="name" nameId="yvnu.1169194664001:0" value="enumeration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490944">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Enumeration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490945">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201704">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" resolveInfo="getColumnModel" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490949">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumns()%cjava%dutil%dEnumeration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="1560298786499490950">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490951">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490952">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490943" resolveInfo="enumeration" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490953">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dhasMoreElements()%cboolean" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490954">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490955">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499490956">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490957">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490881" resolveInfo="aColumn" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499490958">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490959">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490960">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490943" resolveInfo="enumeration" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490961">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dnextElement()%cjava%dlang%dObject" />
                    </node>
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490962">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490963">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499490964">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490965">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490966">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490967">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499490968">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490969">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490970">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490881" resolveInfo="aColumn" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499490971">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetWidth()%cint" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490972">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490935" resolveInfo="columnMargin" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499490973">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499490974">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490975">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490931" resolveInfo="index" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490976">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490872" resolveInfo="column" />
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490977">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.BreakStatement" typeId="yvor.1081855346303:3" id="1560298786499490978" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490979">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499490980">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490981">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490982">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490983">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499490984">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499490985">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490986">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499490987">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499490988">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499490989">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490931" resolveInfo="index" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499490990">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1560298786499490991">
            <node role="expression" roleId="yvor.1081516765348:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499490992">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490874" resolveInfo="includeSpacing" />
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499490993">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499490994">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499490995">
                <property name="name" nameId="yvnu.1169194664001:0" value="spacing" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499490996">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201877">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetIntercellSpacing()%cjava%dawt%dDimension" resolveInfo="getIntercellSpacing" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491000">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491001">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491002">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491003">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dsetBounds(int,int,int,int)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499491004">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491005">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491006">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491007">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1560298786499491008">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491009">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491010">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dwidth" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491011">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490995" resolveInfo="spacing" />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491012">
                        <property name="value" nameId="yvor.1068580320021:3" value="2" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499491013">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491014">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491015">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491016">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1560298786499491017">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491018">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491019">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dheight" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491020">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490995" resolveInfo="spacing" />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491021">
                        <property name="value" nameId="yvor.1068580320021:3" value="2" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499491022">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491023">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491024">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491025">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491026">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491027">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dwidth" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491028">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490995" resolveInfo="spacing" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499491029">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491030">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491031">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491032">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491033">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491034">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dheight" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491035">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490995" resolveInfo="spacing" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499491036">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491037">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499490878" resolveInfo="cellFrame" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499491038">
      <property name="name" nameId="yvnu.1169194664001:0" value="columnSelectionChanged" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499491039" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499491040" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499491041">
        <property name="name" nameId="yvnu.1169194664001:0" value="e" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499491042">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8v99.~ListSelectionEvent" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491043">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491044">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201579">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%drepaint()%cvoid" resolveInfo="repaint" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499491048">
      <property name="name" nameId="yvnu.1169194664001:0" value="valueChanged" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499491049" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499491050" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499491051">
        <property name="name" nameId="yvnu.1169194664001:0" value="e" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499491052">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8v99.~ListSelectionEvent" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491053">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499491054">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491055">
            <property name="name" nameId="yvnu.1169194664001:0" value="firstIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499491056" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491057">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499491058">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491051" resolveInfo="e" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491059">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8v99.~ListSelectionEvent%dgetFirstIndex()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499491060">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491061">
            <property name="name" nameId="yvnu.1169194664001:0" value="lastIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499491062" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491063">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499491064">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491051" resolveInfo="e" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491065">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8v99.~ListSelectionEvent%dgetLastIndex()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499491066">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499491067">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499491068">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491069">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491055" resolveInfo="firstIndex" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499491070">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491071">
                  <property name="value" nameId="yvor.1068580320021:3" value="1" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499491072">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491073">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491061" resolveInfo="lastIndex" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499491074">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491075">
                  <property name="value" nameId="yvor.1068580320021:3" value="1" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491076">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491077">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201689">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%drepaint()%cvoid" resolveInfo="repaint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499491081">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491082">
            <property name="name" nameId="yvnu.1169194664001:0" value="dirtyRegion" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499491083">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201592">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490867" resolveInfo="getCellRect" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491087">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491055" resolveInfo="firstIndex" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491088">
                <property name="value" nameId="yvor.1068580320021:3" value="0" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499491089" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499491090">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491091">
            <property name="name" nameId="yvnu.1169194664001:0" value="numColumns" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499491092" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201538">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnCount()%cint" resolveInfo="getColumnCount" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499491096">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491097">
            <property name="name" nameId="yvnu.1169194664001:0" value="index" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499491098" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491099">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491055" resolveInfo="firstIndex" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499491100">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499491101">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491102">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491104" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491103">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491091" resolveInfo="numColumns" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491104">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499491105" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491106">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499491107">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491108">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491104" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491109">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491110">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491111">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491112">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491082" resolveInfo="dirtyRegion" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491113">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dadd(java%dawt%dRectangle)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201569">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490867" resolveInfo="getCellRect" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491117">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491097" resolveInfo="index" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491118">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491104" resolveInfo="i" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499491119" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491120">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499491121">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491122">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491097" resolveInfo="index" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491123">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491061" resolveInfo="lastIndex" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499491124">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499491125">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491126">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491128" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491127">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491091" resolveInfo="numColumns" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499491128">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499491129" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499491130">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499491131">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491132">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491128" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499491133">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491134">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491135">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491136">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491082" resolveInfo="dirtyRegion" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499491137">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dadd(java%dawt%dRectangle)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201616">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490867" resolveInfo="getCellRect" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491141">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491097" resolveInfo="index" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491142">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491128" resolveInfo="i" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499491143" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499491144">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201655">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%drepaint(int,int,int,int)%cvoid" resolveInfo="repaint" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491148">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491149">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491150">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491082" resolveInfo="dirtyRegion" />
              </node>
            </node>
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491151">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491152">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491153">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491082" resolveInfo="dirtyRegion" />
              </node>
            </node>
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491154">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491155">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491156">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491082" resolveInfo="dirtyRegion" />
              </node>
            </node>
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499491157">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499491158">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499491159">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499491082" resolveInfo="dirtyRegion" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1560298786499496072">
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496073">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="nmow.~BasicTableUI" />
    </node>
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1560298786499496074">
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499496075" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496076">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="1560298786499496077">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="nmow.~BasicTableUI%d&lt;init&gt;()" />
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496078">
      <property name="name" nameId="yvnu.1169194664001:0" value="createTableSize" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499496079" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496080">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496081">
        <property name="name" nameId="yvnu.1169194664001:0" value="width" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.LongType" typeId="yvor.1068581242867:3" id="1560298786499496082" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496083">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496084">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496085">
            <property name="name" nameId="yvnu.1169194664001:0" value="numCols" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496086" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496087">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204453">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496091">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnCount()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496092">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496093">
            <property name="name" nameId="yvnu.1169194664001:0" value="numRows" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496094" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496095">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204073">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496099">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowCount()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496100">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496101">
            <property name="name" nameId="yvnu.1169194664001:0" value="tm" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496102">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableModel" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496103">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204582">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496107">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetModel()%cjavax%dswing%dtable%dTableModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496108">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496109">
            <property name="name" nameId="yvnu.1169194664001:0" value="height" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1560298786499496110">
              <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496111" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496112">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ArrayCreator" typeId="yvor.1184950988562:3" id="1560298786499496113">
                <node role="dimensionExpression" roleId="yvor.1184952969026:3" type="yvor.DimensionExpression" typeId="yvor.1184952934362:3" id="1560298786499496114">
                  <node role="expression" roleId="yvor.1184953288404:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496115">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496093" resolveInfo="numRows" />
                  </node>
                </node>
                <node role="componentType" roleId="yvor.1184951007469:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496116" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496117">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496118">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496119">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496121" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496120">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496085" resolveInfo="numCols" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496121">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496122" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496123">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496124">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496125">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496121" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496126">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496127">
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496128">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496129">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496131" resolveInfo="j" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496130">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496093" resolveInfo="numRows" />
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496131">
                <property name="name" nameId="yvnu.1169194664001:0" value="j" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496132" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496133">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496134">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496135">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496131" resolveInfo="j" />
                </node>
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496136">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496137">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496138">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1560298786499496139">
                      <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496140">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496109" resolveInfo="height" />
                      </node>
                      <node role="index" roleId="yvor.1173175577737:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496141">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496131" resolveInfo="j" />
                      </node>
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1560298786499496142">
                      <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Math" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Math%dmax(int,int)%cint" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1560298786499496143">
                        <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496144">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496109" resolveInfo="height" />
                        </node>
                        <node role="index" roleId="yvor.1173175577737:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496145">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496131" resolveInfo="j" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496146">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496147">
                          <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496148">
                            <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204217">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                            </node>
                            <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496152">
                              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496153">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490747" resolveInfo="getHeight" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496154">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496155">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496101" resolveInfo="tm" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496156">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableModel%dgetValueAt(int,int)%cjava%dlang%dObject" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496157">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496131" resolveInfo="j" />
                              </node>
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496158">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496121" resolveInfo="i" />
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496159">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496121" resolveInfo="i" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496160">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496161">
            <property name="name" nameId="yvnu.1169194664001:0" value="totalMarginWidth" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496162" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1560298786499496163">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496164">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496165">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205135">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496169">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496170">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumnMargin()%cint" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496171">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496085" resolveInfo="numCols" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496172">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496173">
            <property name="name" nameId="yvnu.1169194664001:0" value="widthWithMargin" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.LongType" typeId="yvor.1068581242867:3" id="1560298786499496174" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496175">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496176">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496081" resolveInfo="width" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496177">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496161" resolveInfo="totalMarginWidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496178">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.GreaterThanExpression" typeId="yvor.1081506762703:3" id="1560298786499496179">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496180">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496173" resolveInfo="widthWithMargin" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1560298786499496181">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="vhgx.~Integer" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="vhgx.~Integer%dMAX_VALUE" />
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496182">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496183">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496184">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496185">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496173" resolveInfo="widthWithMargin" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1560298786499496186">
                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="vhgx.~Integer" />
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="vhgx.~Integer%dMAX_VALUE" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496187">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496188">
            <property name="name" nameId="yvnu.1169194664001:0" value="totalHeight" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496189" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496190">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496191">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496192">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496193">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496195" resolveInfo="k" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496194">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496093" resolveInfo="numRows" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496195">
            <property name="name" nameId="yvnu.1169194664001:0" value="k" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496196" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496197">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496198">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496199">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496195" resolveInfo="k" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496200">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496201">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496202">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496203">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496188" resolveInfo="totalHeight" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1560298786499496204">
                  <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496205">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496109" resolveInfo="height" />
                  </node>
                  <node role="index" roleId="yvor.1173175577737:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496206">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496195" resolveInfo="k" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499496207">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496208">
            <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499496209">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Dimension%d&lt;init&gt;(int,int)" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496210">
                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496211">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496173" resolveInfo="widthWithMargin" />
                </node>
                <node role="type" roleId="yvor.1070534934091:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499751013" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496212">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496213">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496188" resolveInfo="totalHeight" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1560298786499496214">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496215">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496093" resolveInfo="numRows" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496216">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204322">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496220">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowMargin()%cint" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496221">
      <property name="name" nameId="yvnu.1169194664001:0" value="getMinimumSize" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499496222" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496223">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496224">
        <property name="name" nameId="yvnu.1169194664001:0" value="c" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496225">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JComponent" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496226">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496227">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496228">
            <property name="name" nameId="yvnu.1169194664001:0" value="width" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.LongType" typeId="yvor.1068581242867:3" id="1560298786499496229" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496230">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496231">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496232">
            <property name="name" nameId="yvnu.1169194664001:0" value="enumeration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496233">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Enumeration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496234">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496235">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204782">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496239">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496240">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumns()%cjava%dutil%dEnumeration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="1560298786499496241">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496242">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496243">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496232" resolveInfo="enumeration" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496244">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dhasMoreElements()%cboolean" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496245">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496246">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496247">
                <property name="name" nameId="yvnu.1169194664001:0" value="aColumn" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496248">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496249">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496250">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496251">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496232" resolveInfo="enumeration" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496252">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dnextElement()%cjava%dlang%dObject" />
                    </node>
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496253">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496254">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496255">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496256">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496228" resolveInfo="width" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496257">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496258">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496228" resolveInfo="width" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496259">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496260">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496247" resolveInfo="aColumn" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496261">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetMinWidth()%cint" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499496262">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201837">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496078" resolveInfo="createTableSize" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496266">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496228" resolveInfo="width" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496267">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPreferredSize" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499496268" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496269">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496270">
        <property name="name" nameId="yvnu.1169194664001:0" value="c" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496271">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JComponent" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496272">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496273">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496274">
            <property name="name" nameId="yvnu.1169194664001:0" value="width" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.LongType" typeId="yvor.1068581242867:3" id="1560298786499496275" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496276">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496277">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496278">
            <property name="name" nameId="yvnu.1169194664001:0" value="enumeration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496279">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Enumeration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496280">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496281">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204624">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496285">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496286">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumns()%cjava%dutil%dEnumeration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="1560298786499496287">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496288">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496289">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496278" resolveInfo="enumeration" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496290">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dhasMoreElements()%cboolean" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496291">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496292">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496293">
                <property name="name" nameId="yvnu.1169194664001:0" value="aColumn" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496294">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496295">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496296">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496297">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496278" resolveInfo="enumeration" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496298">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dnextElement()%cjava%dlang%dObject" />
                    </node>
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496299">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496300">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496301">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496302">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496274" resolveInfo="width" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496303">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496304">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496274" resolveInfo="width" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496305">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496306">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496293" resolveInfo="aColumn" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496307">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetPreferredWidth()%cint" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499496308">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201537">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496078" resolveInfo="createTableSize" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496312">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496274" resolveInfo="width" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496313">
      <property name="name" nameId="yvnu.1169194664001:0" value="getMaximumSize" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499496314" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496315">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496316">
        <property name="name" nameId="yvnu.1169194664001:0" value="c" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496317">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JComponent" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496318">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496319">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496320">
            <property name="name" nameId="yvnu.1169194664001:0" value="width" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.LongType" typeId="yvor.1068581242867:3" id="1560298786499496321" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496322">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496323">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496324">
            <property name="name" nameId="yvnu.1169194664001:0" value="enumeration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496325">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Enumeration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496326">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496327">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204542">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496331">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496332">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumns()%cjava%dutil%dEnumeration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="1560298786499496333">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496334">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496335">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496324" resolveInfo="enumeration" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496336">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dhasMoreElements()%cboolean" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496337">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496338">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496339">
                <property name="name" nameId="yvnu.1169194664001:0" value="aColumn" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496340">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496341">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496342">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496343">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496324" resolveInfo="enumeration" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496344">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dnextElement()%cjava%dlang%dObject" />
                    </node>
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496345">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496346">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496347">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496348">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496320" resolveInfo="width" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496349">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496350">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496320" resolveInfo="width" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496351">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496352">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496339" resolveInfo="aColumn" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496353">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetMaxWidth()%cint" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499496354">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201758">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496078" resolveInfo="createTableSize" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496358">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496320" resolveInfo="width" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496359">
      <property name="name" nameId="yvnu.1169194664001:0" value="paint" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1560298786499496360" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499496361" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496362">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496363">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496364">
        <property name="name" nameId="yvnu.1169194664001:0" value="c" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496365">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JComponent" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496366">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496367">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496368">
            <property name="name" nameId="yvnu.1169194664001:0" value="oldClipBounds" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496369">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496370">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496371">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496362" resolveInfo="g" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496372">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dgetClipBounds()%cjava%dawt%dRectangle" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496373">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496374">
            <property name="name" nameId="yvnu.1169194664001:0" value="clipBounds" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496375">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496376">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499496377">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%d&lt;init&gt;(java%dawt%dRectangle)" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496378">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496368" resolveInfo="oldClipBounds" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496379">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496380">
            <property name="name" nameId="yvnu.1169194664001:0" value="tableWidth" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496381" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496382">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496383">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205091">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496387">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496388">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetTotalColumnWidth()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496389">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496390">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496391">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496392">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496393">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496374" resolveInfo="clipBounds" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1560298786499496394">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Math" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Math%dmin(int,int)%cint" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496395">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496396">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496397">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496374" resolveInfo="clipBounds" />
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496398">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496380" resolveInfo="tableWidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496399">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496400">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496401">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496362" resolveInfo="g" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496402">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetClip(java%dawt%dShape)%cvoid" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496403">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496374" resolveInfo="clipBounds" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496404">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201640">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496532" resolveInfo="paintGrid" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496408">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496362" resolveInfo="g" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496409">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496410">
            <property name="name" nameId="yvnu.1169194664001:0" value="firstIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496411" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496412">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205163">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496416">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%drowAtPoint(java%dawt%dPoint)%cint" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496417">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499496418">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Point%d&lt;init&gt;(int,int)" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496419">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496420">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496421">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496422">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496374" resolveInfo="clipBounds" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496423">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496424">
            <property name="name" nameId="yvnu.1169194664001:0" value="lastIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496425" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201734">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499497363" resolveInfo="lastVisibleRow" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496429">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496374" resolveInfo="clipBounds" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496430">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496431">
            <property name="name" nameId="yvnu.1169194664001:0" value="rowMargin" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496432" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496433">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204297">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496437">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowMargin()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496438">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496439">
            <property name="name" nameId="yvnu.1169194664001:0" value="rowRect" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496440">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496441">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499496442">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%d&lt;init&gt;(int,int,int,int)" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496443">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496444">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496445">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496380" resolveInfo="tableWidth" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496446">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496447">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496448">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496449">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204484">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496453">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496454">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496455">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496410" resolveInfo="firstIndex" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496456">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496431" resolveInfo="rowMargin" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496457">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496458">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496459">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496460">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496461">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496439" resolveInfo="rowRect" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496462">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496463">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496464">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496465">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496467" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496466">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496410" resolveInfo="firstIndex" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496467">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496468" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496469">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496470">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496471">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496467" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496472">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496473">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496474">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496475">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496476">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496477">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496439" resolveInfo="rowRect" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496478">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496479">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496480">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496481">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204503">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496485">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496486">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496487">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496467" resolveInfo="i" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496488">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496431" resolveInfo="rowMargin" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496489">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanOrEqualsExpression" typeId="yvor.1153422305557:3" id="1560298786499496490">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496491">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496493" resolveInfo="index" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496492">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496424" resolveInfo="lastIndex" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496493">
            <property name="name" nameId="yvnu.1169194664001:0" value="index" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496494" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496495">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496410" resolveInfo="firstIndex" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496496">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496497">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496493" resolveInfo="index" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496498">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496499">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496500">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496501">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496439" resolveInfo="rowRect" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496502">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dintersects(java%dawt%dRectangle)%cboolean" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496503">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496374" resolveInfo="clipBounds" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496504">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496505">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201824">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496828" resolveInfo="paintRow" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496509">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496362" resolveInfo="g" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496510">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496493" resolveInfo="index" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496511">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496512">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496513">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496514">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496515">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496439" resolveInfo="rowRect" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496516">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496517">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496518">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496519">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204472">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496523">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496524">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496525">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496493" resolveInfo="index" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496526">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496431" resolveInfo="rowMargin" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496527">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496528">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496529">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496362" resolveInfo="g" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496530">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetClip(java%dawt%dShape)%cvoid" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496531">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496368" resolveInfo="oldClipBounds" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496532">
      <property name="name" nameId="yvnu.1169194664001:0" value="paintGrid" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499496533" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499496534" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496535">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496536">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496537">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496538">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496539">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496540">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496535" resolveInfo="g" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496541">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetColor(java%dawt%dColor)%cvoid" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496542">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205073">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496546">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetGridColor()%cjava%dawt%dColor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496547">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496548">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204423">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496552">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetShowHorizontalLines()%cboolean" />
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496553">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496554">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201672">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496571" resolveInfo="paintHorizontalLines" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496558">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496535" resolveInfo="g" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496559">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496560">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204650">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496564">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetShowVerticalLines()%cboolean" />
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496565">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496566">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201546">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499496707" resolveInfo="paintVerticalLines" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496570">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496535" resolveInfo="g" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496571">
      <property name="name" nameId="yvnu.1169194664001:0" value="paintHorizontalLines" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499496572" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499496573" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496574">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496575">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496576">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496577">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496578">
            <property name="name" nameId="yvnu.1169194664001:0" value="r" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496579">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496580">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496581">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496574" resolveInfo="g" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496582">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dgetClipBounds()%cjava%dawt%dRectangle" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496583">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496584">
            <property name="name" nameId="yvnu.1169194664001:0" value="rect" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496585">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496586">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496578" resolveInfo="r" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496587">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496588">
            <property name="name" nameId="yvnu.1169194664001:0" value="firstIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496589" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496590">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204018">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496594">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%drowAtPoint(java%dawt%dPoint)%cint" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496595">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499496596">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Point%d&lt;init&gt;(int,int)" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496597">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496598">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496599">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496600">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496578" resolveInfo="r" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496601">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496602">
            <property name="name" nameId="yvnu.1169194664001:0" value="lastIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496603" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201761">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499497363" resolveInfo="lastVisibleRow" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496607">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496578" resolveInfo="r" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496608">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496609">
            <property name="name" nameId="yvnu.1169194664001:0" value="rowMargin" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496610" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496611">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204745">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496615">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowMargin()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496616">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496617">
            <property name="name" nameId="yvnu.1169194664001:0" value="y" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496618" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499496619">
              <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496620">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496609" resolveInfo="rowMargin" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496621">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496622">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496623">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496625" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496624">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496588" resolveInfo="firstIndex" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496625">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496626" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496627">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496628">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496629">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496625" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496630">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496631">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496632">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496633">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496617" resolveInfo="y" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496634">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496635">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496636">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496637">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204599">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496641">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496642">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496643">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496625" resolveInfo="i" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496644">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496609" resolveInfo="rowMargin" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496645">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanOrEqualsExpression" typeId="yvor.1153422305557:3" id="1560298786499496646">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496647">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496649" resolveInfo="index" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496648">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496602" resolveInfo="lastIndex" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496649">
            <property name="name" nameId="yvnu.1169194664001:0" value="index" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496650" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496651">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496588" resolveInfo="firstIndex" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496652">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496653">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496649" resolveInfo="index" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496654">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496655">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496656">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496657">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496617" resolveInfo="y" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496658">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496659">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496660">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496661">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204250">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496665">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496666">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496667">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496649" resolveInfo="index" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496668">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496609" resolveInfo="rowMargin" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496669">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499496670">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496671">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.GreaterThanOrEqualsExpression" typeId="yvor.1153417849900:3" id="1560298786499496672">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496673">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496617" resolveInfo="y" />
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496674">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496675">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496676">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496584" resolveInfo="rect" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496677">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.LessThanOrEqualsExpression" typeId="yvor.1153422305557:3" id="1560298786499496678">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496679">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496617" resolveInfo="y" />
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496680">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496681">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496682">
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496683">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                          </node>
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496684">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496584" resolveInfo="rect" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496685">
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496686">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                          </node>
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496687">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496584" resolveInfo="rect" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496688">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496689">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496690">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496691">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496574" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496692">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawLine(int,int,int,int)%cvoid" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496693">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496694">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496695">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496584" resolveInfo="rect" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496696">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496617" resolveInfo="y" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499496697">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496698">
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496699">
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496700">
                              <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                            </node>
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496701">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496584" resolveInfo="rect" />
                            </node>
                          </node>
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496702">
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496703">
                              <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                            </node>
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496704">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496584" resolveInfo="rect" />
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496705">
                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496706">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496617" resolveInfo="y" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496707">
      <property name="name" nameId="yvnu.1169194664001:0" value="paintVerticalLines" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499496708" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499496709" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496710">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496711">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496712">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496713">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496714">
            <property name="name" nameId="yvnu.1169194664001:0" value="rect" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496715">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496716">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496717">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496710" resolveInfo="g" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496718">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dgetClipBounds()%cjava%dawt%dRectangle" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496719">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496720">
            <property name="name" nameId="yvnu.1169194664001:0" value="x" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496721" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496722">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496723">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496724">
            <property name="name" nameId="yvnu.1169194664001:0" value="count" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496725" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496726">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204705">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496730">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnCount()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496731">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496732">
            <property name="name" nameId="yvnu.1169194664001:0" value="horizontalSpacing" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496733" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496734">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496735">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dwidth" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496736">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204294">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496740">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetIntercellSpacing()%cjava%dawt%dDimension" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496741">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanOrEqualsExpression" typeId="yvor.1153422305557:3" id="1560298786499496742">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496743">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496745" resolveInfo="index" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496744">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496724" resolveInfo="count" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496745">
            <property name="name" nameId="yvnu.1169194664001:0" value="index" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496746" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496747">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496748">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496749">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496745" resolveInfo="index" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496750">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496751">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499496752">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496753">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.GreaterThanExpression" typeId="yvor.1081506762703:3" id="1560298786499496754">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496755">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496720" resolveInfo="x" />
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496756">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496757">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499496758">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496759">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.GreaterThanOrEqualsExpression" typeId="yvor.1153417849900:3" id="1560298786499496760">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496761">
                          <node role="expression" roleId="yvor.1079359253376:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499496762">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496763">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496720" resolveInfo="x" />
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496764">
                              <property name="value" nameId="yvor.1068580320021:3" value="1" />
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496765">
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496766">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                          </node>
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496767">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496714" resolveInfo="rect" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496768">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.LessThanOrEqualsExpression" typeId="yvor.1153422305557:3" id="1560298786499496769">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496770">
                          <node role="expression" roleId="yvor.1079359253376:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499496771">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496772">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496720" resolveInfo="x" />
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496773">
                              <property name="value" nameId="yvor.1068580320021:3" value="1" />
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496774">
                          <node role="expression" roleId="yvor.1079359253376:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496775">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496776">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496777">
                                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                              </node>
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496778">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496714" resolveInfo="rect" />
                              </node>
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496779">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496780">
                                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                              </node>
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496781">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496714" resolveInfo="rect" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496782">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496783">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496784">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496785">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496710" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496786">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawLine(int,int,int,int)%cvoid" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499496787">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496788">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496720" resolveInfo="x" />
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496789">
                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496790">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496791">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496792">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496714" resolveInfo="rect" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499496793">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496794">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496720" resolveInfo="x" />
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496795">
                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499496796">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496797">
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496798">
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496799">
                              <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                            </node>
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496800">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496714" resolveInfo="rect" />
                            </node>
                          </node>
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496801">
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496802">
                              <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                            </node>
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496803">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496714" resolveInfo="rect" />
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496804">
                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496805">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496806">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496807">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496745" resolveInfo="index" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496808">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496724" resolveInfo="count" />
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496809">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496810">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496811">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496812">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496720" resolveInfo="x" />
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496813">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496814">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496815">
                          <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496816">
                            <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496817">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496818">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204832">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496822">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496823">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumn(int)%cjavax%dswing%dtable%dTableColumn" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496824">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496745" resolveInfo="index" />
                                </node>
                              </node>
                            </node>
                            <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496825">
                              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496826">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetWidth()%cint" />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496827">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496732" resolveInfo="horizontalSpacing" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499496828">
      <property name="name" nameId="yvnu.1169194664001:0" value="paintRow" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499496829" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499496830" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496831">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496832">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499496833">
        <property name="name" nameId="yvnu.1169194664001:0" value="row" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496834" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496835">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496836">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496837">
            <property name="name" nameId="yvnu.1169194664001:0" value="rect" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496838">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496839">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496840">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496841">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dgetClipBounds()%cjava%dawt%dRectangle" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496842">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496843">
            <property name="name" nameId="yvnu.1169194664001:0" value="column" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496844" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496845">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496846">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496847">
            <property name="name" nameId="yvnu.1169194664001:0" value="drawn" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1560298786499496848" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499496849" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496850">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496851">
            <property name="name" nameId="yvnu.1169194664001:0" value="draggedColumnIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496852" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499496853">
              <node role="expression" roleId="yvor.1239714902950:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496854">
                <property name="value" nameId="yvor.1068580320021:3" value="1" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496855">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496856">
            <property name="name" nameId="yvnu.1169194664001:0" value="draggedCellRect" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496857">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499496858" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496859">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496860">
            <property name="name" nameId="yvnu.1169194664001:0" value="spacing" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496861">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496862">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204642">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496866">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetIntercellSpacing()%cjava%dawt%dDimension" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496867">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496868">
            <property name="name" nameId="yvnu.1169194664001:0" value="header" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496869">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~JTableHeader" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496870">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204851">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496874">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetTableHeader()%cjavax%dswing%dtable%dJTableHeader" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496875">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496876">
            <property name="name" nameId="yvnu.1169194664001:0" value="cellRect" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496877">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499496878">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499496879">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%d&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496880">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496881">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496882">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496883">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496884">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496885">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496886">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496887">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496888">
                    <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204264">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496892">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                    </node>
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496893">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496894">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496833" resolveInfo="row" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496895">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496896">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dheight" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496897">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496860" resolveInfo="spacing" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496898">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496899">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496900">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496901">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496902">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496903">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1560298786499496904">
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1560298786499496905">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496906">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496908" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496907">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496833" resolveInfo="row" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496908">
            <property name="name" nameId="yvnu.1169194664001:0" value="i" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499496909" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499496910">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499496911">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496912">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496908" resolveInfo="i" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496913">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496914">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499496915">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496916">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496917">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496918">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496919">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496920">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496921">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496922">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204779">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496926">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1560298786499490568" resolveInfo="DiffRowTable" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496927">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499490808" resolveInfo="getRowHeight" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496928">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496908" resolveInfo="i" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496929">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496930">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dheight" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496931">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496860" resolveInfo="spacing" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496932">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496933">
            <property name="name" nameId="yvnu.1169194664001:0" value="enumeration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496934">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Enumeration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496935">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496936">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204201">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496940">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496941">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumns()%cjava%dutil%dEnumeration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="1560298786499496942">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496943">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496944">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496933" resolveInfo="enumeration" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496945">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dhasMoreElements()%cboolean" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496946">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499496947">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499496948">
                <property name="name" nameId="yvnu.1169194664001:0" value="aColumn" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496949">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1560298786499496950">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496951">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496952">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496933" resolveInfo="enumeration" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496953">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Enumeration%dnextElement()%cjava%dlang%dObject" />
                    </node>
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499496954">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableColumn" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496955">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496956">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496957">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496958">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496959">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499496960">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496961">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496962">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496948" resolveInfo="aColumn" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496963">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumn%dgetWidth()%cint" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496964">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499496965">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Dimension%dwidth" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496966">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496860" resolveInfo="spacing" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496967">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496968">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496969">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496970">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dintersects(java%dawt%dRectangle)%cboolean" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496971">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496837" resolveInfo="rect" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1560298786499496972">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496973">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496974">
                    <node role="condition" roleId="yvor.1068580123160:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496975">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496847" resolveInfo="drawn" />
                    </node>
                    <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496976">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.BreakStatement" typeId="yvor.1081855346303:3" id="1560298786499496977" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496978">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496979">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499496980">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496981">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496847" resolveInfo="drawn" />
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499496982">
                      <property name="value" nameId="yvor.1068580123138:3" value="true" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499496983">
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.OrExpression" typeId="yvor.1080223426719:3" id="1560298786499496984">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496985">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499496986">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496987">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496868" resolveInfo="header" />
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499496988" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1560298786499496989">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1560298786499496990">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496991">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496948" resolveInfo="aColumn" />
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496992">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499496993">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496868" resolveInfo="header" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499496994">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~JTableHeader%dgetDraggedColumn()%cjavax%dswing%dtable%dTableColumn" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1560298786499496995">
                    <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499496996">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499496997">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499496998">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499496999">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497000">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetColor(java%dawt%dColor)%cvoid" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497001">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497002">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204411">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497006">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetParent()%cjava%dawt%dContainer" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497007">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetBackground()%cjava%dawt%dColor" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497008">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497009">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497010">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497011">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dfillRect(int,int,int,int)%cvoid" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497012">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497013">
                                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                              </node>
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497014">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                              </node>
                            </node>
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497015">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497016">
                                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                              </node>
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497017">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                              </node>
                            </node>
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497018">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497019">
                                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                              </node>
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497020">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                              </node>
                            </node>
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497021">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497022">
                                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                              </node>
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497023">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497024">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499497025">
                          <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497026">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                          </node>
                          <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499497027">
                            <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499497028">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%d&lt;init&gt;(java%dawt%dRectangle)" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497029">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497030">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499497031">
                          <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497032">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496851" resolveInfo="draggedColumnIndex" />
                          </node>
                          <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497033">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496843" resolveInfo="column" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497034">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497035">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201752">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499497176" resolveInfo="paintCell" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497039">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497040">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497041">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496833" resolveInfo="row" />
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497042">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496843" resolveInfo="column" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497043">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499497044">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497045">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497046">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497047">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497048">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497049">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497050">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496876" resolveInfo="cellRect" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497051">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1560298786499497052">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497053">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496843" resolveInfo="column" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499497054">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499497055">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1560298786499497056">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497057">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496851" resolveInfo="draggedColumnIndex" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499497058">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497059">
                  <property name="value" nameId="yvor.1068580320021:3" value="1" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1560298786499497060">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497061">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499497062" />
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497063">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497064">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1560298786499497065">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497066">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497067">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497068">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                  </node>
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497069">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497070">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496868" resolveInfo="header" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497071">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~JTableHeader%dgetDraggedDistance()%cint" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497072">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497073">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497074">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497075">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetColor(java%dawt%dColor)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497076">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204605">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497080">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetBackground()%cjava%dawt%dColor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497081">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497082">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497083">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497084">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dfillRect(int,int,int,int)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497085">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497086">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497087">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497088">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497089">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497090">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497091">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497092">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497093">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497094">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497095">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497096">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497097">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497098">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497099">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497100">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetColor(java%dawt%dColor)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497101">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204646">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497105">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetGridColor()%cjava%dawt%dColor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497106">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497107">
                <property name="name" nameId="yvnu.1169194664001:0" value="x1" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497108" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497109">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497110">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497111">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497112">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497113">
                <property name="name" nameId="yvnu.1169194664001:0" value="y1" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497114" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497115">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497116">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497117">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497118">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497119">
                <property name="name" nameId="yvnu.1169194664001:0" value="x2" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497120" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497121">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497122">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497123">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497107" resolveInfo="x1" />
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497124">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497125">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497126">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497127">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497128">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497129">
                <property name="name" nameId="yvnu.1169194664001:0" value="y2" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497130" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497131">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497132">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497133">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497113" resolveInfo="y1" />
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497134">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497135">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497136">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497137">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499497138">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497139">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204288">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497143">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetShowVerticalLines()%cboolean" />
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497144">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497145">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497146">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497147">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497148">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawLine(int,int,int,int)%cvoid" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497149">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497119" resolveInfo="x2" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497150">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497113" resolveInfo="y1" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497151">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497119" resolveInfo="x2" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497152">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497129" resolveInfo="y2" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499497153">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497154">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205165">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497158">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetShowHorizontalLines()%cboolean" />
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497159">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497160">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497161">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497162">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497163">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawLine(int,int,int,int)%cvoid" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497164">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497107" resolveInfo="x1" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497165">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497129" resolveInfo="y2" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497166">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497119" resolveInfo="x2" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497167">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497129" resolveInfo="y2" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497168">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1200564340082201633">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1560298786499497176" resolveInfo="paintCell" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497172">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496831" resolveInfo="g" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497173">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496856" resolveInfo="draggedCellRect" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497174">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496833" resolveInfo="row" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497175">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499496851" resolveInfo="draggedColumnIndex" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499497176">
      <property name="name" nameId="yvnu.1169194664001:0" value="paintCell" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499497177" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1560298786499497178" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499497179">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499497180">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499497181">
        <property name="name" nameId="yvnu.1169194664001:0" value="cellRect" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499497182">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499497183">
        <property name="name" nameId="yvnu.1169194664001:0" value="row" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497184" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499497185">
        <property name="name" nameId="yvnu.1169194664001:0" value="column" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497186" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497187">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497188">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497189">
            <property name="name" nameId="yvnu.1169194664001:0" value="spacingHeight" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497190" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497191">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204762">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497195">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowMargin()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497196">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497197">
            <property name="name" nameId="yvnu.1169194664001:0" value="spacingWidth" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497198" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497199">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497200">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205052">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497204">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetColumnModel()%cjavax%dswing%dtable%dTableColumnModel" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497205">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6l7b.~TableColumnModel%dgetColumnMargin()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497206">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497207">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497208">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497209">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dsetBounds(int,int,int,int)%cvoid" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497210">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497211">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497212">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497213">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1560298786499497214">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497215">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497197" resolveInfo="spacingWidth" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497216">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497217">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497218">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497219">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497220">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1560298786499497221">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497222">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497189" resolveInfo="spacingHeight" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497223">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497224">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497225">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497226">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497227">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497228">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497197" resolveInfo="spacingWidth" />
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497229">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497230">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497231">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497232">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497233">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497189" resolveInfo="spacingHeight" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499497234">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499497235">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1560298786499497236">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497237">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204230">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497241">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%disEditing()%cboolean" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499497242">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497243">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204395">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497247">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetEditingRow()%cint" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497248">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497183" resolveInfo="row" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499497249">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497250">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204394">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497254">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetEditingColumn()%cint" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497255">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497185" resolveInfo="column" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1560298786499497256">
            <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497257">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497258">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497259">
                  <property name="name" nameId="yvnu.1169194664001:0" value="renderer" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499497260">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6l7b.~TableCellRenderer" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497261">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204064">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497265">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetCellRenderer(int,int)%cjavax%dswing%dtable%dTableCellRenderer" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497266">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497183" resolveInfo="row" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497267">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497185" resolveInfo="column" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497268">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497269">
                  <property name="name" nameId="yvnu.1169194664001:0" value="component" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499497270">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Component" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497271">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204078">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497275">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dprepareRenderer(javax%dswing%dtable%dTableCellRenderer,int,int)%cjava%dawt%dComponent" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497276">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497259" resolveInfo="renderer" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497277">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497183" resolveInfo="row" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497278">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497185" resolveInfo="column" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499497279">
                <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499497280">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497281">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497282">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497269" resolveInfo="component" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497283">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetParent()%cjava%dawt%dContainer" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1560298786499497284" />
                </node>
                <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497285">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497286">
                    <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497287">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204930">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%drendererPane" resolveInfo="rendererPane" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497291">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497292">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497269" resolveInfo="component" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497293">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497294">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204958">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%drendererPane" resolveInfo="rendererPane" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497298">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~CellRendererPane%dpaintComponent(java%dawt%dGraphics,java%dawt%dComponent,java%dawt%dContainer,int,int,int,int,boolean)%cvoid" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497299">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497179" resolveInfo="g" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497300">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497269" resolveInfo="component" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205123">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497304">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497305">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497306">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497307">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497308">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497309">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497310">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497311">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497312">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497313">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497314">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497315">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1560298786499497316">
                      <property name="value" nameId="yvor.1068580123138:3" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497317">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497318">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497319">
                <property name="name" nameId="yvnu.1169194664001:0" value="component" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499497320">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Component" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497321">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148205010">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497325">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetEditorComponent()%cjava%dawt%dComponent" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497326">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497327">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497328">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497319" resolveInfo="component" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497329">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dsetBounds(java%dawt%dRectangle)%cvoid" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497330">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497331">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497332">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497333">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497319" resolveInfo="component" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497334">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dvalidate()%cvoid" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497335">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497336">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497337">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497338">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Rectangle%dsetBounds(int,int,int,int)%cvoid" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497339">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497340">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497341">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dx" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497342">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1560298786499497343">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497344">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497197" resolveInfo="spacingWidth" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497345">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497346">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497347">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497348">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497349">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1560298786499497350">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497351">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497189" resolveInfo="spacingHeight" />
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497352">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497353">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497354">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497355">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dwidth" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497356">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497357">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497197" resolveInfo="spacingWidth" />
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497358">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497359">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497360">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497361">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497181" resolveInfo="cellRect" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497362">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497189" resolveInfo="spacingHeight" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1560298786499497363">
      <property name="name" nameId="yvnu.1169194664001:0" value="lastVisibleRow" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1560298786499497364" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497365" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1560298786499497366">
        <property name="name" nameId="yvnu.1169194664001:0" value="clip" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1560298786499497367">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Rectangle" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497368">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1560298786499497369">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1560298786499497370">
            <property name="name" nameId="yvnu.1169194664001:0" value="lastIndex" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1560298786499497371" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497372">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204150">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497376">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%drowAtPoint(java%dawt%dPoint)%cint" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1560298786499497377">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1560298786499497378">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Point%d&lt;init&gt;(int,int)" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497379">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497380">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1560298786499497381">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497382">
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497383">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dy" />
                          </node>
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497384">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497366" resolveInfo="clip" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497385">
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1560298786499497386">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~Rectangle%dheight" />
                          </node>
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1560298786499497387">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497366" resolveInfo="clip" />
                          </node>
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497388">
                        <property name="value" nameId="yvor.1068580320021:3" value="1" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1560298786499497389">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1560298786499497390">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497391">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497370" resolveInfo="lastIndex" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.UnaryMinus" typeId="yvor.8064396509828172209:3" id="1560298786499497392">
              <node role="expression" roleId="yvor.1239714902950:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497393">
                <property name="value" nameId="yvor.1068580320021:3" value="1" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1560298786499497394">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1560298786499497395">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1560298786499497396">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497397">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497370" resolveInfo="lastIndex" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1560298786499497398">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1560298786499497399">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8692480643148204727">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="nmow.~BasicTableUI%dtable" resolveInfo="table" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1560298786499497403">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTable%dgetRowCount()%cint" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1560298786499497404">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1560298786499497405">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1560298786499497406">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1560298786499497370" resolveInfo="lastIndex" />
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

