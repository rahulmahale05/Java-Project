package DSA.day13;

import java.util.Collections;

public class nextPermutaion {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4};
        nextPerm(arr);
        for (int e : arr) {
            System.out.print(e+" ");
        }
    }
    public static void nextPerm(int arr[]){
        int piv = -1;
        int n = arr.length;
        for (int i = n-2; i >= 0; i--) {
            if(arr[i]<arr[i+1]){
                piv = i;
                break;
            }
        }
        if(piv == -1){
            reverse(arr, 0, n-1);
            return;
        }
        for (int i = n-1; i > piv; i--) {
            if(arr[i]>arr[piv]){
                swap(arr, i, piv);
                break;
            }
        }
        reverse(arr, piv+1, n-1);

    }
    public static void swap(int arr[] , int i , int piv){
        int temp = arr[piv];
        arr[piv] = arr[i];
        arr[i] = temp;
    }
    public static void reverse(int arr[] , int s , int e){
        while (s<e) {
            swap(arr, s++, e--);
        }
    }
}
