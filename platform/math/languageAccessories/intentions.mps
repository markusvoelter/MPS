<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:57529505-426f-4f87-bbc0-2843f12bd318(jetbrains.mps.baseLanguage.math.intentions)">
  <persistence version="7" />
  <language namespace="d7a92d38-f7db-40d0-8431-763b0c3c9f20(jetbrains.mps.lang.intentions)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="3304fc6e-7c6b-401e-a016-b944934bb21f(jetbrains.mps.baseLanguage.math)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="3a13115c-633c-4c5c-bbcc-75c4219e9555(jetbrains.mps.lang.quotation)" />
  <import index="lnrs" modelUID="r:cb1a36c8-1ffb-415a-aba8-afb9dc042d1b(jetbrains.mps.baseLanguage.math.structure)" version="-1" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="vjvt" modelUID="r:feb4a112-d0b1-417f-b9b7-9058aab93ce6(jetbrains.mps.baseLanguage.math.behavior)" version="-1" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvjb" modelUID="r:00000000-0000-4000-0000-011c89590353(jetbrains.mps.lang.intentions.structure)" version="8" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yvjf" modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" implicit="yes" />
  <roots>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1237104496404">
      <property name="name" nameId="yvnu.1169194664001:0" value="DivExpressionFractionToDiv" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operations.arithmetic" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="lnrs.1237100849157" resolveInfo="DivOperationFraction" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1237104500799">
      <property name="name" nameId="yvnu.1169194664001:0" value="DivExpressionDivToFraction" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operations.arithmetic" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvor.1095950406618:3" resolveInfo="DivExpression" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1238402928175">
      <property name="name" nameId="yvnu.1169194664001:0" value="SpecifyMathContext" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1238942880468">
      <property name="name" nameId="yvnu.1169194664001:0" value="DeleteMathContext" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="lnrs.1238402702427" resolveInfo="BinaryOperationMathContext" />
    </node>
  </roots>
  <root id="1237104496404">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1237104496405">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237104496406">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237104536961">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237104536962">
            <property name="value" nameId="yvor.1070475926801:3" value="Use java notation for division operation" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1237104496407">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237104496408">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237104573699">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237104573795">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1237104573700" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1237104577512">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1237104580217">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1237104584157">
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.Expression" typeId="yvor.1068431790191:3" id="1237104584158">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1237104586615">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237104594390">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1237104594311" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237104596253">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="lnrs.1237102926618" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.Expression" typeId="yvor.1068431790191:3" id="1237104584159">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1237104585535">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237104590165">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1237104590055" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237104591888">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="lnrs.1237102925695" />
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
  </root>
  <root id="1237104500799">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1237104500800">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237104500801">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237104548275">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237104548276">
            <property name="value" nameId="yvor.1070475926801:3" value="Use fraction notation for division operation" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1237104500802">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237104500803">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237104473680">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237104473854">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1237104473681" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1237104476587">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1237104520251">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="lnrs.DivExpressionFraction" typeId="lnrs.1237100849157" id="1237104708152">
                  <node role="numerator" roleId="lnrs.1237102925695" type="yvor.Expression" typeId="yvor.1068431790191:3" id="1237104708153">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1237104729015">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237104734301">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1237104733894" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237104736283">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1081773367580:3" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="denominator" roleId="lnrs.1237102926618" type="yvor.Expression" typeId="yvor.1068431790191:3" id="1237104708154">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1237104729704">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237104738145">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1237104738050" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237104740539">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1081773367579:3" />
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
  </root>
  <root id="1238402928175">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1238402928176">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238402928177">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1238402935919">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1238402955733">
            <property name="value" nameId="yvor.1070475926801:3" value="Explicitly specify math context for operation with big decimals" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1238402928178">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238402928179">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1238939673072">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1238939673277">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238939673073" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1238939684204">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1238942970980">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vjvt.1238942053978" resolveInfo="convert2" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vjvt.1238406290274" resolveInfo="MathUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1238942970981">
                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1081773326031:3" resolveInfo="BinaryOperation" />
                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238942970982" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" roleId="yvjb.2522969319638093995:8" type="yvjb.IsApplicableBlock" typeId="yvjb.1192795771125:8" id="1238402953459">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238402953460">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1238406535875">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1238406536737">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vjvt.1238406301498" resolveInfo="applicable" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vjvt.1238406290274" resolveInfo="MathUtil" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238406539003" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1238942880468">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1238942880469">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238942880470">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1238942930189">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1238942930190">
            <property name="value" nameId="yvor.1070475926801:3" value="Use default math context" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1238942880471">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238942880472">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1238942949580">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1238942949785">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238942949581" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1238942951820">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1238942956089">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vjvt.1238942002669" resolveInfo="convert1" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vjvt.1238406290274" resolveInfo="MathUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238942957699" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

