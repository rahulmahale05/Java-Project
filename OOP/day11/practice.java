package day11;

import java.util.Scanner;

// abstract class pen {
//     void write(){
//         System.out.println("Pen is Trimax.");
//     }
//     abstract void refill();
// }

// class fountainPen extends pen{
//     void refill(){
//         System.out.println("Refill is gel");
//     }
//     void changenip(){
//         System.out.println("Change the pen nip ");
//     }
// }



// class Monkey {
//     void jump(){
//         System.out.println("Jump on the trees");
//     }
//     void bite(){
//         System.out.println("Bite the banana");
//     }
// }
// interface Basicanimal{
//     void eat();
//     void step();
// }
// class Human extends Monkey implements Basicanimal{
//     public void eat(){
//         System.out.println("Eating.....");
//     }
//     public void step(){
//         System.out.println("Step one by one ");
//     }
// }



// abstract class Telephone{
//     void ring(){
//         System.out.println("Ringing mobile ....");
//     }
//     void lift(){
//         System.out.println("lift the mobile");
//     }
//     abstract void disconnect();
// }

// class Smartphone extends Telephone{
//     void music(){
//         System.out.println("Playing music");
//     }
//     void disconnect(){
//         System.out.println("disconnecting Mobile .....");
//     }
// }


interface TVremote {
    void on();
}
interface SmartTvremote extends TVremote{
    void off();
}
class remote implements SmartTvremote{
    @Override
    public void on(){
        System.out.println("On tv");
    }
    @Override
    public void off(){
        System.out.println("off tv");
    }
}
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // fountainPen c = new fountainPen();
        // c.write();
        // c.refill();
        // c.changenip();

        // Human h = new Human();
        // h.jump();
        // h.bite();
        // h.eat();
        // h.step();

        // Monkey m = new Human();
        // m.jump();
        // m.bite();
        // m.eat();       //not allowed
        // m.step();

        // Telephone t = new Smartphone();
        // t.ring();
        // t.lift();
        // t.disconnect();
        // t.music();        //not allowed


        remote r = new remote();
        r.on();
        r.off();
    }
    
}
