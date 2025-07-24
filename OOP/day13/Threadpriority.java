package day13;

class Myt extends Thread{
    public Myt(String name){
        super(name);
    }
    public void run(){
        System.out.println("My name is "+ this.getName());
    }
}

public class Threadpriority {
    public static void main(String[] args) {
        //ready queue = t1 t2

    Myt t1 = new Myt("Rahul1");
    Myt t2 = new Myt("Rahul2");
    Myt t3 = new Myt("Rahul3 (most Important)");
    Myt t4 = new Myt("Rahul4");
    Myt t5 = new Myt("Rahul5");
    t3.setPriority(Thread.MAX_PRIORITY);
    t4.setPriority(Thread.NORM_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    System.out.println(t3.getPriority());

    }
}
