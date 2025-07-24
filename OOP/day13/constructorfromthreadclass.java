package day13;


class My extends Thread{
    public My (String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<100) {
            System.out.println("I am a thread");
            i++;
        }
    }
}

public class constructorfromthreadclass {
    public static void main(String[] args) {
    My a = new My("Rahul");
    a.start();
    System.out.println("The id of the thread a is "+a.getId());
    System.out.println("The name of the thread a is "+a.getName());
    }
}
