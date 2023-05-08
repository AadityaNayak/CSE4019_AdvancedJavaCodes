package SwingPractice.Menu;

import javax.swing.*;
import java.awt.*;
public class MenuExample3 {

    MenuExample3(){
        JFrame f = new JFrame("JMENU");
        f.setLayout(new GridLayout(5, 1));
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);

        JMenu menufile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");
        mb.add(menufile);
        mb.add(menuEdit);
        mb.add(menuView);

        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");

        menufile.add(itemNew);
        menufile.add(itemOpen);
        menufile.add(itemSave);

        JRadioButton copy = new JRadioButton("copy");
        JRadioButton cut = new JRadioButton("cut");
        JRadioButton paste = new JRadioButton("paste");

        menuEdit.add(cut);
        menuEdit.add(copy);
        menuEdit.add(paste);

        //Icon adding is left.

        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuExample3();
    }

}
