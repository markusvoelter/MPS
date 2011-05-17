package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import javax.swing.JComponent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Dimension;
import java.awt.Graphics;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.awt.Color;
import javax.swing.JViewport;

public class ChangeTrapeciumStrip extends JComponent {
  private static final int WIDTH = 30;

  private ChangeGroupBuilder myChangeGroupBuilder;

  public ChangeTrapeciumStrip(ChangeGroupBuilder changeGroupBuilder) {
    myChangeGroupBuilder = changeGroupBuilder;
    ChangeListener viewportListener = new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        repaint();
      }
    };
    getLeftViewport().addChangeListener(viewportListener);
    getRightViewport().addChangeListener(viewportListener);
    setMinimumSize(new Dimension(WIDTH, 1));
    setPreferredSize(new Dimension(WIDTH, 1));
    myChangeGroupBuilder.addInvalidateListener(new ChangeGroupInvalidateListener() {
      public void changeGroupsInvalidated() {
        repaint();
      }
    });
  }

  @Override
  protected void paintComponent(Graphics g) {
    int leftOffset = getOffset(getLeftViewport());
    int rightOffset = getOffset(getRightViewport());

    for (ChangeGroup group : ListSequence.fromList(myChangeGroupBuilder.getChangeGroups())) {
      int leftStart = (int) group.getLeftBounds().start() + leftOffset;
      int leftEnd = (int) group.getLeftBounds().end() + leftOffset;
      int rightStart = (int) group.getRightBounds().start() + rightOffset;
      int rightEnd = (int) group.getRightBounds().end() + rightOffset;

      int[] xx = new int[]{0, getWidth(), getWidth(), 0};
      int[] yy = new int[]{leftStart, rightStart, rightEnd, leftEnd};

      g.setColor(ChangeColors.get(group.getChangeType()));
      g.fillPolygon(xx, yy, 4);
      g.setColor(Color.GRAY);
      g.drawLine(0, leftStart, getWidth() - 1, rightStart);
      g.drawLine(0, leftEnd, getWidth() - 1, rightEnd);
    }
  }

  private JViewport getLeftViewport() {
    return myChangeGroupBuilder.getLeftComponent().getViewport();
  }

  private JViewport getRightViewport() {
    return myChangeGroupBuilder.getRightComponent().getViewport();
  }

  private int getOffset(JViewport viewport) {
    return -viewport.getViewPosition().y + myChangeGroupBuilder.getEditorVerticalOffset();
  }
}
