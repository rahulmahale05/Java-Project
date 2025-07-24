package AdvancedJava.day2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class swing{
    JFrame jf;
    swing(){
        jf = new JFrame("JTree Example");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child = new DefaultMutableTreeNode("child");
        root.add(child);
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("child1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("child2");
        child.add(child1);
        child.add(child2);
        JTree jt = new JTree(root);
        jf.add(jt);
        jf.setSize(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new swing();
    }
}
