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
package jetbrains.mps.ide.messages;

import jetbrains.mps.vfs.IFile;

/**
 * User: Sinchuk Sergey
 * Date: 13.06.2010
 */
public class FileWithLogicalPosition {
  private IFile myFile;
  private int myLine;
  private int myColumn;

  public FileWithLogicalPosition(IFile file, int line, int column) {
    myFile = file;
    myLine = line;
    myColumn = column;
  }

  public IFile getFile() {
    return myFile;
  }

  public int getLine() {
    return myLine;
  }

  public int getColumn() {
    return myColumn;
  }
}
