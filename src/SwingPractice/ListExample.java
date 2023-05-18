package SwingPractice;

import javax.swing.*;
import java.awt.*;

public class ListExample {

    public static void main(String[] args) {
        JFrame f = new JFrame("List Demo");
        ListExample s = new  ListExample();
        JPanel p = new JPanel();
        JLabel lb = new JLabel("Select Day");
        String []week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        JList l = new JList(week);
        l.setSelectedIndex(0);
        p.add(l);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

}
