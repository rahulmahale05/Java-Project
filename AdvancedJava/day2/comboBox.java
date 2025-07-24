package AdvancedJava.day2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox extends JFrame {
    JComboBox<String> c1;
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1;

    comboBox() {
        setTitle("ComboBox Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Absolute positioning

        // Create combo box with operations
        String Operations[] = {"Add", "Subtract", "Multiply", "Divide"};
        c1 = new JComboBox<>(Operations);
        c1.setBounds(10, 10, 150, 30); // Position the combo box

        // Initialize text fields and labels
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false); // Total sum should not be editable

        l1 = new JLabel("First No: ");
        l2 = new JLabel("Second No: ");
        l3 = new JLabel("Result: ");
        b1 = new JButton("Calculate");

        // Set bounds for labels and text fields
        l1.setBounds(10, 50, 100, 30);
        t1.setBounds(120, 50, 150, 30);
        l2.setBounds(10, 90, 100, 30);
        t2.setBounds(120, 90, 150, 30);
        l3.setBounds(10, 130, 100, 30);
        t3.setBounds(120, 130, 150, 30);
        b1.setBounds(10, 170, 100, 30);

        // Add components to the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(c1);

        // ActionListener for the "Calculate" button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(t1.getText());
                    double n2 = Double.parseDouble(t2.getText());
                    String operation = c1.getSelectedItem().toString(); // Get the selected operation

                    double result = 0;
                    switch (operation) {
                        case "Add":
                            result = n1 + n2;
                            break;
                        case "Subtract":
                            result = n1 - n2;
                            break;
                        case "Multiply":
                            result = n1 * n2;
                            break;
                        case "Divide":
                            if (n2 != 0) {
                                result = n1 / n2;
                            } else {
                                t3.setText("Cannot divide by zero");
                                return;
                            }
                            break;
                    }
                    t3.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    t3.setText("Invalid Input");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new comboBox();
    }
}
