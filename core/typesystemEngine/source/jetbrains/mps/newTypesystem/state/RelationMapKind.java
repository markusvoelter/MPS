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
package jetbrains.mps.newTypesystem.state;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 02.12.10
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */
public enum RelationMapKind {
  WEAK(" <= ", "Subtyping", true, false, false),
  STRONG(" <<= ", "Subtyping (strong)", false, false, false),
  WEAK_CHECK(" <=' ", "Check-only subtyping", true, true, false),
  STRONG_CHECK(" <<=' ", "Check-only subtyping (strong)", false, true, false),
  WEAK_COMPARABLE(" ~ ", "Comparable", true, true, true),
  STRONG_COMPARABLE(" ~~ ", "Comparable (strong)", false, true, true);

  private String myRelationSign;
  private String myTitle;

  private boolean myWeak;
  private boolean myCheckOnly;
  private boolean myComparable;

  RelationMapKind(String relationSign, String title, boolean weak, boolean checkOnly, boolean comparable) {
    myRelationSign = relationSign;
    myTitle = title;
    myWeak = weak;
    myCheckOnly = checkOnly;
    myComparable = comparable;
  }

  public String getRelationSign() {
    return myRelationSign;
  }

  public String getTitle() {
    return myTitle;
  }

  public boolean isWeak() {
    return myWeak;
  }

  public boolean isCheckOnly() {
    return myCheckOnly;
  }

  public boolean isComparable() {
    return myComparable;
  }
}
