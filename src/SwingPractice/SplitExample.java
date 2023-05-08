package SwingPractice;
import javax.swing.*;

public class SplitExample extends JFrame{

    static JTextArea t1, t2;

    public static void main(String[] args) {
        SplitExample s = new SplitExample();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        t1 = new JTextArea(10,10);
        t2 = new JTextArea(10,10);

        t1.setText("First Area");
        t2.setText("Second Area");

        p1.add(t1);
        p2.add(t2);

        JSplitPane sp = new JSplitPane(SwingConstants.HORIZONTAL, p1, p2);

        s.add(sp);
        s.setSize(300, 300);
        s.setVisible(true);
    }
}
