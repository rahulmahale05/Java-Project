package DSA.day14;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int arr [] = {1,2,8,5,4,9};
        int n = 5;
        int m = 3;
        Arrays.sort(arr);
        int s = arr[0];
        int e = arr[n-1];
        int ans = -1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(isPossible(arr,n,m,mid)){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPossible(int arr[],int n,int m,int mid){
        int cow = 1 , lastStallPos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-lastStallPos >= mid){
                cow++;
                lastStallPos = arr[i];
            }
            if(cow == m) return true;
        }
        return false;
    }
}
