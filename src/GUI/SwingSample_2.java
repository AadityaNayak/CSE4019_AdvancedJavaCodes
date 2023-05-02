package GUI;

import javax.swing.*;

public class SwingSample_2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Password Field Example");
        JLabel l1 = new JLabel("Password");
        JPasswordField pass = new JPasswordField();

        l1.setBounds(20, 100, 80, 30);
        pass.setBounds(100, 100, 100, 30);

        frame.add(l1);
        frame.add(pass);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
