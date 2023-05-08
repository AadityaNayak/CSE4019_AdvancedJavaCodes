package SwingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorExample extends JFrame implements ActionListener {

    TextArea ta = new TextArea();

    ColorExample(){

        JButton b = new JButton("Choose color");
        b.setBounds(10, 40,150, 40);
        ta.setBounds(50, 200, 150, 50);

        b.addActionListener(this);
        add(b);
        add(ta);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "choose", Color.CYAN);
        ta.setBackground(c);
    }

    public static void main(String[] args) {
        new ColorExample();
    }
}
