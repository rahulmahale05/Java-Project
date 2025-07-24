package day13;

class a1 extends Thread{
    public void run(){
    while(true)   {
            System.out.println("Good Morning"+this.getPriority()+this.getState());
            
    // try{
    //     Thread.sleep(200);
    // }
    // catch(InterruptedException e){
    //     e.printStackTrace();
    //     }
        }
    }
}
class a2 extends Thread{
    public void run(){
     while(true)   {
            System.out.println("Welcome"+this.getPriority()+this.getState());
        }
    }
}

public class exercise {
    public static void main(String[] args) {
    a1 t1 = new a1();
    System.out.println(t1.getState());
    System.out.println(Thread.currentThread().getState());
    a2 t2 = new a2();
    t2.setPriority(Thread.MAX_PRIORITY);
    System.out.println(t2.getPriority());
    // t1.start();
    // t2.start();
    }
}
