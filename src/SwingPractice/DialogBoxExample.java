package SwingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBoxExample extends JFrame implements ActionListener {

    DialogBoxExample(){
        JPanel p = new JPanel();
        JButton b = new JButton("Click");


        b.addActionListener(this);
        p.add(b);
        add(p);
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Click")) {
            JDialog d = new JDialog();
            JLabel l = new JLabel("This is a dialog box");

            d.add(l);
            d.setSize(100, 100);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new DialogBoxExample();
    }


}
