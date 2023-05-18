package SwingPractice;

import com.sun.source.tree.Tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample extends JFrame {
    JTree tree;

    public TreeExample(){

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode left = new DefaultMutableTreeNode("Left");
        DefaultMutableTreeNode right = new DefaultMutableTreeNode("Right");
        DefaultMutableTreeNode item1 = new DefaultMutableTreeNode("item1");
        DefaultMutableTreeNode item2 = new DefaultMutableTreeNode("item2");
        DefaultMutableTreeNode item3 = new DefaultMutableTreeNode("item3");
        DefaultMutableTreeNode item4 = new DefaultMutableTreeNode("item4");
        DefaultMutableTreeNode item5 = new DefaultMutableTreeNode("item5");
        DefaultMutableTreeNode item6 = new DefaultMutableTreeNode("item6");

        left.add(item1);
        left.add(item2);
        left.add(item3);

        right.add(item4);
        right.add(item5);
        right.add(item6);

        root.add(left);
        root.add(right);
        tree = new JTree(root);
        add(tree);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}
