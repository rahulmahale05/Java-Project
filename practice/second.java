package practice;

import java.util.Scanner;


public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a;
        // a=sc.nextInt();
        // for(int i=0;i<a;i++){
        //     for (int j = a-i; j >0; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }


        // int a;
        // a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
                
        //     }
        //     System.out.println();
        // }


        // int a;
        // a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j <=a-i+1; j++) {
        //         System.out.print(j);
                
        //     }
        //     System.out.println();
        // }

        // int a;
        // a=sc.nextInt();
        // for(int i=a;i>0;i--){
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
                
        //     }
        //     System.out.println();
        // }


        //floyd's triangle

        // int a;
        // a=sc.nextInt();
        // int n=1;
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(n+" ");
        //         n++;
                
        //     }
        //     System.out.println();
        // }


        // int a;
        // a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j <=i; j++) {
        //         if((i+j)%2==0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
                
        //     }
        //     System.out.println();
        // }

        // int a;
        // a=sc.nextInt();
        // for (int i = 1; i <= a; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= (a-i)*2; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        // for (int i = a; i > 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= (a-i)*2; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }

        // int a;
        // a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j < a-i+1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= a; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }


        // int a;
        // a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j < a-i+1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i+" ");
                
        //     }
        //     System.out.println();
        // }


        // int a;
        // a=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j = 1; j < a-i+1; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = i; j > 0; j--) {
        //         System.out.print(j+" ");
                
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j+" ");
                
        //     }
        //     System.out.println();
        // }

        
        int a;
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for (int j = 1; j < a-i+1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
                
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
        for(int i=a;i>0;i--){
            for (int j = 1; j < a-i+1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
                
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }

    }
}
