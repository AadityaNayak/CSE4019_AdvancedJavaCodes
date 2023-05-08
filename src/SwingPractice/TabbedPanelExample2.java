package SwingPractice;

import javax.swing.*;
import java.awt.*;

public class TabbedPanelExample2 extends JFrame {
    TabbedPanelExample2() {
        JLabel l1 = new JLabel("RNo");
        JLabel l2 = new JLabel("Name");
        JLabel l3 = new JLabel("DOB");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout());

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);

        JRadioButton r1 = new JRadioButton("UG");
        JRadioButton r2 = new JRadioButton("PG");
        JRadioButton r3 = new JRadioButton("PHD");
        JPanel p2 = new JPanel();

        p2.add(r1);
        p2.add(r2);
        p2.add(r3);

        JCheckBox cb1 = new JCheckBox("Java");
        JCheckBox cb2 = new JCheckBox("PHP");
        JCheckBox cb3 = new JCheckBox(".Net");
        JPanel p3 = new JPanel();
        p3.add(cb1);
        p3.add(cb2);
        p3.add(cb3);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 400, 400);
        tp.add("Personal info", p1);
        tp.add("Qualification", p2);
        tp.add("Area of interest", p3);

        add(tp);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPanelExample2();
    }
}
