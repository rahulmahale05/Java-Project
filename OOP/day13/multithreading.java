package day13;

import java.util.Scanner;

class MyThread1 extends Thread{
    int i;
    @Override
    public void run(){
        while(i<20){
            System.out.println("My Thread is Running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    int i;
    @Override
    public void run(){
        while(i<20){
            System.out.println("My Thread 2 is Running");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();
        try{
            m1.join();
            m2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
