package AdvancedJava.day2;

import javax.swing.*;
import java.awt.*;

class TabbedPaneExample  {
    JFrame frame;

    TabbedPaneExample() {
        // Create a JFrame
        frame = new JFrame("JTabbedPane Example");

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels for Tabs
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is Tab 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is Tab 2"));

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("This is Tab 3"));

        // Add Tabs with Titles
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add JTabbedPane to Frame
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Set JFrame properties
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
