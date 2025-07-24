package day14;

import java.util.Scanner;


class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can not be negative ";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+" I am getMessage()";
    }
}

public class throwThrows {
    public static double area (int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result1 = Math.PI*r*r;
        return result1;
    }

    public static int divide (int a, int b) throws ArithmeticException {
        int result = a/b;
        return result;
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // try{
        // int c = divide(12, 0);
        // System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        try {
           double a=area(-12);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        

    }
}
