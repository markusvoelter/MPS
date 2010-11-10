<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:b90ae0cf-6b91-458a-92d0-e5bf2ada7de4(jetbrains.mps.make.script.typesystem)">
  <persistence version="5" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="95f8a3e6-f994-4ca0-a65e-763c9bae2d3b(jetbrains.mps.make.script)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" />
  <languageAspect modelUID="r:b90ae0cf-6b91-458a-92d0-e5bf2ada7de4(jetbrains.mps.make.script.typesystem)" version="-1" />
  <devkit namespace="e073aac8-8c71-4c23-be71-86bf7a6df0a2(jetbrains.mps.devkit.bootstrap-languages)" />
  <maxImportIndex value="2" />
  <import index="1" modelUID="r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)" version="-1" />
  <import index="2" modelUID="r:4ea5a78b-cb8a-4831-b227-f7860a22491d(jetbrains.mps.make.resources)" version="-1" />
  <node type="jetbrains.mps.lang.typesystem.structure.ComparisonRule:3" id="2360002718792535571">
    <property name="name:3" value="ResourceType_comparableWith_IResource" />
    <property name="isWeak:3" value="true" />
    <property name="virtualPackage:3" value="job" />
    <node role="anotherNode:3" type="jetbrains.mps.lang.typesystem.structure.PatternCondition:3" id="2360002718792535575">
      <property name="name:3" value="res" />
      <node role="pattern:3" type="jetbrains.mps.lang.pattern.structure.PatternExpression:0" id="2360002718792535576">
        <node role="patternNode:0" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2360002718792536832">
          <link role="classifier:3" targetNodeId="2.6168415856807657256" resolveInfo="IResource" />
        </node>
      </node>
    </node>
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2360002718792535573">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="2360002718792583534">
        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="2360002718792583536">
          <property name="value:3" value="true" />
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="2360002718792535574">
      <property name="name:3" value="rt" />
      <link role="concept:3" targetNodeId="1.2360002718792446594" resolveInfo="ResourceType" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.SubtypingRule:3" id="2360002718792583537">
    <property name="name:3" value="ResourceType_subtypeOf_IResource" />
    <property name="isWeak:3" value="true" />
    <property name="virtualPackage:3" value="job" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2360002718792583538">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="2360002718792583542">
        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="2360002718792583544">
          <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit:7" id="2360002718792614833">
            <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2360002718792614836" />
            <node role="initValue:7" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="2360002718792614838">
              <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2360002718792614841">
                <link role="classifier:3" targetNodeId="2.6168415856807657256" resolveInfo="IResource" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="2360002718792583539">
      <property name="name:3" value="rt" />
      <link role="concept:3" targetNodeId="1.2360002718792446594" resolveInfo="ResourceType" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="2360002718792622204">
    <property name="name:3" value="typeof_OutputResources" />
    <property name="virtualPackage:3" value="job" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2360002718792622205">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="2360002718792622216">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="2360002718792622217" />
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="2360002718792622220">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="2360002718792622208">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2360002718792622211">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="2360002718792622210">
                <link role="applicableNode:3" targetNodeId="2360002718792622206" resolveInfo="or" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="2360002718792622215">
                <link role="link:16" targetNodeId="1.2360002718792622193" />
              </node>
            </node>
          </node>
        </node>
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="2360002718792622221">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="2360002718792622222">
            <node role="quotedNode:0" type="jetbrains.mps.lang.typesystem.structure.JoinType:3" id="2360002718792622224">
              <node role="argument:3" type="jetbrains.mps.make.script.structure.ResourceType" id="2360002718792622226" />
              <node role="argument:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="2360002718792622228">
                <node role="elementType:7" type="jetbrains.mps.make.script.structure.ResourceType" id="2360002718792622231" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="2360002718792622206">
      <property name="name:3" value="or" />
      <link role="concept:3" targetNodeId="1.2360002718792622184" resolveInfo="OutputResources" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="505095865854557931">
    <property name="name:3" value="typeof_OptionExpression" />
    <property name="virtualPackage:3" value="query" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="505095865854557932">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="505095865854557938">
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="505095865854557943">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="505095865854557944">
            <node role="quotedNode:0" type="jetbrains.mps.make.script.structure.OptionType" id="505095865854557946">
              <node role="referenceAntiquotation$link_attribute$expectedOption" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="505095865854557947">
                <node role="expression:0" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression:16" id="505095865854557960">
                  <link role="concept:16" targetNodeId="1.505095865854384059" resolveInfo="ExpectedOption" />
                  <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="505095865854557955">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="505095865854557950">
                      <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="505095865854557949">
                        <link role="applicableNode:3" targetNodeId="505095865854557933" resolveInfo="oe" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="505095865854557954">
                        <link role="link:16" targetNodeId="1.505095865854384051" />
                      </node>
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="505095865854557959" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="505095865854557941">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="505095865854557935">
            <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="505095865854557937">
              <link role="applicableNode:3" targetNodeId="505095865854557933" resolveInfo="oe" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="505095865854557933">
      <property name="name:3" value="oe" />
      <link role="concept:3" targetNodeId="1.505095865854384050" resolveInfo="OptionExpression" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1977954644795311537">
    <property name="name:3" value="typeof_RelayQueryExpression" />
    <property name="virtualPackage:3" value="query" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1977954644795311538">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1977954644795311540">
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1977954644795311541">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1977954644795311542">
            <node role="quotedNode:0" type="jetbrains.mps.make.script.structure.OptionType" id="1977954644795311543">
              <node role="referenceAntiquotation$link_attribute$expectedOption" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="1977954644795311544">
                <node role="expression:0" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression:16" id="1977954644795311545">
                  <property name="asCast:16" value="true" />
                  <link role="concept:16" targetNodeId="1.505095865854384059" resolveInfo="ExpectedOption" />
                  <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1977954644795311546">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1977954644795311547">
                      <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1977954644795311548">
                        <link role="applicableNode:3" targetNodeId="1977954644795311539" resolveInfo="rqo" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1977954644795311554">
                        <link role="link:16" targetNodeId="1.1977954644795311522" />
                      </node>
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1977954644795311550">
                      <link role="link:16" targetNodeId="1.505095865854384068" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1977954644795311551">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1977954644795311552">
            <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1977954644795311553">
              <link role="applicableNode:3" targetNodeId="1977954644795311539" resolveInfo="rqo" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1977954644795311539">
      <property name="name:3" value="rqe" />
      <link role="concept:3" targetNodeId="1.1977954644795311519" resolveInfo="RelayQueryExpression" />
    </node>
  </node>
</model>

