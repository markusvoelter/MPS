<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.build.custommps" uuid="a79f53b6-9aaa-48eb-9fbb-aaec80a6da9a" compileInMPS="true" doNotGenerateAdapters="true">
  <models>
    <modelRoot path="${language_descriptor}/languageAccessories" />
    <modelRoot path="${language_descriptor}/languageModels" />
  </models>
  <accessoryModels />
  <generators>
    <generator name="genCustomMPS" generatorUID="jetbrains.mps.build.custommps#1233155119006" uuid="310ad856-d400-4ee5-abc4-1f355bef017b">
      <models>
        <modelRoot path="${language_descriptor}/generator/template" />
      </models>
      <external-templates>
        <generator generatorUID="87fb3934-638b-4bed-947e-b13049093817(jetbrains.mps.build.distrib#1230058167282)" />
        <generator generatorUID="ab777ef3-cd35-47a2-8db1-108b4d67986f(jetbrains.mps.build.packaging###1203014923802)" />
      </external-templates>
      <dependencies>
        <dependency reexport="false">02824ec0-c6a4-4517-a484-12d85172bbaa(jetbrains.mps.build.distrib)</dependency>
        <dependency reexport="false">86441d7a-e194-42da-81a5-2161ec62a379(MPS.Workbench)</dependency>
        <dependency reexport="false">6ed54515-acc8-4d1e-a16c-9fd6cfe951ea(MPS.Core)</dependency>
      </dependencies>
      <usedLanguages>
        <usedLanguage>02824ec0-c6a4-4517-a484-12d85172bbaa(jetbrains.mps.build.distrib)</usedLanguage>
        <usedLanguage>fba399db-f591-45dc-a279-e2a2a986e262(jetbrains.mps.build.generictasks)</usedLanguage>
      </usedLanguages>
      <usedDevKits>
        <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
      </usedDevKits>
      <mapping-priorities>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <generator generatorUID="310ad856-d400-4ee5-abc4-1f355bef017b(jetbrains.mps.build.custommps#1233155119006)" />
            <external-mapping>
              <all-local-mappings />
            </external-mapping>
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="ab777ef3-cd35-47a2-8db1-108b4d67986f(jetbrains.mps.build.packaging###1203014923802)" />
            <external-mapping>
              <all-local-mappings />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <generator generatorUID="310ad856-d400-4ee5-abc4-1f355bef017b(jetbrains.mps.build.custommps#1233155119006)" />
            <external-mapping>
              <all-local-mappings />
            </external-mapping>
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="87fb3934-638b-4bed-947e-b13049093817(jetbrains.mps.build.distrib#1230058167282)" />
            <external-mapping>
              <all-local-mappings />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
      </mapping-priorities>
    </generator>
  </generators>
  <sourcePath />
  <dependencies>
    <dependency reexport="false">6ed54515-acc8-4d1e-a16c-9fd6cfe951ea(MPS.Core)</dependency>
    <dependency reexport="false">86441d7a-e194-42da-81a5-2161ec62a379(MPS.Workbench)</dependency>
    <dependency reexport="false">02824ec0-c6a4-4517-a484-12d85172bbaa(jetbrains.mps.build.distrib)</dependency>
    <dependency reexport="false">df9d410f-2ebb-43f7-893a-483a4f085250(jetbrains.mps.smodel.resources)</dependency>
    <dependency reexport="false">a1250a4d-c090-42c3-ad7c-d298a3357dd4(jetbrains.mps.make.runtime)</dependency>
  </dependencies>
  <usedLanguages>
    <usedLanguage>f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</usedLanguage>
    <usedLanguage>83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)</usedLanguage>
    <usedLanguage>02824ec0-c6a4-4517-a484-12d85172bbaa(jetbrains.mps.build.distrib)</usedLanguage>
    <usedLanguage>4e6c5313-7662-4c44-9bc7-b488cec17508(jetbrains.mps.build.packaging)</usedLanguage>
    <usedLanguage>696c1165-4a59-463b-bc5d-902caab85dd0(jetbrains.mps.make.facet)</usedLanguage>
    <usedLanguage>95f8a3e6-f994-4ca0-a65e-763c9bae2d3b(jetbrains.mps.make.script)</usedLanguage>
    <usedLanguage>5d6bee4c-f891-4a93-a0c9-e2268726ae47(jetbrains.mps.uiLanguage)</usedLanguage>
  </usedLanguages>
  <usedDevKits>
    <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
  </usedDevKits>
  <extendedLanguages>
    <extendedLanguage>4e6c5313-7662-4c44-9bc7-b488cec17508(jetbrains.mps.build.packaging)</extendedLanguage>
  </extendedLanguages>
</language>

