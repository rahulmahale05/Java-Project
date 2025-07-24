package AdvancedJava.day3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tabbedpane extends JFrame {
    JTabbedPane tabbedPane ;
    JPanel tab1;
    JPanel tab2;
    JLabel l;
    tabbedpane(){
        setTitle("Rahul");
        setLayout(null);
        setSize(400,400);
        tabbedPane = new JTabbedPane();
        tab1 = new JPanel();
        tab2 = new JPanel();
        tabbedPane.setBounds(50,50,300,300);
        tabbedPane.addTab("First", tab1);
        tabbedPane.addTab("second", tab2);
        l = new JLabel("Hello World");
        tab1.add(l);
        tab2.add(l);
        add(tabbedPane);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new tabbedpane();
    }
}
