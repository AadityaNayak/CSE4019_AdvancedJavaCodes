package SwingPractice;
import javax.swing.*;
public class TableExample {
    JFrame f = new JFrame("Emp Records");
    JTable t;
    TableExample(){
        String[] ColName={"eid","ename","dept"};
        String[][] data={{"501","Aman","CSE"},
                {"502","Raman","IT"}};

        t=new JTable(data,ColName);
        t.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(500,200);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new TableExample();
    }
}
