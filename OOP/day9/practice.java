package day9;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cylinder c = new cylinder();
        cylinder a = new cylinder(12,5);
        // c.getradius(5);
        // System.out.println(c.setradius());
        // c.getheight(12);
        // System.out.println(c.setheight());
        System.out.println(c.area());
        System.out.println(c.volume());
        System.out.println();
        System.out.println(a.area());
        System.out.println(a.volume());

    }
    
}



class cylinder {
    int radius;
    int height;
    // public void getradius(int r){
    //     radius = r;
    // }
    // public int setradius(){
    //     return radius;
    // }
    // public void getheight(int h){
    //     height = h;
    // }
    // public int setheight(){
    //     return height;
    // }


    //using constructor 

    public cylinder(){
        radius = 5;
        height = 12;
    }



    public cylinder(int r , int h){
        radius = r;
        height = h;
    }


    public double area(){
        double a = (2*3.14*radius*height);
        return a;
    }
    public double volume(){
        double b = (2*3.14*radius*radius*height);
        return b;
    }
}