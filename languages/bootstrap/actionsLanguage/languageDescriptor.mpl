<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.bootstrap.actionsLanguage" generatorOutputPath="${mps_home}\source_gen">
  <structure>
    <model modelUID="jetbrains.mps.bootstrap.actionsLanguage.structure" />
  </structure>
  <actions>
    <model modelUID="jetbrains.mps.bootstrap.actionsLanguage.actions" />
  </actions>
  <constraints>
    <model modelUID="jetbrains.mps.bootstrap.actionsLanguage.constraints" />
  </constraints>
  <editor>
    <model modelUID="jetbrains.mps.bootstrap.actionsLanguage.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\." namespacePrefix="jetbrains.mps.bootstrap.actionsLanguage" />
  </models>
  <module />
  <accessoryModels />
  <generators>
    <generator generatorUID="jetbrains.mps.bootstrap.actionsLanguage#1154466409006" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generators\baseLanguage\templates" namespacePrefix="jetbrains.mps.bootstrap.actionsLanguage.generator.baseLanguage.template" />
        <modelRoot path="${mps_home}\languages\baseLanguage\language\generator\java\templates" namespacePrefix="jetbrains.mps.baseLanguage.generator.java.main" />
      </models>
      <module>
        <moduleRoot path="${mps_home}\languages\baseLanguage" />
      </module>
    </generator>
  </generators>
</language>

