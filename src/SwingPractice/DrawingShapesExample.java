package SwingPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class DrawingShapesExample extends JFrame {

    private JPanel circlePanel;
    private JPanel waveformPanel;
    private JPanel buttonsPanel;
    private JButton enableButton;
    private JButton disableButton;

    public DrawingShapesExample() {
        setTitle("Drawing Shapes Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the circle panel
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.BLUE);
                g2d.fill(new Ellipse2D.Double(50, 50, 100, 100));
            }
        };
        circlePanel.setPreferredSize(new Dimension(200, 200));

        // Create the waveform panel
        waveformPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                int x = 0;
                int y = getHeight() / 2;
                for (int i = 0; i < getWidth(); i++) {
                    int amplitude = (int) (Math.sin(i * 0.05) * 40);
                    g.drawLine(x, y + amplitude, x, y - amplitude);
                    x++;
                }
            }
        };
        waveformPanel.setPreferredSize(new Dimension(200, 100));

        // Create the enable and disable buttons
        enableButton = new JButton("Enable");
        disableButton = new JButton("Disable");

        enableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circlePanel.setVisible(true);
                waveformPanel.setVisible(true);
            }
        });

        disableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circlePanel.setVisible(false);
                waveformPanel.setVisible(false);
            }
        });

        buttonsPanel = new JPanel();
        buttonsPanel.add(enableButton);
        buttonsPanel.add(disableButton);

        add(circlePanel, BorderLayout.WEST);
        add(waveformPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawingShapesExample::new);
    }
}
