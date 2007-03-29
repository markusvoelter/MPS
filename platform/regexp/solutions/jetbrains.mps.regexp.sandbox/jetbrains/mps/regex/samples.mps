<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.regex.samples">
  <language namespace="jetbrains.mps.regexp" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="java.util@java_stub" />
  <import index="2" modelUID="java.lang@java_stub" />
  <import index="3" modelUID="jetbrains.mps.regexp.jetbrains.mps.regexp.accessory" />
  <import index="4" modelUID="java.io@java_stub" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174939589143">
    <property name="name" value="SimpleMatch" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174939592769">
      <property name="name" value="simplestRegexp" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174939592770" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939611066">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174939624913">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174939624914">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174939624915">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939626714" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174939630531">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939630532" />
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939633707">
            <link role="variableDeclaration" targetNodeId="1174939624914" resolveInfo="s" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174939637318">
            <node role="regexp" type="jetbrains.mps.regexp.OrRegexp" id="1174939644102">
              <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939642617">
                <property name="text" value="a" />
              </node>
              <node role="right" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939644105">
                <property name="text" value="b" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174939655340">
      <property name="name" value="matchingGroup" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174939655341" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939655342">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174939670515">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174939670516">
            <property name="name" value="email" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174939670517">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939672457" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174939675302">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939675303">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174939719345">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174939726022">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174939719346">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174939734570">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174939735460">
                    <link role="match" targetNodeId="1174939699130" resolveInfo="user" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939732210">
                    <property name="value" value="user = " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174939738509">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174939742247">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174939738510">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174939754015">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174939755127">
                    <link role="match" targetNodeId="1174939708418" resolveInfo="domain" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939748842">
                    <property name="value" value="domain = " />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939676978">
            <link role="variableDeclaration" targetNodeId="1174939670516" resolveInfo="email" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174939679354">
            <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174939693753">
              <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174939699130">
                <property name="name" value="user" />
                <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174939704633">
                  <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174939703179">
                    <link role="symbolClass" targetNodeId="3.1174554738336" />
                  </node>
                </node>
              </node>
              <node role="right" type="jetbrains.mps.regexp.SeqRegexp" id="1174939708417">
                <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939693754">
                  <property name="text" value="@" />
                </node>
                <node role="right" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174939708418">
                  <property name="name" value="domain" />
                  <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174939713734">
                    <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174939711795">
                      <link role="symbolClass" targetNodeId="3.1174554738336" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174939761738">
      <property name="name" value="memory" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174939761739" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939761740">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174939766147">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174939766148">
            <property name="name" value="rep" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174939766149">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939769323">
              <property name="value" value="quaqua" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174939778203">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939778204" />
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939780269">
            <link role="variableDeclaration" targetNodeId="1174939766148" resolveInfo="rep" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174939782302">
            <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174939797965">
              <node role="right" type="jetbrains.mps.regexp.MatchVariableReferenceRegexp" id="1174939797966">
                <link role="match" targetNodeId="1174939785679" resolveInfo="first" />
              </node>
              <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174939785679">
                <property name="name" value="first" />
                <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174939791463">
                  <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174939789852">
                    <link role="symbolClass" targetNodeId="3.1174554738336" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174939813279">
    <property name="name" value="SimpleReplace" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174939818421">
      <property name="name" value="simplestReplace" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174939818422" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939818423">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174939822893">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174939822894">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174939822895">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174939824537">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1174939825180">
            <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939824538">
              <link role="variableDeclaration" targetNodeId="1174939822894" resolveInfo="s" />
            </node>
            <node role="rValue" type="jetbrains.mps.regexp.ReplaceWithRegexpExpression" id="1174939833885">
              <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939844738">
                <link role="variableDeclaration" targetNodeId="1174939822894" resolveInfo="s" />
              </node>
              <node role="replaceBlock" type="jetbrains.mps.regexp.ReplaceBlock" id="1174939833887">
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939833888">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174939845676">
                    <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939846678">
                      <property name="value" value="zzz" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174939838797">
                <node role="regexp" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939841377">
                  <property name="text" value="abc" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174939848617">
      <property name="name" value="replaceWithCapture" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174939848618" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939848619">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174939854682">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174939854683">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174939854684">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174939857046">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1174939857313">
            <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939857047">
              <link role="variableDeclaration" targetNodeId="1174939854683" resolveInfo="s" />
            </node>
            <node role="rValue" type="jetbrains.mps.regexp.ReplaceWithRegexpExpression" id="1174939860205">
              <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939888080">
                <link role="variableDeclaration" targetNodeId="1174939854683" resolveInfo="s" />
              </node>
              <node role="replaceBlock" type="jetbrains.mps.regexp.ReplaceBlock" id="1174939860207">
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939860208">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174939889769">
                    <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174939892116">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174939894104">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939895154">
                          <property name="value" value="&gt;" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174939893087">
                          <link role="match" targetNodeId="1174939872511" resolveInfo="content" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939890615">
                        <property name="value" value="&lt;" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174939865288">
                <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174939872510">
                  <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939869196">
                    <property name="text" value="(" />
                  </node>
                  <node role="right" type="jetbrains.mps.regexp.SeqRegexp" id="1174939885344">
                    <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174939872511">
                      <property name="name" value="content" />
                      <node role="regexp" type="jetbrains.mps.regexp.LazyStarRegexp" id="1174939881967">
                        <node role="regexp" type="jetbrains.mps.regexp.DotRegexp" id="1174939879278" />
                      </node>
                    </node>
                    <node role="right" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939885345">
                      <property name="text" value=")" />
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
  <node type="jetbrains.mps.regexp.Regexps" id="1174939905327">
    <property name="name" value="Regexps" />
    <node role="regexp" type="jetbrains.mps.regexp.RegexpDeclaration" id="1174939907890">
      <property name="description" value="email pattern" />
      <property name="name" value="email" />
      <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174939932335">
        <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174939914064">
          <property name="name" value="user" />
          <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174939930286">
            <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174939926394">
              <link role="symbolClass" targetNodeId="3.1174554738336" />
            </node>
          </node>
        </node>
        <node role="right" type="jetbrains.mps.regexp.SeqRegexp" id="1174939935087">
          <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174939932336">
            <property name="text" value="@" />
          </node>
          <node role="right" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174939935088">
            <property name="name" value="domain" />
            <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174939939200">
              <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174939937840">
                <link role="symbolClass" targetNodeId="3.1174554738336" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp" type="jetbrains.mps.regexp.RegexpDeclaration" id="1175161573569">
      <property name="description" value="prefix" />
      <property name="name" value="prefix" />
      <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1175161596253">
        <node role="left" type="jetbrains.mps.regexp.LineStartRegexp" id="1175161593067" />
        <node role="right" type="jetbrains.mps.regexp.LineEndRegexp" id="1175161596254" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174939949624">
    <property name="name" value="PredefinedRegexps" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174939957359">
      <property name="name" value="matchWithPredefined" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174939957360" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939957361">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174939967445">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174939967446">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174939967447">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174939964472">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174939964473">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174939977031">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174939982253">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174939977032">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174939988412">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174939990727">
                    <link role="match" targetNodeId="1174939914064" resolveInfo="user" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174939983629">
                    <property name="value" value="user = " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174939996604">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174940001264">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174939996605">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174940007738">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174940009382">
                    <link role="match" targetNodeId="1174939935088" resolveInfo="domain" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174940002187">
                    <property name="value" value="domain = " />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174939968620">
            <link role="variableDeclaration" targetNodeId="1174939967446" resolveInfo="s" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174939971324">
            <node role="regexp" type="jetbrains.mps.regexp.RegexpDeclarationReferenceRegexp" id="1174939974483">
              <link role="regexp" targetNodeId="1174939907890" resolveInfo="email" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174940011258">
      <property name="name" value="replaceWithPredefined" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174940011259" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174940011260">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174940018011">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174940018012">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174940018013">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174940020124">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1174940020314">
            <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174940020125">
              <link role="variableDeclaration" targetNodeId="1174940018012" resolveInfo="s" />
            </node>
            <node role="rValue" type="jetbrains.mps.regexp.ReplaceWithRegexpExpression" id="1174940022268">
              <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174940029994">
                <link role="variableDeclaration" targetNodeId="1174940018012" resolveInfo="s" />
              </node>
              <node role="replaceBlock" type="jetbrains.mps.regexp.ReplaceBlock" id="1174940022270">
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174940022271">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174940031417">
                    <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174940033795">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174940038127">
                        <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174940039177">
                          <link role="match" targetNodeId="1174939935088" resolveInfo="domain" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174940035017">
                          <property name="value" value=" at " />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174940032857">
                        <link role="match" targetNodeId="1174939914064" resolveInfo="user" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174940025804">
                <node role="regexp" type="jetbrains.mps.regexp.RegexpDeclarationReferenceRegexp" id="1174940026947">
                  <link role="regexp" targetNodeId="1174939907890" resolveInfo="email" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1175155050941">
    <property name="name" value="MatchIteration" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1175155055598">
      <property name="name" value="forEachMatch" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1175155055599" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175155055600">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1175155160052">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1175155160053">
            <property name="name" value="test" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175155160054">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1175155161775">
              <property name="value" value="239 239 239" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.ForEachMatchStatement" id="1175155078945">
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1175155150546">
            <node role="regexp" type="jetbrains.mps.regexp.MatchParensRegexp" id="1175155183604">
              <property name="name" value="number" />
              <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1175155189779">
                <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1175155188091">
                  <link role="symbolClass" targetNodeId="3.1174554674770" />
                </node>
              </node>
            </node>
          </node>
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1175155165870">
            <link role="variableDeclaration" targetNodeId="1175155160053" resolveInfo="test" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175155078948">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175155168793">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175155174410">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1175155168794">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1175155179490">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1175155268878">
                    <link role="match" targetNodeId="1175155183604" resolveInfo="number" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1175155175333">
                    <property name="value" value="number = " />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1175164538647">
    <property name="name" value="Split" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1175164540913">
      <property name="name" value="splitTest" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1175164540914" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175164540915">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1175164544444">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1175164544445">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175164544446">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1175164545729">
              <property name="value" value="ab23cd23ef" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1175164631550">
          <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1175164631552">
            <property name="name" value="st" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175164633837">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175164631554">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175164638080">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175164642685">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1175164638081">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1175164646626">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1175164654054">
                    <link role="variableDeclaration" targetNodeId="1175164631552" resolveInfo="st" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1175164644546">
                    <property name="value" value="s = " />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.regexp.SplitExpression" id="1175164634870">
            <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1175164840365">
              <link role="variableDeclaration" targetNodeId="1175164544445" resolveInfo="s" />
            </node>
            <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1175164634872">
              <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1175164634873">
                <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1175164634874">
                  <link role="symbolClass" targetNodeId="3.1174554674770" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1175169338798">
    <property name="name" value="FindMatch" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1175169343112">
      <property name="name" value="main" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1175169343113" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175169343114">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1175169364198">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1175169364199">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175169364200">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1175169365499">
              <property name="value" value="abcdef2323" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.FindMatchStatement" id="1175169487423">
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1175169489286">
            <link role="variableDeclaration" targetNodeId="1175169364199" resolveInfo="s" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175169487425">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175169514031">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175169519227">
                <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1175169514032">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.regexp.MatchVariableReference" id="1175169522149">
                  <link role="match" targetNodeId="1175169502339" resolveInfo="number" />
                </node>
              </node>
            </node>
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1175169491959">
            <node role="regexp" type="jetbrains.mps.regexp.MatchParensRegexp" id="1175169502339">
              <property name="name" value="number" />
              <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1175169507342">
                <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1175169505935">
                  <link role="symbolClass" targetNodeId="3.1174554674770" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

