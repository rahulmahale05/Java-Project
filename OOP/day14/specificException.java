package day14;

import java.util.Scanner;

public class specificException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        a[0]=12;
        a[1]=15;
        a[2]=18;
        System.out.print("Enter the arry index :");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with :");
        int n = sc.nextInt();
        try{
            System.out.println("The value at array index entered is : "+ a[ind]);
            System.out.println("division is : "+ a[ind]/n);

        }
        catch(ArrayIndexOutOfBoundsException A){
            System.out.println("Array index  out of bound");
        }
        catch(ArithmeticException B){
            System.out.println("Airthmatic Exception");
        }
        catch(Exception e){
            System.out.println("Some other exception occured!");
        }
    }
}
