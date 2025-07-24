package day13;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I an a thread 1");
    }
    public void ab(){
        System.out.println("Rahul");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I an a thread 2");
    }
}


public class runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread t1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread t2 = new Thread(bullet2);
        t1.start();
        t2.start();
        
    }
    
}
