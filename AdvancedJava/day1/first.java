package AdvancedJava.day1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class first extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b;

    first() {
        // Set the layout
        setLayout(new FlowLayout());

        // Create components
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        l1 = new JLabel("First no: ");
        l2 = new JLabel("Second no: ");
        l3 = new JLabel("Total Sum: ");
        b = new JButton("ADD");

        // Add components to frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);

        // Add action listener
        b.addActionListener(this);

        // Set JFrame properties
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                t3.setText("" + (n1 + n2));
            } catch (NumberFormatException ex) {
                t3.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new first();
    }
}
