package day10;

import java.util.Scanner;

class Phone {
    public void name(){
        System.out.println("My name is java ");
    }
    public void greet(){
        System.out.println("Good morning ");
    }
}
class Smartphone extends Phone {
    public void name(){
        System.out.println("My name is java 1 ");
        super.name();
    }
    public void swagat(){
        System.out.println("Apaka swagat hai ");
    }
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Phone obj = new Phone();
        // obj.name();
        // Smartphone spobj = new Smartphone();

        // Smartphone n = new Phone();  //not allowed

        Phone obj = new Smartphone();   //Allowed
        obj.name();
        obj.greet();

        // obj.swagat();  not allowed

    }
}
