package jetbrains.mps.samples.generator_demo.test_models.test4;

/*Generated by MPS */

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;

public class DemoApp {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container container = frame.getContentPane();
    container.setLayout(new FlowLayout());
    addContent(container);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public static void addContent(Container container) {
    container.add(createComponent_a());
    container.add(createComponent_a_0());
    container.add(createComponent_a_1());
  }

  public static Component createComponent_a() {
    JButton component = new JButton();
    component.setText("Hello");
    component.setEnabled(false);
    return component;
  }

  public static Component createComponent_a_0() {
    JLabel component = new JLabel();
    component.setText("world!");
    component.setOpaque(true);
    component.setBackground(Color.orange);
    return component;
  }

  public static Component createComponent_a0() {
    JLabel component = new JLabel();
    component.setText("Hello");
    return component;
  }

  public static Component createComponent_b0() {
    JLabel component = new JLabel();
    component.setText("MPS!");
    return component;
  }

  public static Component createComponent_a_1() {
    JPanel component = new JPanel();
    component.setOpaque(true);
    component.setBackground(Color.white);
    //  add children 
    component.add(createComponent_a0());
    component.add(createComponent_b0());
    return component;
  }
}
