package jetbrains.mps.ide.findusages.view.optionseditor.components;

import jetbrains.mps.ide.findusages.FindersManager;
import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.ide.findusages.view.optionseditor.options.FindersOptions;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.action.ActionEventData;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

public abstract class FindersEditor extends BaseEditor<FindersOptions> {
  public FindersEditor(FindersOptions defaultOptions, final SNode node, ActionEventData data) {
    super(defaultOptions, node, data);

    myPanel = new JPanel();
    myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));

    myPanel.setBorder(
      BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Finders"),
        BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    Set<GeneratedFinder> availableFinders = FindersManager.getInstance().getAvailableFinders(node);

    List<GeneratedFinder> sortedFinders = new ArrayList<GeneratedFinder>(availableFinders);
    Collections.sort(sortedFinders, new Comparator<GeneratedFinder>() {
      public int compare(GeneratedFinder o1, GeneratedFinder o2) {
        return o1.getDescription().compareToIgnoreCase(o2.getDescription());
      }
    });

    List<String> correctEnabledFinders = new ArrayList<String>();

    for (final GeneratedFinder finder : sortedFinders) {
      boolean isEnabled = false;

      for (String enabledFinderName : myOptions.getFindersClassNames()) {
        if (enabledFinderName.equals(finder.getClass().getName())) {
          isEnabled = true;
        }
      }

      if (isEnabled) {
        correctEnabledFinders.add(finder.getClass().getName());
      }

      JCheckBox finderCheckBox = new JCheckBox(finder.getDescription(), isEnabled);
      finderCheckBox.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
          String finderClassName = finder.getClass().getName();
          if (((JCheckBox) e.getSource()).isSelected()) {
            if (!myOptions.getFindersClassNames().contains(finderClassName)) {
              myOptions.getFindersClassNames().add(finderClassName);
            }
          } else {
            myOptions.getFindersClassNames().remove(finderClassName);
          }
        }
      });

      finderCheckBox.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if ((e.getKeyCode() == MenuKeyEvent.VK_B) && (e.getID() == MenuKeyEvent.KEY_PRESSED) && (e.isControlDown())) {
            goToFinder(finder);
            e.consume();
          }
        }
      });

      JButton goToFinderButton = new JButton("->");
      goToFinderButton.setFocusable(false);
      goToFinderButton.setToolTipText("Go to finder declaration");
      goToFinderButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          goToFinder(finder);
        }
      });

      if (!finder.getLongDescription().equals("")) {
        String htmlTooltipText = "<html>" + finder.getLongDescription().replaceAll("\n", "<br>") + "</html>";
        finderCheckBox.setToolTipText(htmlTooltipText);
      }

      JToolBar finderHolder = new JToolBar(JToolBar.HORIZONTAL);
      finderHolder.add(finderCheckBox);
      finderHolder.add(goToFinderButton);
      finderHolder.setBorder(new EmptyBorder(0, 0, 0, 0));
      finderHolder.setFloatable(false);
      finderHolder.setAlignmentX(JToolBar.LEFT_ALIGNMENT);
      finderHolder.setBackground(myPanel.getBackground());

      myPanel.add(finderHolder);
    }

    myOptions.setFindersClassNames(correctEnabledFinders);
  }

  public abstract void goToFinder(GeneratedFinder finder);
}
