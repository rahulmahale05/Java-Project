package day5;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for(int i=1;i<=num;i++){
        //     System.out.println();
        //     for(int j=0;j<i;j++)
        //         System.out.print("*");
        // }

        // int num = sc.nextInt();
        // for(int i=num;i>0;i--){
        //     System.out.println();
        //     for(int j=i;j>0;j--)
        //         System.out.print("*");
        // }

        // int num = sc.nextInt();
        // for(int i=num;i>0;i--){
        //     System.out.println();
        //     for(int j=0;j<i;j++)
        //         System.out.print("*");
        // }

        // int num = sc.nextInt();
        // int i=0;
        // int sum=0;
        // while(i<=num){
        //     if(i%2==0)
        //         sum = sum+i;
        // i++;
        // }
        // System.out.println("The sum of first n numbers is : "+sum);
        
        // int table;
        // int num = sc.nextInt();
        // for(int i=10;i>0;i--){
        //         table = i*num;
        //     System.out.println(table);
        // }

        // int num = sc.nextInt();
        // int fact=1;
        // for(int i=1;i<=num;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        int n=8;
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);


    }
}
