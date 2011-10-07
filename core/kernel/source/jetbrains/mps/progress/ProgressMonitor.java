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
package jetbrains.mps.progress;

/**
 * Evgeny Gryaznov, 9/30/11
 */
public interface ProgressMonitor {

  void start(String taskName, int totalWork);

  void advance(int work);

  void step(String title);

  void done();

  ProgressMonitor subTask(int work);

  ProgressMonitor subTask(int work, SubProgressKind kind);

  boolean isCanceled();

  void cancel();
}
