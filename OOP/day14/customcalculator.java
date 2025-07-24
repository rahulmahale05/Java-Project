package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvlidInput extends Exception{
    public String toString(){
        return "Input is not valid for this condition";
    }
}

public class customcalculator {
    public static void calculator(int x , int y){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice 1.addition 2.substraction 3.multiplication  4.division");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                try{
                    if(x<7000 & y<7000){
                System.out.println(x*y);
                    }
            }
            catch(Exception A){
                System.out.println("Can not divide by zero");
            }
                break;
            case 4:
                try{
                System.out.println(x/y);
                }
                catch(ArithmeticException A){
                    System.out.println("Can not divide by zero");
                }
        
                break;
        
            default:
                System.out.println("Invalid case");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            calculator(a, b);
            if(a==8||b==9){
                throw new ArithmeticException("Invalid input");
            }
        }
        catch(InputMismatchException I){
            System.out.println("Input is not valid");
        }
        try{
            rahul(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    static void rahul(int a) throws InvlidInput{
        if(a==10){
            throw new InvlidInput();
        }
    }
}
