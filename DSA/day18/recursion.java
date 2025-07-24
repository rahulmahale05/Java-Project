package DSA.day18;

import java.util.ArrayList;
import java.util.HashSet;

public class recursion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));

        int arr[] = {1,2,2};
        System.out.println(isSorted(arr, arr.length));

        System.out.println(binary(arr, 2, 0, arr.length));
        
        ArrayList<Integer> ans = new ArrayList<>();
        // subSet(arr, ans, 0);

        // dupSubset(arr, ans, 0);

        System.out.println();
        permutation(arr, 0);
    }
    public static int fibo(int n){
        if(n == 0 || n == 1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static boolean isSorted(int arr[] , int n){
        if(n == 0 || n == 1) return true;
        return arr[n-1] >= arr[n-2] && isSorted(arr, n-1);
    }
    public static int binary(int arr[] , int tar , int st , int e){
        if(st<=e) {
            int mid = st+(e-st)/2;
            if(arr[mid] == tar) return mid;
            else if(arr[mid]<tar) return binary(arr, tar, mid+1, e);
            else return binary(arr, tar, st, mid-1);
        }
        return -1;
    }
    public static void subSet(int arr[] , ArrayList<Integer> ans , int i){ //Time complexity = O(2^n*n)
        if(i == arr.length){
            for (int j : ans) {
                System.out.print(j+" ");
            }
            System.out.println();
            return;
        }

        //Include
        ans.add(arr[i]);
        subSet(arr, ans, i+1);

        ans.removeLast();
        //Exclude
        subSet(arr, ans, i+1);
    }
    public static void dupSubset(int arr[] , ArrayList<Integer> ans , int i){
        if(i == arr.length){
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        dupSubset(arr, ans, i+1);

        ans.removeLast();
        int idx = i+1;
        while (idx < arr.length && arr[idx] == arr[idx-1]) idx++;
        dupSubset(arr, ans, idx);
    }

    public static void permutation(int arr[] , int idx){
        if(idx == arr.length){
            for (int e : arr) {
                System.out.print(e+" ");
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

            permutation(arr, idx+1);

            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
}
