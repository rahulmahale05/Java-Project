package day11;

import java.util.Scanner;

abstract class base{
    public base(){
        System.out.println("Mai base ka constructor hoon");
    }
    public void satellite(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child extends base{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

abstract class child2 extends base{
    public void tn(){
        System.out.println("I am good");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        child c = new child();
        c.greet();
        c.satellite();
        


    }
}
