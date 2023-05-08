package SwingPractice.Menu;
import java.awt.*;
import javax.swing.*;

public class MenuExample1 {

    MenuExample1(){
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(5,1));
        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);
        Menu menuFile = new Menu("File");
        mb.add(menuFile);

        MenuItem itemNew = new Menu("New");
        MenuItem itemOpen = new Menu("Open");
        MenuItem itemSave = new Menu("Save");
        MenuItem itemExit = new Menu("Exit");

        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemExit);

        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuExample1();
    }
}
