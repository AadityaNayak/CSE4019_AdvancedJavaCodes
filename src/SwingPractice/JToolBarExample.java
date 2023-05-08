package SwingPractice;
import javax.swing.*;

public class JToolBarExample extends JFrame{

    JToolBarExample(){
        JToolBar jt = new JToolBar();
        JButton b = new JButton("Button");
        String []languages = {"Op1", "Op2", "Op3", "Op4", "Op5"};
        JComboBox cb = new JComboBox(languages);

        jt.add(b);
        jt.addSeparator();
        jt.add(cb);
        b.setSize(50, 50);
        cb.setSize(100, 50);
        jt.setBounds(10, 10, 200, 50);
        add(jt);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JToolBarExample();
    }
}
