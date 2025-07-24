package day11;

import java.util.Scanner;

interface bicycle{
    void applybrake(int decreament);
    void speedup(int increament);
}

class avoncycle implements bicycle{
    int speed = 7;
    public void applybrake(int decreament){
        speed = speed-decreament;
        System.out.println(speed);
    }
   public void speedup(int increament){
        speed = speed+increament;
        System.out.println(speed);
    }
   public void speedup1(int increament){
        speed = speed+increament;
        System.out.println(speed);
    }
}

public class interface1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    avoncycle a = new avoncycle();
    a.applybrake(5);
    a.speedup(7);
    a.speedup1(7);
   }
}
