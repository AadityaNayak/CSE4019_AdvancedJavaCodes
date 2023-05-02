package GUI;
import javax.swing.*;
import java.awt.*;

public class SwingSample_3 extends JFrame {
    JLabel message;
    JLabel nameLabel, genderLabel;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    JLabel mailIdLabel, mobileNoLabel;
    JTextField mailIdField, mobileNoField;
    JLabel passwordLabel, rePasswordLabel;
    JPasswordField passwordField, rePasswordField;
    JLabel programLabel;
    JComboBox<String> programList;
    JLabel branchLabel;
    JComboBox<String> branchList;
    JButton registerButton;
    Container container;
    SwingSample_3() {
        message = new JLabel("Register a new Student");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        nameLabel = new JLabel("Name");
        nameField = new JTextField();
        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        mailIdLabel = new JLabel("Mail Id");
        mailIdField = new JTextField();
        mobileNoLabel = new JLabel("Mobile No");
        mobileNoField = new JTextField();
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
        rePasswordLabel = new JLabel("Re Password");
        rePasswordField = new JPasswordField();
        programLabel = new JLabel("Courses");
        programList = new JComboBox<String>();
        programList.addItem("ME/M Tect");
        programList.addItem("BE/B Tect");
        programList.addItem("Diploma");
        branchLabel = new JLabel("Branch");
        branchList = new JComboBox<String>();
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Telecommunications");
        branchList.addItem("Information Technology");
        branchList.addItem("Electrical Engineering");
        branchList.addItem("Electrical and Electronics Engineering");
        branchList.addItem("Civil Engineering");
        registerButton = new JButton("Register");
        container = getContentPane();
        container.setLayout(null);
        setBounds();
        addComponents();
    }
    public void setBounds() {
        message.setBounds(50, 10, 600, 30);
        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);
        genderLabel.setBounds(50, 100, 100, 30);
        genderMale.setBounds(130, 100, 100, 30);
        genderFemale.setBounds(240, 100, 100, 30);
        mailIdLabel.setBounds(50, 180, 100, 30);
        mailIdField.setBounds(130, 180, 200, 30);
        mobileNoLabel.setBounds(50, 230, 100, 30);
        mobileNoField.setBounds(130, 230, 200, 30);
        passwordLabel.setBounds(50, 280, 100, 30);
        passwordField.setBounds(130, 280, 200, 30);
        rePasswordLabel.setBounds(50, 330, 100, 30);
        rePasswordField.setBounds(130, 330, 200, 30);
        programLabel.setBounds(50, 380, 100, 30);
        programList.setBounds(130, 380, 200, 30);
        branchLabel.setBounds(50, 430, 100, 30);
        branchList.setBounds(130, 430, 200, 30);
        registerButton.setBounds(130, 480, 200, 30);
    }
    public void addComponents() {
        container.add(message);
        container.add(nameLabel);
        container.add(nameField);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(mailIdLabel);
        container.add(mailIdField);
        container.add(mobileNoLabel);
        container.add(mobileNoField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(rePasswordLabel);
        container.add(rePasswordField);
        container.add(programLabel);
        container.add(programList);
        container.add(branchLabel);
        container.add(branchList);
        container.add(registerButton);
    }
    public static void main(String[] args) {
        SwingSample_3 frame = new SwingSample_3();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }
}
