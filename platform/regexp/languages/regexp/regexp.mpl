<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.regexp">
  <structure>
    <model modelUID="jetbrains.mps.regexp.structure" />
  </structure>
  <actions>
    <model modelUID="jetbrains.mps.regexp.actions" />
  </actions>
  <editor>
    <model modelUID="jetbrains.mps.regexp.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="jetbrains.mps.regexp" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="jetbrains.mps.regexp" />
  </models>
  <module />
  <accessoryModels />
  <generators>
    <generator generatorUID="jetbrains.mps.regexp#1174510748147" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generator\baseLanguage\template" namespacePrefix="jetbrains.mps.regexp.generator.baseLanguage.template" />
      </models>
      <module>
        <moduleRoot path="${mps_home}\languages\baseLanguage\language\baseLanguage.mpl" />
      </module>
      <external-templates />
      <mapping-priorities />
    </generator>
  </generators>
  <classPath>
    <entry path="${mps_home}\platform\regexp\classes" />
  </classPath>
</language>

