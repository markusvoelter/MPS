<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.baseLanguageInternal">
  <structure>
    <model modelUID="jetbrains.mps.baseLanguageInternal.structure" />
  </structure>
  <helginsTypeSystem>
    <model modelUID="jetbrains.mps.baseLanguageInternal.helgins" />
  </helginsTypeSystem>
  <editor>
    <model modelUID="jetbrains.mps.baseLanguageInternal.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="jetbrains.mps.baseLanguageInternal" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="jetbrains.mps.baseLanguageInternal" />
  </models>
  <module />
  <accessoryModels />
  <generators />
  <classPath>
    <entry path="${language_descriptor}\classes" />
  </classPath>
  <runtimeClassPath>
    <entry path="${language_descriptor}\classes" />
  </runtimeClassPath>
  <osgiOptions>
    <requiredBundles />
    <exportedPackage />
  </osgiOptions>
</language>

