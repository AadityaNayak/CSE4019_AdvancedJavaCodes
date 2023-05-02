package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OhmCalculatorSwing extends JFrame implements ActionListener {
    private JLabel voltageLabel;
    private JLabel resistanceLabel;
    private JLabel currentLabel;
    private JTextField voltageField;
    private JTextField resistanceField;
    private JTextField currentField;
    private JButton calculateButton;

    public OhmCalculatorSwing() {
        super("Ohm's Law Calculator");
        setLayout(new GridLayout(4, 2, 10, 10));

        voltageLabel = new JLabel("Enter voltage (in volts):");
        add(voltageLabel);

        voltageField = new JTextField(10);
        add(voltageField);

        resistanceLabel = new JLabel("Enter resistance (in ohms):");
        add(resistanceLabel);

        resistanceField = new JTextField(10);
        add(resistanceField);

        currentLabel = new JLabel("Calculated current (in amperes):");
        add(currentLabel);

        currentField = new JTextField(10);
        currentField.setEditable(false);
        add(currentField);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String voltageText = voltageField.getText().trim();
        String resistanceText = resistanceField.getText().trim();
        String currentText = currentField.getText().trim();

        double voltage = 0;
        double resistance = 0;
        double current = 0;

        boolean voltageProvided = !voltageText.isEmpty();
        boolean resistanceProvided = !resistanceText.isEmpty();
        boolean currentProvided = !currentText.isEmpty();

        if (voltageProvided) {
            voltage = Double.parseDouble(voltageText);
        }

        if (resistanceProvided) {
            resistance = Double.parseDouble(resistanceText);
        }

        if (currentProvided) {
            current = Double.parseDouble(currentText);
        }

        if (voltageProvided && resistanceProvided && currentProvided) {
// All three values provided
            boolean isValid = (current == voltage / resistance);

            if (isValid) {
                getContentPane().setBackground(Color.GREEN);
            } else {
                getContentPane().setBackground(Color.RED);
            }

        } else if (voltageProvided && resistanceProvided) {
// Calculate current
            current = voltage / resistance;
            currentField.setText(String.format("%.2f", current));

        } else if (voltageProvided && currentProvided) {
// Calculate resistance
            resistance = voltage / current;
            resistanceField.setText(String.format("%.2f", resistance));

        } else if (resistanceProvided && currentProvided) {
// Calculate voltage
            voltage = resistance * current;
            voltageField.setText(String.format("%.2f", voltage));

        } else {
// Not enough input
            JOptionPane.showMessageDialog(this, "Please provide two values to calculate the third.");
        }
    }

    public static void main(String[] args) {
        OhmCalculatorSwing calculator = new OhmCalculatorSwing();
    }
}
