/*
 * Copyright 2003-2010 JetBrains s.r.o.
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
package jetbrains.mps.smodel;

import com.intellij.openapi.command.undo.DocumentReference;
import com.intellij.openapi.command.undo.UndoableAction;
import com.intellij.openapi.command.undo.UnexpectedUndoException;
import com.intellij.openapi.command.undo.DocumentReferenceManager;
import com.intellij.openapi.command.impl.DocumentReferenceByVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;

public abstract class SNodeUndoableAction implements UndoableAction {
  private DocumentReference[] myAffectedDocuments;
  private MPSNodeVirtualFile myFile;
  private long myModifcationStamp;

  protected SNodeUndoableAction(SNode affectedNode) {
    SNode containingRoot = affectedNode.getContainingRoot();
    if (containingRoot == null) {
      myAffectedDocuments = new DocumentReference[0];
    } else {
      myFile = MPSNodesVirtualFileSystem.getInstance().getFileFor(containingRoot);
      assert myFile.isValid() : "Invalid file was returned by VFS node is not available: " + myFile.getNode();
      myAffectedDocuments = new DocumentReference[]{DocumentReferenceManager.getInstance().create(myFile)};
      myModifcationStamp = myFile.getModificationStamp();
    }
  }

  protected abstract void doUndo();

  protected abstract void doRedo();

  public final void undo() throws UnexpectedUndoException {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        if (myFile != null) {
          myFile.setModificationStamp(myModifcationStamp);
        }
        doUndo();
      }
    });
  }

  public final void redo() throws UnexpectedUndoException {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        doRedo();
      }
    });
  }

  public DocumentReference[] getAffectedDocuments() {
    return myAffectedDocuments;
  }

  public boolean isComplex() {
    return false;
  }

  public boolean isGlobal() {
    return false;
  }
}
