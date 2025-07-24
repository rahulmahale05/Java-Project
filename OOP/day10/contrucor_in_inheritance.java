package day10;

import java.util.Scanner;

class base1 {
    base1(){
        System.out.println("I am a contructor");
    }
    base1(int x){
        System.out.println("I am a contructor "+x);
    }

}

class derived1 extends base1 {
    derived1(){
        System.out.println("I am a contructor of derived class");
    }
    derived1(int x , int y){
        super(x);
        System.out.println("I am a contructor of derived class "+y);
    }

}

class derived2 extends derived1 {
    derived2(){
        System.out.println("I am a contructor of derived class");
    }
    derived2(int x , int y , int z){
        super(x,y);
        System.out.println("I am a contructor of derived class "+z);
    }

}

public class contrucor_in_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // derived1 d = new derived1(12,13);
        derived2 d = new derived2(12,13,14);
        derived2 e = new derived2();
    }
    
}
