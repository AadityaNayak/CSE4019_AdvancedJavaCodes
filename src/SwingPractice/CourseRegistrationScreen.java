package SwingPractice;

import Layouts_Example.Grid_Layout;

import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class CourseRegistrationScreen extends JFrame implements ActionListener {

    JLabel title = new JLabel("Course Registration");
    JLabel email = new JLabel("Email");
    JLabel name = new JLabel("Name");
    JLabel gender = new JLabel("Gender");
    JLabel optedCourse = new JLabel("Course Opted");

    JTextField email_input = new JTextField();
    JTextField name_input = new JTextField();

    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");

    JCheckBox java = new JCheckBox("Java - 3");
    JCheckBox dbms = new JCheckBox("DBMS - 3");
    JCheckBox python = new JCheckBox("Python - 2");
    JCheckBox ML = new JCheckBox("ML - 2");
    JCheckBox CN = new JCheckBox("CN - 3");

    JButton submit = new JButton("Submit");

    CourseRegistrationScreen() {
        title.setFont(new Font("Roboto", Font.BOLD, 20));
        title.setBounds(200, 10, 200, 50);
        email.setBounds(50, 70, 100, 50);
        email_input.setBounds(200, 70, 200, 30);
        name.setBounds(50, 140, 100, 50);
        name_input.setBounds(200, 140, 200, 30);
        gender.setBounds(50, 210, 100, 50);
        male.setBounds(200, 210, 100, 50);
        female.setBounds(400, 210, 100, 50);
        optedCourse.setBounds(50, 280, 100, 50);
        java.setBounds(200, 280, 100, 20);
        dbms.setBounds(200, 310, 100, 20);
        python.setBounds(200, 340, 100, 20);
        ML.setBounds(200, 370, 100, 20);
        CN.setBounds(200, 400, 100, 20);
        submit.setBounds(200, 450, 100, 30);


        submit.addActionListener(this);

        add(title);
        add(email);
        add(email_input);
        add(name);
        add(name_input);
        add(gender);
        add(male);
        add(female);
        add(optedCourse);
        add(java);
        add(dbms);
        add(python);
        add(ML);
        add(CN);
        add(submit);

        setTitle("Course Registration");
        setSize(600, 550);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total_c = 0;
        String msg = "Registration Details: \n\n";

        msg += "Name: " + name_input.getText() + "\n";
        msg += "Email: " + email_input.getText() + "\n";

        if (male.isSelected()) {
            msg += "Gender: Male\n";
        }
        if (female.isSelected()) {
            msg += "Gender: Female\n";
        }
        if (java.isSelected()) {
            msg += "> Course: Java - 3\n";
            total_c += 3;
        }
        if (dbms.isSelected()) {
            msg += "> Course: DBMS - 3\n";
            total_c += 3;
        }
        if (python.isSelected()) {
            msg += "> Course: Python - 2\n";
            total_c += 2;
        }
        if (ML.isSelected()) {
            msg += "> Course: ML - 2\n";
            total_c += 2;
        }
        if (CN.isSelected()) {
            msg += "> Course: CN - 3\n";
            total_c += 3;
        }
        msg += "....................................................................\n";
        JOptionPane.showMessageDialog(this, msg + "Total credits: " + total_c);
    }

    public static void main(String[] args) {
        new CourseRegistrationScreen();
    }
}
