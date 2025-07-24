package day13;

class My1 extends Thread{
    public void run(){
        while(true){
        System.out.println("My Thread");
        try{
            Thread.sleep(455);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
class My2 extends Thread{
    public void run(){
        while(true){
        System.out.println("Thread 2");
        }
    }
}
public class Threadmethod {
   public static void main(String[] args) {
    My1 a1 = new My1();
    My2 a2 = new My2();
    a1.start();
    // try{
    //     a1.join();
    // }
    // catch(Exception e){
    //     System.out.println(e);
    // }
    a2.start();
   } 
}
