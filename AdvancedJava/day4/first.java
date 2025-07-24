package AdvancedJava.day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class first extends JFrame implements ActionListener{
    JButton click ;
    JTextField t ;
    Boolean a = false; 
    first(){
        setLayout(new FlowLayout());
        setSize(300,400);
        JLabel l = new JLabel("Rahul Mahale");
        add(l);
        t = new JTextField("Write");
        add(t);
        click = new JButton("Click");
        add(click);
        click.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){ 
        if(e.getSource() == click){
            a=!a;
            if(a){
                t.setText("Ok");
            }else{
                t.setText("Sorry");
            }
        }
    }
    public static void main(String[] args) {
        new first();
    }
}
