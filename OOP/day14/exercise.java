package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            System.out.println(a/0);
        }
        catch(ArithmeticException A){
            System.out.println(A);
        }
        catch(IllegalArgumentException I){
            System.out.println(I);
        }
        catch(InputMismatchException M){
            System.out.println(M);
        }
        catch(Exception e){
            System.out.println(e);
        }

        // int [] a = new int[5];
        // a[0] = 12;
        // a[1] = 13;
        // a[2] = 14;
        // a[3] = 15;
        // a[4] = 16;
        // int i=0;
        // while(true && i<5){
        //     try{
        //         int j = sc.nextInt();
        //         System.out.println(a[j]);
        //         break;
        //     }
        //     catch(Exception e){
        //         System.out.println("Enter valid index");
        //         i++;
        //     }
        // }
        // if(i==5){
        //     throw new ArithmeticException("max is reached");
        // }



    }
}
