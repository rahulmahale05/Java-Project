package day10;

import java.util.Scanner;

class base {
    int x;

    public int getx(){
        return x;
    }

    public void setx(int x){
        this.x = x;
    }

    public void printme(){
        System.out.println("I am a constructor");
    }
}

class derived extends base{
    int y;

    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y = y;
    }


}

public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //creating an object of base class 
        base b = new base();
        // derived b = new derived();
        b.setx(6);
        System.out.println(b.getx());

        //creating an object of derived class

        derived d = new derived();
        d.sety(19);
        System.out.println(d.gety());
    }
    
}
