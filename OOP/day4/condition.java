package day4;
import java.util.*;

public class condition {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18){
            System.out.println("yes boy you can drive");
        }
        else
            System.out.println("no boy you can not drive");

            if (age > 18 && age ==18){
                System.out.println("yes boy you can drive");
            }
            else
                System.out.println("no boy you can not drive");

                if (age > 18 || age ==18){
                    System.out.println("yes boy you can drive");
                }
                else
                    System.out.println("no boy you can not drive");



        if (age > 40){
            System.out.println("you are experienced");
        }
        else if (age >25)
            System.out.println("you are semi-experienced");
        else if (age >= 18)
            System.out.println("yes boy you can drive");
        else
            System.out.println("no boy you can not drive");
    }
}
