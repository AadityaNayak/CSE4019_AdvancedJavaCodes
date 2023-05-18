package SwingPractice;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class CustomDesktopPaneExample extends JFrame {

    public CustomDesktopPaneExample() {
        CustomDesktopPane desktopPane = new CustomDesktopPane();
        Container contentPane = getContentPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);
        desktopPane.display(desktopPane);

        setTitle("JDesktopPane Example");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        new CustomDesktopPaneExample();
    }
}

class CustomDesktopPane extends JDesktopPane {
    int numFrames = 3, x = 40, y = 40;

    public void display(CustomDesktopPane dp) {
        for (int i = 0; i < numFrames; ++i) {
            JInternalFrame jframe = new JInternalFrame("Internal Frame " + i, true, true, true, true);

            jframe.setBounds(x, y, 250, 60);
            Container c1 = jframe.getContentPane();
            c1.add(new JLabel("Welcome"));
            dp.add(jframe);
            jframe.setVisible(true);
            y += 85;
        }
    }
}
