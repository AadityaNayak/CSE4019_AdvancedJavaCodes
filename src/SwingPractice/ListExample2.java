package SwingPractice;

import javax.swing.event.*;

import javax.swing.*;

class ListExample2 extends JFrame implements ListSelectionListener {


    static JFrame f;


    static JList b, b1, b2;


    static JLabel l1;


    public static void main(String[] args) {
        //create a new frame
        f = new JFrame("frame");

        //create a object
        ListExample2 s = new ListExample2();


        JPanel p = new JPanel();


        JLabel l = new JLabel("select your birthday");
        l1 = new JLabel();


        String month[] = {"January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        String date[] = new String[31], year[] = new String[31];

        for (int i = 0; i < 31; i++) {
            date[i] = "" + (int) (i + 1);
            year[i] = "" + (int) (2018 - i);
        }

        b = new JList(date);
        b1 = new JList(month);
        b2 = new JList(year);

        b.setSelectedIndex(2);
        b1.setSelectedIndex(1);
        b2.setSelectedIndex(2);

        l1.setText(b.getSelectedValue() + " " + b1.getSelectedValue()
                + " " + b2.getSelectedValue());

        b.addListSelectionListener(s);
        b1.addListSelectionListener(s);
        b2.addListSelectionListener(s);

        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l1);

        f.add(p);

        f.setSize(500, 600);

        f.show();
    }

    public void valueChanged(ListSelectionEvent e) {
        l1.setText(b.getSelectedValue() + " " + b1.getSelectedValue()
                + " " + b2.getSelectedValue());

    }


}