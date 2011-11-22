<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:6ff1dacd-2ea5-47a0-9336-2eaecdee8a37(jetbrains.mps.execution.languages.plugin)">
  <persistence version="7" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <import index="mjd0" modelUID="r:066129d5-3ed4-4b2c-a29c-cffc17475f81(jetbrains.mps.debugger.api.languages.plugin)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tp4k" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="5" implicit="yes" />
  <roots>
    <node type="tp4k.IdeaInitializerDescriptor" typeId="tp4k.5023285075122009364" id="6863272677075182370">
      <property name="id" nameId="tp4k.5023285075122009366" value="jetbrains.mps.execution.languages" />
      <property name="name" nameId="tpck.1169194664001" value="Execution Languages" />
      <property name="descripttion" nameId="tp4k.5023285075122009368" value="Execution Languages" />
      <property name="version" nameId="tp4k.5023285075122009369" value="1.0" />
      <property name="vendor" nameId="tp4k.5023285075122009371" value="JetBrains" />
      <property name="vendorUrl" nameId="tp4k.5023285075122009372" value="http://www.jetbrains.com/mps/" />
      <property name="ideaVersion" nameId="tp4k.5023285075122009373" value="3000" />
    </node>
  </roots>
  <root id="6863272677075182370">
    <node role="dependency" roleId="tp4k.5864553086652219115" type="tp4k.MPSPluginDependency" typeId="tp4k.203415309825565488" id="2162966196215578044">
      <link role="plugin" roleId="tp4k.203415309825565489" targetNodeId="mjd0.2162966196215564401" resolveInfo="Debugger Api Languages" />
    </node>
  </root>
</model>

