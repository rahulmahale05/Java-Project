package day11;

import java.util.Scanner;


interface Bicycle{
    int b =45;
    void applyBrake();
    void speedup();
}
interface Bicycle1{
    int c =55;
    void Brake();
    void speed();
}

class avoncycle implements Bicycle ,Bicycle1{
    public void applyBrake(){
        System.out.println("Brake "+b);
    }
    public void speedup(){
        System.out.println("speed "+c);
    }
    public void Brake(){
        System.out.println("Brake");
    }
    public void speed(){
        System.out.println("speed");
    }
}

public class abstractvsinterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        avoncycle a = new avoncycle();
        a.speedup();
        a.applyBrake();
        System.out.println(a.b);
        //you can not modify properties in interfaces as they are final
        System.out.println(a.c);
        a.Brake();
        a.speed();
    }
}
