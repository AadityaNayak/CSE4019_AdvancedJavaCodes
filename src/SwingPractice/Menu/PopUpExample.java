package SwingPractice.Menu;

import javax.swing.*;

public class PopUpExample extends JFrame{
    JPopupMenu pm = new JPopupMenu();

    public PopUpExample(){
        pm.add(new JMenuItem("cut"));
        pm.addSeparator();
        pm.add(new JMenuItem("copy"));
        pm.addSeparator();
        pm.add(new JMenuItem("paste"));

        add(pm);
        setTitle("Pop Up Demo");
        setSize(300,300);
        setVisible(true);
        pm.show(this, 100, 105);
    }

    public static void main(String[] args) {
        new PopUpExample();
    }
}
