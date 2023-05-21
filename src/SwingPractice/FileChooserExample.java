package SwingPractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooserExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Open File");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Selected file: " + fileChooser.getSelectedFile().getAbsolutePath());
                }
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
