package DSA.day17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MissAndRepeating {
    public static void main(String[] args) {
        int arr[][] = {{9,1,7},{8,9,2},{3,4,6}};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        // int a=0,b;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int e : arr[i]) {
        //         if(set.contains(e)){
        //             a=e;
        //             break;
        //         }
        //         set.add(e);
        //     }
        // }
        // int expectedSum = (n*n*(n*n+1))/2;
        // int actualSum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int e : arr[i]) {
        //         actualSum+=e;
        //     }
        // }
        // b = expectedSum+a-actualSum;
        // System.out.println(a+" "+b);



        int a=0,b=0;
        for (int i = 0; i < arr.length; i++) {
            for (int e : arr[i]) {
                if(set.contains(e)) a=e;
                set.add(e);
            }
        }
        for (int i = 1; i <= n*n; i++) {
            if(!set.contains(i)){
                b=i;
                break;
            }
        }
        System.out.println(a+" "+b);
    }
}
