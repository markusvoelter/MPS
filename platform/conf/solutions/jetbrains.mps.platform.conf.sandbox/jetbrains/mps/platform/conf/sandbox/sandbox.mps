<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:7d73e2b1-54e0-4481-9616-2b4b627a22db(jetbrains.mps.platform.conf.sandbox.sandbox)">
  <persistence version="7" />
  <language namespace="32d0a39c-772f-4490-8142-e50f9a9f19d4(jetbrains.mps.platform.conf)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="cs0q" modelUID="r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)" version="1" implicit="yes" />
  <roots>
    <node type="cs0q.ConfigurationXmlDocument" typeId="cs0q.5314521579133271086" id="1740160309778217800">
      <property name="name" nameId="tpck.1169194664001" value="foobar" />
    </node>
  </roots>
  <root id="1740160309778217800">
    <node role="root" roleId="cs0q.7130790807395857418" type="cs0q.IdeaPluginRoot" typeId="cs0q.1740160309778217806" id="1740160309778221572">
      <node role="fragment" roleId="cs0q.1740160309778170996" type="cs0q.ComponentsRoot" typeId="cs0q.5522969664585014978" id="8546999199441594024" />
      <node role="plugin" roleId="cs0q.6536266708345503827" type="cs0q.Plugin" typeId="cs0q.6536266708345244486" id="6536266708345522338">
        <property name="name" nameId="tpck.1169194664001" value="foobar" />
        <property name="uid" value="foo.bar" />
        <property name="version" nameId="cs0q.6536266708345244493" value="1.0" />
        <node role="vendor" roleId="cs0q.6536266708345244498" type="cs0q.PluginVendor" typeId="cs0q.6536266708345244494" id="6536266708345559403" />
        <node role="ideaVersion" roleId="cs0q.6536266708345477901" type="cs0q.IdeaVersion" typeId="cs0q.6536266708345477897" id="6536266708345559404" />
        <node role="helpset" roleId="cs0q.6536266708345477912" type="cs0q.PluginHelpset" typeId="cs0q.6536266708345477909" id="6536266708345559405" />
      </node>
    </node>
  </root>
</model>

