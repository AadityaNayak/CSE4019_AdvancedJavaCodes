package SwingPractice;

import javax.swing.*;

public class TabbedPanelExample extends JFrame {

    TabbedPanelExample(){
        JTextArea ta1 = new JTextArea();
        JPanel p1 = new JPanel();

        p1.add(ta1);

        JTextArea ta2 = new JTextArea();
        JPanel p2 = new JPanel();

        p2.add(ta2);

        JTextArea ta3 = new JTextArea();
        JPanel p3 = new JPanel();

        p3.add(ta3);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("Home", p1);
        tp.add("Contacts", p2);
        tp.add("Result", p3);

        add(tp);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPanelExample();
    }

}
