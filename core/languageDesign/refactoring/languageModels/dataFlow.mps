<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024148(jetbrains.mps.logging.refactoring.dataFlow)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.dataFlow" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <languageAspect modelUID="r:1222075024247(jetbrains.mps.bootstrap.dataFlow.constraints)" version="4" />
  <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024219(jetbrains.mps.bootstrap.findUsagesLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024024(jetbrains.mps.bootstrap.editorLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024216(jetbrains.mps.bootstrap.findUsagesLanguage.constraints)" version="4" />
  <languageAspect modelUID="r:1222075024147(jetbrains.mps.logging.refactoring.constraints)" version="4" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024356(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024030(jetbrains.mps.bootstrap.editorLanguage.structure)" version="26" />
  <languageAspect modelUID="r:1222075024091(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="r:1222075024153(jetbrains.mps.logging.refactoring.structure)" version="-1" />
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1210945623184">
    <link role="conceptDeclaration" targetNodeId="1.1204722970897" resolveInfo="DeleteFeatureOperation" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1210945623185">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210945623186">
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1210945727112">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210945730349">
            <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1210945729301" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1210945735743">
              <link role="link" targetNodeId="1.1204722988476" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1210946712795">
    <link role="conceptDeclaration" targetNodeId="1.1199619425400" resolveInfo="AbstractMoveExpression" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1210946712796">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210946712797">
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1210946714720">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210946723304">
            <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1210946722428" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1210946723760">
              <link role="link" targetNodeId="1.1199619459778" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1210946718114">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210946727622">
            <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1210946726871" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1210946729265">
              <link role="link" targetNodeId="1.1199619459779" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

