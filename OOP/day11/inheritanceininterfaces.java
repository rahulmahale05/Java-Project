package day11;

import java.util.Scanner;


interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class sample implements childSampleInterface{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
    public void meth3(){
        System.out.println("method 3");
    }
    public void meth4(){
        System.out.println("method 4");
    }
}
public class inheritanceininterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sample s = new sample();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
    
}
