<?xml version="1.0" encoding="UTF-8"?>
<solution name="jetbrains.mps.debugger.java.runtime" uuid="fcffe3cf-3ebc-4d3d-989b-2f30533bc904" compileInMPS="false">
  <models>
    <modelRoot path="${solution_descriptor}/">
      <manager moduleId="32d0a39c-772f-4490-8142-e50f9a9f19d4" className="jetbrains.mps.platform.conf.stubs.ConfStubs" />
    </modelRoot>
    <modelRoot path="${solution_descriptor}/classes">
      <manager moduleId="f3061a53-9226-4cc5-a443-f952ceaf5816" className="jetbrains.mps.baseLanguage.stubs.JavaStubs" />
    </modelRoot>
    <modelRoot path="${solution_descriptor}/models" />
  </models>
  <stubModelEntries>
    <stubModelEntry path="${solution_descriptor}/">
      <manager moduleId="32d0a39c-772f-4490-8142-e50f9a9f19d4" className="jetbrains.mps.platform.conf.stubs.ConfStubs" />
    </stubModelEntry>
    <stubModelEntry path="${solution_descriptor}/classes">
      <manager moduleId="f3061a53-9226-4cc5-a443-f952ceaf5816" className="jetbrains.mps.baseLanguage.stubs.JavaStubs" />
    </stubModelEntry>
  </stubModelEntries>
  <sourcePath />
  <dependencies>
    <dependency reexport="false">6354ebe7-c22a-4a0f-ac54-50b52ab9b065(JDK)</dependency>
    <dependency reexport="false">fdb93da0-59ed-4001-b2aa-4fad79ec058e(JDK.Tools)</dependency>
    <dependency reexport="false">6ed54515-acc8-4d1e-a16c-9fd6cfe951ea(MPS.Core)</dependency>
    <dependency reexport="false">1ed103c3-3aa6-49b7-9c21-6765ee11f224(MPS.Editor)</dependency>
    <dependency reexport="false">86441d7a-e194-42da-81a5-2161ec62a379(MPS.Workbench)</dependency>
    <dependency reexport="false">4c6a28d1-2c60-478d-b36e-db9b3cbb21fb(closures.runtime)</dependency>
    <dependency reexport="false">f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</dependency>
    <dependency reexport="false">443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)</dependency>
    <dependency reexport="false">a0c108f0-1637-416e-a249-3effbaa4c998(jetbrains.mps.baseLanguage.search)</dependency>
    <dependency reexport="false">df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)</dependency>
    <dependency reexport="false">25891414-2b70-48c7-b1cc-8dc0c127d669(jetbrains.mps.debugger.api.runtime)</dependency>
    <dependency reexport="false">cf8c9de5-1b4a-4dc8-8e6d-847159af31dd(jetbrains.mps.debugger.java.api)</dependency>
    <dependency reexport="false">7da4580f-9d75-4603-8162-51a896d78375(jetbrains.mps.debugger.java.evaluation)</dependency>
    <dependency reexport="false">fcffe3cf-3ebc-4d3d-989b-2f30533bc904(jetbrains.mps.debugger.java.runtime)</dependency>
    <dependency reexport="false">04b376d5-fc16-403b-a344-c68b30193c6a(jetbrains.mps.execution.lib)</dependency>
    <dependency reexport="false">019b622b-0aef-4dd3-86d0-4eef01f3f6bb(jetbrains.mps.ide)</dependency>
    <dependency reexport="false">8d29d73f-ed99-4652-ae0a-083cdfe53c34(jetbrains.mps.ide.platform)</dependency>
    <dependency reexport="false">ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)</dependency>
    <dependency reexport="false">9ded098b-ad6a-4657-bfd9-48636cfe8bc3(jetbrains.mps.lang.traceable)</dependency>
    <dependency reexport="false">cc7da2f6-419f-4133-a811-31fcd3295a85(jetbrains.mps.debugger.api.api)</dependency>
  </dependencies>
  <usedLanguages>
    <usedLanguage>f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</usedLanguage>
    <usedLanguage>774bf8a0-62e5-41e1-af63-f4812e60e48b(jetbrains.mps.baseLanguage.checkedDots)</usedLanguage>
    <usedLanguage>443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)</usedLanguage>
    <usedLanguage>fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)</usedLanguage>
    <usedLanguage>83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)</usedLanguage>
    <usedLanguage>f2801650-65d5-424e-bb1b-463a8781b786(jetbrains.mps.baseLanguage.javadoc)</usedLanguage>
    <usedLanguage>760a0a8c-eabb-4521-8bfd-65db761a9ba3(jetbrains.mps.baseLanguage.logging)</usedLanguage>
    <usedLanguage>df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)</usedLanguage>
    <usedLanguage>fbc14279-5e2a-4c87-a5d1-5f7061e6c456(jetbrains.mps.debugger.api.lang)</usedLanguage>
    <usedLanguage>80208897-4572-437d-b50e-8f050cba9566(jetbrains.mps.debugger.java.privateMembers)</usedLanguage>
    <usedLanguage>22e72e4c-0f69-46ce-8403-6750153aa615(jetbrains.mps.execution.configurations)</usedLanguage>
    <usedLanguage>756e911c-3f1f-4a48-bdf5-a2ceb91b723c(jetbrains.mps.execution.settings)</usedLanguage>
    <usedLanguage>aee9cad2-acd4-4608-aef2-0004f6a1cdbd(jetbrains.mps.lang.actions)</usedLanguage>
    <usedLanguage>28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)</usedLanguage>
    <usedLanguage>3a13115c-633c-4c5c-bbcc-75c4219e9555(jetbrains.mps.lang.quotation)</usedLanguage>
    <usedLanguage>7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)</usedLanguage>
    <usedLanguage>7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)</usedLanguage>
    <usedLanguage>32d0a39c-772f-4490-8142-e50f9a9f19d4(jetbrains.mps.platform.conf)</usedLanguage>
    <usedLanguage>5d6bee4c-f891-4a93-a0c9-e2268726ae47(jetbrains.mps.uiLanguage)</usedLanguage>
  </usedLanguages>
</solution>

