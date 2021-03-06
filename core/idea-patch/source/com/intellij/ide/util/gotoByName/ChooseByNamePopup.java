/*
 * Copyright 2000-2009 JetBrains s.r.o.
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

package com.intellij.ide.util.gotoByName;

import com.intellij.featureStatistics.FeatureUsageTracker;
import com.intellij.ide.util.gotoByName.temp.IdeaItemProvider;
import com.intellij.ide.util.gotoByName.temp.ItemProvider;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.ComponentPopupBuilder;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.DimensionService;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiElement;
import com.intellij.psi.statistics.StatisticsInfo;
import com.intellij.psi.statistics.StatisticsManager;
import com.intellij.ui.ScreenUtil;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.ui.popup.AbstractPopup;
import jetbrains.mps.util.annotation.Patch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import java.awt.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChooseByNamePopup extends com.intellij.ide.util.gotoByName.temp.ChooseByNameBase implements ChooseByNamePopupComponent {
  private static final Key<ChooseByNamePopup> CHOOSE_BY_NAME_POPUP_IN_PROJECT_KEY = new Key<ChooseByNamePopup>("ChooseByNamePopup");
  private Component myOldFocusOwner = null;
  private boolean myShowListForEmptyPattern = false;

  protected ChooseByNamePopup(final Project project, final ChooseByNameModel model, ItemProvider provider, final ChooseByNamePopup oldPopup,
                              final PsiElement context, @Nullable final String predefinedText) {
    super(project, model, provider, oldPopup != null ? oldPopup.getEnteredText() : predefinedText);
    if (oldPopup == null && predefinedText != null) {
      setPreselectInitialText(true);
    }
    if (oldPopup != null) { //inherit old focus owner
      myOldFocusOwner = oldPopup.myPreviouslyFocusedComponent;
    }
  }

  public String getEnteredText() {
    return myTextField.getText();
  }

  protected void initUI(final Callback callback, final ModalityState modalityState, boolean allowMultipleSelection) {
    super.initUI(callback, modalityState, allowMultipleSelection);
    //LaterInvocator.enterModal(myTextFieldPanel);
    if (myInitialText != null) {
      rebuildList(0, 0, null, ModalityState.current(), null);
    }
    if (myOldFocusOwner != null) {
      myPreviouslyFocusedComponent = myOldFocusOwner;
      myOldFocusOwner = null;
    }
  }

  protected boolean isCheckboxVisible() {
    return true;
  }

  protected boolean isShowListForEmptyPattern() {
    return myShowListForEmptyPattern;
  }

  public void setShowListForEmptyPattern(boolean showListForEmptyPattern) {
    myShowListForEmptyPattern = showListForEmptyPattern;
  }

  protected boolean isCloseByFocusLost() {
    return true;
  }

  protected void showList() {
    final JLayeredPane layeredPane = myTextField.getRootPane().getLayeredPane();

    Rectangle bounds = new Rectangle(myTextFieldPanel.getLocationOnScreen(), myTextField.getSize());
    bounds.y += myTextFieldPanel.getHeight() + (SystemInfo.isMac ? 3 : 1);

    final Dimension preferredScrollPaneSize = myListScrollPane.getPreferredSize();
    preferredScrollPaneSize.width = Math.max(myTextFieldPanel.getWidth(), preferredScrollPaneSize.width);

    Rectangle prefferedBounds = new Rectangle(bounds.x, bounds.y, preferredScrollPaneSize.width, preferredScrollPaneSize.height);
    ScreenUtil.fitToScreen(prefferedBounds);

    myListScrollPane.setVisible(true);
    myListScrollPane.setBorder(null);
    if (myDropdownPopup == null) {
      ComponentPopupBuilder builder = JBPopupFactory.getInstance().createComponentPopupBuilder(myListScrollPane, myListScrollPane);
      builder.setFocusable(false).setRequestFocus(false).setCancelKeyEnabled(false).setFocusOwners(new JComponent[]{myTextField}).setBelongsToGlobalPopupStack(false).setForceHeavyweight(true).setModalContext(false);
      builder.setCancelCallback(new Computable<Boolean>() {
        @Override
        public Boolean compute() {
          return Boolean.TRUE;
        }
      });
      myDropdownPopup = builder.createPopup();
      myDropdownPopup.setLocation(prefferedBounds.getLocation());
      myDropdownPopup.setSize(prefferedBounds.getSize());
      myDropdownPopup.show(layeredPane);
    } else {
      myDropdownPopup.setLocation(prefferedBounds.getLocation());
      myDropdownPopup.setSize(prefferedBounds.getSize());
    }
  }

  protected void hideList() {
    if (myDropdownPopup != null) {
      myDropdownPopup.cancel();
      myDropdownPopup = null;
    }
  }

  protected void close(final boolean isOk) {
    if (myDisposedFlag) {
      return;
    }

    if (isOk) {
      myModel.saveInitialCheckBoxState(myCheckBox.isSelected());

      final List<Object> chosenElements = getChosenElements();
      if (chosenElements != null) {
        if (myActionListener instanceof MultiElementsCallback) {
          ((MultiElementsCallback) myActionListener).elementsChosen(chosenElements);
        } else {
          for (Object element : chosenElements) {
            myActionListener.elementChosen(element);
            String text = myModel.getFullName(element);
            if (text != null) {
              StatisticsManager.getInstance().incUseCount(new StatisticsInfo(statisticsContext(), text));
            }
          }
        }
      } else {
        return;
      }

      if (!chosenElements.isEmpty()) {
        final String enteredText = getEnteredText();
        if (enteredText.indexOf('*') >= 0) {
          FeatureUsageTracker.getInstance().triggerFeatureUsed("navigation.popup.wildcards");
        } else {
          for (Object element : chosenElements) {
            final String name = myModel.getElementName(element);
            if (name != null) {
              if (!StringUtil.startsWithIgnoreCase(name, enteredText)) {
                FeatureUsageTracker.getInstance().triggerFeatureUsed("navigation.popup.camelprefix");
                break;
              }
            }
          }
        }
      } else {
        return;
      }
    }

    myDisposedFlag = true;
    myAlarm.cancelAllRequests();
    myProject.putUserData(CHOOSE_BY_NAME_POPUP_IN_PROJECT_KEY, null);

    //LaterInvocator.leaveModal(myTextFieldPanel);

    cleanupUI();
    myActionListener.onClose();
  }

  @Nullable
  public static ChooseByNamePopup getActivePopup(@NotNull final Project project) {
    return CHOOSE_BY_NAME_POPUP_IN_PROJECT_KEY.get(project);
  }

  private void cleanupUI() {
    if (myTextPopup != null) {
      myTextPopup.cancel();
      myTextPopup = null;
    }

    if (myDropdownPopup != null) {
      myDropdownPopup.cancel();
      myDropdownPopup = null;
    }
  }

  @Deprecated
  public static ChooseByNamePopup createPopup(final Project project, final ChooseByNameModel model, final PsiElement context) {
    return createPopup(project, model, new IdeaItemProvider(context), context, null);
  }

  public static ChooseByNamePopup createPopup(final Project project, final ChooseByNameModel model, ItemProvider provider, final PsiElement context) {
    return createPopup(project, model, provider, context, null);
  }

  public static ChooseByNamePopup createPopup(final Project project, final ChooseByNameModel model, final PsiElement context,
                                              @Nullable final String predefinedText) {
    return createPopup(project, model, new IdeaItemProvider(context), context, predefinedText);
  }

  public static ChooseByNamePopup createPopup(final Project project, final ChooseByNameModel model, ItemProvider provider, final PsiElement context,
                                              @Nullable final String predefinedText) {
    final ChooseByNamePopup oldPopup = project.getUserData(CHOOSE_BY_NAME_POPUP_IN_PROJECT_KEY);
    if (oldPopup != null) {
      oldPopup.close(false);
    }
    ChooseByNamePopup newPopup = new ChooseByNamePopup(project, model, provider, oldPopup, context, predefinedText);

    project.putUserData(CHOOSE_BY_NAME_POPUP_IN_PROJECT_KEY, newPopup);
    return newPopup;
  }

  private static final Pattern patternToDetectLinesAndColumns = Pattern.compile("(.*?)(?:\\:|@|,|#)(\\d+)?(?:(?:\\D)(\\d+)?)?");

  public String transformPattern(String pattern) {
    if (pattern.indexOf(':') != -1 ||
      pattern.indexOf(',') != -1 ||
      pattern.indexOf(';') != -1 ||
      pattern.indexOf('#') != -1 ||
      pattern.indexOf('@') != -1) { // quick test if reg exp should be used
      final Matcher matcher = patternToDetectLinesAndColumns.matcher(pattern);
      if (matcher.matches()) {
        pattern = matcher.group(1);
      }
    }

    return super.transformPattern(pattern);
  }

  public int getLinePosition() {
    return getLineOrColumn(true);
  }

  private int getLineOrColumn(final boolean line) {
    final Matcher matcher = patternToDetectLinesAndColumns.matcher(getEnteredText());
    if (matcher.matches()) {
      final int groupNumber = line ? 2 : 3;
      try {
        if (groupNumber <= matcher.groupCount()) {
          final String group = matcher.group(groupNumber);
          if (group != null) return Integer.parseInt(group) - 1;
        }
        if (!line && getLineOrColumn(true) != -1) return 0;
      } catch (NumberFormatException ignored) {
      }
    }

    return -1;
  }

  public int getColumnPosition() {
    return getLineOrColumn(false);
  }

  public void showItemPopup(final JBPopup hint) {
    if (myDropdownPopup != null && myDropdownPopup.isVisible()) {
      Dimension hintSize = null;
      if (hint instanceof AbstractPopup) {
        final String key = ((AbstractPopup) hint).getDimensionServiceKey();
        if (key != null) {
          hintSize = DimensionService.getInstance().getSize(key);
        }
      }

      if (hintSize == null) {
        hintSize = hint.getContent().getPreferredSize();
      }

      final Dimension size = myDropdownPopup.getSize();
      GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      final int width = gd.getDisplayMode().getWidth();
      Point p;
      if (hintSize != null) {
        final int dropDownX = myDropdownPopup.getLocationOnScreen().x;
        if (dropDownX + size.width + 10 + hintSize.width < width || (dropDownX - hintSize.width - 10 < 0)) {
          p = new Point(size.width + 5, 0);
        } else {
          p = new Point(-hintSize.width - 5, 0);
        }
      } else {
        p = new Point(size.width + 5, 0);
      }

      hint.show(new RelativePoint(myDropdownPopup.getContent(), p));
    }
  }
}
