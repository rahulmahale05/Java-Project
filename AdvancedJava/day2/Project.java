package AdvancedJava.day2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Project extends JFrame {
    JTextField t1, t2, t3, t4, t5, jtf;
    JLabel l1, l2, l3, l4, l5;
    JButton b1, b2;
    JTabbedPane tabbedPane;
    JPanel tab1, tab2;
    JCheckBox c1, c2;

    Project() {
        // Set JFrame properties
        setTitle("JTabbedPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Using default layout for proper component placement

        // Initialize JTabbedPane
        tabbedPane = new JTabbedPane();

        // Create tabs
        tab1 = new JPanel();
        tab2 = new JPanel();

        // Set layout for tab1
        tab1.setLayout(new BoxLayout(tab1, BoxLayout.Y_AXIS));
        tab2.setLayout(new BoxLayout(tab2, BoxLayout.Y_AXIS));

        // Initialize components
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false); // Sum field should not be editable

        l1 = new JLabel("First No: ");
        l2 = new JLabel("Second No: ");
        l3 = new JLabel("Total Sum: ");
        b1 = new JButton("Add");

        // Add components to tab1
        tab1.add(l1);
        tab1.add(t1);
        tab1.add(l2);
        tab1.add(t2);
        tab1.add(l3);
        tab1.add(t3);
        tab1.add(b1);

        // Add button action listener for addition
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());
                    t3.setText("" + (n1 + n2));
                } catch (NumberFormatException ex) {
                    t3.setText("Invalid Input");
                }
            }
        });

        // Factorial tab setup
        t4 = new JTextField(10);
        t5 = new JTextField(10);
        t5.setEditable(false); // Sum field should not be editable

        l4 = new JLabel("Enter Number: ");
        l5 = new JLabel("Factorial is: ");
        b2 = new JButton("Calculate Factorial");

        // Add action listener for factorial calculation
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(t4.getText());
                    int fact = 1;
                    for (int i = 1; i <= n1; i++) {
                        fact *= i;
                    }
                    t5.setText("" + fact);
                } catch (NumberFormatException ex) {
                    t5.setText("Invalid Input");
                }
            }
        });

        tab2.add(l4);
        tab2.add(t4);
        tab2.add(l5);
        tab2.add(t5);
        tab2.add(b2);

        // Create JCheckBox components
        c1 = new JCheckBox("Pune");
        c2 = new JCheckBox("Mumbai");
        jtf = new JTextField(20);
        jtf.setEditable(false); // To show the selected city

        // Add item listeners for checkboxes
        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                boolean a = false;
                if (c1.isSelected()) a=!a;
                if(a) jtf.setText("Pune");
                else jtf.setText("");
            }
        });

        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                boolean a = false;
                if (c2.isSelected()) a=!a;
                if(a) jtf.setText("Mumbai");
                else jtf.setText("");
            }
        });

        // Add components to tab2 (city selector)
        tab2.add(c1);
        tab2.add(c2);
        tab2.add(jtf);

        // Add tabs to tabbedPane
        tabbedPane.addTab("Addition", tab1);
        tabbedPane.addTab("Factorial & City Selector", tab2);

        // Add tabbedPane to frame
        tabbedPane.setBounds(20, 20, 350, 200);
        add(tabbedPane);

        // Make frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new Project();
    }
}
