package day7;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //    int [] arr = {2,4,6,8,10};
    //    int [] ans = new int [5];
    //    int sum = 0;
    //     for(int i=0;i<5;i++){
    //         sum += arr[i];
    //         ans[i] = sum;
    //     }
    //     for(int element : ans){
    //         System.out.println("Array elements are "+element);
    //     }

    // int [] arr = {8,9,10,1,4,5};
    int [] arr = {1,2,3,4,5,6};
    int n = arr.length;
    // int [] ans = new int [5];
    
    //    int sum = 0;
    //     for(int i=0;i<5;i++){
    //         sum += arr[i];
    //         ans[i] = sum;
    //     }

    // int temp ;
    //     temp = arr[0];
    //     arr[0]=arr[5];
    //     arr[5]=temp;

    // for(int j=0;j<5;j++){
        for(int i=0;i<n;i++){

        // System.out.println(arr[i+1]);
        // if(arr[i]>arr[i+1]){
        //     int a;
        //     a =arr[i];
        //     arr[i]=arr[i+1];
        //     arr[i+1]=a;

        int temp ;
        temp = arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;


        }

    // }
// }

        for(int element : arr){
            System.out.println("Array elements are "+element);
        }
    }
}
