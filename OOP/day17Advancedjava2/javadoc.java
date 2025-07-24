package day17Advancedjava2;

/**
 * @author Rahul
 * @version 0.1
 * @since 2002
 * @see Java Docs
 */


import java.util.Scanner;

import day14.exception;

public class javadoc {

    static void add(int a , int b)throws Exception {
        System.out.println("The sum is : "+ a+b);
        throw new  Exception();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This my main method");
        try{
            add(12,24);
        }
        catch(Exception e){
            System.out.println("The exception is : "+e);
        }
    }
    
}
