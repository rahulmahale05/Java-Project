package practice;

import java.util.Scanner;
import java.lang.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        // armstrong(n);
        for(int i=0;i<=n;i++){
            armstrong1(i);
        }

    }

    static void armstrong1 (int a){
        int num = 0;
        int n = a;
        while(n>0){
            n=n/10;
            num++;
        }
        // System.out.println(num);
        int i=1 ;
        int b;
        n = a;
        int sum =0;
        while(i<=num){
            b = n % 10 ;
            sum += Math.pow(b,num);
            n = n/10;
            i++;
        }
        if(a==sum)
            System.out.println(sum);
        else
            System.out.print("");
    }
}
