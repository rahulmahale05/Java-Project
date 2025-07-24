package DSA.day1;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
    
        // last();
        decide();
    }

    static void last(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last no : ");
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        while (z<=n) {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }

    static void decide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to print : ");
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        int a = 0;
        while (a<n) {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
            a++;
        }
    }
}

