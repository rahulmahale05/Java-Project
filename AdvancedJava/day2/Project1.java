package AdvancedJava.day2;

import javax.swing.*;
import java.awt.*;

public class Project1 extends JFrame {
    JTabbedPane tabbedPane ;
    JPanel tab1 , tab2 , tab3;
    Project1() {
        
        setTitle("TabbedPane Example");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        tab1 = new JPanel();
        tab2 = new JPanel();
        tab3 = new JPanel();

        tab1.add(new Label("This is main page"));
        tab2.add(new Label("This is visit page"));
        tab3.add(new Label("This is help page"));
        
        tabbedPane.addTab("Main", tab1);
        tabbedPane.addTab("Visit", tab2);
        tabbedPane.addTab("Help", tab3);

        add(tabbedPane);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Project1();
    }
}
