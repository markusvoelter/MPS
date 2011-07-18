/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import jetbrains.mps.TestMain;
import jetbrains.mps.testbench.MpsMakeHelper;
import jetbrains.mps.testbench.junit.runners.SymbolicSuite.SuiteClassSymbols;
import jetbrains.mps.testbench.junit.runners.WatchingSuite;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@SuiteClassSymbols({"jetbrains.mps.build.ant.BrokenReferencesTestTest",
  "jetbrains.mps.build.ant.GenerateTaskFilesCreationTest",
  "jetbrains.mps.build.ant.TeamCityMesageFormatTest",
  "jetbrains.mps.build.ant.WhatToDoSerializationConsistencyTest",
  "jetbrains.mps.generator.test.IncrementalGenerationTest",
  "jetbrains.mps.generator.test.ParallelGenerationMeasuringTest",
  "jetbrains.mps.generator.test.ParallelPoolTest",
  "jetbrains.mps.ide.migration.persistence.PersistenceTest",
  "jetbrains.mps.runtime.InternerTest"})
@RunWith(WatchingSuite.class)
public class TimeConsumingTestSuite {
  @BeforeClass
  public static void make () throws Exception {
    new MpsMakeHelper().make();
  }

  @AfterClass
  public static void shutdown() {
    TestMain.PROJECT_CONTAINER.clear();
  }
}
