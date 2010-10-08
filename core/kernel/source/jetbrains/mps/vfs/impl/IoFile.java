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
package jetbrains.mps.vfs.impl;

import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.IFileNameFilter;
import jetbrains.mps.vfs.ex.IFileEx;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class IoFile implements IFileEx {
  private File myFile;

  IoFile(@NotNull String path) {
    this(new File(path));
  }

  IoFile(@NotNull File file) {
    myFile = file.getAbsoluteFile();
  }

  public String getName() {
    return myFile.getName();
  }

  public IFile getParent() {
    File parentFile = myFile.getParentFile();
    if (parentFile == null) return null;
    return new IoFile(parentFile);
  }

  public boolean isDirectory() {
    return myFile.isDirectory();
  }

  public String getAbsolutePath() {
    return myFile.getAbsolutePath();
  }

  public long lastModified() {
    return myFile.lastModified();
  }

  public boolean exists() {
    return myFile.exists();
  }

  public boolean createNewFile() {
    try {
      return myFile.createNewFile();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public boolean mkdirs() {
    return myFile.mkdirs();
  }

  public boolean delete() {
    return myFile.delete();
  }

  public List<IFile> list() {
    File[] files = myFile.listFiles();
    if (files == null) {
      return null;
    }

    List<IFile> result = new ArrayList<IFile>(files.length);
    for (File f : files) {
      result.add(new IoFile(f));
    }
    return result;
  }

  public IFile child(String suffix) {
    return new IoFile(new File(myFile, suffix));
  }

  public List<IFile> list(IFileNameFilter filter) {
    List<IFile> result = new ArrayList<IFile>();

    File[] files = myFile.listFiles();

    if (files == null) {
      return null;
    }

    for (File f : files) {
      if (filter.accept(this, f.getName())) {
        result.add(new IoFile(f));
      }
    }

    return result;
  }

  public File getFile() {
    return myFile;
  }

  public InputStream openInputStream() throws IOException {
    return new FileInputStream(myFile);
  }

  public OutputStream openOutputStream() throws IOException {
    if (myFile.exists() && myFile.isHidden()) {
      if (!myFile.delete()) {
        throw new RuntimeException();
      }
    }

    return new FileOutputStream(myFile);
  }

  public boolean isReadOnly() {
    return false;
  }

  public long length() {
    return myFile.length();
  }

  public int hashCode() {
    return myFile.hashCode();
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof IoFile)) {
      return false;
    }

    IoFile ioFile = (IoFile) obj;
    return ioFile.myFile.equals(myFile);
  }

  public String toString() {
    return myFile.toString();
  }

  @Override
  public boolean isPackaged() {
    return false;
  }

  @Override
  public IFile getBundleHome() {
    return getParent();
  }

  @Override
  public URL getURL() throws MalformedURLException {
    return myFile.toURI().toURL();
  }

  @Override
  public boolean setTimeStamp(long time) {
    return myFile.setLastModified(time);
  }
}
