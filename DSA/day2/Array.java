package DSA.day2;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // int max=arr[0];
        // int a = Integer.MAX_VALUE;
        // int b = Integer.MIN_VALUE;
        // int min=arr[0];
        // for(int j=0;j<arr.length;j++) {
        //     if(max<arr[j]){
        //         int temp=max;
        //         max=arr[j];
        //         arr[j]=temp;
        //     }
        //     if(min>arr[j]){
        //         int tem=min;
        //         min=arr[j];
        //         arr[j]=tem;
        //     }
        // }
        // System.out.println("Maximum number is "+max);
        // System.out.println("Minimum number is "+min);

        //check array is sorted or not

        // int a=0;
        // for(int j=0;j<arr.length-1;j++){
        //     if(arr[j]>arr[j+1]){
        //         a=1;
        //     }
        // }
        // if(a==1){
        //     System.out.println("The given array is not sorted");
        // }
        // else{
        //     System.out.println("The given array is sorted");
        // }

        //sorting array element

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
