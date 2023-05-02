package GUI;

import javax.swing.*;

public class SwingSample_1 {

    SwingSample_1() {
        JFrame f = new JFrame();
        JLabel l = new JLabel("Employee Name");
        JTextField t = new JTextField();
        JButton b = new JButton("OK");
        l.setBounds(30, 100, 100, 40);
        t.setBounds(140, 100, 100, 40);
        b.setBounds(100, 150, 100, 40);
        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingSample_1 frame = new SwingSample_1();
    }

}
