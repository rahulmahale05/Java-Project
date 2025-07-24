package day6;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1 : create array of 5 floats and calculate their sum

        /*
        float [] num = new float[5];

        for(int i=0; i<num.length;i++){
            System.out.print("Enter a Number : ");
            num[i] = sc.nextFloat();
        }

        float sum = 0f;
        for(int i=0; i<num.length;i++){
            sum += num[i];
        }
        System.out.println("The sum of all elements is : "+sum);
        */





        //Question 2: find number present of number in aray or not

       /*
       int [] num = new int[5];

        for(int i=0; i<num.length;i++){
            System.out.print("Enter a Number : ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter number do you want to find : ");
        int a = sc.nextInt();
        int flag=0;
        int i;
        for( i=0; i<num.length;i++){
            if(a==num[i]){
                flag = 1;
                i=i+1;
                break;
            }
        }
        if(flag==1)
            System.out.println("The given number " +a +" is found at position "+i );
        else
            System.out.println("The given number" +a +" is not found in the array");
         */






         //Question 3 : average of marks

         /*
         int [] num = new int[5];

        for(int i=0; i<num.length;i++){
            System.out.print("Enter a Number : ");
            num[i] = sc.nextInt();
        }

        int sum=0;
        int i;
        for( i=0; i<num.length;i++){
            sum += num[i];
        }
       
            System.out.println("The average of marks is  "+sum/num.length );
         */






         //Question 4 : add two matrices

         /*
         int [][] num1 = new int[2][3];
         int [][] num2 = new int[2][3];

        for(int i=0; i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
            System.out.print("Enter elements of first matrices : ");
            num1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<num2.length;i++){
            for(int j=0;j<num2[i].length;j++){
            System.out.print("Enter elements of second matrices : ");
            num2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[2][3];
        for(int i=0; i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                 sum[i][j] = num1[i][j]+num2[i][j];
            }
        }
        
        for(int i=0; i<num2.length;i++){
            System.out.println();
            for(int j=0;j<num2[i].length;j++){
                 System.out.print(sum[i][j]+" ");
            }
        }
        
         */





         //Question 5 : reverse array

         /*
         int [][] num = new int[2][3];

        for(int i=0; i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
            System.out.print("Enter elements of array : ");
            num[i][j] = sc.nextInt();
            }
        }
        for(int i=num.length-1; i>=0;i--){
            for(int j=num[i].length-1;j>=0;j--){
            System.out.println(num[i][j]);
            }
        }
        
         */





         /*

        float [] num = new float[5];

        for(int i=0; i<num.length;i++){
            System.out.print("Enter a Number : ");
            num[i] = sc.nextFloat();
        }
        System.out.print("enter element to be find : ");
        float a = sc.nextFloat();
        boolean isarray = false;
        for(float element:num){
            if(a==element){
                isarray = true;
                break;
            }
        }
        if(isarray)
            System.out.println("The given number " +a +" is found in array " );
        else
            System.out.println("The given number" +a +" is not found in the array");
         
         */






         //Question 6: find max in array

        /*
         int [][] num = new int[3][3];

        for(int i=0; i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
            System.out.print("Enter elements of array : ");
            num[i][j] = sc.nextInt();
            }
        }
        int max=0;
        for(int i=0; i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                if(max<num[i][j]){
                    max = num[i][j];
                }

            }
        }
        System.out.println("The maximum element in the array is : "+max);
        
         */




         // Question 7 : find min in array

         /*
         int [][] num = new int[3][3];

         for(int i=0; i<num.length;i++){
             for(int j=0;j<num[i].length;j++){
             System.out.print("Enter elements of array : ");
             num[i][j] = sc.nextInt();
             }
         }

         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);

         int min=Integer.MAX_VALUE;
         for(int i=0; i<num.length;i++){
             for(int j=0;j<num[i].length;j++){
                 if(min>num[i][j]){
                     min = num[i][j];
                 }
 
             }
         }
         System.out.println("The maximum element in the array is : "+min);

          */



          


          //Question 8 : find array is sorted or not 


        /*
          int [][] num = new int[3][3];

         for(int i=0; i<num.length;i++){
             for(int j=0;j<num[i].length;j++){
             System.out.print("Enter elements of array : ");
             num[i][j] = sc.nextInt();
             }
         }

        boolean issorted = true;
        for(int i=0; i<num.length-1;i++){
            for(int j=0;j<num[i].length-1;j++){
                if(num[i][j]>num[i+1][j+1]){
                    issorted = false;
                    break;
                }
            
            }
        }
        if(issorted)
           System.out.println("Array is sorted ");
        else
            System.out.println("Array is not sorted ");

         */

         
    }
}
