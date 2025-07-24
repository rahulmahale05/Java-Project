// package practice1;

import java.util.ArrayList;

public class forth {
    // public static int findMissingNumber(int[] arr, int n) {
    //     int expectedSum = n * (n + 1) / 2;  // Sum of first n natural numbers
    //     int actualSum = 0;
        
    //     for (int num : arr) {
    //         actualSum += num;
    //     }
        
    //     return expectedSum - actualSum;
    // }

    public static int missing(int[] arr , int i,ArrayList<Integer> list){
        if(arr[i+1]-arr[i]==1) return arr[i];
        list.add(arr[i]);
        arr[i]=arr[i]+1;
        missing(arr, i , list);
        return arr[i];
    }
    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,6,7,8,9,12,15};
        // ArrayList<Integer> list = new ArrayList<>();
        // int i=0;
        // while(i<arr.length-1){
        //     list.add(missing(arr, i , list));
        //     i++;
        // }
        // list.add(arr[arr.length-1]);
        // System.out.println("Missing numbers : "+ list);
        // System.out.println(findMissingNumber(arr, 9));
        int n = 27;
        if(pow3(n)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }    
    }



    //missing numbers

    public static ArrayList<Integer> findMissingNumbers(int[] arr) {
        ArrayList<Integer> missingList = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];
            
            // Add missing numbers between arr[i] and arr[i+1]
            for (int num = current + 1; num < next; num++) {
                missingList.add(num);
            }
        }
        return missingList;

    }
    static boolean pow2(int n){
        return n>0 &&((n & (n-1) )==0);
    }
    static boolean pow4(int n){
        return n>0 && ((n&(n-1))==0) && ((n-1)%3 == 0);
    }
    static boolean pow3(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n%3 != 0) return false;
        return pow3(n/3);
    }
}
