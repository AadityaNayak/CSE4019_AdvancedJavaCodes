package GUI;
import java.awt.*;

// By extending Frame
public class AWTSample_1 extends Frame {
    AWTSample_1(){
        Button b = new Button("Click");
        b.setBounds(30, 100, 70, 40);
        add(b);
        setSize(300, 300);
        setTitle("AWT");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AWTSample_1 frame = new AWTSample_1();
    }
}
