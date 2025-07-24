package DSA.day1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        gcd();
    }

    static void gcd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        // int n = Math.min(a, b);
        // int n = min(a, b);

        // while(n!=0){
        //     if(a%n==0 && b%n==0){
        //         break;
        //     }
        //     n--;
        // }
        // System.out.println("Greatest common divisor is : "+n);


        while(b!=0){
            int c = a ;
            a=b;
            b=c%b;
        }
        System.out.println(a);
        
    }
    static int min(int a , int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }
}
