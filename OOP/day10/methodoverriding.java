package day10;

import java.util.Scanner;

class A{
    public int Rahul(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public int Rahul(){
        return 8;
    }
    public void meth3(){
        System.out.println("I am method 3 of class b");
    }
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}


public class methodoverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       B b = new B();
       b.meth2();
       System.out.println(b.Rahul());

       A a = new A();
       a.meth2();
       
    }
}
