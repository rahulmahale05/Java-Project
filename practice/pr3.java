package practice;

public class pr3 {
    public static void main(String[] args) {
        // Thread1 a = new Thread1();
        // Thread2 b = new Thread2();
        // b.start();
        // a.start();



        // Runnable

        thread1 bullet1 = new thread1();
        thread2 bullet2 = new thread2();

        Thread t1 = new Thread(bullet1);
        Thread t2 = new Thread(bullet2);

        t1.start();
        t2.start();
    }
}

class thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 200; i > 100; i--) {
            System.out.println(i);
        }
    }
}
class thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}



// class Thread1 extends Thread{
//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
//         super.run();
//         System.out.println("I am run");
//         for (int i = 200; i > 100; i--) {
//             System.out.println(i);
//         }
//     }
// }
// class Thread2 extends Thread{
//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
//         super.run();
//         System.out.println("I am run");
//         for (int i = 0; i < 100; i++) {
//                 System.out.println(i);
//             }
//     }
// }
