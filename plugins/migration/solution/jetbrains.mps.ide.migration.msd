<?xml version="1.0" encoding="UTF-8"?>
<solution name="jetbrains.mps.ide.migration" uuid="f79b80ff-2fee-4243-9291-a156ab1cfc01" compileInMPS="false" generatorOutputPath="${mps_home}/plugins/migration/source_gen">
  <models>
    <modelRoot path="${solution_descriptor}/" />
    <modelRoot path="${mps_home}/plugins/migration">
      <manager moduleId="32d0a39c-772f-4490-8142-e50f9a9f19d4" className="jetbrains.mps.platform.conf.stubs.ConfStubs" />
    </modelRoot>
    <modelRoot path="${mps_home}/plugins/migration/classes">
      <manager moduleId="f3061a53-9226-4cc5-a443-f952ceaf5816" className="jetbrains.mps.baseLanguage.stubs.JavaStubs" />
    </modelRoot>
  </models>
  <stubModelEntries>
    <stubModelEntry path="${mps_home}/plugins/migration">
      <manager moduleId="32d0a39c-772f-4490-8142-e50f9a9f19d4" className="jetbrains.mps.platform.conf.stubs.ConfStubs" />
    </stubModelEntry>
    <stubModelEntry path="${mps_home}/plugins/migration/classes">
      <manager moduleId="f3061a53-9226-4cc5-a443-f952ceaf5816" className="jetbrains.mps.baseLanguage.stubs.JavaStubs" />
    </stubModelEntry>
  </stubModelEntries>
  <sourcePath />
  <dependencies>
    <dependency reexport="false">6354ebe7-c22a-4a0f-ac54-50b52ab9b065(JDK)</dependency>
    <dependency reexport="false">8f6725be-608d-433b-98fd-844f816eb05f(jetbrains.mps.ide.make)</dependency>
    <dependency reexport="false">8f6725be-608d-433b-98fd-844f816eb05f(jetbrains.mps.ide.make)</dependency>
    <dependency reexport="false">0eddeefa-c2d6-4437-bc2c-de50fd4ce470(jetbrains.mps.lang.script)</dependency>
    <dependency reexport="false">6ed54515-acc8-4d1e-a16c-9fd6cfe951ea(MPS.Core)</dependency>
    <dependency reexport="false">86441d7a-e194-42da-81a5-2161ec62a379(MPS.Workbench)</dependency>
  </dependencies>
  <usedLanguages>
    <usedLanguage>83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)</usedLanguage>
    <usedLanguage>28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)</usedLanguage>
    <usedLanguage>7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)</usedLanguage>
    <usedLanguage>f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</usedLanguage>
  </usedLanguages>
</solution>

