package DSA.day1;

import java.util.Scanner;


public class function {
    public static void main(String[] args) {
        // System.out.println("Rahul");

        // rahul(12);
        // //if we use static keyword then there is no need to create object of class

        // function f = new function();
        // f.ram();

        // Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();
        // System.out.println(factorial(a));


        number();
    }

    // public static void rahul(int a){
    //     System.out.println(a);
    // }
    // void ram(){
    //     System.out.println("invoked using class object");
    // }

    // static int factorial(int n){
    //     int fact=1;
    //     for(int i =n;i>0;i--){
    //         fact*=i;
    //     }
    //     return fact;
    // }


    //unlimited number

    static void number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to enter :");
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number : ");
            int a = sc.nextInt();
            if(a==0){
                zero++;
            }
            else if(a%2==0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Count of positive number is : "+pos);
        System.out.println("Count of negative number is : "+neg);
        System.out.println("Count of zero number is : "+zero);
    }
}
