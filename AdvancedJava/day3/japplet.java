package AdvancedJava.day3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class japplet extends JFrame implements ActionListener{
    JButton a;
    JButton b;
    JLabel l;
    japplet(){
        a = new JButton("a");
        b = new JButton("b");
        l = new JLabel("Press any button");
        setLayout(new FlowLayout());
        setSize(300,300);
        add(a);
        add(b);
        add(l);
        b.addActionListener(this);
        a.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == a){
                l.setText("a is press");
            }
            if(e.getSource() == b){
                l.setText("b is press");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new japplet();
    }
}
