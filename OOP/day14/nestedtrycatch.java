package day14;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // try{
        //     System.out.println("Welcome");
        //     int b = sc.nextInt();
        //     try{
        //         System.out.println("Rahul");
        //         int a = sc.nextInt();
        //     }
        //     catch(Exception e){
        //         System.out.println("Nested error / level 2 error");
        //     }
            
        //     System.out.println("Rahul Mahale");
        //     int c = sc.nextInt();

        // }
        // catch(Exception e){
        //     System.out.println("level 1 error");
        // }
        // System.out.println("Print");

    //     int [] a = new int[5];
    //     a[0] = 11;
    //     a[1] = 12;
    //     a[2] = 13;
    //     a[3] = 14;
    //     a[4] = 15;
    //     try{
    //     while(true){
    //         int ind = sc.nextInt();
    //         System.out.println(a[ind]);
    //         System.out.println("You want to perform again :");
    //         String b = sc.next();
    //         if(b.equalsIgnoreCase("y")){
    //             continue;
    //         }
    //         else{
    //             break;
    //         }
    //     }
    // }
    // catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println("ArrayIndexOutOfBoundsException");
    // }

    int [] a = new int[5];
        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;
        boolean b = true;
        while(b){
            try{
            int ind = sc.nextInt();
            System.out.println(a[ind]);
            b = false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
    
        
    }
}
