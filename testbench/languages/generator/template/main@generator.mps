<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:254a17e7-db47-47cc-b375-32516d9c95d0(jetbrains.mps.testbench.suite.generator.template.main@generator)">
  <persistence version="7" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.lang.generator.generationContext)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="pop3" modelUID="r:c8b27be8-26f9-4593-9ae5-f70dd005d131(jetbrains.mps.testbench.suite.structure)" version="-1" />
  <import index="7dx1" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.junit.runner(MPS.Classpath/org.junit.runner@java_stub)" version="-1" />
  <import index="3y6k" modelUID="f:java_stub#920eaa0e-ecca-46bc-bee7-4e5c59213dd6#jetbrains.mps.testbench.junit.runners(Testbench/jetbrains.mps.testbench.junit.runners@java_stub)" version="-1" />
  <import index="30pf" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.util(MPS.Classpath/jetbrains.mps.util@java_stub)" version="-1" />
  <import index="5rc7" modelUID="r:2f48a1e0-29c6-465b-b158-4cba88c0e4a6(jetbrains.mps.testbench.suite.behavior)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpf8" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <roots>
    <node type="tpf8.MappingConfiguration" typeId="tpf8.1095416546421" id="8749850441865775971">
      <property name="name" nameId="tpck.1169194664001" value="main" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="8749850441865775976">
      <property name="name" nameId="tpck.1169194664001" value="TestModule" />
    </node>
  </roots>
  <root id="8749850441865775971">
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="2956932267233340229">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="pop3.4504141816188599477" resolveInfo="ModuleSuite" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="8749850441865775976" resolveInfo="TestModule" />
    </node>
  </root>
  <root id="8749850441865775976">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8749850441865775977" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="8749850441865775978">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="8749850441865775979" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8749850441865775980" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8749850441865775981" />
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="8749850441865775982">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="pop3.4504141816188599477" resolveInfo="ModuleSuite" />
    </node>
    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2956932267233317911">
      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="3y6k.~SymbolicSuite$SuiteClassSymbols" resolveInfo="SuiteClassSymbols" />
      <node role="value" roleId="tpee.1188214630783" type="tpee.AnnotationInstanceValue" typeId="tpee.1188214545140" id="2956932267233365607">
        <link role="key" roleId="tpee.1188214555875" targetNodeId="3y6k.~SymbolicSuite$SuiteClassSymbols%dvalue()" resolveInfo="value" />
        <node role="value" roleId="tpee.1188214607812" type="tpee.ArrayLiteral" typeId="tpee.1188220165133" id="2956932267233365611">
          <node role="item" roleId="tpee.1188220173759" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2956932267233365613">
            <property name="value" nameId="tpee.1070475926801" value="" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="2956932267233365614">
              <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="2956932267233365615">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="2956932267233365616">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2956932267233365617">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2956932267233365618">
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="2956932267233365619">
                        <link role="link" roleId="tp25.1138056546658" targetNodeId="pop3.4504141816188599486" />
                      </node>
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="2956932267233365620" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="2956932267233365621">
              <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
              <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="2956932267233365622">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="2956932267233365623">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2956932267233365624">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2956932267233365625">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="2956932267233365626" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="2956932267233365627">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5rc7.2956932267233324537" resolveInfo="fqClassName" />
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
    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2956932267233313529">
      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="7dx1.~RunWith" resolveInfo="RunWith" />
      <node role="value" roleId="tpee.1188214630783" type="tpee.ImplicitAnnotationInstanceValue" typeId="tpee.2580416627845338977" id="2956932267233317647">
        <link role="key" roleId="tpee.1188214555875" targetNodeId="7dx1.~RunWith%dvalue()" resolveInfo="value" />
        <node role="value" roleId="tpee.1188214607812" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="2956932267233317910">
          <link role="classifier" roleId="tpee.1116615189566" targetNodeId="3y6k.~WatchingSuite" resolveInfo="WatchingSuite" />
        </node>
      </node>
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="2956932267233340149">
      <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
      <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="2956932267233340150">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="2956932267233340151">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2956932267233340153">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="2956932267233340159">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="2956932267233340163">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="30pf.~NameUtil%dtoValidIdentifier(java%dlang%dString)%cjava%dlang%dString" resolveInfo="toValidIdentifier" />
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="30pf.~NameUtil" resolveInfo="NameUtil" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2956932267233340165">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="2956932267233340164" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="2956932267233340169">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="2956932267233340155">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpf8.TemplateFunctionParameter_templatePropertyValue" typeId="tpf8.1167756221419" id="2956932267233340154" />
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2956932267233340158">
                  <property name="value" nameId="tpee.1070475926801" value="_" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

