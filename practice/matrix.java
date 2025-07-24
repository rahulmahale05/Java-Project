package practice;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] flats = new int [3][3];
        int [][] arr = new int [3][3];
        int [][] sum = new int [3][3];
        System.out.println("Enter first matrix element :");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print("Enter flats no : ");
                flats[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter second matrix element :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter flats no : ");
                arr[i][j] = sc.nextInt();

            }
        }

        //sum of matrix 


        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){

        //         sum[i][j] = flats[i][j]+arr[i][j];

        //     }
        // }

        //multiplication of matrix 


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int mul = 0 ;

                for(int k = 0;k<3;k++)
                   mul += (flats[i][k]*arr[k][j]);
                
                sum[i][j] = mul ;

            }
        }

        System.out.println("sum of two matrix is : ");
        for(int i=0;i<arr.length;i++){
            System.out.println();
            for(int j=0;j<arr[i].length;j++){

               System.out.print(sum[i][j] + " ");

            }
        }


        
        
    }
}
