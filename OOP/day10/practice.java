package day10;

import java.util.Scanner;


class Rectangle{
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    public void getinput(){
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void area (){
        System.out.println("Area of the rectangle is :"+ a*b);
    }
}

class cuboid extends Rectangle{
    int c=12;
    public void volume (){
        System.out.println("volume of the cuboid is :"+ a*b*c);
    }

}
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cuboid r = new cuboid();
        r.getinput();
        r.area();
        r.volume();

    }
    
}
