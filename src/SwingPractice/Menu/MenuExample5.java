package SwingPractice.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuExample5 {
    MenuExample5() {
        JFrame f = new JFrame("JMENU");
        f.setLayout(new GridLayout(5, 1));
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);

        JMenu menufile = new JMenu("File");

        mb.add(menufile);

        JMenuItem itemNew = new JMenuItem("New File");
        JMenuItem itemOpen = new JMenuItem("Open");
        JCheckBox opt1 = new JCheckBox("Option 1");
        JCheckBox opt2 = new JCheckBox("Option 2");
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        menufile.add(itemNew);
        menufile.add(itemOpen);
        menufile.add(opt1);
        menufile.add(opt2);
        menufile.add(r1);
        menufile.add(r2);

        //Icon adding is left.

        menufile.setMnemonic(KeyEvent.VK_F);
        menufile.setMnemonic(KeyEvent.VK_F);
        menufile.setMnemonic(KeyEvent.VK_F);

        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuExample5();
    }
}
