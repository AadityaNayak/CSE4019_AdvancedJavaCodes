package SwingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionDialogExample2 extends JFrame implements ActionListener {

    JLabel l = new JLabel("Enter Name");
    JTextField t = new JTextField();
    JButton b = new JButton("Submit");


    OptionDialogExample2() {

        l.setBounds(20, 40, 100, 30);
        t.setBounds(100, 40, 100, 30);
        b.setBounds(70, 120, 100, 30);

        add(l);
        add(t);
        add(b);

        b.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        String str = t.getText();

        if (s.equals("Submit")) {
            JOptionPane.showMessageDialog(this, "Welcome " + str);
        }
    }

    public static void main(String[] args) {
        new OptionDialogExample2();
    }

}

