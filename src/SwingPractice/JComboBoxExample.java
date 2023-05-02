package SwingPractice;

import javax.swing.*;
import java.awt.event.*;
public class JComboBoxExample extends JFrame implements ActionListener {

        String []languages = {"C", "C++", "C#", "Java", "PHP"};
        final JLabel label = new JLabel();
        final JComboBox cb = new JComboBox(languages);
    JComboBoxExample(){

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JButton b = new JButton("Show");
        b.setBounds(200,100,75,20);

        cb.setBounds(50,100,90,20);
        add(cb); add(label); add(b);
        setLayout(null);
        setVisible(true);
        setSize(350, 350);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String data = "Programming Languages Selected: " + cb.getItemAt(cb.getSelectedIndex());
        label.setText(data);
    }

    public static void main(String[] args) {
        new JComboBoxExample();
    }
}
