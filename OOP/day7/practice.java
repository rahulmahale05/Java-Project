package day7;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //multiplication table of number n

        
        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();
        // System.out.println("Table of given number is :");
        // table(n);



        //pattern 
        // *
        // **
        // ***
        // ****

        // pattern();

        //sum of n number

        // System.out.print("Enter a last number : ");
        // int n = sc.nextInt();
        // System.out.print("sum of given number is :");
        // int sum = sum(n);
        // System.out.print(sum);



        //fibonacci series


        System.out.print("Enter a n th term : ");
        int n = sc.nextInt();

        System.out.print("fibonacci series is :");
        int result = series(n);
        System.out.println(result);

        // System.out.print("average of number is :");
        // int result = average(1,2,3,4,5,6,7,8,9,10);
        // System.out.println(result);


            //pattern using recursion
            // int n =5;
            // pattern(n);


    }

    // static void table (int n){
    //     int pro = 0 ;
    //     for (int i = 1; i <= 10; i++) {
    //         pro = i * n;
    //         System.out.println(pro);
    //     }
    // }
    



    // static void pattern(){
    //     for(int i= 0 ; i<4 ;i++){
    //         System.out.println();
    //         for(int j = 0 ; j <= i ; j++)
    //             System.out.print("*");
    //     }

    // }


    // static int sum (int n){
    //     if(n==0)
    //         return 0;
    //     else
    //        return (n+sum(n-1) );
    // }


    // static void pattern(){
    //     for(int i= 4 ; i>0 ;i--){
    //         System.out.println();
    //         for(int j = 1 ; j <= i ; j++)
    //             System.out.print("*");
    //     }

    // }



    static int series (int n){
    //     if(n==1)
    //         return 0;
    //     else if(n==2)
    //         return 1;

    
          if(n==1 || n==2)
                  return n-1;
     
        else
            return (series(n-1) + series(n-2));
        
    }


    // static int average(int ...arr){
    //     int sum =0;
    //     for (int i : arr) {
    //         sum += i;
    //     }
    //     return sum;
    // }





    static void pattern(int n){
            if(n>0){
                pattern(n-1);
                for(int i = 0 ; i<n; i++)
                    System.out.print("*");
            }
            System.out.println();
    }

}
