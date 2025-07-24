package DSA.day17;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {3,2,4};
        int tar = 6;
        /*Time complexity = O(n^2) */
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]+arr[j]==tar){
        //             System.out.println(i+" "+j);
        //             return;
        //         }
        //     }
        // }

        /*Time complexity = O(nlogn) */
        // Arrays.sort(arr);
        // int s = 0;
        // int e = arr.length-1;
        // while (s<e) {
        //     if(arr[s]+arr[e] == tar){
        //         System.out.println(arr[s]+" "+arr[e]);
        //         return;
        //     }
        //     if(arr[s]+arr[e] < tar) s++;
        //     else e--;
        // }

        // Time complexity = O(n)

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int s = tar - arr[i];
            if(map.containsKey(s)){
                if(map.get(s)==i) continue;
                System.out.println(i+" "+map.get(s));
                return;
            }
        }
    }
}
