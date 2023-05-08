package SwingPractice.Menu;

import javax.swing.*;
import java.awt.*;

public class MenuExample2 {

    ImageIcon icon1 = new ImageIcon("image.jpg");

    MenuExample2() {

        JFrame f = new JFrame("JMENU");
        f.setLayout(new GridLayout(5, 1));
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);

        JMenu menufile = new JMenu("File");
        JMenu menuView = new JMenu("View");
        JMenu menuIcon = new JMenu("Icon");
        mb.add(menufile);
        mb.add(menuView);
        mb.add(menuIcon);

        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");

        menufile.add(itemNew);
        menufile.add(itemOpen);
        menufile.add(itemSave);
        menufile.add(itemExit);

        JMenuItem copy = new JMenuItem("copy");
        JMenuItem cut = new JMenuItem("cut");
        JMenuItem paste = new JMenuItem("paste");

        menuView.add(cut);
        menuView.add(copy);
        menuView.add(paste);

        //Icon adding is left.
        JMenuItem image = new JMenuItem(new ImageIcon("image.jpg"));
        menuIcon.add(image);

        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MenuExample2();
    }
}
